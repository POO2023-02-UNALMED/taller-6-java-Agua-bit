package vehiculos;

import java.util.List;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int cantidadPaises;
    private static Pais top;
    private static List<Pais>listaPaises = new ArrayList<Pais>();

    public Pais(String nombre){
        this.nombre = nombre;
        listaPaises.add(this);
    }

    public static Pais paisMasVendedor(){

        for (int i=0; i<Pais.listaPaises.size(); i++){
            Pais top1 = Pais.listaPaises.get(0);
            Pais top2 = Pais.listaPaises.get(i+1);

            if (top1.getCantidadPaises()< top2.getCantidadPaises()){
                top = top2;
            }
            else{
                top = top1;
            }
        }
        return top;
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

    public int getCantidadPaises() {
        return cantidadPaises;
    }

    public void setCantidadPaises(int cantidadPaises) {
        this.cantidadPaises = cantidadPaises;
    }
}
