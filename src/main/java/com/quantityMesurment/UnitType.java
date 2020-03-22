package com.quantityMesurment;

public enum UnitType {
    FEET(12.00, Units.LENGTH), INCH(1.00, Units.LENGTH),
    YARD(36.01, Units.LENGTH), CENTIMETER(0.4, Units.LENGTH),

    LITER(1.0, Units.VOLUME), GALLON(3.78, Units.VOLUME),
    ML(1/1000.0, Units.VOLUME),

    KG(1, Units.WEIGHT), GRAM(1d/1000,Units.WEIGHT),
    TONNE(1000,Units.WEIGHT),

    CELSIUS(2.12,Units.TEMPERATURE), FAHRENHEIT(1,Units.TEMPERATURE);

    public double value;
    public Units mainUnitType;

    UnitType(double value, Units mainUnitType) {
        this.value = value;
        this.mainUnitType = mainUnitType;
    }
}
