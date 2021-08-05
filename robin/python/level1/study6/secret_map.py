def solution(n, arr1, arr2):
    answer = []

    for one, two in zip(arr1, arr2):
        bit_sum = str(bin(one | two)[2:])
        bit_sum = '0' * (n - len(bit_sum)) + bit_sum
        bit_sum = bit_sum.replace('0', " ")
        bit_sum = bit_sum.replace('1', "#")
        answer.append(bit_sum)

    return answer


if __name__ == '__main__':
    n = 6
    arr1 = [46, 33, 33, 22, 31, 50]
    arr2 = [27, 56, 19, 14, 14, 10]
    print(solution(n, arr1, arr2))
