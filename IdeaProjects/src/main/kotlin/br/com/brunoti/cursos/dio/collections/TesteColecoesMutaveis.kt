package br.com.brunoti.cursos.dio.collections

fun main(){
    val joao = Funcionario("João", 1000.0,"CLT")
    val pedro = Funcionario("Pedro", 2000.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    println("---LIST---")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("------add---")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("------remove---")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("---SET---")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("------add---")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("------remove---")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }
}