def gcd(x, y):
    if x > y:
        x, y = y, x

    while (y):
        x, y = y, x % y
    return x


"""
N = A * B 로 나타낼 수 있다는 것을 이용한 풀이. 
항상 약수를 구하면 그 짝이 되는 수가 존재한다 (ex -> 6 = 2 * 3)
for 문을 이용해 자연수 N의 제곱근까지의 약수를 구하면 그 짝이 되는 약수는 자동으로 구할 수 있다.
N = A * B 일때, A == B 일 수 있기 때문에 (ex -> 25 = 5 * 5) 값을 중복해서 넣어주지 않기 위해 if 문으로 제곱했을 때 
n이 되지 않는지 검사를 해준다. 
"""


def divisor(x):
    ls = []

    for i in range(1, int(x ** (1 / 2)) + 1):
        if x % i == 0:
            ls.append(i)
            if (i != (x // i)):
                ls.append(x // i)

    ls.sort()

    return ls


if __name__ == '__main__':
    n = int(input())
    input_data = list(map(int, input().split()))
    gcd_value = 0

    if n == 2:
        gcd_value = gcd(input_data[0], input_data[1])
    elif n == 3:
        gcd_value = gcd(input_data[0], gcd(input_data[1], input_data[2]))

    for i in divisor(gcd_value):
        print(i)
