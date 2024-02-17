import java.util.Scanner;

public class EnderecoCaso31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o endereço: ");
        String entrada = scanner.nextLine();
        while(entrada!= "0"){
        String numero = "";
        String nome = "";
        int fimNumero = 0;
        int inicioNum = 0;

        //se a palavra começar com numero, procurar index de virgula ou espaço [VALIDO PARA NUMEROS NO COMEÇO]
        if(Character.isDigit(entrada.charAt(0))){
            if(entrada.contains(",")){
                fimNumero = entrada.indexOf(',');
            }else{
                fimNumero = entrada.indexOf(" ");
            }
            numero = entrada.substring(0,fimNumero);
            nome = entrada.substring(fimNumero+1, entrada.length());
        }
        else if(entrada.contains(" No ")){  //se a palavra começar com palavra, procurar index de virgula ou "No" [VALIDO PARA LETRAS NO COMEÇO]
            inicioNum = entrada.indexOf("No");
            nome = entrada.substring(0, inicioNum);
            numero = entrada.substring(inicioNum);
        }else{
            String[] partes = entrada.split(",",2);
            nome = partes[0];
            numero = partes [1];
        }
    
       System.out.println("Saída: " + "{" + "\"" + nome.trim() + "\", \"" + numero.trim() + "\"}");
       System.out.print("Digite o endereço: ");
       entrada = scanner.nextLine();

    

    }
    }
}