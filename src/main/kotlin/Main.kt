package ru.netology

import kotlin.math.ceil

fun main() {
    val itemPrice = 100_00
    val itemCount = 12
    val discountMin = 100_00
    val discountMax = 0.05
    val dicountForSingLover = 0.01
    val ifSingLover = true

    var sum = itemPrice * itemCount

    if(sum > 1000_00 && sum <= 10000_00) {
        sum -= discountMin
    } else if (sum > 10000_00) {
        sum = ceil(sum - sum * discountMax).toInt()
    }

    if(ifSingLover) {
        sum = ceil(sum - sum * dicountForSingLover).toInt()
    }

    println(sum)
}