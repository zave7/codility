def solution(citations):
    if citations[0] == 0:
        return 0
    for h, n in enumerate(sorted(citations, reverse=True), start=1):
        if h > n and h > (len(citations) - h):  
            return h-1
    return len(citations)