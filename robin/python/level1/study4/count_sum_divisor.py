def solution(left, right):
    answer = 0
    divisor = 0
    for val in range(left, right + 1):

        for num in range(1, val + 1):

            if val % num == 0:
                divisor += 1

        if divisor % 2 == 0:
            answer += val
        else:
            answer -= val

        divisor = 0

    return answer


def solution1(left, right):
    answer = 0
    for i in range(left, right + 1):
        if int(i ** 0.5) == i ** 0.5:
            answer -= i
        else:
            answer += i
    return answer


def solution3(left, right):
    import math
    answer = 0
    for i in range(left, right + 1, 1):
        sqrt = math.sqrt(i)
        if int(sqrt) == sqrt:
            answer -= i
        else:
            answer += i

    return answer


if __name__ == '__main__':
    left = 13
    right = 17
    print(solution(left, right))
    print(solution1(left, right))
    print(solution3(left, right))
