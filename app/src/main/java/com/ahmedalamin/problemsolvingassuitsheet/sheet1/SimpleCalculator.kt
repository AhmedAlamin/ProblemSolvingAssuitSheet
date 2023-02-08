package com.ahmedalamin.problemsolvingassuitsheet.sheet1

fun main() {

    val items = mutableListOf<Long>()

    readln()?.let { line ->
        line.split(" ").map {
            it.toLong()
        }.forEach {
            items.add(it)
        }
    }

        println("${items[0]} + ${items[1]} = ${items[0] + items[1]}")
        println("${items[0]} * ${items[1]} = ${items[0] * items[1]}")
        println("${items[0]} - ${items[1]} = ${items[0] - items[1]}")

}