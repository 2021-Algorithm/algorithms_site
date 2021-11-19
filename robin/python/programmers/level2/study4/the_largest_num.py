from functools import cmp_to_key


def comparator(x, y):
    a = x + y
    b = y + x

    if (a > b):
        return -1

    elif (a < b):
        return 1

    else:
        return 0


def solution(numbers):
    ls = list(map(str, numbers))

    result = "".join(sorted(ls, key=cmp_to_key(comparator)))

    return "0" if result[0] == "0" else result


if __name__ == '__main__':
    numbers = [3, 30, 34, 5, 9]
    print(solution(numbers))
