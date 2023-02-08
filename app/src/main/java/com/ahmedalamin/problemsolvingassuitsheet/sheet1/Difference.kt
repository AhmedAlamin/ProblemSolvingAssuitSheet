package com.ahmedalamin.problemsolvingassuitsheet.sheet1

fun main() {

    var list = mutableListOf<Long>()

    readln()?.let { line ->
        line.split(" ").map {
            it.toLong()
        }.forEach {
            list.add(it)
        }
    }

    print("Difference = ${(list[0] * list[1]) - (list[2] * list[3])}")

}