package com.kurtsevich.computerstore.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
@MappedSuperclass
public abstract class AbstractProduct {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Serial number name is required")
    private String serialNumber;

    @NotBlank(message = "Producer name is required")
    private String producer;

    @Min(value = 1, message = "Price can't be null or less than 1")
    private BigDecimal price;

    @NotNull(message = "Price can't be null")
    private int count;

}
