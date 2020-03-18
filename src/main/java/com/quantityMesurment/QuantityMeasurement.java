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

    private boolean compare(QuantityMeasurement quantityMeasurement) {
        if (this.unitType.equals(quantityMeasurement.unitType))
            return Double.compare(this.quantiity, quantityMeasurement.quantiity) == 0;
        double convertValue = this.convert(quantityMeasurement);
        return Double.compare(this.quantiity, Math.floor(convertValue)) == 0;
    }
}

