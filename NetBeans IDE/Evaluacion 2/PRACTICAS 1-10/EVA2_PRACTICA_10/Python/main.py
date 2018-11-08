print("Calificacion en Matematicas: ")
iMat = int(input())
print("Calificacion en Fisica: ")
iFis = int(input())
print("Calificacion en Quimica: ")
iQui = int(input())
iSumTres = iMat + iFis + iQui
if iMat >= 65 and iFis >= 55 and iQui >= 50 and iSumTres >= 180 or iMat >= 65 and iSumTres >= 140:
    print("El candidato es elegible para el curso")
else:
    print("El candidato no es elegible para el curso")
