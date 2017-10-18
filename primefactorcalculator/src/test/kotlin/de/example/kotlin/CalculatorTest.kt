package de.example.kotlin

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue

internal class CalculatorTest {

    @Test
    fun shouldValidatePrimeNumbers() {
        assertFalse(Calculator.isNumberPrime(0))
        assertFalse(Calculator.isNumberPrime(1))
        assertTrue(Calculator.isNumberPrime(2))
        assertTrue(Calculator.isNumberPrime(3))
        assertFalse(Calculator.isNumberPrime(4))
        assertTrue(Calculator.isNumberPrime(5))
        assertTrue(Calculator.isNumberPrime(23))
    }

    @Test
    fun shouldValidatePrimeNumbersBloated() {
        assertFalse(Calculator.isNumberPrimeBloated(0))
        assertFalse(Calculator.isNumberPrimeBloated(1))
        assertTrue(Calculator.isNumberPrimeBloated(2))
        assertTrue(Calculator.isNumberPrimeBloated(3))
        assertFalse(Calculator.isNumberPrimeBloated(4))
        assertTrue(Calculator.isNumberPrimeBloated(5))
        assertTrue(Calculator.isNumberPrimeBloated(23))
    }
}