package com.kurtsevich.computerstore.mapper;

import com.kurtsevich.computerstore.dto.HddDto;
import com.kurtsevich.computerstore.entity.Hdd;
import org.springframework.stereotype.Component;


@Component
public class HddMapper {
    public Hdd toEntity(HddDto dto) {
        return Hdd.builder()
                .id(dto.getId())
                .seriesNumber(dto.getSeriesNumber())
                .producer(dto.getProducer())
                .capacity(dto.getCapacity())
                .price(dto.getPrice())
                .count(dto.getCount())
                .build();
    }

    public HddDto toDto(Hdd entity) {
        return HddDto.builder()
                .id(entity.getId())
                .seriesNumber(entity.getSeriesNumber())
                .producer(entity.getProducer())
                .capacity(entity.getCapacity())
                .price(entity.getPrice())
                .count(entity.getCount())
                .build();
    }
}
