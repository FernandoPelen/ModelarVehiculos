
package modVehiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Hyndai accent", 4);
        Carro carro2 = new Carro("Honda Fit", 5);
        Carro carro3 = new Carro("Kia Sorento", 7);
        Bicicleta bicicleta1 = new Bicicleta("de montaña");
        Bicicleta bicicleta2 = new Bicicleta("BMX");
        carro1.acelerar(60);
        carro1.frenar();
        
        carro2.acelerar(80);
        carro2.frenar();
        
        carro3.acelerar(120);
        carro3.frenar();
      
        bicicleta1.acelerar(30);
        bicicleta1.frenar();
        
        bicicleta2.acelerar(25);
        bicicleta2.frenar();
    }
}

