package br.com.brunoti.cursos.dio.collections

fun main(){
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    println("---forEach it---")
    values.forEach(){
        println(it)
    }

    println("---forEach it ordenado---")
    values.sort()
    values.forEach(){
        println(it)
    }
}