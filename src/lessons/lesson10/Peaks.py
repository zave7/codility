def solution(A):
    size = len(A)
    if size < 3: 
        return 0
    peaks = []
    for i in range(1, size - 1):
        if A[i-1] < A[i] > A[i+1]:
            peaks.append(i)
    peak_size = len(peaks)
    if peak_size == 0: 
        return 0
    for i in range(peak_size, 1, -1):
        if size % i == 0:
            block_size = size / i
            idx = 0
            for peak in peaks:
                start = idx * block_size
                end = (idx + 1) * block_size
                if start <= peak < end:
                    idx += 1
            if idx == i:
                return i
    return 1