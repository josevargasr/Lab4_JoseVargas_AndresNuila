package lab4_josevargas_andresnuilaa;

public class miException extends Exception {

    public miException() {
    }

    public miException(String string) {
        super(string);
    }

    @Override
    public String toString() {
        return "Revise los datos ingresados"+super.toString();
    }
    
}
