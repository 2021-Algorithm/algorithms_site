def solution(price, money, count):
    return max(sum([price * i for i in range(1, count + 1)]) - money, 0)


if __name__ == '__main__':
    price = 3
    money = 20
    count = 4
    print(solution(price, money, count))
