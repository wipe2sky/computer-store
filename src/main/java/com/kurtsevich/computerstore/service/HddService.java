package com.kurtsevich.computerstore.service;

import com.kurtsevich.computerstore.dto.HddDto;
import com.kurtsevich.computerstore.entity.Hdd;
import com.kurtsevich.computerstore.exceptions.NotFoundException;
import com.kurtsevich.computerstore.mapper.HddMapper;
import com.kurtsevich.computerstore.repository.HddRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class HddService {
    private final HddRepository repository;
    private final HddMapper mapper;


    public HddDto findById(Long id) {
        Hdd hdd = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Entity with id " + id + " not found"));
        return mapper.toDto(hdd);
    }

    public List<HddDto> findAll(Integer capacity) {
        return (capacity == null
                ? repository.findAll()
                : repository.findAllByCapacity(capacity)
        ).stream()
                .map(mapper::toDto)
                .toList();
    }

    @Transactional
    public HddDto create(HddDto dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Transactional
    public HddDto update(HddDto dto) {
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
