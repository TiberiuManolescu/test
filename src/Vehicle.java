public class Vehicle {

    String culoare = "";
    String marca = "";
    int nrRoti = 0;
    int anFabricatie = 0;
    boolean hasOwner = false;

    public Vehicle(String color, String marca, int roti, int fabricatie, boolean proprietar) {
        this.culoare = color;
        this.marca = marca;
        this.nrRoti = roti;
        this.anFabricatie = fabricatie;
        this.hasOwner = proprietar;

    }

}