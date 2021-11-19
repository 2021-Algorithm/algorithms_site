def solution(arr):
    answer = []
    for idx, val in enumerate(arr):

        if idx == len(arr) - 1:
            answer.append(arr[len(arr) - 1])
            break

        if val != arr[idx + 1]:
            answer.append(val)

    return answer


if __name__ == '__main__':
    arr = [4, 4, 4, 3, 3]
    print(solution(arr))
