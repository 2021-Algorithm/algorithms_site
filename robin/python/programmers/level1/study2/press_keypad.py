def solution(numbers, hand):
    keypad = {1: [0, 0], 2: [0, 1], 3: [0, 2],
              4: [1, 0], 5: [1, 1], 6: [1, 2],
              7: [2, 0], 8: [2, 1], 9: [2, 2],
              '*': [3, 0], 0: [3, 1], '#': [3, 2]}

    answer = ''

    left = keypad.get('*')
    right = keypad.get('#')

    for i in numbers:

        key = keypad.get(i)

        left_distance = abs(left[0] - key[0]) + abs(left[1] - key[1])
        right_distance = abs(right[0] - key[0]) + abs(right[1] - key[1])

        if i in (1, 4, 7):
            left = key
            answer += "L"

        if i in (3, 6, 9):
            right = key
            answer += "R"

        if i in (2, 5, 8, 0):

            if left_distance == right_distance:
                if hand == "left":
                    left = key
                    answer += "L"
                else:
                    right = key
                    answer += "R"
            else:
                if left_distance < right_distance:
                    left = key
                    answer += "L"
                else:
                    right = key
                    answer += "R"

    return answer


if __name__ == '__main__':
    numbers = [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]
    hand = "right"
    print(solution(numbers, hand))
    # result = "LRLLLRLLRRL"
