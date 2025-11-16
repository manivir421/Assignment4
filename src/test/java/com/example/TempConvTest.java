package com.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureConverterTest {

    private final TempConvRefactored converter = new TempConvRefactored();

    @Test
    void testCelsiusToFahrenheit() {
        double result = converter.CelsiusToFahrenheit(0);
        assertEquals(32.0, result, 0.001);

        result = converter.CelsiusToFahrenheit(100);
        assertEquals(212.0, result, 0.001);
    }

    @Test


    void testFahrenheitToCelsius() {
        double result = converter.FahrenheitToCelsius(32);
        assertEquals(0.0, result, 0.001);

        result = converter.FahrenheitToCelsius(212);
        assertEquals(100.0, result, 0.001);
    }
    @Test
    void testCelsiusToKelvin() {
        double result = converter.CelsiusToKelvin(0);
        assertEquals(273.15, result, 0.001);

        result = converter.CelsiusToKelvin(100);
        assertEquals(373.15, result, 0.001);
    }

}