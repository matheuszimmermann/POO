public class Pessoa {

    // Atributos de nome, idade e altura privados
    private String nome; //armazena o nome da pessoa declarada na classe teste
    private int idade; //armazena a idade da pessoa declarada na classe teste
    private double altura; //armazena a altura da pessoa declarada na classe teste
    
    //Metodo para retornar e acessar o nome
    public String getNome() {
        return nome;
    }
    
    //metodo para modificar o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //etodo para acessar o atributo idade
    public int getIdade() {
        return idade;
    }
    
    //metodo para modificar a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //metodo para acessar a altura
    public double getAltura() {
        return altura;
    }
    
    //metodo para modificar a altura
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
