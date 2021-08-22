def solution(priorities, location):
    answer = 0

    rank = 1
    stack = sorted(priorities, reverse=True)

    idx = 0
    print_dic = {}

    while True:

        if idx == len(priorities):
            idx = 0

        max_val = stack[0]

        if priorities[idx] == max_val:
            print_dic[rank] = idx
            stack.pop(0)
            idx += 1
            rank += 1
        else:
            idx += 1

        if len(priorities) == len(print_dic):
            break

    print(print_dic)

    for key, val in print_dic.items():
        if val == location:
            answer = key

    return answer


def solution2(priorities, location):
    answer = 0
    from collections import deque

    queue = deque([(v, i) for i, v in enumerate(priorities)])  # (value, index)

    while len(queue):
        item = queue.popleft()
        if queue and max(queue)[0] > item[0]:
            queue.append(item)
        else:
            answer += 1
            if item[1] == location:
                break
    return answer


if __name__ == '__main__':
    priorities = [2, 1, 3, 2]
    location = 0
    print(solution(priorities, location))
    print(solution2(priorities, location))
