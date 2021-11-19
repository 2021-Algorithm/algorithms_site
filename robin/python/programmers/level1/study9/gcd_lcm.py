def solution(n, m):
    n_copy = n
    m_copy = m
    answer = []
    # gcd
    while True:
        temp = m % n

        if temp == 0:
            answer.append(n)
            break
        m = n
        n = temp

    # lcm
    answer.append(int((n_copy * m_copy) / answer[0]))

    return answer


def gcd(a, b):
    return b if a % b == 0 else gcd(b, a % b)


def lcm(a, b):
    return int(a * b / gcd(a, b))


def gcdlcm(a, b):
    answer = [gcd(a, b), lcm(a, b)]

    return answer


if __name__ == '__main__':
    n = 2
    m = 5
    print(solution(n, m))
    print(gcdlcm(n, m))
