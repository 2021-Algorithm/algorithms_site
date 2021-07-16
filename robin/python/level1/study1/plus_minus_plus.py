def solution(absolutes, signs):
    for i in range(len(signs)):
        if signs[i]:
            signs[i] = 1
        else:
            signs[i] = -1

    return sum([(x * y) for x, y in zip(absolutes, signs)])


def solution_two(absolutes, signs):
    answer = 0

    for absolute, sign in zip(absolutes, signs):
        if sign:
            answer += absolute
        else:
            answer += -absolute

    return answer


def solution_three(absolutes, signs):
    return sum(absolutes if sign else -absolutes for absolutes, sign in zip(absolutes, signs))


if __name__ == '__main__':
    absolutes = [4, 7, 12]
    signs = [True, False, True]
    print(solution(absolutes, signs))
