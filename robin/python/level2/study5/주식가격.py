from collections import deque


def solution(prices):
    answer = []

    queue = deque(prices)

    while queue:
        i = 0
        stock = queue.popleft()

        for price in queue:

            if stock <= price:
                i += 1
            else:
                i += 1  # 주식이 떨어져도 1초는 버틴걸로 간주
                break

        answer.append(i)

    return answer


if __name__ == '__main__':
    prices = [1, 2, 3, 2, 3]
    print(solution(prices))
