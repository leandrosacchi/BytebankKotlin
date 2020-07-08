import kotlin.reflect.typeOf

fun main(){
    println("Bem vindo ao Bytebank");

    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo += 100;
    //var: variavel mutável; val: variável imutável
    // nao é necessário declarar o tipo da variável

    println("Titular: $titular")
    println("Numero da conta: $numeroConta")
    println("Saldo: $saldo")
    //String template recebe a variavel dentro da string    
}