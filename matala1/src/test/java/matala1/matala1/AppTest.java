package matala1.matala1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppTest {

ex1 tester = new ex1();
	
    /**
     * אור סמוביץ 311170435 - סופיה קריבוביאז 330480781
     */
    @Test
    public void Test_case_1() {
    	String Expected_result = "A";
    	double a = 30, b = 15;
    	String mod = "Regular";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    @Test
    public void Test_case_2() {
    	String Expected_result = "B";
    	double a = 10, b = 20;
    	String mod = "Regular";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    
    @Test
    public void Test_case_3() {
        String Expected_result = "Error: Invalid input";
        double a = Double.NaN, b = 5;
        String mod = "Regular";
        String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }


    @Test
    public void Test_case_4() {
    	String Expected_result = "B";
    	double a = -50, b = -60;
    	String mod = "Negative";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    @Test
    public void Test_case_5() {
    	String Expected_result = "A";
    	double a = -30, b = -5;
    	String mod = "Negative";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    
    @Test
    public void Test_case_6() {
        String Expected_result = "Error: Invalid input";
        double a = Double.POSITIVE_INFINITY, b = -5;
        String mod = "opposites";
        String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }

    
    @Test
    public void Test_case_7() {
    	String Expected_result = "A";
    	double a = 2, b = 4;
    	String mod = "Reciprocal";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    
    @Test
    public void Test_case_8() {
    	String Expected_result = "B";
    	double a = 105, b = 90;
    	String mod = "Reciprocal";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    

    @Test
    public void Test_case_9() {
    	String Expected_result = "Error";
    	double a = 0.9, b = 0;
    	String mod = "Reciprocal";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    
}
