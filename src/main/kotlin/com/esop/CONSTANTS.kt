package com.esop


val errors = mapOf(
    "PHONENUMBER_EXISTS" to "User with given phone number already exists.",
    "USERNAME_EXISTS" to "User with given username already exists",
    "EMAIL_EXISTS" to "User with given email already exists",
    "INVALID_EMAIL" to "Email id is not valid",
    "INVALID_PHONENUMBER" to "Phone number is not valid",
    "USER_DOES_NOT_EXISTS" to "User not found",
    "POSITIVE_QUANTITY" to "Quantity must be positive.",
    "POSITIVE_PRICE" to "Price must be positive.",
    "INVALID_TYPE" to "Given type doesn't exist.",
    "NO_ORDERS" to "User does not have any orders",
    "INVALID_TYPE" to "Type of Esop doesn't exist",
    "QUANTITY_NOT_ACCEPTED" to "Quantity of ESOPs must be between 0 to 10000",
    "INVALID_USERNAME" to "Invalid User Name: username can consist only of alphabets, numbers or hyphen(s) and should start with an alphabet."
)


const val MAX_WALLET_CAPACITY = 10_000_000L

const val MAX_INVENTORY_CAPACITY = 10_000_000L


const val NON_PERFORMANCE_SLAB_1_PERCENTAGE = 0.01
const val NON_PERFORMANCE_SLAB_2_PERCENTAGE = 0.0125
const val NON_PERFORMANCE_SLAB_3_PERCENTAGE = 0.015
const val MAX_ESPO_QUANTITY_SLAB_ONE = 100
const val MAX_ESPO_QUANTITY_SLAB_TWO = 50000
const val NON_PERFORMANCE_CAP_AMOUNT = 20L
const val PERFORMANCE_CAP_AMOUNT = 50L
const val PERFORMANCE_SLAB_1_PERCENTAGE = 0.02
const val PERFORMANCE_SLAB_2_PERCENTAGE = 0.0225
const val PERFORMANCE_SLAB_3_PERCENTAGE = 0.025