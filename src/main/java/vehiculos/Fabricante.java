package vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static Fabricante top;
    private static List<Fabricante>fabricantes = new ArrayList<Fabricante>();
    private int cantidadVehiculos;

    public  Fabricante(String nombre, Pais pais){
        Fabricante.fabricantes.add(this);
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public static List<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public static void setFabricantes(List<Fabricante> fabricantes) {
        Fabricante.fabricantes = fabricantes;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
    }


    public static Fabricante fabricaMayorVentas() {
        for (int i=0; i<Fabricante.fabricantes.size()-1; i++){
            Fabricante top1 = Fabricante.fabricantes.get(0);
            Fabricante top2 = Fabricante.fabricantes.get(i+1);
            if (top1.getCantidadVehiculos()< top2.getCantidadVehiculos()){
                top = top2;
            }
            else{
                top = top1;
            }
        }
        return top;

    }




}
