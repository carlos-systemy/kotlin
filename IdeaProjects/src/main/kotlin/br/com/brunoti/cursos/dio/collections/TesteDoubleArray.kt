package br.com.brunoti.cursos.dio.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    println("---forEach lambda ---")
    salarios.forEach() { println(it) }

    println("---forEachIndexed lambda -- aumento 10% nos salarios ---")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach() { println("%.2f".format(it)) }


    println("---forEach lambda ordenado --- melhor forma---")
    val salarios2 = doubleArrayOf(1000.0, 3000.0, 500.0)
    salarios2.sort()
    salarios2.forEach() { println(it) }
}