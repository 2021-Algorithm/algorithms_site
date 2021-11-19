from itertools import combinations


def solution(numbers):
    return sorted(set([sum(i) for i in list(combinations(numbers, 2))]))


if __name__ == '__main__':
    numbers = [2, 1, 3, 4, 1]
    print(solution(numbers))
