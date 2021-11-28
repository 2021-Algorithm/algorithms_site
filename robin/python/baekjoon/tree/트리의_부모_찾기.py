def try_first():
    """
    failed:
    1. 우선 n + 1 까지 (만약 n이 7이라면 0 ~ 7) 까지 -1(부모노드가 정해지지 않았다는 의미)배열 생성
    2. 1번 노드가 루트임으로 tree[1]번은 자기 자신을 채운다.
    3. 자기 자리에 -1 이 아닌 다른 수로 채워져 있으면, 값이 채워지지 않은 노드를 찾아 연결.
    """

    n = int(input())

    tree = [-1] * (n + 1)
    tree[1] = 1

    for i in range(n - 1):
        data = list(map(int, input().split(" ")))

        if tree[data[0]] == -1:
            tree[data[0]] = data[1]
        else:
            tree[data[1]] = data[0]

    for i in range(2, len(tree)):
        print(tree[i])

    return


def try_second():
    """
    failed: 런타임에러
    """
    n = int(input())

    tree = [[] for _ in range(n + 1)]
    parents = [0 for _ in range(n + 1)]

    for _ in range(n - 1):
        a, b = map(int, input().split(" "))
        tree[a].append(b)
        tree[b].append(a)

    dfs(1, tree, parents)

    for i in range(2, n + 1):
        print(parents[i])

    return


def try_third():
    """
    success: 재귀 깊이가 기본적으로 1000회 이기 때문에, sys.setrecursionlimit(10**9)으로 늘려주면 된다.
    """
    import sys
    sys.setrecursionlimit(10 ** 9)
    n = int(input())

    tree = [[] for _ in range(n + 1)]
    parents = [0 for _ in range(n + 1)]

    for _ in range(n - 1):
        a, b = map(int, input().split(" "))
        tree[a].append(b)
        tree[b].append(a)

    dfs(1, tree, parents)

    for i in range(2, n + 1):
        print(parents[i])

    return


def dfs(start, tree, parents):
    for i in tree[start]:
        if parents[i] == 0:
            parents[i] = start
            dfs(i, tree, parents)


if __name__ == '__main__':
    try_third()
