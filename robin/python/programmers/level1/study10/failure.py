def solution(N, stages):
    dic = {}

    player = len(stages)

    for i in range(1, N + 1):
        if player != 0:
            fail_stage = stages.count(i)
            dic[i] = fail_stage / player

            player -= fail_stage

        else:
            dic[i] = 0

    return [key for (key, value) in sorted(dic.items(), key=lambda x: x[1], reverse=True)]


if __name__ == '__main__':
    N = 5
    stages = [2, 1, 2, 6, 2, 4, 3, 3]
    # result = [3,4,2,1,5]
    print(solution(N, stages))
