Usando a classe JOptionPane para entrada de dados, crie uma classe que receba a nota de duas provas e de um trabalho. Calcule e mostre a média.


Usando a classe JOptionPane para entrada de dados, receba a nota de duas provas e de um trabalho.

import javax.swing.JOptionPane; // importacao do JOptionPlane

//variaveis
String aux;
float prova1;
float prova2;
float trabalho;

//entrada dos dados 
aux = JOptionPane.showInputDialog("Informe a nota da prova 1:");// print na tela 
prova1 = Float.parseFloat(aux); //converte o valor armazenado na variável e atribui o valor na variavel prova1

//entrada dos dados 
aux = JOptionPane.showInputDialog("Informe a nota da prova 2:");
prova2 = Float.parseFloat(aux);

//entrada dos dados 
aux = JOptionPane.showInputDialog("Informe a nota do Trabalho:");
trabalho = Float.parseFloat(aux);


Calcule a média

media = (nota1 + nota2 + nota3) / 3; //resultado do calculo guardado na variavel media


Mostre a média usando o showMessageDialog da classe JOptionPane

media = (nota1 + nota2 + nota3) / 3; //resultado do calculo guardado na variavel media

JOptionPane.showMessageDialog(null, "A media é: " + media); //imprime na tela o resultado

