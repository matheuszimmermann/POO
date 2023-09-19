public class TesteVeiculos {
    public static void main(String[] args) {

        // adiciona as informacoes dos carros passando para o metoodo exibir
        Carro carro1 = new Carro("Porsche", "911 gt3", 2021, 2);
        System.out.println(carro1);
        
        // passa as informacoes acima para o metodo exibir
        carro1.exibirDetalhes();
        System.out.println("-----------------------------------------"); 


        // adiciona as informacoes dos carros passando para o metoodo exibir
        Carro carro2 = new Carro("Range Rover", "Velar", 2022, 4);
        
        // passa as informacoes acima para o metodo exibir
        carro2.exibirDetalhes();
        System.out.println("-----------------------------------------"); 


        // adiciona as informacoes das motos passando para o metoodo exibir
        Moto moto1 = new Moto("Kawasaki ", "Z1000", 2021, 1080);
        
        // passa as informacoes acima para o metodo exibir
        moto1.exibirDetalhes();
        System.out.println("-----------------------------------------"); 

       
        // adiciona as informacoes das motos passando para o metoodo exibir
        Moto moto2 = new Moto("Yamaha", "XJ6", 2021, 600);
        
        // passa as informacoes acima para o metodo exibir
        moto2.exibirDetalhes();
        System.out.println("-----------------------------------------"); 
        
    }
}
