package com.ahmedalamin.problemsolvingassuitsheet.sheet1

fun main() {

    readln()?.filter {

        if (it.isUpperCase()){
            print(it.lowercase())
        }else{
            print(it.uppercase())
        }

        return
    }
}