package com.ahmedalamin.problemsolvingassuitsheet.sheet1

// Link For Problem
//https://vjudge.net/problem/HackerRank-compare-the-triplets

fun main() {

    val arr1 = IntArray(3)
    val arr2 = IntArray(3)
    var pOne = 0
    var pTwo = 0


    readLine()?.split(" ")?.forEachIndexed { index:Int, s:String->
        if (index <3){
            arr1[index] = s.toInt()
        }
    }

    readLine()?.split(" ")?.forEachIndexed { index:Int, s:String->
        if (index< 3){
            arr2[index] = s.toInt()
        }
    }

   for(i in 0..2){
       if (arr1[i] > arr2[i]){
           pOne++
       }else if (arr1[i] < arr2[i]){
           pTwo++
       }
   }
    println("$pOne $pTwo")
}