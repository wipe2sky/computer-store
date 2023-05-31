package com.kurtsevich.computerstore.mapper;

import com.kurtsevich.computerstore.dto.MonitorDto;
import com.kurtsevich.computerstore.entity.Monitor;
import org.springframework.stereotype.Component;


@Component
public class MonitorMapper {
    public Monitor toEntity(MonitorDto dto) {
        return Monitor.builder()
                .id(dto.getId())
                .seriesNumber(dto.getSeriesNumber())
                .producer(dto.getProducer())
                .diagonal(dto.getDiagonal())
                .price(dto.getPrice())
                .count(dto.getCount())
                .build();
    }

    public MonitorDto toDto(Monitor entity) {
        return MonitorDto.builder()
                .id(entity.getId())
                .seriesNumber(entity.getSeriesNumber())
                .producer(entity.getProducer())
                .diagonal(entity.getDiagonal())
                .price(entity.getPrice())
                .count(entity.getCount())
                .build();
    }
}
