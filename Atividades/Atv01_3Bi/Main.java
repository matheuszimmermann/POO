public class Main {
    public static void main(String[] args) {

        // teste dos metodo cachorro
        Cachorros cachorro = new Cachorros("Pastor Alemao", "Bob", 6);
        cachorro.emitirSom();
        cachorro.mover();
        System.out.println(cachorro.getRaca());
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getIdade());
        cachorro.abanarRabo();

        // teste dos metodos passaros
        Passaros passaro = new Passaros("Calopsita", 1, "Branco");
        passaro.emitirSom();
        System.out.println(passaro.getIdade());
        System.out.println(passaro.getNome());
        passaro.voar();
        System.out.println(passaro.getCor());
        passaro.construirNinho();
    }
}
