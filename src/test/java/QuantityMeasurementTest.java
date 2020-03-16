import com.quantityMesurment.QuantityMeasurement;
import com.quantityMesurment.UnitCheck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.quantityMesurment.UnitCheck.FEETUNIT;
import static com.quantityMesurment.UnitCheck.INCHUNIT;

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
}

