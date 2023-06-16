package training

class OddOccurrencesInArray {
    fun solution(A: IntArray): Int {
        var result = 0
        for (i in A) {
            result = result xor i
        }
        return result
    }
}

infix fun String.xor(other: String): String {
    val chars = this.chars().toArray()
    val others = other.chars().toArray()
    val loop =
        if(chars.size > others.size)
            chars.size
        else
            others.size
    return IntRange(0, loop - 1).mapIndexed { index, ch ->
        val myCode = if(index < chars.size) chars[index] else 0
        val otherCode = if(index < others.size) others[index] else 0
        Char(myCode xor otherCode)
    }.toCharArray().joinToString("")
}