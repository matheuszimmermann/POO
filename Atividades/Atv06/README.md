Dados os valores de um depósito fixo mensal e um montante desejado, crie uma classe para determinar quantos meses serão necessários para acumular o montante desejado, considerando juros mensais de 0,5%

Aluno: Matheus Zimmermann


import java.util.Scanner;

public class Atv06 { // Início da classe JurosMensais 
    
    // inicia o programa 
	public static void main(String[] args) {
        
		Scanner LER = new Scanner(System.in); //prepara a entrada de dados com o Scanner LER
		
		System.out.print("Informe o valor dos depositos: "); //Printa na tela o que deve ser digitado
		double valorDeposito = LER.nextDouble(); //atribui o valor informado a variavel
		
		System.out.print("Informe o valor do montante desejado: "); //Printa na tela o que deve ser digitado
		double montanteDesejado = LER.nextDouble(); //atribui o valor informado a variavel 

        System.out.println("-----------------------------------------"); //Print adicionado para ter uma melhor visualizacao das informacoes
		
        // inicialização das variaveis
		double saldo = 0; 
		
		int mes = 0; 


        //while para fazer os calculos e comparacoes de valores
		while (saldo < montanteDesejado){ 
		    mes++; 
            
		    saldo += valorDeposito + (saldo * 0.05); //5% de juros mensais 
		    
		    
            //imprime a quantidade de meses e o saldo
		    System.out.println("Mês:" + mes);
            System.out.println("Saldo = " + saldo);
		}
		
		
		//imprime as informacoes dos meses que serao necessarios
		System.out.println("São necessarios " + mes + " meses para alcançar o montante de: " + montanteDesejado);
	}
} 

