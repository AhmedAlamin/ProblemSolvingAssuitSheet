package com.ahmedalamin.problemsolvingassuitsheet.sheet1

fun main() {
    val list = mutableListOf<String>()

    readln()?.let {line ->
        line.split(" ").map {
            it
        }.forEach {
            list.add(it)
        }
    }

    print((list[0][list[0].lastIndex]).toString().toInt() + list[1][list[1].lastIndex].toString().toInt())
}