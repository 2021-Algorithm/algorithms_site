def solution(s):
    lower_s = s.lower()
    count_p = lower_s.count('p')
    count_y = lower_s.count('y')

    if count_p == count_y:
        return True
    return False


def solution1(s):
    return s.lower().count('p') == s.lower().count('y')


if __name__ == '__main__':
    s = "pPoooyY"
    print(solution(s))
    print(solution1(s))
