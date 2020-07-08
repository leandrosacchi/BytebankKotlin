import kotlin.reflect.typeOf

fun main(){
    println("Bem vindo ao Bytebank");


    //estruturas de repetição
    /*
    for(i in 1..5){
        println(i)
    }

    for(i in 5 downTo 1 step 2){
        println(i)
    }

    var i = 1
    while (i <= 5) {
        println(i)
        i++
    } */

    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo -= 100
    //var: variavel mutável; val: variável imutável
    // nao é necessário declarar o tipo da variável

    println("Titular: $titular")
    println("Numero da conta: $numeroConta")
    println("Saldo: $saldo")
    //String template recebe a variavel dentro da string

    testaCondicoes(saldo);

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