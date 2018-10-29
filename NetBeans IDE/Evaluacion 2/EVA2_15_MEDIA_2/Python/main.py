iSuma = 0
for i in range(1, 5 + 1, 1):
    print("Edad ", end='', flush=True)
    print(i, end='', flush=True)
    print(": ")
    iSumInput = int(input())
    iSuma = iSuma + iSumInput
dMedia = float(iSuma) / 5
print("La media es: ", end='', flush=True)
print(dMedia)
