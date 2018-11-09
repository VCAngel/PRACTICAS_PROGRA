print("Introduce un numero:")
iNum = int(input());
iCont = 0;
for i in range(1, iNum + 1):
	iMod = iNum % i;
	if(iMod == 0):
		iCont += 1;
if(iCont <= 2):
	print("Es primo")
else:
	print("No es primo")