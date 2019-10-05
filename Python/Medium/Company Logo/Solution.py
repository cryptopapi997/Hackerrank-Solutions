#Author: Nicolas Schapeler
#Github: https://github.com/nschapeler
#Problem Statement: https://www.hackerrank.com/challenges/most-commons/problem

from collections import Counter

s = sorted(input())
for c in Counter(s).most_common(3):
    print(c[0] + " "+ str(c[1]))
