package vehiculos;

import java.util.List;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private static List<Pais>listaPaises = new ArrayList<>();

    public Pais(String nombre){
        this.nombre = nombre;
        listaPaises.add(this);
    }

    public static

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
