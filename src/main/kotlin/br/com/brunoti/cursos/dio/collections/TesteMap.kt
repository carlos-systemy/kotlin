package br.com.brunoti.cursos.dio.collections

fun main() {

    println("--mapOf--Pair---------")
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)
    map1.forEach{ (k, v) -> println("Chave: $k - Valor: $v") }

    println("--mapOf--to---------")
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    map2.forEach{ (k, v) -> println("Chave: $k - Valor: $v") }

}