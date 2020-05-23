package lab4_josevargas_andresnuilaa;

public class Primate extends Ser_Vivo {

    protected int comida;
    protected int comidaPorKM;
    protected String planeta;
    protected String lugarNacimiento;

    public Primate() {
    }

    public Primate(int comida, int comidaPorKM, String planeta, String lugarNacimiento, String nombre, String tipoSangre, char sexo, double altura, double peso) {
        super(nombre, tipoSangre, sexo, altura, peso);
        this.comida = comida;
        this.comidaPorKM = comidaPorKM;
        this.planeta = planeta;
        this.lugarNacimiento = lugarNacimiento;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public int getComidaPorKM() {
        return comidaPorKM;
    }

    public void setComidaPorKM(int comidaPorKM) {
        this.comidaPorKM = comidaPorKM;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
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
        return "Primate\n" + super.toString() + ", comida=" + comida + ", comidaPorKM=" + comidaPorKM + ", planeta=" + planeta + ", lugarNacimiento=" + lugarNacimiento + '}';
    }
    
}
