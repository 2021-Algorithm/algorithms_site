def solution():
    n, m = map(int, input().split())

    a = list(map(int, input().split()))
    b = list(map(int, input().split()))

    print(" ".join(map(str, sorted(a + b))))
    return


if __name__ == '__main__':
    solution()
