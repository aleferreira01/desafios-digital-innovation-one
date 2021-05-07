fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    val input = mutableListOf<String>()
    var strString = ""

    for (i in 1..N) {

        input.add(readLine()!!)
    }

    input.forEach {
        val value1 = Character.getNumericValue(it[0])
        val char = it[1]
        val value2 = Character.getNumericValue(it[2])

        strString += if (value1 == value2){
            (value1 * value2).toString() + "\n"
        } else{
            when {
                char.isUpperCase() -> (value2 - value1).toString() + "\n"
                char.isLowerCase() -> (value1 + value2).toString() + "\n"
                else -> ""
            }
        }
    }
    print(strString)

}
