package com.kurtsevich.computerstore.mapper;

import com.kurtsevich.computerstore.dto.NotebookDto;
import com.kurtsevich.computerstore.entity.Notebook;
import com.kurtsevich.computerstore.entity.enums.ScreenSize;
import org.springframework.stereotype.Component;


@Component

public class NotebookMapper {
    public Notebook toEntity(NotebookDto dto) {
        return Notebook.builder()
                .id(dto.getId())
                .seriesNumber(dto.getSeriesNumber())
                .producer(dto.getProducer())
                .screenSize(ScreenSize.getByValue(dto.getScreenSize()))
                .price(dto.getPrice())
                .count(dto.getCount())
                .build();
    }

    public NotebookDto toDto(Notebook entity) {
        return NotebookDto.builder()
                .id(entity.getId())
                .seriesNumber(entity.getSeriesNumber())
                .producer(entity.getProducer())
                .screenSize(entity.getScreenSize().getValue())
                .price(entity.getPrice())
                .count(entity.getCount())
                .build();
    }
}
