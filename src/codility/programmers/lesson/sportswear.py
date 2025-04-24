def solution(n, lost, reserve):
    
    nums = [1] * n
    for i in lost:
        nums[i-1] -= 1
    for i in reserve:
        nums[i-1] += 1
    
    for i in range(len(nums)-1):
        diff = max(nums[i], nums[i+1]) - min(nums[i], nums[i+1])
        if diff == 2:
            nums[i], nums[i+1] = 1, 1
    
    return len(list(filter(lambda x: x > 0, nums)))