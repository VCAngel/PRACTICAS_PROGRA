print("�Cuantos a�os tienes?")
iEdad = int(input())
print("�Tienes INE?")
bINE = (input().lower == 'true')
if iEdad >= 18 and bINE == True:
    print("P�sale we")
else:
    print("No puedes pasar bato")
