package lessons.lesson7

import java.util.Stack

class Brackets {

    fun solution(S: String): Int {
        val pairMap = mapOf('{' to '}', '[' to ']', '(' to ')')
        val stack = Stack<Char>()
        for(i in S.indices) {
            if(pairMap.contains(S[i]))
                stack.push(pairMap[S[i]]?: return 0)
            else if(stack.isEmpty() || stack.pop() != S[i])
                return 0
        }
        return if(stack.isEmpty())
            1
        else
            0
    }

}