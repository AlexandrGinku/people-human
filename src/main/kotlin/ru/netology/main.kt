package ru.netology

fun main() {
    var likes = 101
    val userOption1 = "человеку"
    val userOption2 = "людям"
    var printUser = " "
    if (likes === 1 || likes === 21) {
        printUser = userOption1
    } else if (likes === 31 || likes === 41) {
        printUser = userOption1
    } else if (likes === 51 || likes === 61) {
        printUser = userOption1
    } else if (likes === 71 || likes === 81) {
        printUser = userOption1
    } else if (likes === 91 || likes === 101) {
        printUser = userOption1
    } else if (likes === 201 || likes === 221) {
        printUser = userOption1
    } else if (likes === 231 || likes === 241) {
        printUser = userOption1
    } else {
        printUser = userOption2
    }
    println("Понравилось $likes $printUser")
}