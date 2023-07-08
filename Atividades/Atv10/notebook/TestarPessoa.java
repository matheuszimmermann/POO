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
