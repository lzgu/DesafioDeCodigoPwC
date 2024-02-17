 import java.util.Scanner;

public class funcionando2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String entrada = "";
        
        // Mantém o programa rodando enquanto o usuário quiser
        while (!entrada.equals("encerrar")) {
            System.out.print("Digite o endereço: ");
            entrada = scanner.nextLine().trim(); // Remove espaços em branco no início e no fim
            if (!entrada.isEmpty() && !entrada.equals("encerrar")) {
                String enderecoFinal = tratarEndereco(entrada);
                System.out.println(enderecoFinal);
            }
        }

        scanner.close();
    }

    public static String tratarEndereco(String entrada) {
        String numero = "";
        String nome = "";

        // Verifica se a entrada começa com um dígito
        if (Character.isDigit(entrada.charAt(0))) {
            int cont = 0;
            while (cont < entrada.length() && Character.isDigit(entrada.charAt(cont))) {
                numero += entrada.charAt(cont);
                cont++;
            }
            nome = entrada.substring(cont).trim(); // Pega o restante da entrada como nome
        } else if (entrada.contains(" No ")) {
            int inicioNum = entrada.indexOf("No");
            nome = entrada.substring(0, inicioNum).trim();
            numero = entrada.substring(inicioNum).trim();
        } else if (entrada.contains(",")) {
            String[] partes = entrada.split(",", 2);
            nome = partes[0].trim();
            if (partes.length > 1) {
                numero = partes[1].trim();
            } else {
                nome = entrada.trim();
            }
        } else {
            String[] partes = entrada.split(" ", 2);
            nome = partes[0].trim();
            if (partes.length > 1) {
                numero = partes[1].trim();
            } else {
                nome = entrada.trim();
            }
        }

        return "Saída: {" + "\"" + nome + "\", \"" + numero + "\"}";
    }

} 

