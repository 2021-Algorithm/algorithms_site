def solution(brown, yellow):
    answer = []

    total = brown + yellow

    for x in range(total, 2, -1):
        if total % x == 0:  # x 값
            y = total // x

            if yellow == (x - 2) * (y - 2):
                answer.append(x)
                answer.append(y)

    print(answer)
    return answer[:2]


if __name__ == '__main__':
    brown = 24
    yellow = 24
    print(solution(brown, yellow))
