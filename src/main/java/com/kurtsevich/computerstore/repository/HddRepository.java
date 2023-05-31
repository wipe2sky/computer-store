package com.kurtsevich.computerstore.repository;

import com.kurtsevich.computerstore.entity.Hdd;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HddRepository extends CrudRepository<Hdd, Long> {
    List<Hdd> findAll();
    List<Hdd> findAllByCapacity(int capacity);
}
