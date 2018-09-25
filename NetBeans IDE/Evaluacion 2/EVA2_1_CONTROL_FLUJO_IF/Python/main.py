print("Qué calificación obtuviste en Fundamentos de programación:")
rCal = float(input())
print("Tu calificación es: ", end='', flush=True)
print(rCal)
if rCal >= 70:
    print("¡Aprobaste!")
else:
    print("Nos vemos en segunda oportunidad")
