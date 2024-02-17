public class Endereco{

    //atributos da classe
    private String entrada;
    private String nome;
    private String numero;

    //construtor c/ parametros
    public Endereco(String entrada, String nome, String numero){
		//verifica se a entrada contém caracteres especiais ou está vazia
        if(entrada.isEmpty() || entrada.contains("!")||entrada.contains("@")||entrada.contains("#")||entrada.contains("$")||entrada.contains("%")||entrada.contains("¨")||entrada.contains("&")||entrada.contains("*")||entrada.contains("(")||entrada.contains(")")||entrada.contains("-")||entrada.contains("=")||entrada.contains("_")||entrada.contains("+")){
            throw new RuntimeException("Entrada inválida. Programa encerrado.");
        }
        this.entrada = entrada;
        this.nome = nome;
		this.numero = numero;
	}
    
    //método para identificar qual o caso da String inserida e tratá-la de acordo
    public String tratarEndereco(String entrada) {

        String numero = "";
        String nome = "";
        int cont = 0;
        
        //verifica se a String inserida possui palavra composta
        boolean composta = false;
        int primeiroEspaco = entrada.indexOf(' ');
        int segundoEspaco = entrada.indexOf(' ', primeiroEspaco + 1); // Procura pelo próximo espaço após o primeiro encontrado
        if(segundoEspaco!=-1){
            composta = true;
        }

        if (entrada.toLowerCase().contains(" no ")) { //--------------------Verifica se a entrada contém "No" independente se maiúscula ou minúscula
            
            int inicioNum = entrada.toLowerCase().indexOf(" no ");//---------------Marca o "No" como início do número do endereço
            nome = entrada.substring(0, inicioNum).trim();//preenche a string nome
            numero = entrada.substring(inicioNum).trim();//preenche a string numero

        }else if (Character.isDigit(entrada.charAt(0))) {//se o primeiro caractere for um número, armazena ele e os seguintes (se existirem), enquanto o indice atual for numero
            
            while(Character.isDigit(entrada.charAt(cont))){ 
                numero += entrada.charAt(cont);
                cont++;                                        
            }
            nome = entrada.substring(numero.length()+1).trim();//cria uma substring do caractere após a vírgula até o fim da entrada e retira espaços em branco sobrando.

        }else if(composta){ //tratamento para Strings com mais de uma palavra concatenadas
            
            if(entrada.contains(",")){//tratamento diferente para os endereços que são compostos E contêm vírgula
                String[] partes = entrada.split(",",2);
                nome = partes[0].trim();
                if (partes.length > 1) {
                    numero = partes[1].trim();
                }else {
                    nome = entrada.trim();
                }

            }else{ //caso não haja vírgula, identifica onde está o primeiro dígito do número na String
                
                int posicaoNumero = 0;
                for (int indice = 0; indice < entrada.length(); indice++) {
                    if (Character.isDigit(entrada.charAt(indice))) {
                    posicaoNumero = indice; 
                    break;
                    }
                }
                
                nome = entrada.substring(0, posicaoNumero).trim();
                numero = entrada.substring(posicaoNumero).trim();

            }
        }
        else if (Character.isDigit(entrada.charAt(0))) {//-------se o primeiro caractere for um número, armazena ele e os seguintes (se houver)
            
            while(Character.isDigit(entrada.charAt(cont))){     //em uma váriavel até encontrar uma vírgula.
                numero += entrada.charAt(cont);
                nome = entrada.substring(numero.length()+1).trim();//cria uma substring do caractere após a vírgula até o fim da entrada, 
                cont++;                                            //e retira espaços em branco sobrando.
            }

        } else {//-----------------------------------------------------Se a string não é composta, não inicia em número e não contém "No", a separa no primeiro espaço em branco
            
            String[] partes = entrada.split(" ", 2);
            nome = partes[0].trim();
            if (partes.length > 1) {
                numero = partes[1].trim();
            }else {
                nome = entrada.trim();
            }

        }

        return "Saída: {" + "\"" + nome + "\", \"" + numero + "\"}";
    }
    
    public void setNome(String nome){
        this.nome = nome ;
    }

    public String getNome(){
        return nome;
    }

    public void setNumero(String numero){
        this.numero = numero ;
    }

    public String getNumero(){
        return numero;
    }
}