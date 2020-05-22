package lab4_josevargas_andresnuilaa;

import java.awt.Color;

public class Mono extends Primate {

    private Color pelo;

    public Mono() {
    }

    public Mono(Color pelo, int comida, int comidaPorKM, String planeta, String lugarNacimiento, String nombre, String tipoSangre, char sexo, double altura, double peso) {
        super(comida, comidaPorKM, planeta, lugarNacimiento, nombre, tipoSangre, sexo, altura, peso);
        this.pelo = pelo;
    }

    public Mono(Color pelo, Medio_Transporte mt, int comida, int comidaPorKM, String planeta, String lugarNacimiento, String nombre, String tipoSangre, char sexo, double altura, double peso) {
        super(mt, comida, comidaPorKM, planeta, lugarNacimiento, nombre, tipoSangre, sexo, altura, peso);
        this.pelo = pelo;
    }

    public Color getPelo() {
        return pelo;
    }

    public void setPelo(Color pelo) {
        this.pelo = pelo;
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
        return "Mono\n" + super.toString() + "pelo=" + pelo;
    }

}
