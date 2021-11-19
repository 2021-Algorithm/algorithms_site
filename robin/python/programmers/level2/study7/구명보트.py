from collections import deque


def solution(people, limit):

    #우선 내림 차순으로 정렬한 list를 큐에 넣는다.
    standby_people = deque(sorted(people, reverse=True))

    #보트에 태운 수를 구하기 위한 변수
    answer = 0

    while standby_people:

        answer += 1  #보트에 태운 수 +1
        boat = standby_people.popleft() #보트에 태운 사람 몸무게를 보트 변수에 넣어준다.

        if standby_people:  #뒷 사람이 남아있으면, (queue가 남아있으면)

            if boat + standby_people[-1] <= limit: #우선 보트에 태운 무게 많이 나가는 사람이 큐 맨끝에 가장 적게 몸무게가 나가는 사람이랑 더해서 값이 Limit 안인지 확인
                standby_people.pop() #그렇다면 right pop

            elif boat + standby_people[0] <= limit: #첫번째 if 가 아니라면 큐의 맨앞이랑 더해서 몸무게가 limit 안인지 확인
                standby_people.popleft() #그렇다면 leftpop

    return answer


def solution2(people, limit):
    answer = 0
    people.sort()

    a = 0
    b = len(people) - 1
    while a < b:
        if people[b] + people[a] <= limit:
            a += 1
            answer += 1
        b -= 1
    return len(people) - answer


if __name__ == '__main__':
    people = [70, 50, 80, 50]
    limit = 100
    print(solution(people, limit))
    print(solution2(people, limit))
