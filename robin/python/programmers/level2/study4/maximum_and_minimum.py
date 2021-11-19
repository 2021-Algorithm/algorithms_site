def solution(s):
    ls = sorted(map(int, s.split(" ")))
    return str(ls[0]) + " " + str(ls[-1])


if __name__ == '__main__':
    s = "1 2 3 4"
    print(solution(s))
