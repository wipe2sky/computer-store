package com.kurtsevich.computerstore.repository;

import com.kurtsevich.computerstore.entity.Computer;
import com.kurtsevich.computerstore.entity.enums.ComputerType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComputerRepository extends CrudRepository<Computer, Long> {
    List<Computer> findAll();
    List<Computer> findAllByComputerType(ComputerType type);
}
