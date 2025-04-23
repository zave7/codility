package lessons.lesson9

import kotlin.math.max

class MaxDoubleSliceSum {

    fun solution(A: IntArray): Int {

        val front = IntArray(A.size)
        val back = IntArray(A.size)

        for(i in 1 until A.size - 1) {
            front[i] = max(0, front[i-1] + A[i])
            val backIndex = A.size - 1 - i
            back[backIndex] = max(0, back[backIndex+1] + A[backIndex])
        }

        var maxDoubleSliceSum = 0
        for(i in 1 until A.size - 1) {
            maxDoubleSliceSum = max(front[i-1] + back[i+1], maxDoubleSliceSum)
        }


        return maxDoubleSliceSum
    }

}