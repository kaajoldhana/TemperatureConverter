package junitIntroduction;
import static org.junit.Assert.*;
import org.junit.Test;


public class TemperatureConverterTests {
    @Test
    public void testCeltoF(){
        double result = TemperatureConverter.celsisusToFahrenheit(0);
        assertEquals(32.0,result,0);

    }
    @Test
    public void testFartoC(){
        double result = TemperatureConverter.fahrenheitToCelsius(32);
        assertEquals(0.0, result, 0);
    }
}



