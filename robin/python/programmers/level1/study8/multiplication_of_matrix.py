import numpy as np


def solution(arr1, arr2):
    answer = np.array(arr1) + np.array(arr2)

    return answer.tolist()


def solution2(arr1, arr2):
    return [[x + y for x, y in zip(a, b)] for a, b in zip(arr1, arr2)]


if __name__ == '__main__':
    arr1 = [[1, 2], [2, 3]]
    arr2 = [[3, 4], [5, 6]]

    print(solution(arr1, arr2))
    print(solution2(arr1, arr2))
