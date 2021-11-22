from collections import deque


def solution1():
    a, b = map(int, input().split())
    ls = list(range(0, a))

    queue = deque(ls)

    answer = "<"

    while queue:

        for _ in range(b - 1):
            queue.append(queue.popleft())

        kill = queue.popleft()
        answer += str(kill + 1)
        answer += ", "

    answer = answer[:-2]
    answer += ">"

    print(answer)
    return


if __name__ == '__main__':
    solution1()
