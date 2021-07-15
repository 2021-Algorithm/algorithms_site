# move 하나씩 카운트 한다
# 0가장 len 끝 값에 존재하면 0으로 바꾼다.
# basket에 제일 끝과 바로 앞이 2면 answer를 2개 증가

def solution(board, moves):
    answer = 0
    basket = []

    for val in moves:

        board_idx = val - 1

        for i in range(len(board)):

            block = board[i][board_idx]

            if block != 0:
                basket.append(block)
                board[i][board_idx] = 0
                break

        if len(basket) > 1:

            last_basket_idx = len(basket) - 1
            next_to_last_basket_idx = len(basket) - 2

            if basket[last_basket_idx] == basket[next_to_last_basket_idx]:
                basket.pop(-1)
                basket.pop(-1)
                answer += 1

    return answer * 2


if __name__ == '__main__':
    board = [[0, 0, 0, 0, 0],
             [0, 0, 1, 0, 3],
             [0, 2, 5, 0, 1],
             [4, 2, 4, 4, 2],
             [3, 5, 1, 3, 1]]
    moves = [1, 5, 3, 5, 1, 2, 1, 4]

    # 4 - 3 - 1 - 1 -3 - 2 -4

    print(solution(board, moves))
