def solution(arr1, arr2):
    answer = []

    for i in range(len(arr1)):
        ls = []

        for j in range(len(arr2[0])):
            temp = 0

            for k in range(len(arr1[0])):
                temp += arr1[i][k] * arr2[k][j]

            ls.append(temp)

        answer.append(ls)

    return answer


if __name__ == '__main__':
    arr1 = [[2, 3, 2], [4, 2, 4], [3, 1, 4]]
    arr2 = [[5, 4, 3], [2, 4, 1], [3, 1, 1]]

    print(solution(arr1, arr2))
