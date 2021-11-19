from collections import deque


def solution(bridge_length, weight, truck_weights):
    time = 0

    truck_on_the_bridge = [0] * bridge_length

    standby_truck = deque(truck_weights)

    while len(truck_on_the_bridge):

        time += 1
        truck_on_the_bridge.pop(0)

        if standby_truck:

            if sum(truck_on_the_bridge) + standby_truck[0] <= weight:
                truck_on_the_bridge.append(standby_truck.popleft())
            else:
                truck_on_the_bridge.append(0)

    return time


if __name__ == '__main__':
    bridge_length = 100
    weight = 100
    truck_weights = [10]
    print(solution(bridge_length, weight, truck_weights))
