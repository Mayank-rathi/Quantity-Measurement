package com.quantityMesurment;

public class QuantityMeasurement {
    public double fistValue;
    public double secondValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return fistValue == that.fistValue &&
                secondValue == that.secondValue;
    }

    public double unitValueCheck(UnitCheck unit, double value) {
        return value * unit.value;
    }

}