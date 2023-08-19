package lessons.lesson7

import java.util.Stack

class StoneWall {

    fun solution(H: IntArray): Int {

        val stack = Stack<Int>()
        var result = 0
        stack.push(H[0])
        for(i in 1 until H.size) {
            while(stack.isNotEmpty()) {
                if(stack.peek() > H[i]) {
                    result++
                    stack.pop()
                } else if(stack.peek() < H[i]) {
                    stack.push(H[i])
                } else {
                    break
                }
            }
            if(stack.isEmpty()) stack.push(H[i])
        }
        return result + stack.size
    }

}