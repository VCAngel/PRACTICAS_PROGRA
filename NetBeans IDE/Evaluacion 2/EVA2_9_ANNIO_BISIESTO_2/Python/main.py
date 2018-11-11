print("Ingrese un annio")
iAnnio = int(input())
iResi = iAnnio % 4
iResi100 = iAnnio % 100
iResi400 = iAnnio % 400
if (iResi == 0 and (iResi100 != 0 or iResi400 == 0)):
	print("BISIESTO")
else:
	print("NO ES BISIESTO")
