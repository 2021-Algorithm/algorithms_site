import itertools
import re
import bisect


# def solution(info, query):
#     answer = []
#
#     info_dic = {}
#     comb = [0, 1, 2, 3]
#
#     for i in info:
#         s = i.split(" ")
#         person = s[:-1]
#         score = int(s[-1])
#
#         for j in range(5):
#             for k in list(itertools.combinations(comb, j)):
#                 temp = person.copy()
#                 for n in k:
#                     temp[n] = '-'
#
#                 key = "".join(temp)
#
#                 if key in info_dic:
#                     info_dic[key].append(score)
#                 else:
#                     info_dic[key] = [score]
#
#     for i in query:
#         s = re.split(' and | ', i)
#
#         temp = ''.join(s[:-1])
#         # print(temp)
#
#         for key in info_dic.keys():
#             count = 0
#             if temp == key:
#                 for value in info_dic[temp]:
#                     if int(s[-1]) <= value:
#                         count += 1
#                 answer.append(count)
#     # print(info_dic['-backendsenior-'])
#     return answer


def solution(info, query):
    answer = []

    info_dic = {}
    comb = [0, 1, 2, 3]

    for i in info:
        s = i.split(" ")
        person = s[:-1]
        score = int(s[-1])

        for j in range(5):
            for k in list(itertools.combinations(comb, j)):
                temp = person.copy()
                for n in k:
                    temp[n] = '-'

                key = "".join(temp)

                if key in info_dic:
                    info_dic[key].append(score)
                else:
                    info_dic[key] = [score]

    for value in info_dic.values():
        value.sort()

    for i in query:
        s = re.split(' and | ', i)

        key = "".join(s[:-1])
        score = int(s[-1])

        if key in info_dic:
            score_list = info_dic[key]

            index = bisect.bisect_left(score_list, score)
            answer.append(len(score_list) - index)
        else:
            answer.append(0)

    return answer


if __name__ == '__main__':
    info = ["java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150",
            "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"]
    query = ["java and backend and junior and pizza 100", "python and frontend and senior and chicken 200",
             "cpp and - and senior and pizza 250", "- and backend and senior and - 150",
             "- and - and - and chicken 100", "- and - and - and - 150"]

    # result = [1,1,1,1,2,4]

    print(solution(info, query))
