# 누적합, 구간합 개념 https://jow1025.tistory.com/47
# https://ssafy-story.tistory.com/m/73?category=846431


"""
--> n = 3 , x1(x2 + x3) + x2(x3)
--> n = 4 , x1(x2 + x3 + x4) + x2(x3 + x4) + x3(x4)
"""
def solution():
    n = int(input())
    temp = list(map(int, input().split()))
    arr = []
    arr.append(temp[0])

    #구간 합 계산하기 위해서 누적합 구하기.
    for i in range(1, n):
        arr.append(arr[i - 1] + temp[i])

    answer = 0

    # i(구간합) 계산
    for i in range(n):
        answer += temp[i] * (arr[n - 1] - arr[i])

    print(answer)

    return


if __name__ == '__main__':
    solution()
