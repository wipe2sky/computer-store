package com.kurtsevich.computerstore.repository;

import com.kurtsevich.computerstore.entity.Computer;
import org.springframework.data.repository.CrudRepository;

public interface ComputerRepository extends CrudRepository<Computer, Long> {
}
