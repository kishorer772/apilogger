package com.apilogger.apilogger.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.apilogger.apilogger.dao.ApiLoggingModal;

public interface ApiLoggingRepository extends MongoRepository<ApiLoggingModal, String> {
    // Additional custom query methods can be defined here
}
