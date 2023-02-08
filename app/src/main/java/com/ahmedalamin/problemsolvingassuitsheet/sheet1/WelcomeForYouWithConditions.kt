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
        print("Yes")
    }else{
        print("No")
    }

}