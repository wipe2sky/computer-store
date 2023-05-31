package com.kurtsevich.computerstore.repository;

import com.kurtsevich.computerstore.entity.Monitor;
import org.springframework.data.repository.CrudRepository;

public interface MonitorRepository extends CrudRepository<Monitor, Long> {
}
