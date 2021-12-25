# https://studyandwrite.tistory.com/482
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10 ** 9)


def CountSubtreeNodes(x):
    cnt[x] = 1
    for i in graph[x]:
        if cnt[i] == 0:
            CountSubtreeNodes(i)
            cnt[x] += cnt[i]


# 어쨋든 문제는 서브트리의 정점의 수를 구해라.
if __name__ == '__main__':
    # n: 트리의 정점의 수
    # r: 루트의 번호
    # q: 쿼리의 수

    n, r, q = map(int, input().split())

    graph = [[] for i in range(n + 1)]
    cnt = [0] * (n + 1)

    for i in range(n - 1):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)

    CountSubtreeNodes(r)

    for i in range(q):
        node = int(input())
        print(cnt[node])
