package com.achauwu.uas2020

fun main(){
    val buah = arrayOf(
        "Apel", "Pisang", "Mangga", "Melon", "Mangga", "Apel", "Mangga", "Pisang", "Melon", "Mangga", "Apel", "Mangga"
    )
    var Pisang = 0
    var Mangga = 0

    for (item in buah){
        if (item == "Pisang") {
            Pisang += 1
        } else if (item == "Mangga"){
            Mangga += 1
        }

    }
    println("Total Pisang = $Pisang")
    println("Total Mangga = $Mangga")

}
