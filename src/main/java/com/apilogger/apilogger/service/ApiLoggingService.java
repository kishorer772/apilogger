package com.apilogger.apilogger.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apilogger.apilogger.dao.ApiLoggingModal;
import com.apilogger.apilogger.repository.ApiLoggingRepository;




@Service
public class ApiLoggingService {
    @Autowired
    private ApiLoggingRepository apiLoggingRepo;

    public ApiLoggingModal saveBook(ApiLoggingModal book) {
     
        return apiLoggingRepo.save(book);
    }

    public List<ApiLoggingModal> getAllBooks() {
        return apiLoggingRepo.findAll();
    }

    public Optional<ApiLoggingModal> getBookById(String id) {
        return apiLoggingRepo.findById(id);
    }

    public void updateBook(String id, ApiLoggingModal updatedBook) {
        Optional<ApiLoggingModal> existingBook = apiLoggingRepo.findById(id);
        if (existingBook.isPresent()) {
            updatedBook.setId(id);
            apiLoggingRepo.save(updatedBook);
        }
    }

    public void deleteBook(String id) {
        apiLoggingRepo.deleteById(id);
    }
}
