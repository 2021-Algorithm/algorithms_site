"""
하루는 24시간.

피로도 -> a
일 - > b
쉬면 -> c
피로도를 최대한 -> m 을 넘지 않게.
"""


def solution():
    a, b, c, m = map(int, input().split())
    time = 24

    tired = 0
    process = 0

    # 피로도가 m 보다 클때
    if a > m:
        print(0)
        return

    while time > 0:

        if tired + a <= m:
            tired += a
            process += b
            time -= 1
        else:
            tired -= c
            time -= 1

    print(process)
    return


if __name__ == '__main__':
    solution()
