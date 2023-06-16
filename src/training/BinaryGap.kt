package training

class BinaryGap {
    fun solution(N: Int): Int {
        val binary = N.toString(2).chunked(1)
        var result = 0
        var acc = 0
        for(i in binary) {
            if(i == "1") {
                result =
                    if(acc > result) acc
                    else result
                acc = 0
            } else
                acc++
        }
        return result
    }
}

fun main() {
    println(BinaryGap().solution(1041))
}