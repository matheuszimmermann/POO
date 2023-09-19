public class Cachorros extends Mamiferos{
    private String raca; 

    public Cachorros(String racaCachorro, String nome, int idade){
        super(nome, idade);
        this.raca = racaCachorro;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String racaCachorro){
        this.raca = racaCachorro;
    }

    public void abanarRabo(){
        System.out.println("Cachorro abanando rabo");
    }
}