package com.sitric.utils.enums;

/**
 * Типы десертов
 */
public enum DessertType {
    CANDY ("Конфета"),
    BISCUIT ("Печенье"),
    CAKE ("Торт");

    private final String name;

    DessertType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DessertType{" +
                "name='" + name + '\'' +
                '}';
    }
}
