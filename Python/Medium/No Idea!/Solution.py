#Author: Nicolas Schapeler
#Github: https://github.com/nschapeler
#Problem Statement: https://www.hackerrank.com/challenges/no-idea/problem

happiness = 0
input()
array = input().split(" ")
set1 = set(input().split(" "))
set2 = set(input().split(" "))

for s in array:
    if s in set1:
        happiness = happiness +1
    if s in set2:
        happiness = happiness -1
print(happiness)
