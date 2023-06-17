package training

import kotlin.math.ceil

class FrogJmp {
    fun solution(X: Int, Y: Int, D: Int): Int {
        return ceil((Y - X) / D.toDouble()).toInt()
    }
}