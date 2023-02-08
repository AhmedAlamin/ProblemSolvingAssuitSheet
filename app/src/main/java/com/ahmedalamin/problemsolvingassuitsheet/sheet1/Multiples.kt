package com.ahmedalamin.problemsolvingassuitsheet.sheet1

fun main() {
    val list = mutableListOf<Int>()

    readln()?.let { line ->
        line.split(" ").map {
            it.toInt()
        }.forEach {
            list.add(it)
        }
    }

    if (list[0] >= list[1]){
        if (list[0] % list[1] == 0){
            print("Multiples")
        }else {
            print("No Multiples")
        }
    }else {
        if (list[1] % list[0] == 0){
            print("Multiples")
        }else {
            print("No Multiples")
        }
    }

}