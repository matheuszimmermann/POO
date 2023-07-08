public class ParcelaEmprestimos {
    public static void main(String[] args) {

        // instanciando E1 e E2 da classe Emprestimo
        Emprestimo E1 = new Emprestimo(1000.0, 0.1, 12);
        Emprestimo E2 = new Emprestimo(500000.0, 0.03, 360);

        // variaveis para receber o retorno
        double proxE1;
        double proxE2; 
        System.out.println("Valores das parcelas:"); // Mensagem de orientação

        //exibe as parcelas enquanto houver parcelas restantes 
        do {
            // Obtendo os valores das próximas parcelas de E1 e E2
            proxE1 = E1.proximaParcela();
            proxE2 = E2.proximaParcela();

            //imprimindo os valores das parcelas
            System.out.println("Parcela de E1: " + proxE1 + "\tParcela de E2: " + proxE2);

        } while (proxE1 > 0 && proxE2 > 0); //continua se houver parcelas restantes dos empréstimos

    } 
} 
