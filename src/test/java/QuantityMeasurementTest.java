import com.quantityMesurment.QuantityMeasurement;
import com.quantityMesurment.UnitCheck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.quantityMesurment.UnitCheck.*;

public class QuantityMeasurementTest {

    private QuantityMeasurement measurement;

    @Before
    public void QuantityMeasurement() {
        measurement = new QuantityMeasurement();
    }

    @Test
    public void givenQuantityMesurmentData_WhenCorrect_ShouldReturn_CorrectFeet() {
        double checkForFeet = measurement.unitValueCheck(FEET_TO_INCH, 0.0);
        Assert.assertEquals(checkForFeet, checkForFeet, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForNullCheck_WhenCorrect_ShouldReturn_Correctmeasurment() {
        double result = measurement.unitValueCheck(UnitCheck.FEET_TO_INCH, 0.0);
        double result1 = measurement.unitValueCheck(UnitCheck.FEET_TO_INCH, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForRefranceCheck_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(UnitCheck.FEET_TO_INCH, 0.0);
        double result1 = measurement.unitValueCheck(UnitCheck.FEET_TO_INCH, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForTypeCheck_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(UnitCheck.FEET_TO_INCH, 5.0);
        double result1 = measurement.unitValueCheck(UnitCheck.FEET_TO_INCH, 5.0);
        Assert.assertEquals(result, result1, 0.0);

    }

    @Test
    public void givenQuantityMesurmentCheckForEquality_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(UnitCheck.FEET_TO_INCH, 0.0);
        double result1 = measurement.unitValueCheck(UnitCheck.FEET_TO_INCH, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentDataForInch_WhenCorrect_ShouldReturn_CorrectFeet() {
        double checkForFeet = measurement.unitValueCheck(INCH_TO_FEET, 0.0);
        Assert.assertEquals(checkForFeet, checkForFeet, 0.0);
    }

    @Test
    public void givenQuantityMesurmentDataInInch_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(INCH_TO_FEET, 0.0);
        double result1 = measurement.unitValueCheck(INCH_TO_FEET, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForNullCheckInInch_WhenCorrect_ShouldReturn_Correctmeasurment() {
        double result = measurement.unitValueCheck(INCH_TO_FEET, 0.0);
        double result1 = measurement.unitValueCheck(INCH_TO_FEET, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForRefranceCheckInInch_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(INCH_TO_FEET, 0.0);
        double result1 = measurement.unitValueCheck(INCH_TO_FEET, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForTypeCheckInInch_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(INCH_TO_FEET, 0.0);
        double result1 = measurement.unitValueCheck(INCH_TO_FEET, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentCheckForEqualityInInch_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(INCH_TO_FEET, 0.0);
        double result1 = measurement.unitValueCheck(INCH_TO_FEET, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1ftNotEqualTo1In_WhenCorrect_ShouldReturn_CorrectResult() {
        double feetvalue = measurement.unitValueCheck(UnitCheck.FEET_TO_INCH, 1.0);
        double inchValue = measurement.unitValueCheck(INCH_TO_FEET, 1.0);
        Assert.assertNotEquals(feetvalue, inchValue, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1InchNotEqualTo1ft_WhenCorrect_ShouldReturn_CorrectResult() {
        double inchValue = measurement.unitValueCheck(INCH_TO_FEET, 1.0);
        double feetvalue = measurement.unitValueCheck(UnitCheck.FEET_TO_INCH, 1.0);
        Assert.assertNotEquals(feetvalue, inchValue, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1ftEqualsTo12inch_WhenCorrect_ShouldReturn_CorrectResult() {
        double inchValue = measurement.unitValueCheck(UnitCheck.FEET_TO_INCH, 1.0);
        Assert.assertEquals(12, inchValue, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor12InchEqualTo1ft_WhenCorrect_ShouldReturn_CorrectResult() {
        double feetValue = measurement.unitValueCheck(INCH_TO_FEET, 12.0);
        Assert.assertEquals(1, feetValue, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor3ftTo1Yard_WhenCorrect_ShouldReturn_CorrectResult() {
        double feetValue = measurement.unitValueCheck(FEET_TO_YARD, 3.0);
        Assert.assertEquals(1, feetValue, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1ftNotEqualTo1Yard_WhenCorrect_ShouldReturn_CorrectResult() {
        double feetValue = measurement.unitValueCheck(FEET_TO_INCH, 1.0);
        double oneFeetToYard = measurement.unitValueCheck(YARDS, 1.0);
        Assert.assertNotEquals(feetValue, oneFeetToYard, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1InchNotEqualTo1Yard_WhenCorrect_ShouldReturn_CorrectResult() {
        double inchValue = measurement.unitValueCheck(INCH_TO_FEET, 1.0);
        double oneFeetToYard = measurement.unitValueCheck(YARDS, 1.0);
        Assert.assertNotEquals(inchValue, oneFeetToYard, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1YardEqualsTo36Inch_WhenCorrect_ShouldReturn_CorrectResult() {
        double oneFeetToYard = measurement.unitValueCheck(YARDS, 1.0);
        Assert.assertEquals(36, oneFeetToYard, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1YardEqualsTo3ft_WhenCorrect_ShouldReturn_CorrectResult() {
        double oneYardToFeet = measurement.unitValueCheck(YARDS, 1.0);
        Assert.assertEquals(3, oneYardToFeet, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor2InTo5cm_WhenCorrect_ShouldReturn_CorrectResult() {
        double oneYardToFeet = measurement.unitValueCheck(CM_TO_INCH, 2.0);
        Assert.assertEquals(5, oneYardToFeet, 1);
    }
}

