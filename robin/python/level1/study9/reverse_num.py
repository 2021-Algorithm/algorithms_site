def solution(n):
    return list(map(int, (str(n)[::-1])))


if __name__ == '__main__':
    n = 12345
    print(solution(n))
