import re

def solution(new_id):
    answer = ''
    answer = new_id.lower()
    answer = re.sub('[^0-9a-z\_\.\-]', '', answer)
    answer = re.sub('\.\.+', '..', answer)
    answer = re.sub('^\.|\.$', '', answer)

    if len(answer) == 0:
        answer += 'a'

    answer = answer[:15]

    answer = re.sub('^\.|\.$', '', answer)

    while len(answer) < 3:
        answer += answer[len(answer) - 1]

    return answer


if __name__ == '__main__':
    new_id = '...!@BaT#*..y.abcdefghijklm'
    #new_id = 'z-+.^.'
    #new_id = '=.='
    print(solution(new_id))
