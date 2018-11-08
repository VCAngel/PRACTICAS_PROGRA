print("Ax^2 + Bx + C = 0")
print("A = ", end='', flush=True)
iA = int(input())
print("B = ", end='', flush=True)
iB = int(input())
print("C = ", end='', flush=True)
iC = int(input())
print(iA, end='', flush=True)
print("x^2 + ", end='', flush=True)
print(iB, end='', flush=True)
print("x + ", end='', flush=True)
print(iC, end='', flush=True)
print(" = 0")
dRaiz = iB ** 2 - 4 * iA * iC
dDisc = sqrt(dRaiz)
dX1 = (-iB + dDisc) / (2 * iA)
dX2 = (-iB - dDisc) / (2 * iA)
if dRaiz == 0:
    print("Es un Trinomio Cuadrado Perfecto")
    print("Sus raices son: ", end='', flush=True)
    print("x1 = ", end='', flush=True)
    print(dX1, end='', flush=True)
    print(", x2 = ", end='', flush=True)
    print(dX2)
else:
    if dRaiz > 0:
        print("Es otro tipo de Trinomio")
    else:
        print("No se puede resolver")
