package lessons.lesson7

import java.util.Stack

class Nesting {

    fun solution(S: String): Int {
        val stack = Stack<Char>()
        for(i in S.indices) {
            if(S[i] == ')') {
                if(stack.isEmpty())
                    return 0
                stack.pop()
            } else {
                stack.push(S[i])
            }
        }
        return if(stack.isEmpty()) 1 else 0
    }

}