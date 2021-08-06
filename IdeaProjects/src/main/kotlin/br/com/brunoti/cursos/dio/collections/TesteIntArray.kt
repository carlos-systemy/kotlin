package br.com.brunoti.cursos.dio.collections

fun main(){
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("---for in array---")
    for (valor in values){
        println(valor)
    }

    println("---forEach it---")
    values.forEach {
        println(it)
    }

    println("---forEach variavel---")
    values.forEach { valor ->
        println(valor)
    }

    println("---for in array.indices----")
    for (index in values.indices){
        println(values[index])
    }

    println("---for in array ordenado---")
    values.sort()
    for (valor in values){
        println(valor)
    }
}