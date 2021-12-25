# https://happylsm76.tistory.com/entry/%EB%B0%B1%EC%A4%80-2630%EB%B2%88%EC%83%89%EC%A2%85%EC%9D%B4-%EB%A7%8C%EB%93%A4%EA%B8%B0-with-Python
paper = []
result = []

def divide_and_conquer(x, y, n):
    global paper
    global result
    color = paper[x][y]

    for i in range(x, x + n):
        for j in range(y, y + n):
            if color != paper[i][j]:
                divide_and_conquer(x, y, n // 2)
                divide_and_conquer(x, y + n // 2, n // 2)
                divide_and_conquer(x + n // 2, y, n // 2)
                divide_and_conquer(x + n // 2, y + n // 2, n // 2)
                return
    if color == 0:
        result.append(0)
    else:
        result.append(1)


def solution():
    global paper
    global result

    n = int(input())
    for i in range(n):
        paper.append(list(map(int, input().split())))

    divide_and_conquer(0, 0, n)

    print(result.count(0))
    print(result.count(1))
    return


if __name__ == '__main__':
    solution()
