package com.kurtsevich.computerstore.service;

import com.kurtsevich.computerstore.dto.ComputerDto;
import com.kurtsevich.computerstore.entity.Computer;
import com.kurtsevich.computerstore.entity.enums.ComputerType;
import com.kurtsevich.computerstore.exception.NotFoundException;
import com.kurtsevich.computerstore.mapper.ComputerMapper;
import com.kurtsevich.computerstore.repository.ComputerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ComputerService {
    private final ComputerRepository repository;
    private final ComputerMapper mapper;


    public ComputerDto findById(Long id) {
        Computer computer = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Entity with id " + id + " not found"));
        return mapper.toDto(computer);
    }

    public List<ComputerDto> findAll(ComputerType type) {
        return (type == null
                ? repository.findAll()
                : repository.findAllByComputerType(type)
        ).stream()
                .map(mapper::toDto)
                .toList();
    }

    @Transactional
    public ComputerDto create(ComputerDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Transactional
    public ComputerDto update(ComputerDto dto) {
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
