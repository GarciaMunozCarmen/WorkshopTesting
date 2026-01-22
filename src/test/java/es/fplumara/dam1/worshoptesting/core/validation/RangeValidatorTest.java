package es.fplumara.dam1.worshoptesting.core.validation;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

import es.fplumara.dam1.workshoptesting.core.validation.RangeValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RangeValidatorTest {
    private RangeValidator validator;
    @BeforeEach
    public void setUp(){
        validator = new RangeValidator();
    }
    @ParameterizedTest
    @CsvSource({
            "0",
            "58",
            "20"
    })
    public void validAgeTest(int edad){
        assertTrue(validator.isValidAge(edad));
    }
    @ParameterizedTest
    @CsvSource({
            "-6",
            "121",
            "389"
    })
    public void invalidAgeTest(int edad){
        assertFalse(validator.isValidAge(edad));
    }
}
