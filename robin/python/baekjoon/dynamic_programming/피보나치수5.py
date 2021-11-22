def solution():
    n = int(input())

    dp = [0, 1, 1]

    for i in range(3, n + 1):
        dp.append(dp[i - 2] + dp[i - 1])

    print(dp[n])
    return


if __name__ == '__main__':
    solution()
