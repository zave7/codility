def dfs(numbers, minus, idx, target):
    numbers = numbers.copy()
    if minus is not None and minus:
        numbers[idx] = -numbers[idx]
    if len(numbers) == idx+1:
        if sum(numbers) == target:
            return 1
        else:
            return 0
    else:
        return dfs(numbers, True, idx+1, target) + dfs(numbers, False, idx+1, target)

def solution(numbers, target):
    
    return dfs(numbers, None, -1, target)