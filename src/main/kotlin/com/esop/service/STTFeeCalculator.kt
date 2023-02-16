package com.esop.service

import com.esop.*
import kotlin.math.min
import kotlin.math.round

class STTFeeCalculator {


    fun calculate(sellAmount: Long, esopType: String, sellQuantity: Long): Long {
        var securityTransactionFee = 0L
        if (esopType == "NON_PERFORMANCE") {
            securityTransactionFee = if (sellQuantity <= MAX_ESPO_QUANTITY_SLAB_ONE) {
                min(round(sellAmount * NON_PERFORMANCE_SLAB_1_PERCENTAGE).toLong(), NON_PERFORMANCE_CAP_AMOUNT)
            } else if (sellQuantity < MAX_ESPO_QUANTITY_SLAB_TWO) {
                min(round(sellAmount * NON_PERFORMANCE_SLAB_2_PERCENTAGE).toLong(), NON_PERFORMANCE_CAP_AMOUNT)
            } else {
                round(sellAmount * NON_PERFORMANCE_SLAB_3_PERCENTAGE).toLong()
            }
        }
        if (esopType == "PERFORMANCE") {
            securityTransactionFee = if (sellQuantity <= MAX_ESPO_QUANTITY_SLAB_ONE) {
                min(round(sellAmount * PERFORMANCE_SLAB_1_PERCENTAGE).toLong(), PERFORMANCE_CAP_AMOUNT)
            } else if (sellQuantity < MAX_ESPO_QUANTITY_SLAB_TWO) {
                min(round(sellAmount * PERFORMANCE_SLAB_2_PERCENTAGE).toLong(), PERFORMANCE_CAP_AMOUNT)
            } else {
                round(sellAmount * PERFORMANCE_SLAB_3_PERCENTAGE).toLong()
            }
        }

        return securityTransactionFee

    }
}