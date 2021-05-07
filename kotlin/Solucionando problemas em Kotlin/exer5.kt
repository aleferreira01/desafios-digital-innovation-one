fun main(args: Array<String>) {

    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }

        if (input.size == 2){
            lista.add(mdc(input[0], input[1]))
        }
        else{
            break
        }
    }
    lista.forEach { result ->
        println(result)
    }
}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
    if (n1 % n2 == 0) return n2
    return mdc(n2, n1 % n2)
}
