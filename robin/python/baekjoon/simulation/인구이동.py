from collections import deque
import sys

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
is_move = False

"""
python3 시간 초과가 난다... PyPy3는 안난다..
"""


def bfs(i, j, visited, board, l, r):
    global is_move

    people = board[i][j]

    #일단 bfs에 들어왔다는 것 자체가 count 1시작
    count = 1
    queue = deque([])
    queue.append((i, j))

    visited[i][j] = True

    # 인구이동이 발생할 도시 변수 리스트
    change_queue = []
    change_queue.append((i, j))

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]


            # 허용되는 범위인지 검사
            if 0 <= nx < len(board) and 0 <= ny < len(board):
                # 방문했는지 검사
                if not visited[nx][ny]:
                    # 인구차이 검사
                    if l <= abs(board[x][y] - board[nx][ny]) <= r:
                        visited[nx][ny] = True
                        queue.append((nx, ny))

                        #인구이동. 평균값? 구하기위해. people변수에 인구 수 넣기
                        people += board[nx][ny]

                        #인구이동 도시 개수 카운트.
                        count += 1

                        #인구이동이 일어날 위치 change_queue변수에 넣어두기
                        change_queue.append((nx, ny))

    move_people = people // count

    if count > 1:
        #count 1보다 크다는건 인구이동이 변경되었으니 true로 설정
        is_move = True
        for x, y in change_queue:
            board[x][y] = move_people


def solution():
    global is_move # -> 핵심.. 일단 인구이동이 일어났는지, 아닌지에 따라 while문 돌리기.
    answer = 0

    n, l, r = map(int, sys.stdin.readline().split())

    board = []
    for i in range(n):
        board.append(list(map(int, sys.stdin.readline().split())))

    while True:
        is_move = False
        visited = [[False] * n for _ in range(n)]

        for i in range(n):
            for j in range(n):
                if not visited[i][j]:
                    bfs(i, j, visited, board, l, r)

        #is_move 인구이동이 발생했다면 answer에 넣는데, 아니면 브릭!
        #일단 인구이동이 일어났는지, 아닌지에 따라 while문 돌리기.
        if is_move:
            answer += 1
        else:
            break

    print(answer)
    return


if __name__ == '__main__':
    solution()
