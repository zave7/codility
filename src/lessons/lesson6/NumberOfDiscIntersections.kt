package lessons.lesson6

class NumberOfDiscIntersections {

    fun solution(A: IntArray): Int {

        val arr = Array(A.size * 2) { LongArray(2) }
        var arrIdx = 0
        for(i in A.indices) {
            arr[arrIdx] = longArrayOf(i-A[i].toLong(), -1L)
            arr[arrIdx+1] = longArrayOf(i+A[i].toLong(), 1L)
            arrIdx += 2
        }

        arr.sortWith(compareBy({it[0]}, {it[1]}))

        var intervals = 0
        var intersections = 0L
        for(ia in arr) {
            if(ia[1] == -1L) {
                intersections += intervals
                intervals++
            } else {
                intervals--
            }
        }

        return if(intersections > 10_000_000L) -1
               else intersections.toInt()
    }

}