print("Temperatura (ºC): ")
iTemp = int(input())
if iTemp < 0:
    print("Freezing Cold Weather")
else:
    if iTemp >= 0 and iTemp < 10:
        print("Very Cold Weather")
    else:
        if iTemp >= 10 and iTemp < 20:
            print("Cold Weather")
        else:
            if iTemp >= 20 and iTemp < 30:
                print("Normal in Temperature")
            else:
                if iTemp >= 30 and iTemp < 40:
                    print("It's Hot")
                else:
                    if iTemp >= 40:
                        print("It's Very Hot!")
