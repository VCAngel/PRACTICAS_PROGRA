print("Introduce un valor: ", end='')
iNum = int(input());
for i in range(1, iNum + 1):
	for j in range(1, i + 1):
		print("*", end='')
	print("\n")