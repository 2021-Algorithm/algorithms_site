import math


def solution(arr):
    answer = arr[0]

    for i in range(1, len(arr)):
        answer = answer * arr[i] / math.gcd(int(answer), arr[i])

    return answer


if __name__ == '__main__':
    arr = [2, 6, 8, 14]

    print(solution(arr))
