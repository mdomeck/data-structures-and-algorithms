package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidatePinTest {

    @Test
    public void validPins() {
        assertEquals(true, ValidatePin.validatePinKata("1234"));
        assertEquals(true, ValidatePin.validatePinKata("0000"));
        assertEquals(true, ValidatePin.validatePinKata("1111"));
        assertEquals(true, ValidatePin.validatePinKata("123456"));
        assertEquals(true, ValidatePin.validatePinKata("098765"));
        assertEquals(true, ValidatePin.validatePinKata("000000"));
        assertEquals(true, ValidatePin.validatePinKata("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, ValidatePin.validatePinKata("a234"));
        assertEquals(false, ValidatePin.validatePinKata(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, ValidatePin.validatePinKata("1"));
        assertEquals(false, ValidatePin.validatePinKata("12"));
        assertEquals(false, ValidatePin.validatePinKata("123"));
        assertEquals(false, ValidatePin.validatePinKata("12345"));
        assertEquals(false, ValidatePin.validatePinKata("1234567"));
        assertEquals(false, ValidatePin.validatePinKata("-1234"));
        assertEquals(false, ValidatePin.validatePinKata("1.234"));
        assertEquals(false, ValidatePin.validatePinKata("00000000"));
    }

}
