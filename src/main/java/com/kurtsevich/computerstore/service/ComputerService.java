package com.kurtsevich.computerstore.service;

import com.kurtsevich.computerstore.dto.ComputerDto;
import com.kurtsevich.computerstore.entity.Computer;
import com.kurtsevich.computerstore.entity.enums.ComputerType;
import com.kurtsevich.computerstore.exceptions.NotFoundException;
import com.kurtsevich.computerstore.mapper.ComputerMapper;
import com.kurtsevich.computerstore.repository.ComputerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ComputerService implements BaseProductService {
    private final ComputerRepository repository;
    private final ComputerMapper mapper;


    public ComputerDto findBySerialNumber(String serialNumber) {
        Computer computer = repository.findBySerialNumber(serialNumber)
                .orElseThrow(() -> new NotFoundException("Entity with serial number " + serialNumber + " not found"));
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
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Transactional
    public void delete(String serialNumber) {
        repository.deleteBySerialNumber(serialNumber);
    }
}
