import math

def solution(A):
    if len(A) < 3:
        return 0
    indices = []
    for n in range(1, len(A)-1):
        if A[n - 1] < A[n] > A[n + 1]:
            indices.append(n)
    if len(indices) < 3:
        return len(indices)
    max_flag = int(math.sqrt(indices[-1] - indices[0]) + 1)
    result = 0
    for f in range(max_flag, 2, -1):
        count = 1
        p = indices[0]
        for i, pe in enumerate(indices):
            if f <= pe - p:
                count += 1
                p = pe
        if count >= f:
            result = f
            break
    return result
