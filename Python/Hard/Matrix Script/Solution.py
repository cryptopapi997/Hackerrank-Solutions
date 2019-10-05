#Author: Nicolas Schapeler
#Github: https://github.com/nschapeler
#Problem Statement: https://www.hackerrank.com/challenges/matrix-script/problem

import re

first_multiple_input = input().rstrip().split()
n = int(first_multiple_input[0])
m = int(first_multiple_input[1])

matrix = []

for _ in range(n):
    matrix_item = input()
    matrix.append(matrix_item)

word = ""
for i in range(0,m):
    for j in range(0,n):
        word = word + matrix[j][i]

print(re.sub(r"(?<=\w)([^\w]+)(?=\w)", " ", word))
