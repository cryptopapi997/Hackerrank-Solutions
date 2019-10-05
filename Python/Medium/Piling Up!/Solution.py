#Author: Nicolas Schapeler
#Github: https://github.com/nschapeler
#Problem Statement: https://www.hackerrank.com/challenges/piling-up/problem

from collections import deque

for i in range(int(input())):  
    input()
    queue = deque(map(int, input().split(" ")))
    current = 10000000000000
    
    
    while True:
        if len(queue) == 0: 
            print('Yes')
            break
        if queue[-1] <= current and queue[-1] >= queue[0]: 
            current = queue[-1]
            queue.pop()
        elif queue[0] <= current: 
            current = queue[0]
            queue.popleft()
        else:
            print('No')
            break
