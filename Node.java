
package node;
import java.util.LinkedList;
import java.util.Queue;
public class Node {
    int dado;
    Node esquerda, direita;

    public Node(int item) {
        dado = item;
        esquerda = direita = null;
    }
}
