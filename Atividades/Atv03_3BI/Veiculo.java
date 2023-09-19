public class Veiculo {

    //atributos
    private String marca;
    private String modelo;
    private int ano;
    
    // construtor da classe veiculo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    // metodo da marca
    public String getMarca() {
        return marca;
    }
    
    // metodo para definicao da marca do veículo
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
     // metodo da modelo
    public String getModelo() {
        return modelo;
    }
    
    // metodo para definicao do modelo do veículo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // metodo da ano do veiculo
    public int getAno() {
        return ano;
    }
    
     // metodo para definicao do ano do veículo
    public void setAno(int ano) {
        this.ano = ano;
    }

    //imprimir as informacoes com os atributos
    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}