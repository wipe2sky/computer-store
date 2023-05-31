package com.kurtsevich.computerstore.service;

import com.kurtsevich.computerstore.dto.NotebookDto;
import com.kurtsevich.computerstore.entity.Notebook;
import com.kurtsevich.computerstore.entity.enums.ScreenSize;
import com.kurtsevich.computerstore.exceptions.NotFoundException;
import com.kurtsevich.computerstore.mapper.NotebookMapper;
import com.kurtsevich.computerstore.repository.NotebookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class NotebookService {
    private final NotebookRepository repository;
    private final NotebookMapper mapper;


    public NotebookDto findById(Long id) {
        Notebook notebook = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Entity with id " + id + " not found"));
        return mapper.toDto(notebook);
    }

    public List<NotebookDto> findAll(Integer screenSize) {
        return (screenSize == null
                ? repository.findAll()
                : repository.findAllByScreenSize(ScreenSize.getByValue(screenSize))
        ).stream()
                .map(mapper::toDto)
                .toList();
    }

    @Transactional
    public NotebookDto create(NotebookDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Transactional
    public NotebookDto update(NotebookDto dto) {
        if (repository.findById(dto.getId()).isEmpty()) {
            throw new NotFoundException("Entity with id " + dto.getId() + " not found");
        }
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
