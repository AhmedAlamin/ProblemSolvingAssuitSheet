package com.ahmedalamin.problemsolvingassuitsheet.sheet1

import java.util.Scanner

fun main() {

        readLine()?.let { line ->
            line.split(" ").map {
               it.toString()
            }.forEach {
                println(it)
            }
        }

}