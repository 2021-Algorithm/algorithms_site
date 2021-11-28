"""
동전이 2원, 5원 짜리로만 있다.
failed: 왜 틀렸지? ㅜㅜ
홀수 + 홀수는 짝수되는거 아닌가..
"""


def solution():
    import sys
    input = sys.stdin.readline

    coin = int(input())
    coin_cnt = 0

    if coin == 1 or coin == 3:
        print(-1)
        return

    mok, remain = divmod(coin, 5)

    if remain % 2 == 0:
        coin_cnt += mok
        coin_cnt += remain // 2

    else:
        coin_cnt += mok - 1
        coin_cnt += (remain + 5) // 2

    print(coin_cnt)
    return


"""
https://today-retrospect.tistory.com/30
"""
def solution2():
    import sys
    input = sys.stdin.readline

    n = int(input())
    count = 0
    while True:
        if n % 5 == 0:
            count += (n // 5)
            print(count)
            break
        else:
            n -= 2
            count += 1
        if n < 0:
            print(-1)
            break

    return


if __name__ == '__main__':
    solution2()
