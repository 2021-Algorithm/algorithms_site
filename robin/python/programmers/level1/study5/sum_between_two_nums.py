def solution(a, b):
    max_num = max(a, b) + 1
    min_num = min(a, b)

    return sum(list(range(min_num, max_num)))


if __name__ == '__main__':
    a = 3
    b = 5
    print(solution(a, b))
