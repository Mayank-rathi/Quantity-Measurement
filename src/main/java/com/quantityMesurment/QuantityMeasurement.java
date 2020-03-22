package com.quantityMesurment;

public class QuantityMeasurement {
    private UnitType unitType;
    private double quantiity;

    public QuantityMeasurement(UnitType unitType, double quantiity) {
        this.unitType = unitType;
        this.quantiity = quantiity;
    }

    public double convert(QuantityMeasurement quantityMeasurement) {
        return quantityMeasurement.quantiity * quantityMeasurement.unitType.value / this.unitType.value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof QuantityMeasurement)) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return this.compare(quantityMeasurement);
    }

    public double additionOfTwoUnits(QuantityMeasurement quantityObject1, QuantityMeasurement quantityObject2, OutputUnit unit) {
        double addition = (quantityObject1.unitType.value * quantityObject1.quantiity) +
                (quantityObject2.unitType.value * quantityObject2.quantiity);
        if (unit != null)
            return Math.round(100 * unit.value * addition) / 100D;
        return addition;
    }

    public boolean compare(QuantityMeasurement quantityMeasurement) {
        if (unitType.equals(quantityMeasurement.unitType))
            return Double.compare(quantiity, quantityMeasurement.quantiity) == 0;
        double convertValue = convert(quantityMeasurement);
        return Double.compare(quantiity, Math.floor(convertValue)) == 0;
    }
}

