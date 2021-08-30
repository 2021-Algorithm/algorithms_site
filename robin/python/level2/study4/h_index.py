def solution(citations):
    result = sorted(citations, reverse=True)

    for i in range(len(result)):
        print(i+ 1, result[i])
        if i + 1 > result[i]:
            return i

    return len(result)


if __name__ == '__main__':
    citations = [3, 0, 6, 1, 5]
    print(solution(citations))
