package lessons.lesson6

class MaxProductOfThree {

    fun solution(A: IntArray): Int {
        A.sort()
        val calc1 = A[0] * A[1] * A[A.size-1]
        val calc2 = A[A.size-3] * A[A.size-2] * A[A.size-1]
        return if(calc1 > calc2)
                    calc1
                else
                    calc2
    }

}