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
        QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 3.00);
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.00);
        Assert.assertEquals(feet, yard);
    }

    @Test
    public void givenQuantityMesurmentFor1ftNotEqualTo1Yard_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 1.00);
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.00);
        Assert.assertNotEquals(feet, yard);
    }

    @Test
    public void givenQuantityMesurmentFor1InchNotEqualTo1Yard_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 1.00);
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.00);
        Assert.assertNotEquals(inch, yard);
    }

    @Test
    public void givenQuantityMesurmentFor1YardEqualsTo36Inch_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.00);
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 36.00);
        Assert.assertNotEquals(yard, inch);
    }

    @Test
    public void givenQuantityMesurmentFor1YardEqualsTo3ft_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement yard = new QuantityMeasurement(UnitType.YARD, 1.00);
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 3.00);
        Assert.assertNotEquals(yard, inch);
    }

    @Test
    public void givenQuantityMesurmentFor2InTo5cm_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 2.00);
        QuantityMeasurement cm = new QuantityMeasurement(UnitType.CENTIMETER, 5.00);
        Assert.assertEquals(inch, cm);
    }

    @Test
    public void givenQuantityMesurmentForAdd2InTo2In_When4InchIsCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 2.00);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.INCH, 2.00);
        double addition = inch.additionOfTwoUnits(inch, inch1, null);
        Assert.assertEquals(4.00, addition, 0.00);
    }

    @Test
    public void givenQuantityMesurmentFor2InTo2In_WhenCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 2.00);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitType.INCH, 2.00);
        double addition = inch.additionOfTwoUnits(inch1, inch, null);
        Assert.assertEquals(4, addition, 0.00);
    }

    @Test
    public void givenQuantityMesurmentForAdd1FtAnd2Inch_When14InchIsCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 1.00);
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 2.00);
        double addition = feet.additionOfTwoUnits(feet, inch, null);
        Assert.assertEquals(14, addition, 0.00);
    }

    @Test
    public void givenQuantityMesurmentForAdd1FtAnd1Ft_When24InchIsCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement feet = new QuantityMeasurement(UnitType.FEET, 1.00);
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitType.FEET, 1.00);
        double addition = feet.additionOfTwoUnits(feet1, feet, null);
        Assert.assertEquals(24, addition, 0.00);
    }

    @Test
    public void givenQuantityMesurmentForAdd2InchAnd2_5Cm_When3InchIsCorrect_ShouldReturn_CorrectResult() {
        QuantityMeasurement inch = new QuantityMeasurement(UnitType.INCH, 2.00);
        QuantityMeasurement cm = new QuantityMeasurement(UnitType.CENTIMETER, 2.5);
        double addition = inch.additionOfTwoUnits(cm, inch, null);
        Assert.assertEquals(3, addition, 0.0);
    }

    @Test
    public void givenGallonAndLitres_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement gallon = new QuantityMeasurement(UnitType.GALLON, 1);
        QuantityMeasurement litre = new QuantityMeasurement(UnitType.LITER, 3.78);
        boolean compareCheck = gallon.equals(litre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenLitresAndMl_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement gallon = new QuantityMeasurement(UnitType.GALLON, 1);
        QuantityMeasurement ml = new QuantityMeasurement(UnitType.ML, 3.78);
        boolean compareCheck = gallon.equals(ml);
        Assert.assertTrue(compareCheck);
    }
}

