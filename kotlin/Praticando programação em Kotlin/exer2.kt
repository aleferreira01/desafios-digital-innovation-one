fun main(args: Array<String>) {

    var value : String
    var result = ""
    val r = """0x.*""".toRegex()
    val input = mutableListOf<String>()

    while(true) {

        value = readLine()!!
        if (value == "-1") break
        else{
            input.add(value)
        }
    }

    input.forEach {
        val isHex = r.containsMatchIn(it)
        result += if(isHex){
            val substring = it.substring(2)
            Integer.parseInt(substring,16).toString() + "\n"
        } else{
            "0x${it.toInt().toString(16).toUpperCase()}" + "\n"
        }

    }

    print(result)
}
