package lessons.lesson7

import java.util.Stack

class Fish {

    fun solution(A: IntArray, B: IntArray): Int {
        val stack = Stack<Pair<Int, Int>>()
        var count = 0

        for(i in A.indices) {
            val isUpstreamFish = B[i] == 0
            if(isUpstreamFish) {
                while(stack.isNotEmpty()) {
                    if(A[i] > stack.peek().first)
                        stack.pop()
                    else
                        break
                }
                if(stack.isEmpty()) count++
            } else {
                stack.push(A[i] to B[i])
            }
        }

        return count + stack.size
    }

}