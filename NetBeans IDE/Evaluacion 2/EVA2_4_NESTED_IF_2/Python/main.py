print("Introduce tu calificacion:")
iCali = int(input())
if iCali == 100:
    print("A")
else:
    if iCali >= 90 and iCali < 100:
        print("B")
    else:
        if iCali >= 80 and iCali < 90:
            print("C")
        else:
            if iCali >= 70 and iCali < 80:
                print("D")
            else:
                if iCali >= 0 and iCali < 70:
                    print("F")
                else:
                    print("Fuera de rango")
