import java.util.Scanner;

public class EnderecoCaso2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o endereço: ");
        String entrada = scanner.nextLine();
        System.out.println("Endereço digitado: " + entrada + ".");

        int posicaoNumero = 0;
        for (int indice = 0; indice < entrada.length(); indice++) {
            if (Character.isDigit(entrada.charAt(indice))) {
                posicaoNumero = indice;
                break;
            }
        }   

        String nomeRua = entrada.substring(0, posicaoNumero).trim();
        String numero = entrada.substring(posicaoNumero).trim();

        System.out.println("Saída: " + "{" + "\"" + nomeRua + "\", \"" + numero + "\"}");

        scanner.close();
    }
}