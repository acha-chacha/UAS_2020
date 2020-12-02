package com.achauwu.uas2020

fun main(){
    val orangJepang = arrayOf("Naruto", "Sasuke", "Sakura")
    val orangAmerika = arrayOf("Bryan", "Jack", "Rose")
    val orangIndonesia = arrayOf("Susanti", "Soleh", "Budi")
    val orangKorea = arrayOf("Jungkook", "Jimin", "Suga")

    println("Masukan satu nama :")
    val name = readLine()

    when(name){
        in orangIndonesia -> {
            println("$name lokal")
            println("Orang Indonesia")
        }
        in orangAmerika -> {
            println("$name bule")
            println("Orang Amerika")
        }
        in orangJepang -> {
            println("$name konnichiwa")
            println("Orang Jepang")
        }
        in orangKorea -> {
            println("$name annyeonghaseyo")
            println("Orang Korea")
        }
    }
}