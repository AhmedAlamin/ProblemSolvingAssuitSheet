package com.ahmedalamin.problemsolvingassuitsheet.sheet1

import kotlin.math.ceil
import kotlin.math.roundToInt

fun main() {

    val list = mutableListOf<Float>()

    readln()?.let { line ->
        line.split(" ").map {
            it.toFloat()
        }.forEach {
            list.add(it)
        }
    }


    println("floor ${list[0].toInt()} / ${list[1].toInt()} = ${(list[0]/list[1]).toInt()}")
    println("ceil ${list[0].toInt()} / ${list[1].toInt()} = ${(ceil((list[0]/list[1]).toDouble())).toInt()}")
    println("round ${list[0].toInt()} / ${list[1].toInt()} = ${(list[0]/list[1]).roundToInt()}")


}