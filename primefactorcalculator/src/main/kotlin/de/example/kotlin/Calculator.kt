package de.example.kotlin

/**
 * Simple class that checks if a given number is prime or
 * splits a given number into its prime factors
 *
 * @author bre94
 */
class Calculator {

    /**
     * Equivalent to static methods in Java
     */
    companion object {
        /**
         * Kotlin way of solving the problem
         */
        fun isNumberPrime(number: Int): Boolean {
            return number !in 0..1 && (2..number / 2).none { number % it == 0 }
        }

        /**
         * Java-like way to solve the problem
         */
        @Suppress("RedundantSemicolon")
        fun isNumberPrimeBloated(number: Int): Boolean {
            if (number == 0 || number == 1)
                return false;

            val maxDivisor = number / 2
            for (i in 2..maxDivisor) {
                if (number % maxDivisor == 0)
                    return false;
            }

            return true
        }
    }
}