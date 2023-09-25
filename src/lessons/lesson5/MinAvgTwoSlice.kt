package lessons.lesson5

class MinAvgTwoSlice {

    fun solution(A: IntArray): Int {
        var minAvg = (A[0] + A[1]) / 2f
        var minIndex = 0
        for(i in 2 until A.size) {
            var avg = (A[i-2] + A[i-1] + A[i]) / 3f
            if(minAvg > avg) {
                minAvg = avg
                minIndex = i-2
            }
            avg = (A[i-1] + A[i]) / 2f
            if(minAvg > avg) {
                minAvg = avg
                minIndex = i-1
            }
        }
        return minIndex
    }

}