import collections
import itertools


def solution(relation):
    key_num = len(relation[0])  # 속성 개수
    combi = list(range(key_num))

    candidate_key = set()

    for i in range(key_num):
        for comb in itertools.combinations(combi, i + 1):
            find_overlap = []
            for val in relation:
                s = ''
                for c in comb:
                    s += val[c]
                find_overlap.append(s)

            dic = collections.Counter(find_overlap)

            for value in dic.values():
                if value > 1:
                    break
            else:
                for tc in candidate_key:
                    if set(tc).issubset(set(comb)):
                        break
                else:
                    candidate_key.add(comb)

    if len(list(candidate_key)) == 0:
        return 1
    else:
        return len(list(candidate_key))


# def solution(relation):
#
#     case = len(relation[0]) #속성 개수
#     comb = list(range(case))
#
#     answer = []
#
#     for i in range(1, case):
#         for c in itertools.combinations(comb, i):
#
#             temp = []
#             for attribute in relation:
#                 current_key = [attribute[cc] for cc in c]
#                 if current_key in temp:
#                     break
#                 else:
#                     temp.append(current_key)
#             else:
#                 for ck in answer:
#
#                     if set(ck).issubset(set(c)):
#                         break
#                 else:
#                     answer.append(c)
#
#     return answer


if __name__ == '__main__':
    relation = [['a', 'aa'], ['aa', 'a'], ['a', 'a']]
    # [["100", "ryan", "music", "2"], ["200", "apeach", "math", "2"], ["300", "tube", "computer", "3"], ["400", "con", "computer", "4"], ["500", "muzi", "music", "3"], ["600", "apeach", "music", "2"]]
    print(solution(relation))
