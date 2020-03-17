package com.quantityMesurment;

public enum UnitCheck {
    FEETUNIT(1 * 12.0), INCHUNIT(1.0 / 12.0),
    YARDSUNIT(1 * 36.0),FEET_TO_YARD(1/3.0);

    final double value;

    UnitCheck(double value) {
        this.value = value;
    }
}
