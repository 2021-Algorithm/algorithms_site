def solution(s):
    answer = ''
    s = " " + s

    for i in range(1, len(s)):

        if s[i] == " ":
            answer += ""

        if s[i - 1] == " ":
            answer += s[i].upper()
        else:
            answer += s[i].lower()

    return answer


def solution2(s):
    return s.title()  # 문자열을 단어 앞만 대문자로 바꿀 수 있는 함수.


if __name__ == '__main__':
    s = "for the last week"
    print(solution(s))
    print(solution2(s))
