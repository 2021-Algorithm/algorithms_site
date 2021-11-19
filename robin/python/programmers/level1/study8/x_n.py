def solution(x, n):
    return [x + (i * x) for i in range(abs(n))]


if __name__ == '__main__':
    x = -4
    n = -2
    print(solution(x, n))
