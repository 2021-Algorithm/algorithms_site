def solution(n, lost, reserve):
    student = {}
    for i in range(1, n + 1):
        student[i] = 1

    for i in reserve:
        student[i] += 1

    for i in lost:
        student[i] -= 1

    for k, v in student.items():
        if v == 0:
            if student.get(k - 1) == 2:
                student[k] += 1
                student[k - 1] -= 1

            if student.get(k + 1) == 2:
                student[k] += 1
                student[k + 1] -= 1

    return sum([1 for v in student.values() if v != 0])


def solution2(n, lost, reserve):
    set_reserve = list(set(reserve) - set(lost))
    set_lost = list(set(lost) - set(reserve))

    for i in set_reserve:
        if i - 1 in set_lost:
            set_lost.remove(i - 1)
        elif i + 1 in set_lost:
            set_lost.remove(i + 1)

    answer = n - len(set_lost)

    return answer


if __name__ == '__main__':
    n = 5
    lost = [2, 4]
    reserve = [1, 3, 5]
    # result = 4
    print(solution(n, lost, reserve))
    print(solution(n, lost, reserve))
