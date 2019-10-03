import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            arvore.insert(
                new Node(i)
            );
        }
        
        if (arvore.isBalanced(arvore.raiz)) {
            System.out.println("Árvore está balanceada!"); 
        } else {
            System.out.println("Árvore NÃO está balanceada!");
        }

        JFrame frame = new JFrame("Visualizador de ABB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        ArvoreBinariaBuscaView view = new ArvoreBinariaBuscaView(arvore);
        frame.add(view);

        frame.setVisible(true);
    }
}
