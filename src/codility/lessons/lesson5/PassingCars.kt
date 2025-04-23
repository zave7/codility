package lessons.lesson5

class PassingCars {
    fun solution(A: IntArray): Int {
        var result = 0L
        var sum = 0
        for(n in A) {
            if(n == 0)
                sum++
            else
                result += sum
        }
        return if(result > 1_000_000_000) -1 else result.toInt()
    }
}