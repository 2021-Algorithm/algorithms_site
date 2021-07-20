def is_valid_decimal(valid_str):
    try:
        int(valid_str)
    except ValueError:
        return False
    return True


def solution(s):
    alphabet_dic = {"zero": 0, "one": 1, "two": 2, "three": 3,
                    "four": 4, "five": 5, "six": 6, "seven": 7,
                    "eight": 8, "nine": 9}

    temp = ''
    answer = ''

    for idx, val in enumerate(s):
        temp += val

        if is_valid_decimal(temp):
            answer += str(temp)
            temp = ''

        if temp in alphabet_dic:
            answer += str(alphabet_dic.get(temp))
            temp = ''

    return int(answer)


def solution2(s):
    alphabet_dic = {"zero": "0", "one": "1", "two": "2", "three": "3",
                    "four": "4", "five": "5", "six": "6", "seven": "7",
                    "eight": "8", "nine": "9"}
    answer = s
    for key, value in alphabet_dic.items():
        answer = answer.replace(key, value)
    return int(answer)


def solution3(s):
    alphabet_num_list = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]

    answer = s

    for idx, val in enumerate(alphabet_num_list):
        if val in answer:
            answer = answer.replace(val, str(idx))

    return int(answer)


if __name__ == '__main__':
    s = "one4seveneight"
    print(solution(s))
    print(solution2(s))
    print(solution3(s))
