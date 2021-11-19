from itertools import combinations #조합


def is_prime_number(val):

    for i in range(2, val):
        if val % i == 0:
            return False

    return True


def solution(nums):
    answer = 0

    com_list = list(combinations(nums, 3))

    for val in com_list:
        sum_val = sum(val)

        if is_prime_number(sum_val):
            answer += 1

    return answer


if __name__ == '__main__':
    # nums = [1, 2, 3, 4]  # result= 1
    nums = [1, 2, 7, 6, 4]  # result = 4

    print(solution(nums))
