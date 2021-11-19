import math


def solution(n):
    num = math.sqrt(n)
    return (num + 1) ** 2 if num % 1 == 0 else -1


if __name__ == '__main__':
    n = 3
    print(solution(n))
