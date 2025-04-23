package lessons.lesson4

class MaxCounters {
    fun solution(N: Int, A: IntArray): IntArray {
        val result = IntArray(N)
        var max = 0
        var currMax = 0
        for(value in A) {
            val index = value - 1
            if(value == N + 1) {
                max = currMax
            } else {
                result[index] = result[index].coerceAtLeast(max) + 1
                currMax = result[index].coerceAtLeast(currMax)
            }
        }
        for(i in result.indices) {
            if(result[i] < max)
                result[i] = max
        }
        return result
    }
}