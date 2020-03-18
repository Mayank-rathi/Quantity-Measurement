package com.quantityMesurment;

public enum UnitType {
    FEET(12.00, Units.LENGTH), INCH(1.00, Units.INCH),
    YARD(36.01, Units.LENGTH), CENTIMETER(1.0, Units.INCH),
    LITER(1.02, Units.LITER), GALLON(3.785, Units.LITER);

    public double value;
    public Units mainUnitType;

    UnitType(double value, Units mainUnitType) {
        this.value = value;
        this.mainUnitType = mainUnitType;
    }
}
