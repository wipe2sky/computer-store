package com.kurtsevich.computerstore.repository;

import com.kurtsevich.computerstore.entity.Notebook;
import org.springframework.data.repository.CrudRepository;

public interface NotebookRepository extends CrudRepository<Notebook, Long> {
}
