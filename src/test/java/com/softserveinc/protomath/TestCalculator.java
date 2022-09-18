package com.softserveinc.protomath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Unit tests
public class TestCalculator {

    //Square unit tests
    @Test
    public void testSquareOfPositive() {
        Calculator calc = new Calculator();
        assertEquals(25.0, calc.square(5.0), 0);
    }

    @Test
    public void testSquareOfZero() {
        Calculator calc = new Calculator();
        assertEquals(0.0, calc.square(0.0), 0);
    }

    @Test
    public void testSquareOfOne() {
        Calculator calc = new Calculator();
        assertEquals(1.0, calc.square(1.0), 0);
    }

    @Test
    public void testSquareOfNegative() {
        Calculator calc = new Calculator();
        assertEquals(16.0, calc.square(-4.0), 0);
    }
    
    //Cube unit tests
    @Test
    public void testCubeOfPositive() {
        Calculator calc = new Calculator();
        assertEquals(125.0, calc.cube(5.0), 0);
    }

    @Test
    public void testCubeOfZero() {
        Calculator calc = new Calculator();
        assertEquals(0.0, calc.cube(0.0), 0);
    }

    @Test
    public void testCubeOfOne() {
        Calculator calc = new Calculator();
        assertEquals(1.0, calc.cube(1.0), 0);
    }
    
    @Test
    public void testCubeOfMinusOne() {
        Calculator calc = new Calculator();
        assertEquals(-1.0, calc.cube(-1.0), 0);
    }

    @Test
    public void testCubeOfNegative() {
        Calculator calc = new Calculator();
        assertEquals(-64.0, calc.cube(-4.0), 0);
    }
}
