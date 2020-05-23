package lab4_josevargas_andresnuilaa;

public class Gorila extends Primate {

    private int IQ;

    public Gorila() {
    }

    public Gorila(int IQ, int comida, int comidaPorKM, String planeta, String lugarNacimiento, String nombre, String tipoSangre, char sexo, double altura, double peso) {
        super(comida, comidaPorKM, planeta, lugarNacimiento, nombre, tipoSangre, sexo, altura, peso);
        this.IQ = IQ;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Gorila\n" + super.toString() + "IQ=" + IQ;
    }

}
