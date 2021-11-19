def solution(a, b):
    answer = 0
    for idx, val in enumerate(a):
        answer += (a[idx] * b[idx])
    return answer


def solution_two(a, b):
    answer = 0
    for val_a, val_b in zip(a, b):
        answer += (val_a * val_b)
    return answer


def solution_three(a, b):
    return sum([val_a * val_b for val_a, val_b in zip(a, b)])  # List Comprehension


if __name__ == '__main__':
    a = [1, 2, 3, 4]
    b = [-3, -1, 0, 2]
    print(solution(a, b))

    print(solution_two(a, b))

    print(solution_three(a, b))

    # result = 3
