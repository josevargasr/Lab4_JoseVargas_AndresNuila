package lab4_josevargas_andresnuilaa;

import java.util.ArrayList;

public abstract class Medio_Transporte {
    protected int combustible;
    protected int distancia;
    protected double altitud;
    protected ArrayList<Primate> primates = new ArrayList();

    public Medio_Transporte() {
    }

    public Medio_Transporte(int combustible, int distancia, double altitud) {
        this.combustible = combustible;
        this.distancia = distancia;
        this.altitud = altitud;
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
        return "Medio Transporte\n" + "combustible=" + combustible + ", distancia maxima=" + distancia + ", altitud=" + altitud +", primates asigandos: " + primates;
    }
    
    public abstract int viaje (int km);
    
}
