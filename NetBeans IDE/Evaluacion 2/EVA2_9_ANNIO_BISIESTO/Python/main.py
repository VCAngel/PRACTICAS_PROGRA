print("INTRODUCE EL A�O")
iAnnio = int(input())
if iAnnio % 4 == 0:
    if iAnnio % 100 == 0:
        if iAnnio % 400 == 0:
            print("ES BISIESTO")
        else:
            print("NO ES BISIESTO")
    else:
        print("ES BISIESTO")
else:
    print("NO ES BISIESTO")
