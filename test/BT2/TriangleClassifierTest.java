package BT2;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {
    @Test
    @DisplayName("Test Triangle")
     void getTriangleTest01(){
       String result = "2_2_2";
        String expected="Đây là tam giác đều";
      TriangleClassifier triangleClassifier=new TriangleClassifier();
      String triangleList1=triangleClassifier.getTriangle(result);
      assertEquals(expected,triangleList1);
    }
    @Test
    @DisplayName("Test Triangle")
    void getTriangleTest02(){
        String result = "2_2_3";
        String expected="Đây là tam giác cân";
        TriangleClassifier triangleClassifier=new TriangleClassifier();
        String triangleList1=triangleClassifier.getTriangle(result);
        assertEquals(expected,triangleList1);
    }
    @Test
    @DisplayName("Test Triangle")
    void getTriangleTest03(){
        String result = "3_4_5";
        String expected="Đây là tam giác thường";
        TriangleClassifier triangleClassifier=new TriangleClassifier();
        String triangleList1=triangleClassifier.getTriangle(result);
        assertEquals(expected,triangleList1);
    }
    @Test
    @DisplayName("Test Triangle")
    void getTriangleTest04(){
        String result = "8_2_3";
        String expected="Đây không phải tam giác";
        TriangleClassifier triangleClassifier=new TriangleClassifier();
        String triangleList1=triangleClassifier.getTriangle(result);
        assertEquals(expected,triangleList1);
    }
    @Test
    @DisplayName("Test Triangle")
    void getTriangleTest05(){
        String result = "-1_2_1";
        String expected="Đây không phải tam giác";
        TriangleClassifier triangleClassifier=new TriangleClassifier();
        String triangleList1=triangleClassifier.getTriangle(result);
        assertEquals(expected,triangleList1);
    }
    @Test
    @DisplayName("Test Triangle")
    void getTriangleTest06(){
        String result = "0_1_1";
        String expected="Đây không phải tam giác";
        TriangleClassifier triangleClassifier=new TriangleClassifier();
        String triangleList1=triangleClassifier.getTriangle(result);
        assertEquals(expected,triangleList1);
    }

}