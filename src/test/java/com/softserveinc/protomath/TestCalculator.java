package com.softserveinc.protomath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Pruebas unitarias del proyecto
public class TestCalculator {

    //Pruebas unitarias para el cuadrado
    @Test
    public void testCuadradoPositivo() {
        Calculator calc = new Calculator();
        assertEquals(25.0, calc.cuadrado(5.0), 0);
    }

    @Test
    public void testCuadradoCero() {
        Calculator calc = new Calculator();
        assertEquals(0.0, calc.cuadrado(0.0), 0);
    }

    @Test
    public void testCuadradoUno() {
        Calculator calc = new Calculator();
        assertEquals(1.0, calc.cuadrado(1.0), 0);
    }

    @Test
    public void testCuadradoNegativo() {
        Calculator calc = new Calculator();
        assertEquals(16.0, calc.cuadrado(-4.0), 0);
    }
    
    //Pruebas unitarias para el cubo
    @Test
    public void testCuboPositivo() {
        Calculator calc = new Calculator();
        assertEquals(125.0, calc.cubo(5.0), 0);
    }

    @Test
    public void testCuboCero() {
        Calculator calc = new Calculator();
        assertEquals(0.0, calc.cubo(0.0), 0);
    }

    @Test
    public void testCuboUno() {
        Calculator calc = new Calculator();
        assertEquals(1.0, calc.cubo(1.0), 0);
    }
    
    @Test
    public void testCuboMenosUno() {
        Calculator calc = new Calculator();
        assertEquals(-1.0, calc.cubo(-1.0), 0);
    }

    @Test
    public void testCuboNegativo() {
        Calculator calc = new Calculator();
        assertEquals(-64.0, calc.cubo(-4.0), 0);
    }
}
