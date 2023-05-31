package com.kurtsevich.computerstore.repository;

import com.kurtsevich.computerstore.entity.Computer;
import com.kurtsevich.computerstore.entity.enums.ComputerType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ComputerRepository extends CrudRepository<Computer, Long> {
    void deleteBySerialNumber(String serialNumber);
    Optional<Computer> findBySerialNumber(String serialNumber);
    List<Computer> findAll();
    List<Computer> findAllByComputerType(ComputerType type);
}
