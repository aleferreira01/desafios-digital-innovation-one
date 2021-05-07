fun main(args: Array<String>) {

    while (true) {

        try {
            val l = readLine()!!.toInt()
            val v = readLine()!!.split(" ").map{
               it.toInt()
            }
            if (v.size != l){
                break
            }
            else{
                var largest = 0
                for (num in v){
                    if (largest < num){
                        largest = num
                    }
                }
                when (largest) {
                    in 0..9 -> println(1)
                    in 10..19 -> println(2)
                    else -> println(3)
                }
            }

        } catch (e : Exception ) {
            break
        }
        
    }
}
