package br.com.brunoti.cursos.dio.collections

fun main() {

    val joao = Funcionario("João", 1000.0,"CLT")
    val pedro = Funcionario("Pedro", 2000.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println("--findById-----------")
    println(repositorio.findById(maria.nome))

    println("--remove -- findByAll-----------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}