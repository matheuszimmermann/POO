
- Crie uma classe chamada "Pessoa" com os seguintes atributos privados: "nome" (do tipo String), "idade" (do tipo int) e "altura" (do tipo double). Em seguida, implemente métodos públicos para acessar e modificar esses atributos, respeitando o princípio de encapsulamento.


- Crie uma classe para testar o funcionamento da classe "Pessoa".

Aluno: Matheus Zimmermann

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

TESTAR

public class TestarPessoa { 
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); //instânciando a classe pessoa
        
        pessoa.setNome("Matheus"); //modifica o atributo "nome" da pessoa
        pessoa.setIdade(17); //modifica o atributo "idade" da pessoa
        pessoa.setAltura(1.80); //modifica o atributo "altura" da pessoa
        
        
        System.out.println("Nome: " + pessoa.getNome()); //imprime o nome
        System.out.println("Idade: " + pessoa.getIdade()); //imprime a idade
        System.out.println("Altura: " + pessoa.getAltura()); //imprime a altura
    }
}
