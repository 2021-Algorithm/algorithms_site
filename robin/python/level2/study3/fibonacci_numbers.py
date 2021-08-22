# def fibonacci(n):
#     if n == 0: return 0
#     if n == 1: return 1
#
#     return (fibonacci(n - 1) + fibonacci(n - 2))
# python은 재귀 호출 횟수가 1000번을 넘으면 안됨.. 1000번에 걸리나봄

def solution(n):
    answer = [0, 1]

    if n == 0:
        return 0

    if n == 1:
        return 1

    for i in range(1, n):
        answer.append(answer[-2] + answer[-1])

    print(answer)

    return answer[-1] % 1234567


# 0, 1, 1, 2, 3, 5

def solution2(n):
    a, b = 0, 1
    for i in range(n):
        a, b = b, a + b
    return a


if __name__ == '__main__':
    n = 5
    print(solution(n))
    print(solution2(n))
