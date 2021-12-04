# 그냥 생각한 풀이..
def solution():
    n = int(input())

    answer = 0
    count = 0
    for i in range(1, n):
        if answer + i > n:
            break

        answer += i
        count += 1

    print(count)
    return


# 이진탐색으로.. 풀면
def binary_search():
    n = int(input())

    count = 0
    start, end = 1, n

    while start <= end:
        mid = (start + end) // 2

        # 1부터 mid 까지의 합구하는 공식
        #  가우스 공식. 1 ~ n 까지의 합은 n * (n + 1) // 2 이다.
        if mid * (mid + 1) // 2 <= n:
            count = mid
            start = mid + 1
        else:
            end = mid - 1

    print(count)
    return


if __name__ == '__main__':
    solution()
    binary_search()
