package br.com.brunoti.cursos.dio.collections

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("--funcao criada: somatoria----")
    println(salarios.somatoria())

    println("--funcao criada: media----")
    println(salarios.media())
}