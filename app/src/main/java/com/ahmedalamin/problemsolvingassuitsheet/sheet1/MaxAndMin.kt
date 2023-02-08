package com.ahmedalamin.problemsolvingassuitsheet.sheet1

fun main() {
    var list = mutableListOf<Int>()

    readln()?.let { line->
        line.split(" ").map {
            it.toInt()
        }.forEach {
            list.add(it)
        }
    }

    print("${list.min()} ${list.max()}")
}