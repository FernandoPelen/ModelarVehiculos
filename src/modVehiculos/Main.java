
package modVehiculos;

public class Main {
    public static void main(String[] args) {
        Carro auto = new Carro("Sedán", 5);
        Bicicleta bicicleta = new Bicicleta("Montaña");

        auto.acelerar(60);
        auto.frenar();

        bicicleta.acelerar(30);
        bicicleta.frenar();
    }
}

