package com.ahmedalamin.problemsolvingassuitsheet.sheet1

fun main() {

    var x:Long
    var sum:Long = 0

    readln().let { it ->
        x = it.toLong()
    }
    print(x*(x+1)/2)
}