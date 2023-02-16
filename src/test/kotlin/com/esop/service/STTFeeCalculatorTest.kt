package com.esop.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class STTFeeCalculatorTest {
    @Test
    fun `it should calculate STTFee for NON_PERFORMANCE Esop with trade quantity less than 100 with cap of RS 20`() {

        val securityTransactionTax = STTFeeCalculator().calculate(10000, "NON_PERFORMANCE", 100)

        assertEquals(20, securityTransactionTax)
    }

    @Test
    fun `it should calculate STTFee for NON_PERFORMANCE Esop with trade quantity less than 100 `() {
        val securityTransactionTax = STTFeeCalculator().calculate(100, "NON_PERFORMANCE", 1)

        assertEquals(1, securityTransactionTax)
    }

    @Test
    fun `it should calculate STTFee for NON_PERFORMANCE Esop with trade quantity between 100 and 50K`() {

        val securityTransactionTax = STTFeeCalculator().calculate(300, "NON_PERFORMANCE", 300)

        assertEquals(4, securityTransactionTax)

    }

    @Test
    fun `it should calculate STTFee for NON_PERFORMANCE Esop with trade quantity between 100 and 50K with cap of RS 20`() {

        val securityTransactionTax = STTFeeCalculator().calculate(30000, "NON_PERFORMANCE", 300)

        assertEquals(20, securityTransactionTax)
    }

    @Test
    fun `it should calculate STTFee for NON_PERFORMANCE Esop with trade quantity greater than 50K`() {
        val securityTransactionTax = STTFeeCalculator().calculate(6000000, "NON_PERFORMANCE", 60000)

        assertEquals(90000, securityTransactionTax)

    }


    @Test
    fun `it should calculate STTFee for PERFORMANCE Esop with trade quantity less than 100 with cap of RS 50`() {
        val securityTransactionTax = STTFeeCalculator().calculate(10000, "PERFORMANCE", 100)

        assertEquals(50, securityTransactionTax)

    }

    @Test
    fun `it should calculate STTFee for PERFORMANCE Esop with trade quantity less than 100 `() {
        val securityTransactionTax = STTFeeCalculator().calculate(100, "PERFORMANCE", 100)

        assertEquals(2, securityTransactionTax)
    }

    @Test
    fun `it should calculate STTFee for PERFORMANCE Esop with trade quantity between 100 and 50K`() {
        val securityTransactionTax = STTFeeCalculator().calculate(150, "PERFORMANCE", 150)

        assertEquals(3, securityTransactionTax)
    }

    @Test
    fun `it should calculate STTFee for PERFORMANCE Esop with trade quantity between 100 and 50K with cap of RS 50`() {
        val securityTransactionTax = STTFeeCalculator().calculate(35000, "PERFORMANCE", 350)

        assertEquals(50, securityTransactionTax)
    }

    @Test
    fun `it should calculate STTFee for PERFORMANCE Esop with trade quantity greater than 50K`() {
        val securityTransactionTax = STTFeeCalculator().calculate(60000, "PERFORMANCE", 60000)

        assertEquals(1500, securityTransactionTax)
    }

}