package lab4_josevargas_andresnuilaa;

import java.util.ArrayList;

public class Aereo_Normal extends Medio_Transporte {

    protected String gasolina;
    protected String PaisSalida;
    protected String PaisLlegada;

    public Aereo_Normal() {
    }

    public Aereo_Normal(String gasolina, String PaisSalida, String PaisLlegada, int combustible, int distancia, double altitud) {
        super(combustible, distancia, altitud);
        this.gasolina = gasolina;
        this.PaisSalida = PaisSalida;
        this.PaisLlegada = PaisLlegada;
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
        return "Aereo Normal\n" + super.toString() + "gasolina=" + gasolina + ", PaisSalida=" + PaisSalida + ", PaisLlegada=" + PaisLlegada;
    }

    @Override
    public int viaje(int KmaViajar) {
        try {

            validar(KmaViajar);
        } catch (miException e) {
            System.out.println(e.getMessage());
        }
        int viaje = (KmaViajar / this.distancia) * 100;
        int total = this.combustible - viaje;
        return total;
    }

    public void validar(int x) throws miException {
        if (x > this.distancia) {
            throw new miException("No se puede realizar el viaje");
        }

    }
}
