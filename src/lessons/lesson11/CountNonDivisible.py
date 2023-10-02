import math

def solution(A):
    # Implement your solution here
    # 1. 각 원소를 순회
    # 2. 절반보다 낮은 인덱스에 접근해서 각각 몇개씩 있는지 센다.
    # 3의 경우 3, 1, 3 총 3개이므로 전체-3
    # 이미 카운트한 경우 해당 값 바로 리턴
    # 나머지가 0인 경우에만 센다.

    count = [0 for _ in range(len(A)*2)]
    for n in A:
        count[n] += 1
        pass

    acc = {}
    result = []
    for i in range(len(A)):
        if acc.get(i) is not None:
            result.append(acc[i])
            print(f"Exist {i}, {acc[i]}")
        else:
            sum = 0
            for j in range(math.floor(math.sqrt(i)), -1, -1):
                sum += count[j]
                print(f"sum i({i}) {sum}")
            result.append(sum)
            acc[i] = sum
    return result

print(solution([3,2,1,3,6]))