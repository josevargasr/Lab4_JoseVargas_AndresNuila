package lab4_josevargas_andresnuilaa;

import java.util.ArrayList;
import java.util.Date;

public class Ingeniero extends Ser_Vivo {
    private String correo;
    private String username;
    private ArrayList<String>idiomas= new ArrayList();
    private String password;
    private Date nacimiento;

    public Ingeniero() {
    }

    public Ingeniero(String correo, String username, String password, Date nacimiento, String nombre, String tipoSangre, char sexo, double altura, double peso) {
        super(nombre, tipoSangre, sexo, altura, peso);
        this.correo = correo;
        this.username = username;
        this.password = password;
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
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
        return "Ingeniero\n"+super.toString() + "correo=" + correo + ", username=" + username + ", idiomas=" + idiomas + ", password=" + password + ", nacimiento=" + nacimiento;
    }
    
    
    
}
