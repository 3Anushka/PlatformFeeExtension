package com.esop.schema

import com.esop.STTFeeLessThanZeroException
import java.math.BigInteger

class STTFee {

    companion object {

        private var totalSTTFee: BigInteger = BigInteger("0")

        fun addSTTFee(fee: Long) {
            if (fee < 0)
                throw STTFeeLessThanZeroException()
            totalSTTFee += fee.toBigInteger()
        }

        fun getSTTFee(): BigInteger {
            return totalSTTFee
        }

    }


}
