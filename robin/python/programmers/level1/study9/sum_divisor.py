def solution(n):
    return sum(list(filter(lambda x: n % x == 0, range(1, n + 1))))


if __name__ == '__main__':
    n = 12
    print(solution(n))
