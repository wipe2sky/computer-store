package com.kurtsevich.computerstore.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
@NoArgsConstructor
public class BaseProductDto {
    private Long id;

    @NotBlank(message = "Series number name is required")
    private String seriesNumber;

    @NotBlank(message = "Producer name is required")
    private String producer;

    @NotNull(message = "Field is required")
    @DecimalMin(value = "0.01", message = "Price must be positive")
    private BigDecimal price;

    @NotNull(message = "Count can't be null")
    private Integer count;
}
