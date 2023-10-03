package vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static List<Fabricante>fabricantes = new ArrayList<>();
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
        Fabricante fabricaTop = null;
        int a = 0;

        for (int i=0; i<Fabricante.fabricantes.size()-1; i++){
            int e = Fabricante.fabricantes.get(i).cantidadVehiculos;

            if (e > a){
                a = e;
                fabricaTop = Fabricante.fabricantes.get(i);
            }
        }
        return fabricaTop;
    }




}
