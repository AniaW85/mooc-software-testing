package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest
    @CsvSource({"abc, 1, bcd", "abc, -1, zab", "xyz, 1, yza", "a, 1, b", "ala, 123, tet", "tata,26,tata"})
    public void SuccesfullTest(String input, int shift, String expectedResult){
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher(input, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({"abc7, 1, invalid", "a bc, -1, invalid", "xy@z, 1, invalid", "}, 1, invalid", " ' ', 1, invalid"})
    public void InvalidResultTest(String input, int shift, String expectedResult){
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher(input, shift);
        Assertions.assertEquals(expectedResult, result);
    }

}
