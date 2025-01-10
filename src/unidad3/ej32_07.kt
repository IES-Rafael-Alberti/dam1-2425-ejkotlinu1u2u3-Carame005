package com.dam1.unidad3
import os


def limpiar_pantalla():
if os.name == "posix":
os.system("clear")
else:
os.system("cls")


def main():
limpiar_pantalla()
cesta = {}
total = 0
cont = 1

while True:
try:
precio = float(input(f"Dame el precio del artículo {cont} (0 para salir): "))
if precio == 0:
break
if precio < 0:
print("El precio no puede ser negativo. Inténtalo de nuevo.")
continue
cesta[f'Artículo {cont}'] = precio
total += precio
cont += 1
except ValueError:
print("Por favor, introduce un valor numérico válido.")

print("\nResumen de la cesta:")
for articulo, precio in cesta.items():
print(f"{articulo}: {precio:.2f}€")
print(f"\nEl precio total es: {total:.2f}€")


if __name__ == "__main__":
main()
