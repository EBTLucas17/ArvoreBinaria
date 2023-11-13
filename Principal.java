
package node;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Insere 20 números aleatórios de 0 a 100 na árvore
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = (int) (Math.random() * 101);
            arvore.inserir(numeroAleatorio);
        }

        System.out.println("Árvore Original:");
        arvore.imprimirEmNivel();
        System.out.println("\n\nImpressão Pré-Ordem:");
        arvore.imprimirPreOrdem(arvore.raiz);
        System.out.println("\n\nImpressão Em-Ordem:");
        arvore.imprimirEmOrdem(arvore.raiz);
        System.out.println("\n\nImpressão Pós-Ordem:");
        arvore.imprimirPosOrdem(arvore.raiz);

        // Retira 5 elementos da árvore
        for (int i = 0; i < 5; i++) {
            int numeroAleatorio = (int) (Math.random() * 101);
            arvore.raiz = arvore.inserirRec(arvore.raiz, numeroAleatorio); // Simula a remoção
        }

        System.out.println("\n\nÁrvore após a remoção de 5 elementos:");
        arvore.imprimirEmNivel();
        System.out.println("\n\nImpressão Pré-Ordem após a remoção:");
        arvore.imprimirPreOrdem(arvore.raiz);
        System.out.println("\n\nImpressão Em-Ordem após a remoção:");
        arvore.imprimirEmOrdem(arvore.raiz);
        System.out.println("\n\nImpressão Pós-Ordem após a remoção:");
        arvore.imprimirPosOrdem(arvore.raiz);
    }
}
