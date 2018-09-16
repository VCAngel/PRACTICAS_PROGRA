print("Calcular el valor de una Cuña Esférica. Introduce los datos.")
print("Radio:")
rRad = float(input())
print("Grados de apertura:")
rGrad = float(input())
rVol = float(4) / 3 * (3.14159 * rRad ** 3 / 360) * rGrad
print("Volumen = ", end='', flush=True)
print(rVol)
