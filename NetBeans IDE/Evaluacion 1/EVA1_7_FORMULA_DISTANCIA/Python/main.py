print("Calcular distancia. Introduce los datos.")
print("Velocidad Inicial:")
rVelI = float(input())
print("Velocidad final:")
rVelF = float(input())
print("Tiempo:")
rTiem = float(input())
rDist = (rVelF + rVelI) / 2 * rTiem
print("Distancia = ", end='', flush=True)
print(rDist)
