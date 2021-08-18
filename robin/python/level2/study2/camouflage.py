def solution(clothes):
    answer = 1

    dic = {}
    for i in clothes:
        if i[1] not in dic:
            dic[i[1]] = 1
        else:
            dic[i[1]] = dic[i[1]] + 1

    for i in dic.values():
        answer *= i + 1

    return answer - 1


if __name__ == '__main__':
    clothes = [["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]

    print(solution(clothes))
