import itertools


def is_prime_number(val):
    for i in range(2, val):
        if val % i == 0:
            return False

    return True


def solution(numbers):
    answer = 0

    expected_ls = set([])

    for i in range(1, len(numbers) + 1):

        for expected in itertools.permutations(str(numbers), i):
            print(expected)
            expected_ls.add(int("".join(expected)))

    print(expected_ls)

    for i in expected_ls:

        if i == 0 or i == 1:
            continue

        if is_prime_number(i):
            answer += 1

    return answer


# def solution(numbers):
#     answer = 0
#
#     expected = int("".join(sorted(numbers)))
#
#     n = int("".join(sorted(numbers, reverse=True)))
#
#     sieve = [True] * (n + 1)
#
#     m = int(n ** 0.5)
#
#     for i in range(2, m + 1):
#         if sieve[i] == True:
#             for j in range(i + i, n + 1, i):
#                 sieve[j] = False
#
#     for i in range(2, n + 1):
#         if sieve[i] == True:
#
#             expect = int("".join(sorted(str(i))))
#
#             if i in list(map(int, numbers)):
#                 answer += 1
#
#             if expect == expected:
#                 answer += 1
#
#     return answer


if __name__ == '__main__':
    numbers = "17"
    print(solution(numbers))
