package lab4_josevargas_andresnuilaa;

import java.util.ArrayList;

public class Aero_Espacial extends Medio_Transporte {

    protected String combustibe;
    protected String PlanetaSalida;
    protected String PlanetaLlegada;

    public Aero_Espacial() {
    }

    public Aero_Espacial(String combustibe, String PlanetaSalida, String PlanetaLlegada, int combustible, int distancia, double altitud) {
        super(combustible, distancia, altitud);
        this.combustibe = combustibe;
        this.PlanetaSalida = PlanetaSalida;
        this.PlanetaLlegada = PlanetaLlegada;
    }

    public String getCombustibe() {
        return combustibe;
    }

    public void setCombustibe(String combustibe) {
        this.combustibe = combustibe;
    }

    public String getPlanetaSalida() {
        return PlanetaSalida;
    }

    public void setPlanetaSalida(String PlanetaSalida) {
        this.PlanetaSalida = PlanetaSalida;
    }

    public String getPlanetaLlegada() {
        return PlanetaLlegada;
    }

    public void setPlanetaLlegada(String PlanetaLlegada) {
        this.PlanetaLlegada = PlanetaLlegada;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public ArrayList<Primate> getPrimates() {
        return primates;
    }

    public void setPrimates(ArrayList<Primate> primates) {
        this.primates = primates;
    }

    @Override
    public String toString() {
        return "Aero Espacial\n" + super.toString() + "combustibe=" + combustibe + ", PlanetaSalida=" + PlanetaSalida + ", PlanetaLlegada=" + PlanetaLlegada + '}';
    }

}
