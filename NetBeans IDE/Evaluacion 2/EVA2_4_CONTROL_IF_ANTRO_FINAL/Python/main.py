print("�Cuantos a�os tienes?")
iEdad = int(input())
print("�Tienes INE?")
bINE = (input().lower == 'true')
if iEdad >= 18:
    if bINE == True:
        print("P�sale we")
    else:
        print("No puedes entrar bato")
else:
    print("No puedes entrar bato")
