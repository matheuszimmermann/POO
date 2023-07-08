public class Atv09 {

    public static void main(String[] args) {

        // Declaracao do vetor 1
        int[] vetor1 = {123, 32, 1, 5, 7, 4, 86, 1, 3, 10};
        
        // Declaracao do vetor 2
        int[] vetor2 = {32, 23, 12, 54, 2, 3, 1, 2, 3, 0};

        // Chamando o método somaDosNumeros e passando os dois vetores como parâmetros
        somaDosNumeros(vetor1, vetor2);

        // Chamando o método imprimirNumeros para imprimir o vetor original
        imprimirNumeros(vetor1);
    }

    // Método que realiza a soma dos elementos de dois vetores
    public static void somaDosNumeros(int[] array, int[] array2) {
        // Vetor para armazenar a soma dos elementos
        int[] arraySoma = new int[array.length];

        // Realiza a soma dos elementos de mesmo índice dos dois vetores e armazena no vetor arraySoma
        for (int i = 0; i < array.length; i++) {
            arraySoma[i] = array[i] + array2[i];
        }

        System.out.println(""); //print para organizar as informacoes
        
        // Chama o método imprimirNumeros para imprimir o vetor arraySoma
        imprimirNumeros(arraySoma);
    }

    // Método para imprimir os elementos de um vetor
    public static void imprimirNumeros(int[] array) {
        System.out.println("Saida do Vetor:");  // Percorre o vetor e imprime cada elemento
        
        for (int i = 0; i < array.length; i++) { //for para percorrer o vetor 
            System.out.print(array[i] + "\t"); //imprime cada elemento na tela.
        }
        
    }
}