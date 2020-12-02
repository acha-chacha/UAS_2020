package com.achauwu.uas2020

fun main(){
    val uang = 100
    when(uang){
        in 5..10 -> println("aku akan jajan bakpao")
        in 20..50 -> println("aku akan jajan chatime")
        in 70..100 -> println("aku akan jajan skincare")
        else -> println("aku ga bisa beli apa apa")
    }

    val HargaCilok = 1000
    val HargaCimol = 500

    if(HargaCilok > HargaCimol){
        println("Cilok lebih mahal daripada cimol")
    } else if (HargaCilok == HargaCimol){
        println("Harga-nya sama aja")
    } else{
        println("Au deh")
    }

}