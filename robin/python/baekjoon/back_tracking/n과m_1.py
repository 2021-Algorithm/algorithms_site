import itertools


# 그냥 생각해서 풀면.. 순열 사용..
def solution():
    n, m = map(int, input().split())

    ls = list(range(1, n + 1))

    for i in itertools.permutations(ls, m):
        print(" ".join(map(str, i)))
    return


# 백트래킹 사용..
def back_tracking():
    n, m = map(int, input().split())
    s = []
    visited = [False] * (n + 1)  # 방문 기록
    dfs(n, m, s, visited)
    return


def dfs(n, m, s, visited):
    if len(s) == m:
        print(" ".join(map(str, s)))
        return

    for i in range(1, n + 1):
        if visited[i]:
            continue

        visited[i] = True
        s.append(i)
        dfs(n, m, s, visited)  # 가지치기..
        s.pop()  # 가지를 치는데 s = [1] 에선 1을 쓰면 안되기 때문에 -> 다음에 써야하기 때문에  s =[ ] 만들면서 false 로 변환 -> s[2]
        visited[i] = False
        #예를 들어 2에선 2는 쓰지 않는데 1은 필요해서.


if __name__ == '__main__':
    # solution()
    back_tracking()
