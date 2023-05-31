package com.kurtsevich.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Hdd extends AbstractProduct {

    @Min(value = 16, message = "Capacity must be greater than 16GB")
    private int capacity;
}
