package lab4_josevargas_andresnuilaa;

import java.util.ArrayList;

public class Avion extends Aereo_Normal {

    private int numeroPasajeros;
    private boolean PilotoAutomatico;

    public Avion() {
    }

    public Avion(int numeroPasajeros, boolean PilotoAutomatico, String gasolina, String PaisSalida, String PaisLlegada, int combustible, int distancia, double altitud) {
        super(gasolina, PaisSalida, PaisLlegada, combustible, distancia, altitud);
        this.numeroPasajeros = numeroPasajeros;
        this.PilotoAutomatico = PilotoAutomatico;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public boolean isPilotoAutomatico() {
        return PilotoAutomatico;
    }

    public void setPilotoAutomatico(boolean PilotoAutomatico) {
        this.PilotoAutomatico = PilotoAutomatico;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }

    public String getPaisSalida() {
        return PaisSalida;
    }

    public void setPaisSalida(String PaisSalida) {
        this.PaisSalida = PaisSalida;
    }

    public String getPaisLlegada() {
        return PaisLlegada;
    }

    public void setPaisLlegada(String PaisLlegada) {
        this.PaisLlegada = PaisLlegada;
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
        return "Avion\n" + super.toString() + "numeroPasajeros=" + numeroPasajeros + ", PilotoAutomatico=" + PilotoAutomatico + '}';
    }

}
