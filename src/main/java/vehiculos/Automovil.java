package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    private static int cifraAutomoviles;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        Automovil.cifraAutomoviles++;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public static int getCifraAutomoviles() {
        return cifraAutomoviles;
    }
}
