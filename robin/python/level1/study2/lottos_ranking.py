def solution(lottos, win_nums):
    answer = []
    dic = {6: 1, 5: 2, 4: 3, 3: 4, 2: 5, 0: 6}

    contain_zero = lottos.count(0)

    contain_val = 0

    for i in range(len(lottos)):
        if win_nums[i] in lottos:
            contain_val += 1

    if contain_val >= 2:
        answer.append(dic.get(contain_val + contain_zero))
        answer.append(dic.get(contain_val))

    else:
        answer.append(dic.get(contain_val + contain_zero))
        answer.append(6)

    return answer


def solution2(lottos, win_nums):
    dic = {6: 1, 5: 2, 4: 3, 3: 4, 2: 5, 1: 6, 0: 6}
    contain_zero = lottos.count(0)
    contain_val = 0

    for i in range(len(lottos)):
        if win_nums[i] in lottos:
            contain_val += 1

    return [dic.get(contain_zero + contain_val), dic.get(contain_val)]


def solution3(lottos, win_nums):
    rank = [6, 6, 5, 4, 3, 2, 1]

    cnt_0 = lottos.count(0)
    ans = 0
    for x in win_nums:
        if x in lottos:
            ans += 1
    return [rank[cnt_0 + ans], rank[ans]]


if __name__ == '__main__':
    lottos = [44, 2, 30, 16, 32, 25]
    win_nums = [31, 10, 45, 1, 6, 19]

    print(solution(lottos, win_nums))
    print(solution2(lottos, win_nums))
    print(solution3(lottos, win_nums))
