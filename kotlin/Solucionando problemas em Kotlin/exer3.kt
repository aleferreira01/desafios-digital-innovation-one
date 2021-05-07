import kotlin.math.sqrt

fun main(args: Array<String>) {

    var strResult = ""
    val input = mutableListOf<Double>()

    for (i in 1..readLine()!!.toInt()){
        input.add((readLine()!!).toDouble())
    }
    input.forEach { number ->
        val result = isPrime(number)
        strResult += if (result) "Prime\n" else "Not Prime\n"
    }
    print(strResult)
}

fun isPrime(number: Double): Boolean {

    if (number <= 3) return !(number < 2)

    if((number % 2) == 0.0 || (number % 3) == 0.0) return false

    var i = 5
    val s:Double = sqrt(number)

    while (i <= s){
        if ((number % i) == 0.0) return false

        i += 2

        if ((number % i) == 0.0) return false

        i += 4
    }

   return true
}
