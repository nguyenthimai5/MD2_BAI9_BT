package BT1;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
@DisplayName("nextDay")
    void  getNextDayTest01(){
    String currenDay="2018-1-1";
    String expected="2018-1-2";
    NextDayCalculator nextDayCalculator=new NextDayCalculator();
    String nextDate=nextDayCalculator.getNextDay(currenDay);
    assertEquals(expected,nextDate);
}
    @Test
    @DisplayName("nextDay")
    void  getNextDayTest02(){
        String currenDay="2018-1-31";
        String expected="2018-2-1";
        NextDayCalculator nextDayCalculator=new NextDayCalculator();
        String nextDate=nextDayCalculator.getNextDay(currenDay);
        assertEquals(expected,nextDate);
    }
    @Test
    @DisplayName("nextDay")
    void  getNextDayTest03(){
        String currenDay="2018-4-30";
        String expected="2018-5-1";
        NextDayCalculator nextDayCalculator=new NextDayCalculator();
        String nextDate=nextDayCalculator.getNextDay(currenDay);
        assertEquals(expected,nextDate);
    }
    @Test
    @DisplayName("nextDay")
    void  getNextDayTest04(){
        String currenDay="2020-2-29";
        String expected="2020-3-1";
        NextDayCalculator nextDayCalculator=new NextDayCalculator();
        String nextDate=nextDayCalculator.getNextDay(currenDay);
        assertEquals(expected,nextDate);
    }
    @Test
    @DisplayName("nextDay")
    void  getNextDayTest05(){
        String currenDay="2018-12-31";
        String expected="2019-1-1";
        NextDayCalculator nextDayCalculator=new NextDayCalculator();
        String nextDate=nextDayCalculator.getNextDay(currenDay);
        assertEquals(expected,nextDate);
    }
}