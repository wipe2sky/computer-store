package com.kurtsevich.computerstore.entity.enums;

public enum ScreenSize {
    THIRTEEN(13),
    FOURTEEN(14),
    FIFTEEN(15),
    SEVENTEEN(17);

    ScreenSize(int value) {
        this.value = value;
    }

    private final int value;

    public int getValue() {
        return value;
    }

    public static ScreenSize getByValue(int value) {
        for (ScreenSize screenSize : ScreenSize.values()) {
            if (screenSize.value == value) {
                return screenSize;
            }
        }
        throw new IllegalArgumentException("Invalid ScreenSize value: " + value);
    }
}
