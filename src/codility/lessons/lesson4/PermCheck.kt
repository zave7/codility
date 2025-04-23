package lessons.lesson4

class PermCheck {
    fun solution(A: IntArray): Int {
        A.sort()
        for(i in A.indices) {
            if(i+1 != A[i])
                return 0
        }
        return 1
    }
}