Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, armazene essas notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente (da maior para a menor) e a média aritmética das notas.


Aluno: Matheus Zimmermann
Professor: Nelson Bellincanta
Turma: 3 INFORMATICA

import javax.swing.JOptionPane;

public class Atv07 { 

    public static void main(String[] args) {

        // Declaração de variáveis
        float soma = 0;
        String aux;
        int notas[] = new int[5];
        String notasOrdenadas = "";

        for (int i = 0; i < 5; i++) {
            aux = JOptionPane.showInputDialog("Insira a nota da " + (i + 1) + " prova:"); // Solicita ao usuário inserir a nota da prova atual
            notas[i] = Integer.parseInt(aux); // Converte a nota para um número inteiro e a armazena no array "notas"
            soma += notas[i]; // Calcula a soma total das notas
        }

        // Ordenando as notas em ordem decrescente usando o algoritmo de ordenação por seleção
        for (int i = 0; i < notas.length - 1; i++) {
            int maiorIndice = i; // Índice do elemento não ordenado atualmente como o maior
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[j] > notas[maiorIndice]) { // Compara se o elemento atual é maior que o maior elemento encontrado até agora
                    maiorIndice = j; // Atualiza o índice do maior elemento
                }
            }
            // Troca de posição o elemento atual com o maior elemento encontrado
            int temp = notas[maiorIndice];
            notas[maiorIndice] = notas[i];
            notas[i] = temp;
        }

        for (int num : notas) {
            notasOrdenadas += num + "; "; // Constrói a representação das notas em ordem decrescente
        }

        String mensagem = "Notas em ordem decrescente: " + notasOrdenadas + "\nMédia das notas: " + soma / 5;
        JOptionPane.showMessageDialog(null, mensagem); // Exibe as notas em ordem decrescente e a média das notas em uma única caixa de diálogo
    }
}
