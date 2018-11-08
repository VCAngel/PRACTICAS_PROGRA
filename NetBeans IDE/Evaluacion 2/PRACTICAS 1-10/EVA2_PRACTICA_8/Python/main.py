print("Valor de Angulo 1 = ", end='', flush=True)
iAng1 = int(input())
print("Valor de Angulo 2 = ", end='', flush=True)
iAng2 = int(input())
print("Valor de Angulo 3 = ", end='', flush=True)
iAng3 = int(input())
if iAng1 == iAng2 and iAng2 == iAng3:
    print("Triangulo Equilatero")
else:
    if iAng1 == iAng2 or iAng1 == iAng3 or iAng2 == iAng3:
        print("Triangulo Isoceles")
    else:
        print("Triangulo Escaleno")
