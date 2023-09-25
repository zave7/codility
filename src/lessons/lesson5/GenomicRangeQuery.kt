package lessons.lesson5

class GenomicRangeQuery {

    fun solution(S: String, P: IntArray, Q: IntArray): IntArray {

        val A = Triple("A", 1, IntArray(S.length + 1))
        val C = Triple("C", 2, IntArray(S.length + 1))
        val G = Triple("G", 3, IntArray(S.length + 1))
        val dnsList = listOf(A, C, G)
        val result = IntArray(P.size) {4}

        S.chunked(1)
            .forEachIndexed { index, s ->
                dnsList.forEach { dns ->
                    if(dns.first == s)
                        dns.third[index + 1] = dns.third[index] + 1
                    else
                        dns.third[index + 1] = dns.third[index]
                }
            }

        P.forEachIndexed { index, p ->
            for(pair in dnsList) {
                if(pair.third[Q[index]+1] - pair.third[p] > 0) {
                    result[index] = pair.second
                    break
                }
            }
        }

        return result
    }

}