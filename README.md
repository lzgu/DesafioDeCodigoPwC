![logo projeot](https://github.com/lzgu/DesafioDeCodigoPwC/assets/157890445/f7f5574e-e621-46be-91fd-c6972d95d3bd)
<h1 align = center>
    <img src="logo projeot.png"/>
    <p align = center>Desafio de código PwC - Validação de endereços <p>
</h1>

# Sobre o projeto

    O objetivo deste programa é receber do usuário uma única String contendo o nome de uma rua ou avenida e seu número, e separá-los em duas Strings individuais, uma para o nome, outra para o número.

# Execução do projeto
    
    Minha abordagem para este desafio foi tomar cada caso descrito no pdf como um problema individual, dessa forma, inicialmente fiz três programas diferentes que solucionassem individualmente os problemas propostos em cada caso, após isso, juntei os códigos em um para resolver todos os casos através de um único programa. Dessa forma, em um primeiro momento, tive 3 programas diferentes, cada um para resolver um dos casos descritos no pdf recebido com as instruções, após, um único programa, que resolvia todas as hipóteses e interagia com o usuário apenas por texto, via terminal, e ao final de tudo, tenho um programa com duas classes: "Principal" e "Endereco", onde foi aplicado encapsulamento e as interações do usuário passaram a ser feitas através de janelas da classe JOptionPane.

# Funcionamento do código

    A classe Endereco, antes de qualquer coisa, verifica se a String recebida é valida, isto é, se ela não está vazia ou possui algum caractere especial, através de um "ifElse" que só deixa os atributos da classe Endereco receberem os parâmetros caso a entrada seja válida. A classe também possui o método "tratarEndereco" que tem a capacidade de reconhecer qual tipo de String (no contexto desse desafio) o usuário digitou, por exemplo, se ela possui uma rua com nome composto, se o número está separado do nome por uma vírgula, espaço ou pela abreviação "No", etc.

# Executando os testes

    Exemplo do programa em funcionamento, com os casos de teste do pdf:

<h1 align = center>
    <img src="executando.gif"/>
</h1>
    


# Construído com

    Visual Studio Code - desenvolvimento do programa (Version: 1.86.2 (user setup))
    Eclipse IDE - fazer os commits do projeto (Version: 2023-06 (4.28.0) Build id: 20230608-1333)

# Autor

   * **Linkedin** - www.linkedin.com/in/luizgustavoreis2003



