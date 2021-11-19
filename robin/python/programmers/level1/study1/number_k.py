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


def solution_three(array, commands):
    return list(map(lambda x: sorted(array[x[0] - 1:x[1]])[x[2] - 1], commands))  # lambda map 을 사용해서 돌리고, list 화


def solution_four(array, commands):
    return [sorted(array[x[0] - 1: x[1]])[x[2] - 1] for x in commands]  # List Comprehension


if __name__ == '__main__':
    array = [1, 5, 2, 6, 3, 7, 4]
    commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
    print(solution(array, commands))
    print(solution_two(array, commands))
    print(solution_three(array, commands))
    print(solution_four(array, commands))
    # result [5, 6, 3]
