package com.kurtsevich.computerstore.entity;

import com.kurtsevich.computerstore.entity.enums.ComputerType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@Entity
public class Computer extends AbstractProduct {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ComputerType computerType;

}


