import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;
import java.util.Queue;
import java.util.LinkedList;




public class ExercicioMenu {
    public static void main(String[] args) {
        int add;
        int escolha;

        Queue<Integer> q = new LinkedList();

        do{escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções a seguir \n 1 - Adicionar \n 2 - Remover \n 3 - Tamanho da Lista \n 4 - Imprimir a Lista \n 5 - Sair"));
        switch (escolha) {
            case 1:
                // add
                add = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
                q.add(add);
                break;
            case 2:
                // remove
                // itemRemove =  q.remove();
                JOptionPane.showMessageDialog(null,"Numero removido: " + q.remove());
                break;
            case 3:
                // size
                // sizeList = q.size();
                JOptionPane.showMessageDialog(null,"Tamanho da lista: " + q.size() );
                break;
            case 4:
                // imprimir
                JOptionPane.showMessageDialog(null,"O primeiro número da lista é: " +  q.peek() );
                break;
        }
    }while(escolha != 5);
    }
}