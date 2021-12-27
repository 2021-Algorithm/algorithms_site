def change_minute(time):
    ls = str(time).split(":")
    h = int(ls[0])
    m = int(ls[1])

    minute = h * 60
    minute += m
    return minute


def change_melody(melody):
    melody = melody.replace('C#', 'c')
    melody = melody.replace('D#', 'd')
    melody = melody.replace('F#', 'f')
    melody = melody.replace('G#', 'g')
    melody = melody.replace('A#', 'a')
    return melody


def solution(m, musicinfos):
    music = {}

    for input in musicinfos:
        ls = input.split(",")

        # 시간
        time_1 = change_minute(ls[0])
        time_2 = change_minute(ls[1])
        time_diff = time_2 - time_1

        # 노래제목
        title = ls[2]

        # 멜로디
        melody = change_melody(ls[3])

        # 노래의 길이가 시간보다 더 긴 경우
        melody_time = time_diff - len(melody)

        # 시간만큼 재생된 음악 dictionary에 넣기
        # melody_time 이 음수나 0이 나오면 문자열 길이만큼의 노래만 재생하거나 더 적게 재생
        if melody_time <= 0:
            music[melody[:time_diff]] = title
        else:
            mok, remain = divmod(time_diff, len(melody))
            string_melody = (melody * mok) + melody[:remain]
            music[string_melody] = title

    sort_music = dict(sorted(music.items(), reverse=True, key=lambda item: len(item[0])))
    m = change_melody(m)

    for i in sort_music.keys():
        if m in i:
            return sort_music.get(i)

    return "(None)"


if __name__ == '__main__':
    m = "ABC"
    musicinfos = ["12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"]
    print(solution(m, musicinfos))
