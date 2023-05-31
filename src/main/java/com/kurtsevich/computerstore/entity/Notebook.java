package com.kurtsevich.computerstore.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Notebook extends AbstractProduct {

    @NotNull(message = "Screen size can't be null")
    private ScreenSize screenSize;

    public enum ScreenSize {
        THIRTEEN("13\""),
        FOURTEEN("14\""),
        FIFTEEN("15\""),
        SIXTEEN("16\"");

        ScreenSize(String value) {
            this.value = value;
        }

        private final String value;

        public String getValue() {
            return value;
        }
    }
}
