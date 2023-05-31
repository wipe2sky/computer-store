package com.kurtsevich.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Monitor extends AbstractProduct {

    @Size(min = 1, max = 999, message = "Diagonal must be greater than 1 and less than 999")
    private int diagonal;

}
