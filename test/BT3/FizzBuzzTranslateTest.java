package BT3;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTranslateTest {
@Test
    @DisplayName("Test number")
    void getNumberTest01(){
    String numberTest="15";
    String expected="FizzBuzz";
    FizzBuzzTranslate fizzBuzzTranslate=new FizzBuzzTranslate();
    String result=fizzBuzzTranslate.getNumber(numberTest);
    assertEquals(expected,result);
}
    @Test
    @DisplayName("Test number")
    void getNumberTest02(){
        String numberTest="9";
        String expected="Fizz";
        FizzBuzzTranslate fizzBuzzTranslate=new FizzBuzzTranslate();
        String result=fizzBuzzTranslate.getNumber(numberTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test number")
    void getNumberTest03(){
        String numberTest="5";
        String expected="Buzz";
        FizzBuzzTranslate fizzBuzzTranslate=new FizzBuzzTranslate();
        String result=fizzBuzzTranslate.getNumber(numberTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test number")
    void getNumberStringTest01(){
        String numberTestString="115";
        String expected="Buzz";
        FizzBuzzTranslate fizzBuzzTranslate=new FizzBuzzTranslate();
        String result=fizzBuzzTranslate.getNumberString(numberTestString);
        System.out.println(fizzBuzzTranslate.getNumberRead(Integer.parseInt(numberTestString)));
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test number")
    void getNumberStringTest02(){
        String numberTestString="116";
        String expected="Fizz";
        FizzBuzzTranslate fizzBuzzTranslate=new FizzBuzzTranslate();
        String result=fizzBuzzTranslate.getNumberString(numberTestString);
        System.out.println(fizzBuzzTranslate.getNumberRead(Integer.parseInt(numberTestString)));
        assertEquals(expected,result);
    }
}