package estruturas;

public class Fila {

    private int[] elementos;
    private int tamanho;
    private final int capacidade = 5;

    public Fila() {
        elementos = new int[capacidade];
        tamanho = 0;
    }

    public void enfileirar(int valor) {
        if (tamanho == capacidade) {
            System.out.println("Fila cheia! Não é possível enfileirar " + valor);
            return;
        }
        elementos[tamanho] = valor;
        tamanho++;
        System.out.println(valor + " enfileirado.");
    }

    public int desenfileirar() {
        if (tamanho == 0) {
            System.out.println("Fila vazia! Nada para desenfileirar.");
            return -1;
        }
        int removido = elementos[0];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        System.out.println(removido + " desenfileirado.");
        return removido;
    }

    public void mostrarFila() {
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    // 👇 Adicione este método para poder rodar diretamente
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.enfileirar(40);
        fila.enfileirar(50);
        fila.mostrarFila();

        fila.desenfileirar();
        fila.mostrarFila();

        fila.enfileirar(60);
        fila.mostrarFila();
    }
}