package lessons.lesson9

import kotlin.math.max

class MaxSliceSum {

    fun solution(A: IntArray): Int {

        var max = A[0]
        var result = A[0]
        for(i in 1 until A.size) {
            max = max(A[i], max + A[i])
            result = max(max, result)
        }

        return result
    }

}