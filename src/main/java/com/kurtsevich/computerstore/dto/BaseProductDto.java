package com.kurtsevich.computerstore.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
@NoArgsConstructor
public class BaseProductDto {
    private String serialNumber;

    private String producer;

    private BigDecimal price;

    private int count;
}
