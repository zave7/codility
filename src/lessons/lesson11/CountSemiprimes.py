def solution(N, P, Q):
    primes = []
    semiprimes = []
    counts = [ 0 for _ in range(N+1) ]
    for candidate in range(2, int((N/2+1))):
        is_prime = True
        for i in range(2, candidate):
            if candidate % i == 0:
                is_prime = False
                break
        if is_prime:
            primes.append(candidate)
            for idx_prime in range(len(primes)):
                semiprime = primes[idx_prime] * candidate
                if semiprime <= N:
                    semiprimes.append(semiprime)
    semiprimes.sort()
    count = 0
    start = 0
    for semiprime in semiprimes:
        for i in range(start, semiprime):
            counts[i] = count
        count += 1
        counts[semiprime] = count
        start = semiprime+1
    return [ counts[Q[K]] - counts[P[K]-1] for K in range(len(P)) ]

def solution2(N, P, Q):
    nums = [0] * (N+1)
    i = 2
    while i ** 2 <= N:
        if nums[i] == 0:
            j = i ** 2
            while j <= N:
                if nums[j] == 0:
                    nums[j] = i
                j += i
        i += 1
    counts = [0] * (N+1)
    sum = 0
    for i in range(1, N+1):
        if nums[i] != 0:
            j = i / nums[i]
            if nums[int(j)] == 0:
                sum += 1
        counts[i] = sum
    return [ counts[Q[K]] - counts[P[K]-1] for K in range(len(P)) ]
