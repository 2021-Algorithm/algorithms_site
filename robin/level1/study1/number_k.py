def solution(array, commands):
    i = 0
    j = 1
    k = 2
    answer = []

    for command in commands:
        sorted_array = sorted(array[command[i] - 1:command[j]])
        answer.append(sorted_array[command[k] - 1])
    return answer


def solution_two(array, commands):
    answer = []
    for command in commands:
        i, j, k = command
        sorted_array = sorted(array[i - 1:j])
        answer.append(sorted_array[k - 1])
    return answer


if __name__ == '__main__':
    array = [1, 5, 2, 6, 3, 7, 4]
    commends = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
    print(solution(array, commends))
    print(solution_two(array, commends))
    # result [5, 6, 3]
