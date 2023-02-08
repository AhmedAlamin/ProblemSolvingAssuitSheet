package com.ahmedalamin.problemsolvingassuitsheet.sheet1

import java.util.*

fun main() {
    var list = mutableListOf<String>()

    readln()?.let { line ->
        line.split(" ").map {
            it.lowercase()
        }.forEach {
            list.add(it)
        }
    }

    readln()?.let { line ->
        line.split(" ").map {
            it.lowercase()
        }.forEach {
            list.add(it)
        }
    }


    if (list[1].equals(list[3])) {
        print("ARE Brothers")
    } else {
        print("NOT")
    }

}