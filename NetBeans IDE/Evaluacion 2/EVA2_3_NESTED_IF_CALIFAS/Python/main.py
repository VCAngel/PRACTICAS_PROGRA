print("INTRODUCE TU CALIFICACIÓN")
iCali = int(input())
if iCali == 100:
    print("Sacaste A")
else:
    if iCali == 90:
        print("Sacaste B")
    else:
        if iCali == 80:
            print("Sacaste C")
        else:
            if iCali == 70:
                print("Sacaste D")
            else:
                if iCali == 60:
                    print("Sacaste F")
                else:
                    print("Calificiación fuera de rango")
