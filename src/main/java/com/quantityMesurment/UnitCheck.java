package com.quantityMesurment;

public enum UnitCheck {
    FEET_TO_INCH(1 * 12.0), INCH_TO_FEET(1.0 / 12.0),
    YARDS(1 * 36.0),FEET_TO_YARD(1/3.0),
    CM_TO_INCH(1/0.39370);
    final double value;

    UnitCheck(double value) {
        this.value = value;
    }
}
