print("Acreditaste tus materias?")
bMaterias = (input().lower == 'true');
print("Hiciste tus servicios?")
bServicio = (input().lower == 'true');
print("Terminaste tus residencias?")
bResidencias = (input().lower == 'true');

if (bMaterias and bServicio and bResidencias) == True:
	print("TE PUEDES TITULAR")
else:
	print("NO TE PUEDES TITULAR")
	