package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;


    public  Camioneta(boolean volco){
        this.volco = volco;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}
