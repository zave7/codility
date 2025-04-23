package lessons.lesson8

class EquiLeader {

    fun solution(A: IntArray): Int {

        val map = HashMap<Int,Int>()
        var readerCount = 0
        var reader = 0
        for(i in A.indices) {
            val value = (map[A[i]] ?: 0) + 1
            map[A[i]] = value
            if(value > readerCount) {
                readerCount = value
                reader = A[i]
            }
        }

        val array = IntArray(A.size)
        var currCount = 0
        for(i in array.indices) {
            if(A[i] == reader)
                currCount++
            array[i] = currCount
        }

        var result = 0
        for(i in A.indices) {
            val leftCount = array[i]
            val rightCount = array.last() - leftCount
            val leftLimitCount = (i + 1) / 2
            val rightLimitCount = (A.size - i - 1) / 2
            if(leftCount > leftLimitCount && rightCount > rightLimitCount)
                result++
        }
        return result

    }

}