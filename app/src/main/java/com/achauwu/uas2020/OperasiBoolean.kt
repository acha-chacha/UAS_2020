package com.achauwu.uas2020

fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 60
    val nilaiEkstra = 80

    val apakahLulusUjian = nilaiUjian > 75 //true
    val apakahLulusAbsen = nilaiAbsen > 75 //false
    val apakahLulusEkstra = nilaiEkstra > 75 //true

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusEkstra
    println(apakahLulus)

    //-------------------------------------//

    val nilaiUjianAqidah = 60
    val nilaiUjianFiqih = 75
    val nilaiUjianSiroh = 70

    val apakahLulusUjianAqidah = nilaiUjianAqidah > 80
    val apakahLulusUjianFiqih = nilaiUjianFiqih > 80
    val apakahLulusUjianSiroh = nilaiUjianSiroh > 80

    val apakahLulusUjianDiniyyah = apakahLulusUjianAqidah
            || apakahLulusUjianFiqih || apakahLulusUjianSiroh

    println(apakahLulusUjianDiniyyah)



}