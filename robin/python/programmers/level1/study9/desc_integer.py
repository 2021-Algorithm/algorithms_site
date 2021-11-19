def solution(n):
    answer = sorted(list(map(int, list(str(n)))), reverse=True)
    return int("".join(list(map(str, answer))))


def solution2(n):
    return int("".join(sorted(str(n), reverse=True)))


if __name__ == '__main__':
    n = 118372
    print(solution(n))
    print(solution(n))
