import java.util.Scanner;

public class EnderecoCaso1 {
    public static void main(String[] args) {
        

        System.out.print("Digite o endereço: ");

        Scanner scanner = new Scanner(System.in);
        String endereco = scanner.nextLine();

        System.out.println("Endereço digitado: " + endereco + ".");
        
        String[] partes = endereco.split(" ");

        String nomeRua = partes[0];
        String numero = partes[1];

        System.out.println("Saída: " + "{" + "\"" + nomeRua + "\", \"" + numero + "\"}");

        scanner.close();

    }
}
