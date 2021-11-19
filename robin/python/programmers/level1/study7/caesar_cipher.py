def solution(s, n):
    answer = ''

    upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    lower = 'abcdefghijklmnopqrstuvwxyz'

    for i in s:

        if i in upper:
            idx = upper.find(i) + n
            answer += upper[idx % 26]

        if i in lower:
            idx = lower.find(i) + n
            answer += lower[idx % 26]

        if i == " ":
            answer += " "

    return answer


if __name__ == '__main__':
    s = "a B z"
    n = 4
    print(solution(s, n))
