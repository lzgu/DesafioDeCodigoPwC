import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         try{ //try catch para verificação da entrada
            
            String entrada = JOptionPane.showInputDialog(null, "Digite o endereço: ", "Validação de endereços", JOptionPane.QUESTION_MESSAGE);

            while (entrada != null ) {
            	
            	Endereco endereco = new Endereco(entrada, "","");
                endereco.tratarEndereco(entrada);
                JOptionPane.showMessageDialog(null, endereco.tratarEndereco(entrada));
                entrada = JOptionPane.showInputDialog(null, "Digite o endereço: ", "Validação de endereços", JOptionPane.QUESTION_MESSAGE);
            
            }JOptionPane.showMessageDialog(null, "Programa encerrado.", "AVISO", JOptionPane.WARNING_MESSAGE);

        }catch(RuntimeException excecao){
            JOptionPane.showMessageDialog(null, excecao.getMessage(), "AVISO", JOptionPane.WARNING_MESSAGE);
        }

        scanner.close();
    }
}
