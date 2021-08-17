import heapq as hq


def solution(scoville, K):
    pop_count = 0

    hq.heapify(scoville)

    while True:

        if len(scoville) == 1:
            return -1

        min_node = hq.heappop(scoville)
        min2_node = hq.heappop(scoville)

        hq.heappush(scoville, min_node + min2_node * 2)

        pop_count += 1

        if scoville[0] >= K:
            return pop_count

    return 0


def solution2(scoville, K):
    hq.heapify(scoville)
    answer = 0
    while True:
        first = hq.heappop(scoville)
        if first >= K:
            break
        if len(scoville) == 0:
            return -1
        second = hq.heappop(scoville)
        hq.heappush(scoville, first + second * 2)
        answer += 1

    return answer


if __name__ == '__main__':
    scoville = [1, 2, 3]
    K = 11
    print(solution(scoville, K))
