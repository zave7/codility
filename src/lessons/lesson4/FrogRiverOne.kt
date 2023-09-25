package lessons.lesson4

class FrogRiverOne {
    fun solution(X: Int, A: IntArray): Int {
        val set = HashSet<Int>()
        for(n in A.indices) {
            set.add(A[n])
            if(set.size == X)
                return n
        }
        return -1
    }
}