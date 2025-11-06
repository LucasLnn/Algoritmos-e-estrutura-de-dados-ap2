public class Lista {
    private final int[] elementos;
    private int tamanho;

    public Lista() { // nome do construtor corrigido
        elementos = new int[5];
        tamanho = 0;
    }

    public void inserir(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Lista cheia!");
        }
    }

    public void mostrar() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lista lista = new Lista(); // nome da classe corrigido aqui também
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        lista.mostrar();
    }
}
