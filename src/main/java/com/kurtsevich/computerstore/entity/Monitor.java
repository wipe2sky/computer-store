package com.kurtsevich.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
public class Monitor extends AbstractProduct {

    @Digits(integer = 999, fraction = 0, message = "Diagonal must be greater than 1 and less than 999")
    @Min(1)
    private Integer diagonal;

}
