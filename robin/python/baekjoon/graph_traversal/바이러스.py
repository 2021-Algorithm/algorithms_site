def dfs(start, graph, visited):
    visited[start] = True

    for i in graph[start]:
        if visited[i] is False:
            dfs(i, graph, visited)


def solution():
    node = int(input())
    num = int(input())

    graph = [[] * node for _ in range(node + 1)]
    visited = [False] * (node + 1)


    for i in range(num):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)

    dfs(1, graph, visited)

    cnt_node = 0

    for i in visited[2:]:
        if i is True:
            cnt_node += 1

    print(cnt_node)
    return


if __name__ == '__main__':
    solution()
