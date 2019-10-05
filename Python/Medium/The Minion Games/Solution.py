#Author: Nicolas Schapeler
#Github: https://github.com/nschapeler
#Problem Statement: https://www.hackerrank.com/challenges/the-minion-game/problem

def minion_game(string):
    stuart = 0
    kevin = 0
    length = len(string)
    for i in range(0,length):
        if(string[i] == "A" or string[i] == "E" or string[i] == "I" or string[i] == "O" or string[i] == "U"):
            kevin = kevin + (length - i)
                
    stuart = int((length**2+length)/2 - kevin)

    if(stuart > kevin):
        print("Stuart " + str(stuart), end='')
    elif(stuart < kevin):
        print("Kevin " + str(kevin), end = '')
    elif(stuart == kevin):
        print("Draw", end='')   

if __name__ == '__main__':
    s = input()
    minion_game(s)
