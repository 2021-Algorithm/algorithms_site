import datetime


def solution(a, b):
    en_days = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"]
    month = {1: 31, 2: 29, 3: 31, 4: 30, 5: 31, 6: 30, 7: 31, 8: 31, 9: 30, 10: 31, 11: 30, 12: 31}
    days = 0
    for i in range(1, a):
        days += month.get(i)

    week = (days + (b - 1)) % 7
    return en_days[week]


def solution1(a, b):
    day = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    answer = day[datetime.date(2016, a, b).weekday()]
    return answer


def solution2(a, b):
    months = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    days = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    return days[(sum(months[:a - 1]) + b - 1) % 7]


if __name__ == '__main__':
    a = 1
    b = 1
    print(solution(a, b))
    print(solution1(a, b))
    print(solution2(a, b))
