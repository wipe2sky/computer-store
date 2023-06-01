package com.kurtsevich.computerstore.service;

import com.kurtsevich.computerstore.dto.MonitorDto;
import com.kurtsevich.computerstore.entity.Monitor;
import com.kurtsevich.computerstore.exception.NotFoundException;
import com.kurtsevich.computerstore.mapper.MonitorMapper;
import com.kurtsevich.computerstore.repository.MonitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MonitorService {
    private final MonitorRepository repository;
    private final MonitorMapper mapper;


    public MonitorDto findById(Long id) {
        Monitor monitor = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Entity with id " + id + " not found"));
        return mapper.toDto(monitor);
    }

    public List<MonitorDto> findAll(Integer diagonal) {
        return (diagonal == null
                ? repository.findAll()
                : repository.findAllByDiagonal(diagonal)
        ).stream()
                .map(mapper::toDto)
                .toList();
    }

    @Transactional
    public MonitorDto create(MonitorDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Transactional
    public MonitorDto update(MonitorDto dto) {
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
