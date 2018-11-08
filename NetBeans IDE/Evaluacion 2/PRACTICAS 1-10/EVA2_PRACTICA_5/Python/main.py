print("Introduce el primer valor: ")
iNum1 = int(input())
print("Introduce el segundo valor: ")
iNum2 = int(input())
print("Introduce el tercer valor: ")
iNum3 = int(input())
print("El número mayor es = ", end='', flush=True)
if iNum1 >= iNum2 and iNum1 >= iNum3:
    print(iNum1)
else:
    if iNum2 >= iNum1 and iNum2 >= iNum3:
        print(iNum2)
    else:
        if iNum3 >= iNum1 and iNum3 >= iNum2:
            print(iNum3)
