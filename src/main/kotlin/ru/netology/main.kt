package ru.netology

fun main() {
    var likes = 105801
    val userOption1 = "человеку"
    val userOption2 = "людям"
    var people = userOption2
    var condition1 = likes % 100
    var condition2 = likes % 10
    if (condition1 === 11 || likes === 11) {
        people = userOption2
    } else {
        people = if (condition2 === 1) userOption1 else userOption2
    }

    println("Понравилось $likes $people")
}