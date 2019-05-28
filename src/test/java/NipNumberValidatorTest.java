import Exceptions.WrongLengthException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class NipNumberValidatorTest {

    @Test
    void shouldReturnControlDigit(){
        String nip = "895-18-65-838";
        NipNumberValidator nipNumberValidator = new NipNumberValidator(nip);
        Assertions.assertEquals("8951865838",nipNumberValidator.getNip());
    }

    @Test
    void shouldReturnNipValidationTrue() throws WrongLengthException {
        String nip = "895-18-65-838";
        NipNumberValidator nipNumberValidator = new NipNumberValidator(nip);
        Assertions.assertTrue(nipNumberValidator.isNipValid());
    }
    @Test
    void shouldReturnNipValidationFalse() throws WrongLengthException {
        String nip = "895-18-65-837";
        NipNumberValidator nipNumberValidator = new NipNumberValidator(nip);
        Assertions.assertFalse(nipNumberValidator.isNipValid());
    }
    @Test
    void assertThrowsExceptionWrongLengthException() {
        String nip = "895-18-65-8388";
        NipNumberValidator nipNumberValidator = new NipNumberValidator(nip);
        assertThrows(WrongLengthException.class, nipNumberValidator::isNipValid);
    }
    @Test
    void assertThrowsExceptionNumberFormatException() {
        String nip = "895-18-65-83a";
        NipNumberValidator nipNumberValidator = new NipNumberValidator(nip);
        assertThrows(NumberFormatException.class, nipNumberValidator::isNipValid);
    }
}
