package br.com.brunoti.cursos.dio.collections

fun main() {
    val nomes = Array<String>(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "Bruno"

    println("---for in array---")
    for (nome in nomes) {
        println(nome)
    }

    println("---for lambda ordenado---")
    nomes.sort()
    nomes.forEach() { println(it) }

    println("---melhor forma---")
    val nomes2 = arrayOf("Maria", "Zazá", "Bruno")
    nomes2.sort()
    nomes2.forEach() { println(it) }

}

