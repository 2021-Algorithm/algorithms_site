def solution(A, B):
    answer = 0

    A = sorted(A)
    B = sorted(B, reverse=True)

    for a, b in zip(A, B):
        answer += a * b

    return answer


if __name__ == '__main__':
    A = [1, 4, 2]
    B = [5, 4, 4]
    print(solution(A, B))
