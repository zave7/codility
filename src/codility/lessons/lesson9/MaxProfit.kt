package lessons.lesson9

import kotlin.math.max

class MaxProfit {

    fun solution(A: IntArray): Int {

        val sumArr = IntArray(
            if(A.isNotEmpty()) A.size - 1
            else 0
        )
        for(i in 0 until A.size - 1) {
            sumArr[i] = A[i + 1] - A[i]
        }

        var max = 0
        var slice = 0
        for(a in sumArr) {
            max = max(0, max + a)
            slice = max(max, slice)
        }

        return slice
    }

}