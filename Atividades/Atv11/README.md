Você foi contratado para desenvolver um programa que gerencie empréstimos financeiros. Sua tarefa é implementar a classe Emprestimo em Java, que representa cada empréstimo realizado. Cada objeto da classe Emprestimo será responsável por calcular e armazenar as parcelas correspondentes ao empréstimo.

A classe Emprestimo deve ser construída com os seguintes atributos: valorTotal (representando o valor total do empréstimo), taxaJuros (indicando o percentual de juros mensal) e numeroParcelas (representando a quantidade de parcelas do empréstimo).

Além disso, a classe deve possuir um método chamado proximaParcela(), que não recebe parâmetros e retorna o valor da próxima parcela a ser paga. Cada vez que esse método é invocado, ele deve retornar o valor correspondente à próxima parcela. Caso não haja mais parcelas a serem pagas, o método deve retornar -1.

Seu programa deve criar dois objetos Emprestimo, chamados E1 e E2, com valores diferentes para valorTotal, taxaJuros e numeroParcelas. Após a criação dos objetos, seu programa deve exibir as parcelas dos empréstimos em paralelo, ou seja, a primeira parcela de E1 deve ser exibida junto com a primeira parcela de E2, a segunda parcela de E1 com a segunda parcela de E2 e assim por diante. O programa deve continuar exibindo as parcelas enquanto houver parcelas restantes em pelo menos um dos empréstimos.

Você deve implementar a solução em Java, criando a classe Emprestimo com o construtor e o método descritos, além de utilizar um loop e as chamadas adequadas para exibir as parcelas dos empréstimos em paralelo.

Aluno: Matheus Zimmermann


public class Emprestimo { 
    
    // Atributos privados: valorTotal, taxaJuros e numeroParcelas
    public double valorTotal;
    public double taxaJuros;
    public int numeroParcelas;
    public int parcelaAtual;
    
    // Construtor da classe Emprestimo
    public Emprestimo(double valorTotal, double taxaJuros, int numeroParcelas) {
        this.valorTotal = valorTotal;
        this.taxaJuros = taxaJuros;
        this.numeroParcelas = numeroParcelas;
        this.parcelaAtual = 1;
    }
    
    // Método para obter o valor da próxima parcela
    public double proximaParcela() {
        if (parcelaAtual <= numeroParcelas) {
            double valorParcela = valorTotal / numeroParcelas;
            double jurosParcela = valorParcela * taxaJuros / 100;
            double valorTotalParcela = valorParcela + jurosParcela;
            parcelaAtual++;
            return valorTotalParcela;
        } else {
            return -1;
        }
    }

   //metodo de acesso ao atributo valorTotal
public double getValorTotal() {
    return valorTotal;
}

//metodo de modificação do atributo valorTotal
public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
}

//metodo de acesso ao atributo taxaJuros
public double getTaxaJuros() {
    return taxaJuros;
}

//metodo de modificação do atributo taxaJuros
public void setTaxaJuros(double taxaJuros) {
    this.taxaJuros = taxaJuros;
}

//metodo de acesso ao atributo numeroParcelas
public int getNumeroParcelas() {
    return numeroParcelas;
}

//metodo de modificação do atributo numeroParcelas
public void setNumeroParcelas(int numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
}

}
FIM 
---------------------------------------------------------------------------------------------



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


