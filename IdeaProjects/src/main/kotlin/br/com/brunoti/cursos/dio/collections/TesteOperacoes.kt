package br.com.brunoti.cursos.dio.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("--Array salarios-----------")
    for (salario in salarios){
        println(salario)
    }
    println("--maxOrNull---minOrNull---average-----")
    println("Maior Salário: ${salarios.maxOrNull()}")
    println("Menor Salário: ${salarios.minOrNull()}")
    println("Média Salários: ${salarios.average()}")

    println("--Filtros-----------")
    val salariosMaiorQue2500 = salarios.filter { it > 2500 }
    salariosMaiorQue2500.forEach() { println(it) }

    println("---count----------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("---count----------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("---any----------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })

}
