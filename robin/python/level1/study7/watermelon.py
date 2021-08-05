def solution(n):
    answer = ''

    mok, remain = divmod(n, 2)

    answer += "수박" * mok

    if remain == 1:
        answer += "수"

    return answer


if __name__ == '__main__':
    n = 3
    print(solution(n))
