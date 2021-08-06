package br.com.brunoti.cursos.dio.collections

fun main() {
    val joao = Funcionario("João", 1000.0,"CLT")
    val pedro = Funcionario("Pedro", 2000.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    println("--union-----------")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println (it) }

    println("--subtract-----------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println (it) }

    println("--intersect-----------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{ println (it) }

}