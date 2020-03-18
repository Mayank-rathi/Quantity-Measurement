import com.quantityMesurment.QuantityMeasurement;
import com.quantityMesurment.UnitType;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Test
    public void givenFeetZero_ShoulfReturnZero() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.FEET, 1.00);
        QuantityMeasurement expectedQuantityMeasurement = new QuantityMeasurement(UnitType.FEET, 1.00);
        Assert.assertEquals(expectedQuantityMeasurement, quantityMeasurement);
    }

    @Test
    public void givenNullAsObject_AndInchInZero_ShouldReturnEquals() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.FEET, 0);
        Assert.assertNotEquals(quantityMeasurement, null);
    }

    @Test
    public void givenFeetInZero_AndInch_ShouldreturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.FEET, 0);
        QuantityMeasurement expectedQuantityMeasurement = new QuantityMeasurement(UnitType.INCH, 0);
        Assert.assertEquals(quantityMeasurement, expectedQuantityMeasurement);
    }

    @Test
    public void givenOneFeet_AndOneInch_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.FEET, 0);
        Assert.assertNotEquals(quantityMeasurement, UnitType.INCH);

    }

    @Test
    public void givenQuantityMesurmentData_WhenCorrect_ShouldReturn_CorrectFeet() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.FEET, 0);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement);
    }


    @Test
    public void givenQuantityMesurmentCheckForEquality_WhenCorrect_ShouldReturn_CorrectFeet() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.INCH, 0.0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(UnitType.INCH, 0.0);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMesurmentDataForInch_WhenCorrect_ShouldReturn_CorrectFeet() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.INCH, 1.00);
        QuantityMeasurement expected = new QuantityMeasurement(UnitType.INCH, 1.00);
        Assert.assertEquals(expected, quantityMeasurement);
    }

    @Test
    public void givenQuantityMesurmentFor1ftNotEqualTo1In_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.INCH, 1.0);
        QuantityMeasurement measurement = new QuantityMeasurement(UnitType.FEET, 1.0);
        Assert.assertNotEquals(measurement, quantityMeasurement);
    }

    @Test
    public void givenQuantityMesurmentFor1ftEqualsTo12inch_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.FEET, 1.00);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(UnitType.INCH, 12.00);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMesurmentFor12InchEqualTo1ft_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.INCH, 12.00);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(UnitType.FEET, 1.00);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMesurmentFor3ftTo1Yard_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.FEET, 3.00);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(UnitType.YARD, 1.00);
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMesurmentFor1ftNotEqualTo1Yard_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.FEET, 1.00);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(UnitType.YARD, 1.00);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMesurmentFor1InchNotEqualTo1Yard_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.INCH, 1.00);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(UnitType.YARD, 1.00);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMesurmentFor1YardEqualsTo36Inch_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.YARD, 1.00);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(UnitType.INCH, 36.00);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMesurmentFor1YardEqualsTo3ft_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.YARD, 1.00);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(UnitType.INCH, 3.00);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenQuantityMesurmentFor2InTo5cm_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(UnitType.INCH, 2.00);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(UnitType.CENTIMETER, 5.00);
        Assert.assertNotEquals(quantityMeasurement, quantityMeasurement1);
    }

}

