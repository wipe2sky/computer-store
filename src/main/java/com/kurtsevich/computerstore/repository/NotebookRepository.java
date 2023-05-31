package com.kurtsevich.computerstore.repository;

import com.kurtsevich.computerstore.entity.Notebook;
import com.kurtsevich.computerstore.entity.enums.ScreenSize;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NotebookRepository extends CrudRepository<Notebook, Long> {
    List<Notebook> findAll();
    List<Notebook> findAllByScreenSize(ScreenSize screenSize);
}
