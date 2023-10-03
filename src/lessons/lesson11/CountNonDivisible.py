def solution(A):
    N = len(A)
    element = [0 for _ in range(2 * N + 1)]
    for a in A:
        element[a] += 1
    answer = [0 for _ in range(N)]
    acc = [-1 for _ in range((2 * N + 1))]
    for i in range(N):
        val = A[i]
        if acc[val] != -1:
            answer[i] = acc[val]
        else:
            count = 0
            for target in range(1, int(val ** 0.5) + 1):
                if val % target == 0:
                    count += element[target]
                    if target != val // target:
                        count += element[val // target]
            answer[i] = N - count
            acc[val] = answer[i]
    return answer