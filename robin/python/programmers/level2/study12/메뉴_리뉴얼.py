import collections
import itertools


def solution(orders, course):
    answer = []

    for c in course:
        temp = []
        for order in orders:
            combi = itertools.combinations(sorted(order), c)
            temp += combi
        odict = collections.Counter(temp)

        if odict:
            max_val = max(list(odict.values()))
            if max_val >= 2:
                for key, value in odict.items():
                    if odict[key] == max_val:
                        answer.append("".join(key))
                        
    return sorted(answer)


if __name__ == '__main__':
    orders = ["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"]
    course = [2, 3, 4]
    print(solution(orders, course))
