def solution(nums):
    answer = 0
    pocket_num = len(nums) / 2

    set_nums = set(nums)

    if pocket_num < len(set_nums) or pocket_num == len(set_nums):
        answer = pocket_num

    if pocket_num > len(set_nums):
        answer = len(set_nums)

    return answer


def solution2(nums):
    return min(len(nums) / 2, len(set(nums)))


if __name__ == '__main__':
    nums = [3, 1, 2, 3]  # 2
    nums = [3, 3, 3, 2, 2, 4]  # 3
    # nums = [3, 3, 3, 2, 2, 2] #2
    print(solution(nums))
    print(solution2(nums))
