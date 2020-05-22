package lab4_josevargas_andresnuilaa;

import java.util.ArrayList;

public class Helicoptero extends Aereo_Normal {

    private int helices;
    private int patas;

    public Helicoptero() {
    }

    public Helicoptero(int helices, int patas, String gasolina, String PaisSalida, String PaisLlegada, int combustible, int distancia, double altitud) {
        super(gasolina, PaisSalida, PaisLlegada, combustible, distancia, altitud);
        this.helices = helices;
        this.patas = patas;
    }

    public int getHelices() {
        return helices;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
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
        return "Helicoptero\n" + super.toString() + "helices=" + helices + ", patas=" + patas + '}';
    }

}
