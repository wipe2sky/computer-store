package com.kurtsevich.computerstore.mapper;

import com.kurtsevich.computerstore.dto.ComputerDto;
import com.kurtsevich.computerstore.entity.Computer;
import org.springframework.stereotype.Component;


@Component
public class ComputerMapper {
    public Computer toEntity(ComputerDto dto) {
        return Computer.builder()
                .id(dto.getId())
                .seriesNumber(dto.getSeriesNumber())
                .producer(dto.getProducer())
                .computerType(dto.getComputerType())
                .price(dto.getPrice())
                .count(dto.getCount())
                .build();
    }

    public ComputerDto toDto(Computer entity) {
        return ComputerDto.builder()
                .id(entity.getId())
                .seriesNumber(entity.getSeriesNumber())
                .producer(entity.getProducer())
                .computerType(entity.getComputerType())
                .price(entity.getPrice())
                .count(entity.getCount())
                .build();
    }
}
