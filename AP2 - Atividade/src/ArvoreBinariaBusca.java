public class ArvoreBinariaBusca {
    No raiz;


    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }
        if (valor < atual.valor) {
            atual.esquerda = inserirRec(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRec(atual.direita, valor);
        }
        return atual;
    }


    public void emOrdem(No atual) {
        if (atual != null) {
            emOrdem(atual.esquerda);
            System.out.print(atual.valor + " ");
            emOrdem(atual.direita);
        }
    }


    public void mostrarFolhas(No atual) {
        if (atual != null) {
            if (atual.esquerda == null && atual.direita == null) {
                System.out.print(atual.valor + " ");
            }
            mostrarFolhas(atual.esquerda);
            mostrarFolhas(atual.direita);
        }
    }


    public int altura(No atual) {
        if (atual == null) return 0;
        int altEsq = altura(atual.esquerda);
        int altDir = altura(atual.direita);
        return Math.max(altEsq, altDir) + 1;
    }
}
