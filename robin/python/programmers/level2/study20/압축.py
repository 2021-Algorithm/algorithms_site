from string import ascii_uppercase


def init_alphabet_dic():
    alphabet_list = list(ascii_uppercase)
    alphabet_dic = {}

    for idx, alphabet_str in enumerate(alphabet_list):
        alphabet_dic[alphabet_str] = idx + 1

    return alphabet_dic


def solution(msg):
    alphabet_dic = init_alphabet_dic()
    answer = []
    i = 0

    while i < len(msg):
        j = i

        # 키에 매칭되는 게 없으면 j 를 늘린다.
        while msg[i:j + 1] in alphabet_dic.keys() and j < len(msg):
            j += 1

        if j == len(msg):
            break

        answer.append(alphabet_dic[msg[i:j]])

        # 딕셔너리에 존재하는 글자 + 1
        alphabet_dic[msg[i: j + 1]] = len(alphabet_dic) + 1
        i = j

    # 맨 마지막 글자 넣기
    answer.append(alphabet_dic[msg[i:j]])

    return answer


if __name__ == '__main__':
    msg = "KAKAO"
    print(solution(msg))
