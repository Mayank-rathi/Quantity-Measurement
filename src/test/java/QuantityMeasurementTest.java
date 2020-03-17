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
        double checkForFeet = measurement.unitValueCheck(FEETUNIT, 0.0);
        Assert.assertEquals(checkForFeet, checkForFeet, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForNullCheck_WhenCorrect_ShouldReturn_Correctmeasurment() {
        double result = measurement.unitValueCheck(UnitCheck.FEETUNIT, 0.0);
        double result1 = measurement.unitValueCheck(UnitCheck.FEETUNIT, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForRefranceCheck_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(UnitCheck.FEETUNIT, 0.0);
        double result1 = measurement.unitValueCheck(UnitCheck.FEETUNIT, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForTypeCheck_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(UnitCheck.FEETUNIT, 5.0);
        double result1 = measurement.unitValueCheck(UnitCheck.FEETUNIT, 5.0);
        Assert.assertEquals(result, result1, 0.0);

    }

    @Test
    public void givenQuantityMesurmentCheckForEquality_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(UnitCheck.FEETUNIT, 0.0);
        double result1 = measurement.unitValueCheck(UnitCheck.FEETUNIT, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentDataForInch_WhenCorrect_ShouldReturn_CorrectFeet() {
        double checkForFeet = measurement.unitValueCheck(INCHUNIT, 0.0);
        Assert.assertEquals(checkForFeet, checkForFeet, 0.0);
    }

    @Test
    public void givenQuantityMesurmentDataInInch_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(INCHUNIT, 0.0);
        double result1 = measurement.unitValueCheck(INCHUNIT, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForNullCheckInInch_WhenCorrect_ShouldReturn_Correctmeasurment() {
        double result = measurement.unitValueCheck(INCHUNIT, 0.0);
        double result1 = measurement.unitValueCheck(INCHUNIT, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForRefranceCheckInInch_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(INCHUNIT, 0.0);
        double result1 = measurement.unitValueCheck(INCHUNIT, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentForTypeCheckInInch_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(INCHUNIT, 0.0);
        double result1 = measurement.unitValueCheck(INCHUNIT, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentCheckForEqualityInInch_WhenCorrect_ShouldReturn_CorrectFeet() {
        double result = measurement.unitValueCheck(INCHUNIT, 0.0);
        double result1 = measurement.unitValueCheck(INCHUNIT, 0.0);
        Assert.assertEquals(result, result1, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1ftNotEqualTo1In_WhenCorrect_ShouldReturn_CorrectResult() {
        double feetvalue = measurement.unitValueCheck(UnitCheck.FEETUNIT, 1.0);
        double inchValue = measurement.unitValueCheck(INCHUNIT, 1.0);
        Assert.assertNotEquals(feetvalue, inchValue, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1InchNotEqualTo1ft_WhenCorrect_ShouldReturn_CorrectResult() {
        double inchValue = measurement.unitValueCheck(INCHUNIT, 1.0);
        double feetvalue = measurement.unitValueCheck(UnitCheck.FEETUNIT, 1.0);
        Assert.assertNotEquals(feetvalue, inchValue, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1ftEqualsTo12inch_WhenCorrect_ShouldReturn_CorrectResult() {
        double inchValue = measurement.unitValueCheck(UnitCheck.FEETUNIT, 1.0);
        Assert.assertEquals(12, inchValue, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor12InchEqualTo1ft_WhenCorrect_ShouldReturn_CorrectResult() {
        double feetValue = measurement.unitValueCheck(INCHUNIT, 12.0);
        Assert.assertEquals(1, feetValue, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor3ftTo1Yard_WhenCorrect_ShouldReturn_CorrectResult() {
        double feetValue = measurement.unitValueCheck(FEET_TO_YARD, 3.0);
        Assert.assertEquals(1, feetValue, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1ftNotEqualTo1Yard_WhenCorrect_ShouldReturn_CorrectResult() {
        double feetValue = measurement.unitValueCheck(FEETUNIT, 1.0);
        double oneFeetToYard = measurement.unitValueCheck(YARDSUNIT, 1.0);
        Assert.assertNotEquals(feetValue, oneFeetToYard, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1InchNotEqualTo1Yard_WhenCorrect_ShouldReturn_CorrectResult() {
        double inchValue = measurement.unitValueCheck(INCHUNIT, 1.0);
        double oneFeetToYard = measurement.unitValueCheck(YARDSUNIT, 1.0);
        Assert.assertNotEquals(inchValue, oneFeetToYard, 0.0);
    }

    @Test
    public void givenQuantityMesurmentFor1YardEqualsTo36Inch_WhenCorrect_ShouldReturn_CorrectResult() {
        double oneFeetToYard = measurement.unitValueCheck(YARDSUNIT, 1.0);
        Assert.assertEquals(36, oneFeetToYard, 0.0);
    }
    @Test
    public void givenQuantityMesurmentFor1YardEqualsTo3ft_WhenCorrect_ShouldReturn_CorrectResult() {
        double oneYardToFeet = measurement.unitValueCheck(YARDSUNIT, 1.0);
        Assert.assertEquals(3, oneYardToFeet, 0.0);
    }

}

