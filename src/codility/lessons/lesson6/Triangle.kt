package lessons.lesson6

class Triangle {

    fun solution(A: IntArray): Int {
        A.sort()
        var result = 0
        for(i in 0 until A.size - 2) {
            val condition1 = A[i].toLong() + A[i+1] > A[i+2]
            val condition2 = A[i+1].toLong() + A[i+1] > A[i+2]
            val condition3 = A[i].toLong() + A[i+1] > A[i+2]
            if(condition1 and condition2 and condition3) {
                result = 1
                break
            }
        }
        return result
    }

}