package lessons.lesson10

import java.util.Vector

class CountFactors {

    fun solution(N: Int): Int {

        Vector<Int>(3)

        var result = 0
        var i = 1L
        while(i * i < N) {
            if(N % i == 0L) result += 2
            i++
        }
        if(i * i == N.toLong())
            result++

        return result
    }

}