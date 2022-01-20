package com.test.forumAluraAPI

import java.math.BigDecimal


fun main() {
    var gerente = Gerente(2000)


    val salarios: Array<BigDecimal> = bigDecimalArrayOf("1000", "5000", "7000", "7500", "6000", "15000")

    //sorted organiza do menor para o maior, pega os 3 ultimos faz o cast para Array<BigDecimal>
    val mediaMaioresSalarios = salarios
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
}

open class Funcionario(var salario: Int) {
    open fun bonificacao(): Double {
        return salario * 0.1
    }
}

class Gerente(salario: Int) : Funcionario(salario) {
    override fun bonificacao(): Double {
        return super.bonificacao()
    }
}

//types of properties declaration


class Rectangle(private val width: Int, private val heigth: Int) {
    //ao chamar a propertie area será retornado o calculo especificado
    val area1: Int
        get() = this.width * this.heigth
    //é possível declarar a propriedade sem especificar o type
    val area2 get() = this.width * this.heigth


}

//cria uma classe anonima por meio da palavra reservada 'object'
var casa: Funcionario = object : Funcionario(1000) {
    override fun bonificacao(): Double {
        return super.bonificacao()
    }
}

//vararg indica que será recebido um numero x de elementos (no caso String)
fun bigDecimalArrayOf(vararg salarios: String): Array<BigDecimal> {
    //o indice i já é fornecido pelo kotlin de acordo com o tamanho do array
    //pega o indice i do array e percorre o array salarios
    return Array<BigDecimal>(salarios.size) { i -> salarios[i].toBigDecimal() }
}

fun Array<BigDecimal>.somatoria(): BigDecimal{
    return this.reduce {acumulator, value ->
        //acumulador começa com zero e vai sendo somado ao valor, tendo no final a soma de todos os valores
        acumulator + value
    }
}

//extension function: permite adicionar funcionalidades a uma classe sem necessariamente herda-la
//cria a classe media dentro da classe Array<BigDecimal> localmente
fun Array<BigDecimal>.media(): BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatoria() / this.size.toBigDecimal()
    }
}





