import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TDA {
    private List<String> elementos;

    public TDA() {
        elementos = new ArrayList<>();
    }

    public void adicionar(String valor) {
        elementos.add(valor);
    }

    public void remover(String valor) {
        if (elementos.contains(valor)) {
            elementos.remove(valor);
            System.out.println(valor + " foi removido da lista.");
        } else {
            System.out.println(valor + " não está na lista.");
        }
    }

    public void mostrar() {
        System.out.println("Lista atual de itens: " + elementos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TDA listaSupermercado = new TDA();

        System.out.println("Vamos adicionar 5 itens de supermercado na sua lista:");


        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o item " + i + ": ");
            String item = scanner.nextLine();
            listaSupermercado.adicionar(item);
        }

        listaSupermercado.mostrar();


        System.out.print("Você quer remover algum item da lista? (sim/não): ");
        String resposta = scanner.nextLine();

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.print("Digite o item que deseja remover: ");
            String removerItem = scanner.nextLine();
            listaSupermercado.remover(removerItem);
            listaSupermercado.mostrar();

            System.out.print("Deseja remover mais algum item? (sim/não): ");
            resposta = scanner.nextLine();
        }

        System.out.println("Lista final:");
        listaSupermercado.mostrar();

        scanner.close();
    }
}