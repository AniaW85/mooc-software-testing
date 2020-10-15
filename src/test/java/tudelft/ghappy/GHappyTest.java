package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest
    @CsvSource({"xxgggxx, true", "xxgg, true", "gg, true", "ggg, true", "xxggxx, true", "abcd,true"})
    public void HappyFlowTest (String input, Boolean expectedResult){
        GHappy happy = new GHappy();
        Boolean result = happy.gHappy(input);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({"xgx, false", "g, false", "gxg, false", "xxgxx, false", "xxggyygxx, false"})
    public void UnhappyFlowTest (String input, Boolean expectedResult) {
        GHappy happy = new GHappy();
        Boolean result = happy.gHappy(input);
        Assertions.assertEquals(expectedResult, result);
    }
}
