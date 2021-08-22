import math
from collections import deque


def solution(progresses, speeds):
    answer = []
    queue = deque()

    for progress, speed in zip(progresses, speeds):
        queue.append(math.ceil((100 - progress) / speed))

    count = 1
    check = queue.popleft()

    while True:

        if len(queue) == 0:
            answer.append(count)
            break

        if check >= queue[0]:
            queue.popleft()
            count += 1

        else:
            answer.append(count)
            check = queue.popleft()
            count = 1

    return answer


if __name__ == '__main__':
    progresses = [93, 30, 55]
    speeds = [1, 30, 5]

    print(solution(progresses, speeds))
