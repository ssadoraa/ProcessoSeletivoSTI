def fatorialNRecursivo(x):
    total = 1

    for i in range(x, 0, -1):
        total *= i;

    return total

def fatorialRecursivo(x):
    if x == 1:
        return 1;
    elif x == 0:
        return 1
    else:
        return x * fatorialRecursivo(x - 1);
    
def imprimir(x, total):
    print("\n", x,"! = ", end='')
    for i in range(x, 1, -1):
        print(i, "* ", end='')
    print('1 =', total)

def main():
    valor = int(input("Digite o valor: "))
    
    print("\nCalcular em qual tipo:")
    print("1 - Forma Recursiva")
    print("2 - Forma NAO Recursiva")
    tipo = int(input("Opcao: "))
    
    while (tipo != 1 and tipo != 2):
        print("Opcao Invalida")
        tipo = int(input("Opcao: "))
        
    if tipo == 1:
        imprimir(valor, fatorialRecursivo(valor))
    else:
        imprimir(valor, fatorialNRecursivo(valor))

main()