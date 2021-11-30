from collections import deque


def try_first_solution(cacheSize, cities):
    """
    failed: 테스트는 다 성공했는데, 제출하면 40점..
    """
    cities_queue = deque(cities)
    cache = []
    timer = 0

    while len(cities_queue) != 0:
        city = str(cities_queue.popleft()).upper()

        if city in cache:
            timer += 1
        else:
            timer += 5

        if len(cache) <= cacheSize:
            cache.append(city)
        elif len(cache) > cacheSize:
            cache.pop(0)
            cache.append(city)

    return timer


def try_second_solution(cacheSize, cities):
    """
    캐시에서 재사용하면 오래된 데이터는 최근 사용된 것으로 갱신된다.
    캐시 사이즈가 0일때는 캐시를 사용하지 않는 거라. 해당 부분도 if 문 처리해줘야한다.
    """
    cities_queue = deque(cities)
    cache = []
    timer = 0

    while len(cities_queue) != 0:
        city = str(cities_queue.popleft()).upper()

        if city in cache:
            idx = cache.index(city)
            cache.pop(idx)
            timer += 1
        else:
            timer += 5

        if cacheSize == 0:
            continue
        elif len(cache) < cacheSize:
            cache.append(city)
        elif len(cache) >= cacheSize:
            cache.pop(0)
            cache.append(city)

    return timer


def smart_solution(cacheSize, cities):
    """
    deque도 maxlen을 정할 수 있눼..
    """
    import collections
    cache = collections.deque(maxlen=cacheSize)
    time = 0
    for i in cities:
        s = i.lower()
        if s in cache:
            cache.remove(s)
            cache.append(s)
            time += 1
        else:
            cache.append(s)
            time += 5
    return time


if __name__ == '__main__':
    # cacheSize = 3
    cacheSize = 0
    cities = ["la", "la"]
    # cities = ["Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"]
    # cities = ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"]
    print(try_second_solution(cacheSize, cities))
    print(smart_solution(cacheSize, cities))
