def solution(x):
    return x % sum(map(int, list(str(x)))) == 0


if __name__ == '__main__':
    arr = 10
    print(solution(arr))
