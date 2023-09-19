public class Aves {
    String nome;
    int idade;

    // metodo construtor
    public Aves(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public int getIdade(){
        return idade;
    }


    public String getNome(){
        return nome;
    }

    public void voar() {
        System.out.println("Ave voando");
    }
}
