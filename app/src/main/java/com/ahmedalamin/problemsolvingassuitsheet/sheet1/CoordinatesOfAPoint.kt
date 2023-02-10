package com.ahmedalamin.problemsolvingassuitsheet.sheet1

import kotlin.math.abs
import kotlin.math.ceil

fun main() {


    var list = mutableListOf<Double>()

    readln()?.let { line ->
        line.split(" ").map {
            it.toDouble()
        }.forEach {
            list.add(it)
        }
    }

    if (list[0] == 0.0 && list[1] == 0.0){
        print("Origem")
    }else if (list[0] > 0 && list[1] > 0){
        print("Q1")
    }else if (list[0] > 0 && list[1] < 0){
        print("Q4")
    }else if (list[0] < 0 && list[1] > 0){
        print("Q2")
    }else if (list[0] < 0 && list[1] < 0){
        print("Q3")
    }else if (list[0] == 0.0 && list[1] < 0.0 || list[0] == 0.0 && list[1] > 0.0){
        print("Eixo Y")
    }else if (list[0] > 0.0 && list[1] == 0.0 || list[0] < 0.0 && list[1] == 0.0){
        print("Eixo X")
    }

}