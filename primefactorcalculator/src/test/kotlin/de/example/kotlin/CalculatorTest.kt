package de.example.kotlin
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

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

    @Test
    fun shouldReturnCorrectPrimeFactors(){
        assertThat(Calculator.splitInPrimeFactors(0), `is`(emptyList()))
        assertThat(Calculator.splitInPrimeFactors(1), `is`(emptyList()))
        assertThat(Calculator.splitInPrimeFactors(2), `is`(listOf(2)))
        assertThat(Calculator.splitInPrimeFactors(3), `is`(listOf(3)))
        assertThat(Calculator.splitInPrimeFactors(4), `is`(listOf(2,2)))
        assertThat(Calculator.splitInPrimeFactors(17954), `is`(listOf(2, 47, 191)))
    }

}