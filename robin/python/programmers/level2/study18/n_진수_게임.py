"""

n -> 진법
t -> 미리 구할 숫자의 갯수
m -> 게임에 참가하는 인원
p -> 튜브의 순서

10진수
0,1,2,3,4,5,6,7,8,9,10 -> 한자리씩 끊어서

2진법
0: 0, 1: 1, 2: 10, 3: 11, 4: 100

16진법
0: 0 , 1: 1, 2: 2, 3: 3, 4: 4
"""

def convert(num, base):
    tmp = '0123456789ABCDEF'

    q, r = divmod(num, base)
    if q == 0:
        return tmp[r]
    else:
        return convert(q, base) + tmp[r]


def solution(n, t, m, p):
    temp = ''
    answer = ''

    for i in range(m * t):
        temp += convert(i, n)

    while len(answer) < t:
        answer += temp[p - 1]
        p += m

    return answer


if __name__ == '__main__':
    n = 8
    t = 8
    m = 2
    p = 1
    print(solution(n, t, m, p))
