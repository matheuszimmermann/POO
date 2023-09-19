public class Carro extends Veiculo {

    private int numPortas; //atributo
    
    // metodo construtor do carro
    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano); 
        this.numPortas = numPortas;
    }
    
    // metodo do numero de portas
    public int getNumeroDePortas() {
        return numPortas;
    }
    
    // metodo para definicao das portas do veículo
    public void setNumeroDePortas(int numPortas) {
        this.numPortas = numPortas;
    }

    // adiciona o atributo numPortas no metodo de exibir
    public void exibirDetalhes() {
        super.exibirDetalhes(); 
        System.out.println("Número de Portas: " + numPortas);
    }
    
} 