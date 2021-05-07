fun main(args: Array<String>) {

    val cases = readLine()!!.toInt()
    val list = mutableListOf<Int>()

    if(cases > 0){

        for(i in 1..cases){

            val values = readLine()!!.split(" ").map { it.toInt() }

            if(values[0] < 0 || values[1] < 0){
                break
            }
            else{
                list.add(values[0] + values[1])
            }
        }

        list.forEach{ 
            println(it)
        }
    }
}
