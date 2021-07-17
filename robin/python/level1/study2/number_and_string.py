def is_valid_decimal(str):
    try:
        int(str)
    except ValueError:
        return False
    return True


def solution(s):
    dic = {"zero": 0, "one": 1, "two": 2, "three": 3,
           "four": 4, "five": 5, "six": 6, "seven": 7,
           "eight": 8, "nine": 9}

    temp = ''
    answer = ''

    for idx, val in enumerate(s):
        temp += val

        if is_valid_decimal(temp):
            answer += str(temp)
            temp = ''

        if temp in dic:
            answer += str(dic.get(temp))
            temp = ''

    return int(answer)


def solution2(s):
    dic = {"zero": "0", "one": "1", "two": "2", "three": "3",
           "four": "4", "five": "5", "six": "6", "seven": "7",
           "eight": "8", "nine": "9"}
    answer = s
    for key, value in dic.items():
        answer = answer.replace(key, value)
    return int(answer)


if __name__ == '__main__':
    s = "one4seveneight"
    print(solution(s))
