import random

random.seed() 	#Prepare random number generator
for i in range(1, 100 + 1, 1):
	iNumAlea = int(random.random() * 100) + 1
	print(iNumAlea)