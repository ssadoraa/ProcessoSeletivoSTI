#include <stdio.h>
#include <stdlib.h>
#define SIZE 10

typedef struct fila {
	int *info;
	int primeiro;
	int ultimo;
	int nItens; 

} Fila;

Fila *criarFila() { 
    Fila *f = malloc(sizeof(Fila));
	f->info = (int*) malloc (SIZE * sizeof(int));
	f->primeiro = 0;
	f->ultimo = -1;
	f->nItens = 0;

    return f;
}

void inserir(Fila *f, int valor) {
	if(f->ultimo == SIZE - 1)
		f->ultimo = -1;

	f->ultimo++;
	f->info[f->ultimo] = valor;
	f->nItens++;
    printf("Elemento inserido com sucesso!\n");
}

int remover(Fila *f) {
	int aux = f->info[f->primeiro++]; 

	if(f->primeiro == SIZE)
		f->primeiro = -1;

	f->nItens--;
	return aux;
}

int estaVazia(Fila *f) {
	return f->nItens == 0;
}

int quantidadeElementos(Fila *f) {
	return f->nItens;
}

int mostrarElemento(Fila *f){
    return f->info[f->primeiro];
}

int main () {
	int valor, op = -1;
	Fila *filaElementos = criarFila();

	while (op != 0){
		printf("\n1 - Inserir elemento\n");
        printf("2 - Remover elemento\n");
        printf("3 - Proximo Elemento a ser Removido\n");
        printf("4 - Tamanho da Fila\n");
        printf("0 - Sair\n");
        printf("Digite a opcao: ");
		scanf("%d", &op);

		switch(op){
            case 0:
                exit(0); break;
			case 1:
				if (quantidadeElementos(filaElementos) == SIZE)
					printf("\nFila Cheia, nao tem como inserir elementos!!!\n\n");
				else {
					printf("\n -> Digite o valor para inserir: ");
					scanf("%d", &valor);
					inserir(filaElementos, valor);
				}
				break;

			case 2:
				if (estaVazia(filaElementos))
					printf("\nFila vazia, nao tem como remover elementos!!!\n");
				else {
					valor = remover(filaElementos);
					printf("\nO valor %d foi removido com sucesso\n", valor); 
				}
				break;

				case 3:
					if (estaVazia(filaElementos))
						printf("\nFila vazia, nao tem elemento para ser mostrado!!!\n");
					else {
						printf("\nProximo elemento que sera removido da fila => %d\n", mostrarElemento(filaElementos));
					}
					break;

                case 4:
                    if (estaVazia(filaElementos))
                        printf("\nFila vazia, nao tem elemento para ser mostrado!!!\n");
                    else
                        printf("\nA fila tem %d elemento(s)\n", quantidadeElementos(filaElementos));
                    break;

				default:
					printf("\nOpcao Invalida\n\n");

		}
	}
}