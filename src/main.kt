import kotlin.reflect.typeOf

fun main(){
    println("Bem vindo ao Bytebank");

    val conta1 = Conta()
    conta1.titular = "Leandro"
    conta1.numeroConta = 1000
    conta1.saldo = 100.0

    val conta2 = Conta()
    conta2.titular = "Alex"
    conta2.numeroConta = 1001
    conta2.saldo = -200.0

//    println("Titular: " + conta1.titular)
//    println("Numero da conta: " + conta1.numeroConta)
//    println("Saldo: " + conta1.saldo)
//
//    println("Titular: " + conta2.titular)
//    println("Numero da conta: " + conta2.numeroConta)
//    println("Saldo: " + conta2.saldo)

    deposita(conta1,50.0)
}

fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor
    println()
    println("Bem vindo(a), ${conta.titular}")
    println("Você depositou o valor $valor na sua conta. Seu saldo agora é de ${conta.saldo}")
}

fun testaCopiasEReferencias() {
    val conta1 = Conta()
    conta1.titular = "Leandro"
    conta1.numeroConta = 1000
    conta1.saldo = 100.0

//    val conta2 = conta1    ao fazer isso, as duas contas apontarão para o mesmo espaço na memória. Precisa criar uma nova instância
    val conta2 = Conta()
    conta2.titular = "Alex"
    conta2.numeroConta = 1001
    conta2.saldo = -200.0

    println("Titular: " + conta1.titular)
    println("Numero da conta: " + conta1.numeroConta)
    println("Saldo: " + conta1.saldo)
    //String template recebe a variavel dentro da string

    testaCondicoes(conta1.saldo);

    println("Titular: " + conta2.titular)
    println("Numero da conta: " + conta2.numeroConta)
    println("Saldo: " + conta2.saldo)
    //String template recebe a variavel dentro da string

    testaCondicoes(conta2.saldo);
}


class Conta{
    var titular: String = ""
    var numeroConta: Int = 0
    var saldo = 0.0
    //var: variavel mutável; val: variável imutável
    //nao é necessário declarar o tipo da variável


}

fun testaLacos() {
    //estruturas de repetição
    for (i in 1..5) {
        println(i)
    }

    for (i in 5 downTo 1 step 2) {
        println(i)
    }

    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }
}

fun testaCondicoes(saldo: Double){
    if (saldo > 0.0) {
        println("Saldo é positivo")
    } else if (saldo == 0.0) {
        println("Saldo é zero")
    } else {
        println ("Saldo é negativo")
    }

    //expressão when equivalente a expressão if acima
    when {
        saldo > 0.0 -> println("Saldo é positivo")
        saldo == 0.0 -> println("Saldo é zero")
        else -> println ("Saldo é negativo")
    }
}