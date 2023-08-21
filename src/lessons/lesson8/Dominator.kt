package lessons.lesson8

class Dominator {

    fun solution(A: IntArray): Int {

        val map = HashMap<Int, Int>()

        for(i in A.indices) {
            val count = (map[A[i]] ?: 0) + 1
            map[A[i]] = count
            if(count > A.size / 2)
                return i
        }

        return -1
    }

}