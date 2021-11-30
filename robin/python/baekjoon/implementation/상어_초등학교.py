dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]


def solution1():
    # graph 크기
    n = int(input())

    # 좋아하는 친구 4명
    like_friend = [[]] * ((n * n) + 1)

    graph = [[0] * n for i in range(n)]

    for _ in range(n * n):
        student_num, a, b, c, d = map(int, input().split())
        print("======", student_num, "======")
        # 같이 앉고 싶은 친구 리스트를 받는다.
        like_friend[student_num] = [a, b, c, d]

        x, y = 0, 0


        # 자리마다 max 값을 알기 위해 (만약 이전 자리는 좋아하는 친구가 3 지금 자리는 4 일 때를 검사하기 위해서 있는 변수)
        max_like = -1
        max_empty = -1

        for i in range(n):
            for j in range(n):
                if graph[i][j] == 0:
                    like_cnt = 0
                    empty_cnt = 0

                    for d in range(4):
                        nx = i + dx[d]
                        ny = j + dy[d]

                        if 0 <= nx and nx < n and 0 <= ny and ny < n:
                            if graph[nx][ny] in like_friend[student_num]:
                                like_cnt += 1
                            if graph[nx][ny] == 0:
                                empty_cnt += 1

                    # 비어있는 칸 중에서 좋아하는 학생이 인접한 칸에 가장 많은 칸으로 자리를 정한다.
                    # 인접한 칸 중에서 비어있는 칸이 가장 많은 칸으로 자리를 정한다.
                    # 행의 번호가 가장 작은칸으로, 아니면 열의 번호가 가장 작은 칸으로 자리를 정한다
                    if max_like < like_cnt or (max_like == like_cnt and max_empty < empty_cnt):
                        x = i
                        y = j
                        max_like = like_cnt
                        max_empty = empty_cnt

        graph[x][y] = student_num

    result = 0
    for i in range(n):
        for j in range(n):
            cnt = 0
            like = like_friend[graph[i][j]]

            for d in range(4):
                nx = i + dx[d]
                ny = j + dy[d]

                if 0 <= nx < n and 0 <= ny < n:
                    if graph[nx][ny] in like:
                        cnt += 1

            if cnt != 0:
                result += 10 ** (cnt - 1)

    print(result)
    return


if __name__ == '__main__':
    solution1()


"""
그냥 막 두드려본 코드... 역시나.. 어렵다
"""

def second(graph, i, j, n):
    cnt = 0
    for d in range(4):
        nx = i + dx[d]
        ny = j + dy[d]
        if 0 <= nx and nx < n and 0 <= ny and ny < n:
            if graph[nx][ny] == 0:
                cnt += 1
    return cnt


def solution():
    n = int(input())
    like_friend = [[]] * ((n * n) + 1)
    graph = [[0] * n for i in range(n)]

    x, y = -1, -1

    for i in range(n * n):
        student_num, a, b, c, d = map(int, input().split())
        print("======", student_num, "======")
        # 같이 앉고 싶은 친구 리스트를 받는다.
        like_friend[student_num] = [a, b, c, d]

        if x == -1 and y == -1:
            max = 0

            for i in range(n):
                for j in range(n):
                    cnt = second(graph, i, j, n)
                    if max < cnt:
                        max = cnt
                        x, y = i + 1, j + 1

            if graph[x - 1][y - 1] == 0:
                graph[x - 1][y - 1] = student_num

        else:

            for like in like_friend[student_num]:
                for i in range(n):
                    for j in range(n):
                        if like == graph[i][j]:
                            x, y = i + 1, j + 1
                            break
            print(x, y)

            recommend = []
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]

                if 0 <= nx and nx <= n and 0 <= ny and ny <= n:
                    if abs(x - nx) + abs(y - ny) == 1:
                        recommend.append((nx, ny))

            recommend.sort()
            print(recommend)

            cnt_ls = set()
            for i, j in recommend:
                cnt_ls.add(second(graph, i - 1, j - 1, n))

            if len(cnt_ls) == 1:
                for i, j in recommend:
                    if graph[i - 1][j - 1] == 0:
                        graph[i - 1][j - 1] = student_num
                        break
                    else:
                        continue
            else:
                max = 0
                for i, j in sorted(recommend, reverse=True):
                    if graph[i - 1][j - 1] == 0:
                        cnt = second(graph, i - 1, j - 1, n)
                        if max <= cnt:
                            max = cnt
                            x, y = i, j
                graph[x - 1][y - 1] = student_num

        print(graph)
    return
