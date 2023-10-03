package vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static List<Fabricante>fabricantes = new ArrayList<>();

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

    public String fabricaMayorVentas(){

    }
}
