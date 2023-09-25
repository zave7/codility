package lessons.lesson3

class PermMissingElem {
    fun solution(A: IntArray): Int {
        val total = ((A.size + 1).toLong() * (A.size + 2)) / 2
        return (total - A.sum()).toInt()
    }
}