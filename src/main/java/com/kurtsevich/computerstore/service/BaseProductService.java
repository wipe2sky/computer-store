package com.kurtsevich.computerstore.service;

import java.util.UUID;

public interface BaseProductService {
    default String generateSerialNumber() {
        return UUID.randomUUID().toString();
    }
}
