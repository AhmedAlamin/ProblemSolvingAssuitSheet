package com.ahmedalamin.problemsolvingassuitsheet.sheet1

import java.util.Calendar
import kotlin.math.roundToInt


fun main() {
    var x: Int? = null
    readln()?.let {
        x = it.toInt()
    }

    var year = x?.div(365)
    var month = x?.mod(365)?.div(30)
    var days = x?.mod(365)?.mod(30)


    print("$year years\n" +
            "$month months\n" +
            "$days days")
}