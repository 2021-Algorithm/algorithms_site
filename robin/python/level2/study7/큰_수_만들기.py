def solution(number, k):
    stack = []

    for num in number:

        # stack에 값이 있고, stack의 마지막 값이 작거나,k개수가 남아있는 경우
        while stack and stack[-1] < num and k > 0:
            k -= 1
            stack.pop()  # 작은 수를 팝

        stack.append(num)

    return ''.join(stack[:len(stack) - k])


if __name__ == '__main__':
    number = "4177252841"
    k = 4
    print(solution(number, k))
