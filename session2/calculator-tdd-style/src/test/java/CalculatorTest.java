import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }

    @Test
    void shouldBeTurnedOff(){
        assertFalse(calculator.status);
    }

    @Test
    void shouldTurnOn(){
        calculator.turnOn();
        assertTrue(calculator.isOn());
    }

    @Test
    void shouldTurnOff(){
        calculator.turnOn();
        assertTrue(calculator.isOn());

        calculator.turnOff();
        assertFalse(calculator.isOn());
    }

    @Test
    void testIsOff(){

        calculator.turnOn();
        assertFalse(calculator.isOff());

        calculator.turnOff();
        assertTrue(calculator.isOff());
    }

    @Test
    void testIntSum(){
        int sumResult = calculator.add(6,4);
        assertEquals(10,sumResult);
    }

    @Test
    void testFloatSum(){
        float sumResult = calculator.add(6.5f,4.3f);
        assertEquals(10.8f,sumResult);
    }

    @Test
    void testShortSum(){
        short sumResult = calculator.add((short) 6, (short) 5);
        assertEquals(11,sumResult);
    }

    @Test
    void testLongSum(){
        Long sumResult = calculator.add(6L,10L);
        assertEquals(16, sumResult);
    }

    @Test
    void testDoubleSum(){
        Double sumResult = calculator.add(6.55,10.22);
        assertEquals(16.77,sumResult);
    }

    @Test
    void testIntDifference(){
        int diffResult = calculator.subtract(6,4);
        assertEquals(2,diffResult);
    }

    @Test
    void testFloatDifference(){
        float diffResult = calculator.subtract(1.5f,0.3f);
        assertEquals(1.2f,diffResult);
    }

    @Test
    void testLongDifference(){
        Long diffResult = calculator.subtract(10L,3L);
        assertEquals(7L,diffResult);
    }

    @Test
    void testShortDifference(){
        short diffResult = calculator.subtract((short)60,(short)3);
        assertEquals(57,diffResult);
    }
    @Test
    void testDoubleDifference(){
        Double diffResult = calculator.subtract(10.50,3.11);
        assertEquals(7.39,diffResult, 0.001);
    }

    @Test
    void testDifferenceOfNegative(){
        float diffResult = calculator.subtract(-6,4);
        assertEquals(-10,diffResult);
    }

    @Test
    void testIntProductIsCorrect(){
        int productResult = calculator.multiply(2,8);
        assertEquals(16,productResult);
    }

    @Test
    void testIntProductWithNegativeIsCorrect(){
        int productResult = calculator.multiply(-2,8);
        assertEquals(-16,productResult);
    }

    @Test
    void testFloatProductIsCorrect(){
        float productResult = calculator.multiply(2.5f,8.2f);
        assertEquals(20.5,productResult, 0.001);
    }

    @Test
    void testDoubleProductIsCorrect(){
        double productResult = calculator.multiply(2.1,8.1);
        assertEquals(17.01,productResult, 0.001);
    }

    @Test
    void testShortProductIsCorrect(){
        short productResult = calculator.multiply((short)2, (short)8);
        assertEquals(16,productResult);
    }

    @Test
    void testLongProductIsCorrect(){
        long productResult = calculator.multiply(2101L,1010L);
        assertEquals(2122010,productResult);
    }

    @Test
    void testIntQuotient(){
        int quotientResult = calculator.divide(5,2);
        assertEquals(2, quotientResult);
    }

    @Test
    void testIntQuotientWithZeroDivisor(){
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10,0),
                "Expected divide() to throw IllegalArgumentException, but it didn't"
        );
        assertEquals("Cannot divide by 0.", thrown.getMessage());
    }

    @Test
    void testFloatQuotient(){
        float quotientResult = calculator.divide(8.25f,20.4f);
        assertEquals(0.4044, quotientResult, 0.0001);
    }

    @Test
    void testDoubleQuotient(){
        double quotientResult = calculator.divide(8.5,2);
        assertEquals(4.25, quotientResult, 0.0001);
    }

    @Test
    void testShortQuotient(){
        short quotientResult = calculator.divide((short)10, (short)2);
        assertEquals(5, quotientResult);
    }

    @Test
    void testLongQuotient(){
        long quotientResult = calculator.divide(10000,200);
        assertEquals(500, quotientResult);
    }

}
