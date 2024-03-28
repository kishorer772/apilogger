package com.apilogger.apilogger.controller;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.apilogger.apilogger.dao.ApiLoggingModal;
import com.apilogger.apilogger.service.ApiLoggingService;

@RestController
@RequestMapping("/api/apilog")
public class ApiLoggingController {
    @Autowired
    private ApiLoggingService apiLogService;

    @PostMapping
    public ApiLoggingModal addBook(@RequestBody ApiLoggingModal book) {
        book.setCreatedAt(new Date().toString());
        return apiLogService.saveBook(book);
    }

    @GetMapping
    public List<ApiLoggingModal> getAllBooks() {
        return apiLogService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiLoggingModal> getBookById(@PathVariable String id) {
        Optional<ApiLoggingModal> book = apiLogService.getBookById(id);
        return book.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable String id, @RequestBody ApiLoggingModal updatedBook) {
        apiLogService.updateBook(id, updatedBook);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        apiLogService.deleteBook(id);
    }
}
