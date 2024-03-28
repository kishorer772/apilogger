package com.apilogger.apilogger.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "apiregister")
public class ApiLoggingModal {
    @Id
    private String id;
    private String tagName;
    private String username;
    private String endpoint;
    private String payload;
    private String response;
    private String createdAt;

    // getters and setters
}
