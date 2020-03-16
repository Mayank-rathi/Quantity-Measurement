package com.quantityMesurment;

public enum UnitCheck {
    FEETUNIT(1 * 12.0), INCHUNIT(1.0 / 12.0);

    final double value;

    UnitCheck(double value) {
        this.value = value;
    }
}
