def solution(dartResult):
    answer = []
    score = ["x", "S", "D", "T"]
    option = ["x", "#", "*"]

    dart = 0

    for idx, val in enumerate(dartResult):

        if val in score:
            answer.append(int(dartResult[dart:idx]) ** int(score.index(val)))

            dart = idx + 1

        if val in option:

            if val == "*":

                if len(answer) < 2:
                    answer[-1] = answer[-1] * 2
                else:
                    answer[-1] = answer[-1] * 2
                    answer[-2] = answer[-2] * 2

            if val == "#":
                answer[-1] = -answer[-1]

            dart += 1

    return sum(answer)


if __name__ == '__main__':
    dartResult = "1D#2S*3S"
    print(solution(dartResult))
