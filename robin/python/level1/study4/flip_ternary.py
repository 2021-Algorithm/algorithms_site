def solution(n):
    answer = ''
    ternary = ''

    while n:
        remainder = n % 3
        n = int(n / 3) #n // 3으로 변경가능
        ternary = str(remainder) + ternary

    for i in reversed(ternary):
        answer += i

    return int(answer, 3)


def solution1(n):
    tmp = ''
    while n:
        tmp += str(n % 3)
        n = n // 3

    answer = int(tmp, 3)
    return answer


if __name__ == '__main__':
    n = 45
    print(solution(n))
    print(solution1(n))
