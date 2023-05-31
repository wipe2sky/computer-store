package com.kurtsevich.computerstore.repository;

import com.kurtsevich.computerstore.entity.Monitor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MonitorRepository extends CrudRepository<Monitor, Long> {

    List<Monitor> findAll();

    List<Monitor> findAllByDiagonal(Integer diagonal);
}
