package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

public class TwoNumbersSumTest {
    ArrayList<Integer> firstNumber= new ArrayList<>();
    ArrayList<Integer> secondNumber=new ArrayList<>();
    ArrayList<Integer> expectedResult=new ArrayList<>();
    @BeforeEach
    public void resetArrays(){
        firstNumber=new ArrayList<>();
        secondNumber=new ArrayList<>();
        expectedResult=new ArrayList<>();
    }
    @Test
    public void addTwoSingleDigitNumbers(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

        firstNumber.add(9);
        secondNumber.add(9);
        expectedResult.add(1);
        expectedResult.add(8);

        ArrayList<Integer> result;

        result=twoNumbersSum.addTwoNumbers(firstNumber, secondNumber);

        Assertions.assertEquals(expectedResult, result);

    }

    @Test
    public void addTwoDoubleDigitNumbers1(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

        firstNumber.add(1);
        firstNumber.add(0);
        secondNumber.add(1);
        secondNumber.add(0);
        expectedResult.add(2);
        expectedResult.add(0);

        ArrayList<Integer> result;

        result=twoNumbersSum.addTwoNumbers(firstNumber, secondNumber);

        Assertions.assertEquals(expectedResult, result);

    }
    @Test
    public void addTwoMixedDigits(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

        firstNumber.add(1);
        firstNumber.add(1);
        secondNumber.add(9);
        expectedResult.add(2);
        expectedResult.add(0);

        ArrayList<Integer> result;

        result=twoNumbersSum.addTwoNumbers(firstNumber, secondNumber);

        Assertions.assertEquals(expectedResult, result);

    }
    @Test
    public void addTwoThreeDigitsNumbers(){
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();

        firstNumber.add(1);
        firstNumber.add(0);
        firstNumber.add(0);
        secondNumber.add(9);
        secondNumber.add(9);
        secondNumber.add(9);
        expectedResult.add(1);
        expectedResult.add(0);
        expectedResult.add(9);
        expectedResult.add(9);

        ArrayList<Integer> result;

        result=twoNumbersSum.addTwoNumbers(firstNumber, secondNumber);

        Assertions.assertEquals(expectedResult, result);

    }
}
