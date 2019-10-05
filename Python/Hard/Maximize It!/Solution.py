#Author: Nicolas Schapeler
#Github: https://github.com/nschapeler
#Problem Statement: https://www.hackerrank.com/challenges/maximize-it/problem

import itertools

n1, n2 = input().split(" ")
numsum = 0
matrix = [[0]*int(n1) for i in range(int(n1))]


for i in range(0,int(n1)):
    matrix[i] = input().split(" ")
    matrix[i].pop(0)
    matrix[i] = [int(i)**2 for i in matrix[i]]
    matrix[i].sort()

maximum = 0
#Create Cartesian Product and then check which combination has the largest function value
for element in itertools.product(*matrix):
    sumnum = 0
    for num in element:
        sumnum += int(num)
    func = sumnum%int(n2)
    if(func >= maximum):
        maximum = func

print(maximum)
