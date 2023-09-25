def solution(N):
    common_divisors = [1]
    n = 1
    while n ** 2 <= N:
        if N % n == 0:
            common_divisors.append(n)
        n += 1
    A = common_divisors[-1]
    B = N // A
    return 2 * (A + B)