
package node;

import java.util.LinkedList;
import java.util.Queue;

public class ArvoreBinaria {
    Node raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    // Insere um número na árvore
    public void inserir(int dado) {
        raiz = inserirRec(raiz, dado);
    }

    Node inserirRec(Node raiz, int dado) {
        if (raiz == null) {
            raiz = new Node(dado);
            return raiz;
        }

        if (dado < raiz.dado) {
            raiz.esquerda = inserirRec(raiz.esquerda, dado);
        } else if (dado > raiz.dado) {
            raiz.direita = inserirRec(raiz.direita, dado);
        }

        return raiz;
    }

    // Impressão em pré-ordem
    public void imprimirPreOrdem(Node raiz) {
        if (raiz != null) {
            System.out.print(raiz.dado + " ");
            imprimirPreOrdem(raiz.esquerda);
            imprimirPreOrdem(raiz.direita);
        }
    }

    // Impressão em ordem
    public void imprimirEmOrdem(Node raiz) {
        if (raiz != null) {
            imprimirEmOrdem(raiz.esquerda);
            System.out.print(raiz.dado + " ");
            imprimirEmOrdem(raiz.direita);
        }
    }

    // Impressão em pós-ordem
    public void imprimirPosOrdem(Node raiz) {
        if (raiz != null) {
            imprimirPosOrdem(raiz.esquerda);
            imprimirPosOrdem(raiz.direita);
            System.out.print(raiz.dado + " ");
        }
    }

    // Impressão em nível
    public void imprimirEmNivel() {
        Queue<Node> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            Node noTemporario = fila.poll();
            System.out.print(noTemporario.dado + " ");

            if (noTemporario.esquerda != null) {
                fila.add(noTemporario.esquerda);
            }

            if (noTemporario.direita != null) {
                fila.add(noTemporario.direita);
            }
        }
    }
}
