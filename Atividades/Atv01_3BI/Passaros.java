class Passaros extends Aves {
    String cor; //atributo

    // metodo construtor
    public Passaros(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    // Método adicional construirNinho()
    public void construirNinho() {
        System.out.println("O passaro esta construindo o nino");
    }

}