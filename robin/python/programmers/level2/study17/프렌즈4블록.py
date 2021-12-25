
#https://gingerkang.tistory.com/38

def friends(m, n, board, visited):
    for i in range(m - 1):
        for j in range(1, n):
            if board[i][j] != ' ' and board[i][j] == board[i][j - 1] and board[i][j - 1:j + 1] == board[i + 1][
                                                                                                  j - 1:j + 1]:
                visited[i][j] = True
                visited[i][j - 1] = True
                visited[i + 1][j] = True
                visited[i + 1][j - 1] = True


def deleteBlock(m, n, board, visited):
    ## 지워질 블록 갯수 담는 변수
    cnt = 0
    for i in range(m):
        for j in range(n):
            if visited[i][j] == True:

                ## 지워질 블록 갯수 담는 변수
                cnt += 1
                # 지워지는 블럭이 있으면 그부분 ' ' 공백으로 변경
                board[i] = board[i][:j] + ' ' + board[i][j + 1:]


    # 공백으로 변경한 board[i]를 문자열로 rotation_board에 넣어줌.
    rotation_board = []
    for i in range(n):
        tmp = ''
        for j in range(m):
            tmp += board[j][i]
        rotation_board.append(tmp)


    for i in range(n):
        for j in range(1, m):
            # 공백이 있으면
            if rotation_board[i][j] == ' ':
                # 아래로 땡기고 윗 부분 공백으로 채우기
                rotation_board[i] = ' ' + rotation_board[i][:j] + rotation_board[i][j + 1:]
                print(rotation_board[i])

    #board를 다시 재구성 하기 위해 만든 변수.
    tmp_board = []
    for i in range(m):
        tmp = ''
        for j in range(n):
            tmp += rotation_board[j][i]
        tmp_board.append(tmp)

    # 재구성한 temp_board를 board에 다시 넣어줌.
    board = tmp_board

    return board, cnt


def solution(m, n, board):
    answer = 0
    result = 1

    # result가 제거된 블럭 갯수인데, 제거된 블럭이 없으면 break 처음엔 while 문이 돌아야하기 때문에 1로 초기값 셋팅
    while result:
        visited = [[False] * n for _ in range(m)]

        # 2 * 2 블럭 찾기
        friends(m, n, board, visited)

        # 2 * 2 블럭 제거해주면서 위에 남아있는 블럭 아래로 떨어트리기 위한 메소드
        board, result = deleteBlock(m, n, board, visited)

        answer += result

    return answer


#############################################################
from collections import deque


def bfs(graph, i, j, n, m):
    dx = [1, -1, 0, 0]
    dy = [0, -0, 1, -1]

    val = graph[i][j]
    count = 1
    visited = [[False] * n for _ in range(m)]
    queue = deque([(i, j)])

    while len(queue) != 0:
        x, y = queue.popleft()
        visited[x][y] = True

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx and nx < len(graph) and 0 <= ny and ny < len(graph[i]):

                if visited[nx][ny] == False:

                    if graph[nx][ny] == val:
                        queue.append((nx, ny))
                        visited[nx][ny] = True
                        count += 1

                    if graph[nx][ny] == 0:
                        queue.append((nx, ny))
                        visited[nx][ny] = True
                        continue

    return count


def first_solution(m, n, board):
    graph = []

    for i in board:
        ls = []
        for j in i:
            ls.append(j)
        graph.append(ls)

    print(graph)
    queue = deque([])

    for i in range(len(graph)):
        for j in range(len(graph[i])):
            count = bfs(graph, i, j, n, m)
            if count > 3:
                queue.append((i, j))
                continue

    answer = 0

    while queue:
        x, y = queue.popleft()
        if graph[x][y] != 0:
            answer += 1

        graph[x][y] = 0

        for i in range(len(graph)):
            for j in range(len(graph[i])):
                if graph[i][j] != 0:
                    count = bfs(graph, i, j, n, m)
                    if count > 3:
                        queue.append((i, j))

    return answer


if __name__ == '__main__':
    m = 6
    n = 6
    board = ["TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"]
    print(solution(m, n, board))
