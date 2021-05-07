import java.math.BigDecimal

fun main(args: Array<String>) {

    val raio = readLine()!!.toDouble()
    val pi = 3.14159
    val area = pi * (Math.pow(raio, 2.0))
    val resultado = BigDecimal(area)
    println("A=${"%.4f".format(resultado)}")

}
