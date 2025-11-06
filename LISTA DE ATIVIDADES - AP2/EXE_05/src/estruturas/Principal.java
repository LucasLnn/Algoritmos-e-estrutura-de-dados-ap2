package estruturas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        int opcao = 0;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Testar Lista");
            System.out.println("2. Testar Pilha");
            System.out.println("3. Testar Fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    testarLista(lista, sc);
                    break;
                case 2:
                    testarPilha(pilha, sc);
                    break;
                case 3:
                    testarFila(fila, sc);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        sc.close();
    }

    private static void testarLista(Lista lista, Scanner sc) {
        int escolha;
        do {
            System.out.println("\n--- LISTA ---");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Voltar ao menu principal");
            System.out.print("Escolha: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite um valor para inserir: ");
                    int valor = sc.nextInt();
                    lista.inserir(valor);
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 3:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 3);
    }

    private static void testarPilha(Pilha pilha, Scanner sc) {
        int escolha;
        do {
            System.out.println("\n--- PILHA ---");
            System.out.println("1. Empilhar");
            System.out.println("2. Desempilhar");
            System.out.println("3. Verificar se está vazia");
            System.out.println("4. Voltar ao menu principal");
            System.out.print("Escolha: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite um valor para empilhar: ");
                    int valor = sc.nextInt();
                    pilha.empilhar(valor);
                    break;
                case 2:
                    pilha.desempilhar();
                    break;
                case 3:
                    if (pilha.estaVazia()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("A pilha não está vazia.");
                    }
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 4);
    }

    private static void testarFila(Fila fila, Scanner sc) {
        int escolha;
        do {
            System.out.println("\n--- FILA ---");
            System.out.println("1. Enfileirar");
            System.out.println("2. Desenfileirar");
            System.out.println("3. Mostrar fila");
            System.out.println("4. Voltar ao menu principal");
            System.out.print("Escolha: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite um valor para enfileirar: ");
                    int valor = sc.nextInt();
                    fila.enfileirar(valor);
                    break;
                case 2:
                    fila.desenfileirar();
                    break;
                case 3:
                    fila.mostrarFila();
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 4);
    }
}
