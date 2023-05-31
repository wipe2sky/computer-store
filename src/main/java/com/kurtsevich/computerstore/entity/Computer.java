package com.kurtsevich.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Computer extends AbstractProduct {

    @NotNull(message = "Type can't be null")
    private Type type;


    public enum Type {
        DESKTOP,
        NET_TOP,
        MONO_BLOCK
    }
}


