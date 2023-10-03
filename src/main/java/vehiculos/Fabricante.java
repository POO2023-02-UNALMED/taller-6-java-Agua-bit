package vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static List<Fabricante>fabricantes = new ArrayList<>();
    private int numeroVehi;

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
        int a;
        for (int a=0, a < fabricantes.size()-1, a++){

        }
    }

    public static List<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public static void setFabricantes(List<Fabricante> fabricantes) {
        Fabricante.fabricantes = fabricantes;
    }

    public int getNumeroVehi() {
        return numeroVehi;
    }

    public void setNumeroVehi(int numeroVehi) {
        this.numeroVehi = numeroVehi;
    }
}
