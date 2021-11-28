"""
https://codingpractices.tistory.com/48
"""


def get_set_ls(example_string):
    ls = []
    for i in range(1, len(example_string)):

        verify_str = (example_string[i - 1] + example_string[i]).upper()

        if verify_str.isalpha():
            ls.append(verify_str)

    return ls


def solution(str1, str2):
    str1_ls = get_set_ls(str1)
    str2_ls = get_set_ls(str2)

    # 둘 다 ls에 아무것도 들어가있지 않으면 공집합인 경우로 간주
    if len(str1_ls) == 0 and len(str2_ls) == 0:
        return 65536

    else:
        intersection = list(set(str1_ls) & set(str2_ls))
        union = list(set(str1_ls) | set(str2_ls))

        """
        만약 
        a = [1, 1, 2, 2]
        b = [1, 2, 2, 3]
        
        a & b = [1, 2] -> 어쨋든 이 원소가 멀티 교집합에 있는데 갯수가 몇개가 있냐가 중요.
        a | b = [1, 2, 3] -> 어쨋든 이 원소가 멀티 합집합에 있는데 갯수가 몇개가 있냐가 중요.
        
        multi_a & b = [1, 2, 2]
        multi_a | b = [1, 1, 2, 2, 3]
        
        만약 1의 경우는 
        멀티 교집합의 일때 1은 1개만 담으면 된다. 그래서 min 값을 사용.
        멀티 합집합의 일때 1은 2개를 담아야 하는데 그래서 max 값을 사용.
        """

        # 다중 교집합
        multi_inter = []
        for i in intersection:
            for _ in range(min(str1_ls.count(i), str2_ls.count(i))):
                multi_inter.append(i)
        print(multi_inter)

        # 다중 합집합
        multi_union = []
        for i in union:
            for _ in range(max(str1_ls.count(i), str2_ls.count(i))):
                multi_union.append(i)
        print(multi_union)

    return int(len(multi_inter) / len(multi_union) * 65536)


if __name__ == '__main__':
    str1 = "FRANCE"
    str2 = "french"

    # str1 = "handshake"
    # str2 = "shake hands"

    # str1 = "aa1+aa2"
    # str2 = "AAAA12"

    # str1 = "E=M*C^2"
    # str2 = "e=m*c^2"

    # str1="aabbc"
    # str2 = "abbde"
    print(solution(str1, str2))
