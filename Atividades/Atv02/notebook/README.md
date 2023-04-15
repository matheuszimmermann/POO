Crie uma classe em Java que realize cada uma das seguintes tarefas:

a) Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha;
b) Atribuir o produto de variáveis b e c para a variável a;
c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.

a) Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha;
System.out.print("Digite um numero inteiro"); // mostrar na tela o que foi solicitado deixando o cursor na mesma linha com o "print"



b) Atribuir o produto de variáveis b e c para a variável a;
import java.util.Scanner; 

//declaracao das variaveis
int a = 0;
int b = 5;
int c = 10;
           
a = b * c; // Atribui o produto de b e c para a variável a

System.out.print("O produto é: " + a); // Imprime o valor da variável a


c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.
import java.util.Scanner; 

Scanner leitor = new Scanner(System.in);
int b = leitor.nextInt(); 
        
double c = 2; //produto de c


//declaraçao da variavel do salario
double a = b * c; //cálculo da folha de pagamento.
// Exibe o valor do produto da variavel
System.out.println("O produto é: " + a );
