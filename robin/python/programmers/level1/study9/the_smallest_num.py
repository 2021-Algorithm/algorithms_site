def solution(arr):
    arr.remove(min(arr))
    return arr if len(arr) != 0 else [-1]


if __name__ == '__main__':
    arr = [4, 3, 2, 1]
    print(solution(arr))
