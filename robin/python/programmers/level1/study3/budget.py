def solution(d, budget):
    answer = 0
    d.sort()
    for i in d:
        if i <= budget:
            answer += 1
            budget -= i
        else:
            break

    return answer


if __name__ == '__main__':
    d = [1, 3, 2, 5, 4]
    # d = [1,3,4,6,7]
    budget = 9
    print(solution(d, budget))
