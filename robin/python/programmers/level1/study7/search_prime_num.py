import math


def solution(n):
    sieve = [True] * (n + 1)

    for i in range(2, int(math.sqrt(n) + 1)):

        if sieve[i]:
            for j in range(i + i, n + 1, i):
                sieve[j] = False

    return sieve.count(True) - 2


def solution1(n):
    num = set(range(2, n + 1))

    for i in range(2, n + 1):
        if i in num:
            num -= set(range(2 * i, n + 1, i))
    return len(num)


if __name__ == '__main__':
    n = 10
    print(solution(n))
    print(solution1(n))
