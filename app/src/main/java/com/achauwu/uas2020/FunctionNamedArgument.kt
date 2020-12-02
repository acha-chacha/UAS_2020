package com.achauwu.uas2020

fun idnSchool(firstName : String, middleName : String, lastName : String){
    println("$firstName $middleName $lastName")
}

fun sloganIDN(slogan : String){
    println("$slogan ")
}

fun account(username : String, password : String, email : String) {
    println("username : $username, password : $password, email : $email")

}

fun main() {
    idnSchool(firstName = "IDN", middleName = "Akhwat", lastName = "Boarding School")

    sloganIDN("Jagoan IT Pinter Ngaji")

    account("achhha", "lovingyou", "alishaacha@gmail.com")
}