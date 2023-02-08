package com.ahmedalamin.problemsolvingassuitsheet.sheet1

import androidx.core.text.isDigitsOnly

fun main() {

    readln()?.filter {
        if (it.isDigit()) {
            print("IS DIGIT")
        } else {
            if (it.isUpperCase()){
                print("ALPHA\n" +
                        "IS CAPITAL")
            }else {
                print("ALPHA\n" +
                        "IS SMALL")
            }
        }
        return
    }

}

