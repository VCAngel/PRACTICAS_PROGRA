import random

random.seed()   #Prepare random number generator
iNumAlea = int(random.random() * 11)
for i in range(0, 2 + 1, 1):
    print("Adivina el numero")
    iNume = int(input())
    if iNume == iNumAlea:
        print("Felicidades, ganaste!!!")
        break
    if i == 2:
        print("Perdiste")