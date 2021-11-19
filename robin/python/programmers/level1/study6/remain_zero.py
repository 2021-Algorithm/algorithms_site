def solution(arr, divisor):
    answer = []
    for i in arr:
        if i % divisor == 0:
            answer.append(i)

    if len(answer) == 0:
        answer.append(-1)

    return sorted(answer)


def solution1(arr, divisor):
    return sorted([n for n in arr if n % divisor == 0]) or [-1]


if __name__ == '__main__':
    arr = [2, 36, 1, 3]
    divisor = 1
    print(solution(arr, divisor))
    print(solution1(arr, divisor))
