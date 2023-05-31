package com.kurtsevich.computerstore.mapper;

import com.kurtsevich.computerstore.dto.ComputerDto;
import com.kurtsevich.computerstore.entity.Computer;
import org.springframework.stereotype.Component;


@Component
public class ComputerMapper {
    public Computer toEntity(ComputerDto dto) {
        return Computer.builder()
                .serialNumber(dto.getSerialNumber())
                .producer(dto.getProducer())
                .computerType(dto.getComputerType())
                .price(dto.getPrice())
                .count(dto.getCount())
                .build();
    }

    public ComputerDto toDto(Computer entity) {
        return ComputerDto.builder()
                .serialNumber(entity.getSerialNumber())
                .producer(entity.getProducer())
                .computerType(entity.getComputerType())
                .price(entity.getPrice())
                .count(entity.getCount())
                .build();
    }
}
