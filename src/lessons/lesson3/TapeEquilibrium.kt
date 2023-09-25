package lessons.lesson3

import kotlin.math.abs

class TapeEquilibrium {
    fun solution(A: IntArray): Int {
        val sum = A.sum()
        var left = A[0]
        var right = sum - A[0]
        var result = abs(left - right)
        for(i in 1 until A.size - 1) {
            right -= A[i]
            left += A[i]
            val diff = abs(left - right)
            result = if(diff < result) diff else result
        }
        return result
    }
}