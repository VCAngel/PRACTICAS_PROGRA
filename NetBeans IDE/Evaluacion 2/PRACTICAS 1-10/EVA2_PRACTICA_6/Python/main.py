print("Coordenada en X = ")
iX = int(input())
print("Coordenada en Y = ")
iY = int(input())
if iX > 0 and iY > 0:
    print("Coordenadas del Cuadrante 1")
else:
    if iX < 0 and iY > 0:
        print("Coordenadas del Cuadrante 2")
    else:
        if iX < 0 and iY < 0:
            print("Coordenadas del Cuadrante 3")
        else:
            if iX > 0 and iY < 0:
                print("Coordenadas del Cuadrante 4")
