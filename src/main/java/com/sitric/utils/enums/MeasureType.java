package com.sitric.utils.enums;

/**
 *
 * Минимальная порция продаваемого товара
 */
public enum  MeasureType {
    PIECE ("штука"),
    HUNDREED_GRAM ("100 грамм"),
    KILO ("1 килограмм");

    private final String name;

    MeasureType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MeasureType{" +
                "name='" + name + '\'' +
                '}';
    }
}
