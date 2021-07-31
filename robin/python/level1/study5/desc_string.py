def solution(s):
    return "".join(sorted(s, reverse=True))


if __name__ == '__main__':
    s = "Zbcdefg"
    print(solution(s))
