print("Introduce un numero entero: ", end='')
iNum = int(input());
for i in range(1, 100 + 1, 1):
	iMod = i % iNum;
	if(iMod != 0):
		print(i)