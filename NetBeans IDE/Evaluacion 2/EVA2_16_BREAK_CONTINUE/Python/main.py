#Detener For cuando se encuentre numero divisible entre 5
for i in range(1, 10, 1):
	print(i)
	iResi = i % 5;
	if(iResi == 0):
		break;

#Imprimir numeros que no sean divisibles entre 5
for i in range(1, 10, 1):
	iResi = i % 5;
	if(iResi == 0):
		continue;
	print(i)
