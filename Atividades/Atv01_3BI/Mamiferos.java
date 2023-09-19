public class Mamiferos{

    //atributos
    private String nome; 
    private int idade; 

    //metodo construtor 
    public Mamiferos(String nome, int idadee){
        this.nome = nome;
        this.idade = idadee;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idadee){
        this.idade = idadee;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void emitirSom(){
        System.out.println("Emitindo som");
    }

    public void mover(){
        System.out.println("Mamifero esta se movendo");
    }

    
}