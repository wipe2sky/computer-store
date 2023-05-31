package com.kurtsevich.computerstore.entity.enums;

import com.kurtsevich.computerstore.exceptions.MapperException;

import java.util.Objects;

public enum ScreenSize {
    THIRTEEN(13),
    FOURTEEN(14),
    FIFTEEN(15),
    SEVENTEEN(17);

    ScreenSize(Integer value) {
        this.value = value;
    }

    private final Integer value;

    public Integer getValue() {
        return value;
    }

    public static ScreenSize getByValue(Integer value) {
        for (ScreenSize screenSize : ScreenSize.values()) {
            if (Objects.equals(screenSize.value, value)) {
                return screenSize;
            }
        }
        throw new MapperException("Invalid ScreenSize value: " + value);
    }
}
