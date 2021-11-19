def solution(phone_book):
    phone_book = sorted(phone_book)

    for i in range(len(phone_book)):

        if i + 1 == len(phone_book):
            break

        if phone_book[i + 1].startswith(phone_book[i]):
            return False

    return True


import collections


def solution2(phone_book):
    phone_dic = collections.Counter(phone_book)

    for phone_number in phone_book:
        temp = ""
        for number in phone_number:
            temp += number
            if temp in phone_dic and temp != phone_number:
                return False

    return True


if __name__ == '__main__':
    phone_book = ["12", "123", "1235", "567", "88"]

    print(solution(phone_book))
    print(solution2(phone_book))
