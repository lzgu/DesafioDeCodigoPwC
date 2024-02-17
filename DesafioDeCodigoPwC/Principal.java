import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         try{ //try catch para verificação da entrada
            
            
            System.out.print("Digite o endereço: ");
            String entrada = scanner.nextLine();
            

            while (!entrada.equals("encerrar")) {
            	
            	Endereco endereco = new Endereco(entrada, "","");
                endereco.tratarEndereco(entrada);
                System.out.println("\n" + endereco.tratarEndereco(entrada));
                System.out.print("\nDigite o endereço: ");
                entrada = scanner.nextLine();
            
            }System.out.print("\nPrograma encerrado.");

        }catch(RuntimeException excecao){
            System.out.println(excecao.getMessage());
        }

        scanner.close();
    }
}