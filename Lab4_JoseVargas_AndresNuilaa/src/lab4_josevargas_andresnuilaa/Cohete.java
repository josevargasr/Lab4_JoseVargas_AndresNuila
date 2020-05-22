package lab4_josevargas_andresnuilaa;

import java.util.ArrayList;

public class Cohete extends Aero_Espacial {

    private int separaciones;

    public Cohete() {
    }

    public Cohete(int separaciones, String combustibe, String PlanetaSalida, String PlanetaLlegada, int combustible, int distancia, double altitud) {
        super(combustibe, PlanetaSalida, PlanetaLlegada, combustible, distancia, altitud);
        this.separaciones = separaciones;
    }

    public int getSeparaciones() {
        return separaciones;
    }

    public void setSeparaciones(int separaciones) {
        this.separaciones = separaciones;
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
        return "Cohete\n" + super.toString() + "separaciones=" + separaciones + '}';
    }

}
