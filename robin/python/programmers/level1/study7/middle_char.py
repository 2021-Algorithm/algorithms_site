def solution(s):
    answer = ''
    mok, remain = divmod(len(s), 2)

    if remain == 1:
        answer = s[mok: mok + 1]

    if remain == 0:
        answer = s[mok - 1: mok + 1]
    return answer


if __name__ == '__main__':
    s = "qwer"
    print(solution(s))
