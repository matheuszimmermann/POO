public class Moto extends Veiculo {

    //atributo
    private int numCilindradas;
    
    // metodo construtor da moto
    public Moto(String marca, String modelo, int ano, int numCilindradas) {
        super(marca, modelo, ano); 
        this.numCilindradas = numCilindradas;
    }
    
     // metodo do numero de cilindradads
    public int getCilindradas() {
        return numCilindradas;
    }
    
    // metodo para definicao da cilinddrada
    public void setCilindradas(int numCilindradas) {
        this.numCilindradas = numCilindradas;
    }

    // adiciona o atributo numCilindradas no metodo de exibir
    public void exibirDetalhes() {
        super.exibirDetalhes(); 
        System.out.println("A moto tem " + numCilindradas + " Cilindradas");
    }
    
} 