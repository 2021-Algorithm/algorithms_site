from datetime import datetime


def formatting_time(str_time):
    ls = str_time.split(":")

    if len(ls[0]) <= 1:
        return "0" + ":".join(ls)
    else:
        return ":".join(ls)


def solution():
    FORMAT_TIME = "%H:%M:%S"

    now = str(input())
    time = str(input())

    diff = datetime.strptime(time, FORMAT_TIME) - datetime.strptime(now, FORMAT_TIME)

    if str(diff) == "0:00:00":
        print("24:00:00")

    elif diff.days < 0:
        print(formatting_time(str(diff).split(", ")[1]))

    else:
        print(formatting_time(str(diff)))

    return


if __name__ == '__main__':
    solution()
