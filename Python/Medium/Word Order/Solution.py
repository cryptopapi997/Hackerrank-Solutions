#Author: Nicolas Schapeler
#Github: https://github.com/nschapeler
#Problem Statement: https://www.hackerrank.com/challenges/word-order/problem

from collections import OrderedDict

wordnum = int(input())
wordlist = OrderedDict()
for i in range(0,wordnum):
    key = input()
    if key in wordlist.keys():
        wordlist[key] += 1
    else: 
        wordlist[key] = 1

print(len(wordlist))
for v in wordlist.values():
    print(v, end = " ")
