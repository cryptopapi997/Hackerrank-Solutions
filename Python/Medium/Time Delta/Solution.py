#Author: Nicolas Schapeler
#Github: https://github.com/nschapeler
#Problem Statement: https://www.hackerrank.com/challenges/python-time-delta/problem

import os
from datetime import datetime

def time_delta(t1, t2):
    formattime = '%a %d %b %Y %H:%M:%S %z'
    return int(abs((datetime.strptime(t1,formattime) - datetime.strptime(t2,formattime)).total_seconds()))


    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        t1 = input()

        t2 = input()

        delta = time_delta(t1, t2)

        fptr.write(str(delta) + "\n")

    fptr.close()

