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
                    semiprimes.append(primes[idx_prime] * candidate)
            
    count = 0
    start = 0
    for semiprime in semiprimes:
        for i in range(start, semiprime):
            counts[i] = count
        count += 1
        counts[semiprime] = count
        start = semiprime+1
    return [ counts[Q[K]] - counts[P[K]-1] for K in range(len(P)) ]

print(solution(26, [1, 4, 16], [26, 10, 20]))