package com.ahmedalamin.problemsolvingassuitsheet.sheet1

import java.math.RoundingMode

fun main() {

    var x: Double? = null
    readln()?.let {
       x = (3.141592653 * it.toDouble() * it.toDouble())
    }

   print(String.format("%.9f",x).toDouble())
}




