def solution(s):
    answer = []
    s = s.split(' ')

    for i in s:
        result = ""
        for idx, val in enumerate(i):
            remain = idx % 2
            result += val.upper() if remain == 0 else val.lower()

        answer.append(result)

    return " ".join(answer)


if __name__ == '__main__':
    s = "try hello world"
    # s = "TRY HELLO WORLD"
    print(solution(s))
