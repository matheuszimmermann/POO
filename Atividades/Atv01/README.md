Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.


/*
 * IFPR - Campus Cascavel
 * Curso: Técnico em informática
 * Disciplina: Programação orientada à objetos
 * Professor: Nelson Bellincanta 
 * Aluno: Matheus Eduardo Zimmermann  */


import java.util.Scanner; 
Scanner leitor = new Scanner(System.in); 
        
System.out.println("Digite um numero inteiro"); //printl usado para informar o valor 1
int Num1 = leitor.nextInt(); //variavel para o numero digitado
System.out.println("Digite outro numero inteiro"); //printl usado para informar o valor 2
int Num2 = leitor.nextInt(); //variavel para o segundo numero digitado
 


int resultado = Num1 + Num2; //
        
/* Imprime o reusltado da soma dos numeros digitados 
System.out.println("A soma dos numeros informados é : " + resultado);
