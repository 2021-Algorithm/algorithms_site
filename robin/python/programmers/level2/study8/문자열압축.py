def solution(s):
    answer = len(s)

    for size in range(1, len(s) // 2 + 1):
        count = 1
        compress = 0

        prev = s[:size]
        for i in range(size, len(s) + size, size):
            curr = s[i: i + size]
            if prev == curr:
                count += 1
            else:
                if count > 1:
                    compress += size + len(str(count))
                else:
                    compress += len(prev)
                prev = curr
                count = 1
        if answer > compress:
            answer = compress

    return answer


if __name__ == '__main__':
    s = "aabbaccc"
    print(solution(s))
