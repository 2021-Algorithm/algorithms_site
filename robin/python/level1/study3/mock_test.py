def solution(answers):
    student1 = [1, 2, 3, 4, 5]
    student2 = [2, 1, 2, 3, 2, 4, 2, 5]
    student3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    report = {1: 0, 2: 0, 3: 0}
    for idx, val in enumerate(answers):

        if val == student1[idx % len(student1)]:
            report[1] += 1

        if val == student2[idx % len(student2)]:
            report[2] += 1

        if val == student3[idx % len(student3)]:
            report[3] += 1

    return [k for k, v in report.items() if max(report.values()) == v]


if __name__ == '__main__':
    answers = [1, 2, 3, 4, 5, 10]
    print(solution(answers))
