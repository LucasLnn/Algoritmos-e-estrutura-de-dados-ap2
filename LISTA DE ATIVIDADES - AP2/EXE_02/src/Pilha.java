import java.util.ArrayList;

public class Pilha {

    private ArrayList<Integer> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public void empilhar(int valor) {
        elementos.add(valor);
        System.out.println("Empilhando: " + valor);
    }

    public int desempilhar() {
        if (elementos.isEmpty()) {
            System.out.println("A pilha está vazia!");
            return -1;
        }
        int valorRemovido = elementos.remove(elementos.size() - 1);
        System.out.println("Desempilhando: " + valorRemovido);
        return valorRemovido;
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);
        pilha.empilhar(50);
        pilha.empilhar(60);

        System.out.println("\n--- Desempilhando todos os valores ---");

        while (!pilha.estaVazia()) {
            pilha.desempilhar();
        }

        System.out.println("\nTentando desempilhar novamente:");
        pilha.desempilhar();
    }
}