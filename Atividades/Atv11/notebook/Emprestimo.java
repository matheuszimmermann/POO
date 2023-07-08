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
