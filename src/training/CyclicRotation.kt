package training

class CyclicRotation {
    fun solution(A: IntArray, K: Int): IntArray =
        if(A.isNotEmpty())
            A.slice(A.size - (K % A.size) until A.size).toIntArray() +
                    A.slice(0 until A.size - (K % A.size)).toIntArray()
        else
            intArrayOf()
}