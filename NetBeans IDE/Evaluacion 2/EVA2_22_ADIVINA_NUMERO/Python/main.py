import random

random.seed()   #Prepare random number generator
iRand = int(random.random() * 11)
iNum = 0
while iRand != iNum:
    print("Adivina el numero: ")
    iNum = int(input())
print("ADIVINASTE!!!")
