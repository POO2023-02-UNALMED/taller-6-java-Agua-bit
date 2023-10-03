package vehiculos;

import java.util.List;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int cantidadVehiculos;
    private static List<Pais>listaPaises = new ArrayList<>();

    public Pais(String nombre){
        this.nombre = nombre;
        listaPaises.add(this);
    }

    public static Pais paisMasVendedor(){
        int a = 0;
        Pais paisTop = null;
        for (int i=0; i<Pais.listaPaises.size(); i++){
            int e = Pais.listaPaises.get(i).cantidadVehiculos;

            if (a<e){
                a = e;
                paisTop = Pais.listaPaises.get(i);
            }
        }
        return paisTop;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static List<Pais> getListaPaises() {
        return listaPaises;
    }
}
