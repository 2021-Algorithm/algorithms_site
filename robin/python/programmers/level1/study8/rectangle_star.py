def solution(num):
    answer = ''
    a, b = map(int, num.strip().split(' '))
    answer += (("*" * a) + "\n") * b
    return answer


if __name__ == '__main__':
    num = "5 3"
    print(solution(num))
