def solution(seoul):
    return "".join([("김서방은 " + str(idx) + "에 있다") for idx, val in enumerate(seoul) if val == "Kim"])


def solution1(seoul):
    return "김서방은 {}에 있다".format(seoul.index('Kim'))


if __name__ == '__main__':
    seoul = ["Jane", "Kim"]
    print(solution(seoul))
    print(solution1(seoul))
