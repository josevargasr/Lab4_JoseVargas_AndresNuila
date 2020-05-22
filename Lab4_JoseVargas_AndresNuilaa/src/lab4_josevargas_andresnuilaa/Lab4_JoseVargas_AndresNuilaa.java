/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_josevargas_andresnuilaa;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author josevargas
 */
public class Lab4_JoseVargas_AndresNuilaa {
static Scanner sc = new Scanner(System.in);
static boolean repetido = false;
static boolean inge = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        ArrayList<Ingeniero> ingenieros = new ArrayList();
        boolean valid = true;
        while (valid) {
            System.out.println("----Shopping Mall----\n"
                    + "1]Registro Ingeniero\n"
                    + "2]Login\n"
                    + "3]Primates\n"
                    + "4]Medios de Transporte\n"
                    + "5]Viajar\n"
                    + "6]Cerrar Sesion\n"
                    + "7]Salir\n"
                    + "Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese un nombre: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese un grupo sanguineo: ");
                    String grupo_sangre = sc.next();
                    System.out.println("Ingrese su sexo(M/F): ");
                    char sexo = sc.next().charAt(0);
                    System.out.println("Ingrese su altura: ");
                    double altura = sc.nextInt();
                    System.out.println("Ingrese su peso(lb): ");
                    double peso = sc.nextInt();
                    System.out.println("Ingrese su correo electronico: ");
                    String correo = sc.next();
                    String user = "";
                    boolean flag = true;
                    while(flag){
                        System.out.println("Ingrese su nombre de usuario: ");
                        user = sc.next();
                        for (Ingeniero x : ingenieros) {
                            if (x.getUsername().equals(user)) {
                                System.out.println("El nombre de usuario ya esta ocupado");
                                repetido = true;
                                break;
                            }
                        }
                        if(repetido){
                            
                        }else{
                            flag = false;
                        }
                    }
                    System.out.println("Ingrese una lista de idiomas que habla: ");
                    String idiomas = sc.nextLine();
                    idiomas = sc.nextLine();
                    System.out.println("Ingrese una contraseña: ");
                    String contraseña = sc.next();
                    System.out.println("Ingrese su fecha de nacimiento(dd/MM/yyyy): ");
                    String fecha = sc.next();
                    Date date=new SimpleDateFormat("dd/MM/yyyy").parse(fecha); 
                    ingenieros.add(new Ingeniero(correo,user,contraseña,date,nombre,grupo_sangre,sexo,altura,peso));
                    System.out.println("El ingeniero fue registrado con exito!");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ingrese el username: ");
                    String usuario = sc.next();
                    System.out.println("Ingrese la contraseña: ");
                    String pass = sc.next();
                    for (int i = 0; i < ingenieros.size(); i++) {
                        if (usuario.equals(ingenieros.get(i).getUsername()) && pass.equals(ingenieros.get(i).getPassword())) {
                            System.out.println("Se inicio sesion correctamente!");
                            inge = true;
                            break;
                        }
                    }
                    if (inge) {

                    } else {
                         System.out.println("El usuario o contraseña es incorrecto");
                    }
                    System.out.println();
                    break;
                case 3:
                    if(inge == false){
                        System.out.println("Se debe ingresar sesion como Ingeniero para tener acceso");
                    }else{
                        System.out.println("1]Agregar un Primate\n"
                                + "2]Modificar un Primate\n"
                                + "3]Eliminar un Primate\n"
                                + "4]Listar Primates\n"
                                + "Ingrese una opcion:");
                        int opcion2 = sc.nextInt();
                        switch(opcion2){
                            case 1:
                                System.out.println("1]");
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    if(inge == false){
                        System.out.println("Se debe ingresar sesion como Ingeniero para tener acceso");
                    }else{
                        
                    }
                    System.out.println();
                    break;
                case 5:
                    if(inge == false){
                        System.out.println("Se debe ingresar sesion como Ingeniero para tener acceso");
                    }else{
                        
                    }
                    System.out.println();
                    break;
                case 6:
                    if(inge == false){
                        System.out.println("No se ha iniciado sesion todavia");
                    }else{
                        System.out.println("Se cerro sesion con exito");
                        inge = false;
                    }
                    System.out.println();
                    break;
                case 7:
                    valid = false;
                    break;
            }
        }
    }
    
}
