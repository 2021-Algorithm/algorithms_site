import collections


def solution(participant, completion):
    answer = collections.Counter(participant) - collections.Counter(completion)

    return list(answer.keys())[0]


if __name__ == '__main__':
    participant = ["leo", "kiki", "eden"]
    completion = ["eden", "kiki"]
    print(solution(participant, completion))
