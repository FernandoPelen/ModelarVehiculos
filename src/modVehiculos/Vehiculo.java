
package modVehiculos;


public abstract class Vehiculo implements conducible {
    private String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}


    class Carro extends Vehiculo {
    public int numPasajeros;

    public Carro(String nombre, int numPasajeros) {
        super(nombre);
        this.numPasajeros = numPasajeros;
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("El automóvil " + getNombre() + " está acelerando a " + velocidad + " km/h. y tiene capaciudad para " + this.numPasajeros + " pasajeros");
    }

    @Override
    public void frenar() {
        System.out.println("El automóvil " + getNombre() + " está frenando.");
    }
}

class Bicicleta extends Vehiculo {
    public Bicicleta(String nombre) {
        super(nombre);
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("La bicicleta " + getNombre() + " está acelerando a " + velocidad + " km/h.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta " + getNombre() + " está frenando.");
    }
}
    
