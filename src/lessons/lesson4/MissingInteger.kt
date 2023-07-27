package lessons.lesson4

class MissingInteger {
    fun solution(A: IntArray): Int {
        var min = 1
        A.sort()
        for(n in A) {
            if(min == n)
                min++
        }
        return min
    }
}