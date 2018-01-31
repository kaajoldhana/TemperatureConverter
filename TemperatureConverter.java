package junitIntroduction;

/**
 * This class has functions to convert temperatures between Fahrenheit and Celsius
 */
public class TemperatureConverter {
    /**
     * This method takes a celsius temperature measurement and converts it to Fahrenheit
     * @param  celsius double temperature in celsius
     * @return Fahrenheit
     */
    public static double celsisusToFahrenheit(double celsius) {

        double fahrenheit = (9.0/5.0)*celsius + 32;
        return fahrenheit;
    }

    /**
     * This method takes a Fahrenheit temperature and converts it to Celsius
     * @param fahrenheit double temperature in Fahrenheit 
     * @return celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit){

        double celsius = (5.0/9.0)*(fahrenheit - 32);
        return celsius;

    }

}
