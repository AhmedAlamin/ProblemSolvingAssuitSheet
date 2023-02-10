package com.ahmedalamin.problemsolvingassuitsheet.sheet1

fun main() {

    readln().let {
        if (it[0].toString().toInt() % 2 == 0){
            print("EVEN")
        }else print("ODD")
    }

}