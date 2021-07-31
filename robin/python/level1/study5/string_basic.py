def solution(s):
    len_s = len(s)
    for i in s:
        try:
            int(i)
        except ValueError:
            return False

    if len_s in (4, 6):
        return True
    return False


def solution1(s):
    return s.isdigit() and len(s) in (4, 6)


def solution2(s):
    import re
    return bool(re.match("^(\d{4}|\d{6})$", s))


if __name__ == '__main__':
    s = "1234"
    print(solution(s))
    print(solution1(s))
    print(solution2(s))
