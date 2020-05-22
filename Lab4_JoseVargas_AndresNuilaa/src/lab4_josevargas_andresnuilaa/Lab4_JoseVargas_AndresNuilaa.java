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
        ArrayList<Primate> primates = new ArrayList();
        ArrayList<Aero_Espacial> aereo_espacial = new ArrayList();
        ArrayList<Aereo_Normal> aereo_normal = new ArrayList();
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
            switch (opcion) {
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
                    while (flag) {
                        System.out.println("Ingrese su nombre de usuario: ");
                        user = sc.next();
                        for (Ingeniero x : ingenieros) {
                            if (x.getUsername().equals(user)) {
                                System.out.println("El nombre de usuario ya esta ocupado");
                                repetido = true;
                                break;
                            }
                        }
                        if (repetido) {

                        } else {
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
                    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
                    ingenieros.add(new Ingeniero(correo, user, contraseña, date, nombre, grupo_sangre, sexo, altura, peso));
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
                    if (inge == false) {
                        System.out.println("Se debe ingresar sesion como Ingeniero para tener acceso");
                    } else {
                        System.out.println("1]Agregar un Primate\n"
                                + "2]Modificar un Primate\n"
                                + "3]Eliminar un Primate\n"
                                + "4]Listar Primates\n"
                                + "Ingrese una opcion:");
                        int opcion2 = sc.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Ingrese un nombre: ");
                                String nombre2 = sc.next();
                                System.out.println("Ingrese un grupo sanguineo: ");
                                String grupo_sangre2 = sc.next();
                                System.out.println("Ingrese su sexo(M/F): ");
                                char sexo2 = sc.next().charAt(0);
                                System.out.println("Ingrese su altura: ");
                                double altura2 = sc.nextInt();
                                System.out.println("Ingrese su peso(lb): ");
                                double peso2 = sc.nextInt();
                                System.out.println("Ingrese la cantidad de comida(1-100): ");
                                int cant_comida = sc.nextInt();
                                System.out.println("Ingrese cuanta comida consume por kilometro: ");
                                int comidaPorKM = sc.nextInt();
                                System.out.println("Ingrese el planeta asignado: ");
                                String planeta = sc.next();
                                System.out.println("Ingrese el lugar de nacimiento: ");
                                String nacimiento = sc.next();
                                System.out.println("1]Mono\n"
                                        + "2]Gorila\n"
                                        + "Ingrese el tipo de primate que desea: ");
                                String color = "";
                                int iq = 0;
                                int tipo_prim = sc.nextInt();
                                if (tipo_prim == 1) {
                                    System.out.println("Ingrese el color del mono: ");
                                    color = sc.next();
                                } else {
                                    System.out.println("Ingrese el iq del gorila(130-139): ");
                                    iq = sc.nextInt();

                                }
                                System.out.println("1]Aereo Normal\n"
                                        + "2]Aereo Espacial\n"
                                        + "Ingrese el metodo de transporte que desea utilizar: ");
                                int opc = sc.nextInt();
                                switch (opc) {
                                    case 1:
                                        if (aereo_normal.size() > 0) {
                                            for (Aereo_Normal an : aereo_normal) {
                                                System.out.println("[" + aereo_normal.indexOf(an) + "] " + an);
                                            }
                                            System.out.println("Ingrese la posicion donde quiere agregar el primate: ");
                                            int posi = sc.nextInt();
                                            if (tipo_prim == 1) {
                                                aereo_normal.get(posi).getPrimates().add(new Mono(color, aereo_normal.get(posi), cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                                primates.add(new Mono(color, aereo_normal.get(posi), cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                            } else {
                                                aereo_normal.get(posi).getPrimates().add(new Gorila(iq, aereo_normal.get(posi), cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                                primates.add(new Gorila(iq, aereo_normal.get(posi), cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                            }

                                        } else {
                                            System.out.println("No hay ningun metodo de transporte disponible por los momentos");
                                            if (tipo_prim == 1) {
                                                primates.add(new Mono(color, cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                            } else {
                                                primates.add(new Gorila(iq, cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                            }
                                        }
                                        break;
                                    case 2:
                                        if (aereo_espacial.size() > 0) {
                                            for (Aero_Espacial ae : aereo_espacial) {
                                                System.out.println("[" + aereo_espacial.indexOf(ae) + "] " + ae);
                                            }
                                            System.out.println("Ingrese la posicion donde quiere agregar el primate: ");
                                            int posi = sc.nextInt();
                                            if (tipo_prim == 1) {
                                                aereo_espacial.get(posi).getPrimates().add(new Mono(color, aereo_normal.get(posi), cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                                primates.add(new Mono(color, aereo_espacial.get(posi), cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                            } else {
                                                aereo_espacial.get(posi).getPrimates().add(new Gorila(iq, aereo_normal.get(posi), cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                                primates.add(new Gorila(iq, aereo_espacial.get(posi), cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                            }

                                        } else {
                                            System.out.println("No hay ningun metodo de transporte disponible entonces no se podra agregar por los momentos");
                                            if (tipo_prim == 1) {
                                                primates.add(new Mono(color, cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                            } else {
                                                primates.add(new Gorila(iq, cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                            }
                                        }

                                        break;
                                }
                                System.out.println("El primate fue creado con exito!");
                                break;
                            case 2:
                                System.out.println("Ingrese el indice del primate a modificar");
                                int primate = sc.nextInt();
                                System.out.println("1. Cambiar nombre");
                                System.out.println("1. Cambiar tipo de sangre");
                                System.out.println("1. Cambiar sexo");
                                System.out.println("1. Cambiar altura");
                                System.out.println("1. Cambiar peso");
                                System.out.println("1. Cambiar medio de transporte");
                                System.out.println("1. Cambiar cantidad de comida");
                                System.out.println("1. Cambiar comida por kilometro");
                                System.out.println("1. Cambiar planeta asigando");
                                System.out.println("1. Cambiar lugar de nacimiento");
                                System.out.println("1. Cambiar color de pelo");
                                System.out.println("1. Cambiar IQ ");
                                System.out.println("Ingrese la opcion e ejecutar");
                                int mod1 = sc.nextInt();
                                switch (mod1) {
                                    case 1:
                                        System.out.println("Ingrese el nuevo nombre: ");
                                        String nombre3 = sc.nextLine();
                                        sc = new Scanner(System.in);
                                        sc.nextLine();
                                        primates.get(primate).setNombre(nombre3);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo tipo de sangre: ");
                                        String sangre2 = sc.nextLine();
                                        sc = new Scanner(System.in);
                                        sc.nextLine();
                                        primates.get(primate).setTipoSangre(sangre2);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el nuevo genero del primate: ");
                                        char sexo3 = sc.next().charAt(0);
                                        sc = new Scanner(System.in);
                                        primates.get(primate).setSexo(sexo3);
                                        break;
                                    case 4:
                                        System.out.println("Ingrese la nueva altura del primate: ");
                                        double altura3 = sc.nextDouble();
                                        sc = new Scanner(System.in);
                                        primates.get(primate).setAltura(altura3);
                                        break;
                                    case 5:
                                        System.out.println("Ingrese la nueva altura del primate: ");
                                        double peso3 = sc.nextDouble();
                                        sc = new Scanner(System.in);
                                        primates.get(primate).setPeso(peso3);
                                        break;
                                    case 6:
                                        System.out.println("Ingrese el nuevo medio de trasnporte: ");
                                        break;
                                    case 7:
                                        System.out.println("Ingrese la nueva cantidad de comida para el primate: ");
                                        int cantidad2 = sc.nextInt();
                                        sc = new Scanner(System.in);
                                        primates.get(primate).setComida(cantidad2);
                                        break;
                                    case 8:
                                        System.out.println("Ingrese la nueva cantidad de comida para el primate: ");
                                        int porKm2 = sc.nextInt();
                                        sc = new Scanner(System.in);
                                        primates.get(primate).setComidaPorKM(porKm2);
                                        break;
                                    case 9:
                                        System.out.println("Ingrese el nuevo planeta asignado: ");
                                        String planeta2 = sc.nextLine();
                                        sc.nextLine();
                                        sc = new Scanner(System.in);

                                        primates.get(primate).setNombre(planeta2);
                                        break;
                                    case 10:
                                        System.out.println("Ingrese el nuevo lugar de nacimiento");
                                        String nacimiento2 = sc.nextLine();
                                        sc = new Scanner(System.in);
                                        sc.nextLine();
                                        primates.get(primate).setNombre(nacimiento2);
                                        break;
                                    case 11:
                                        if (primates.get(primate) instanceof Mono) {
                                            System.out.println("Ingrese el nuevo color de pelo");
                                            String pelo = sc.next();
                                            ((Mono)primates.get(primate)).setColor(pelo);
                                            break;
                                        } else {
                                            System.out.println("A este primate no se le puede modificare el pelo");
                                        }
                                        break;
                                    case 12:
                                        if (primates.get(primate) instanceof Gorila) {
                                            System.out.println("Ingrese el nuevo iq del Gorila");
                                            int IQ = sc.nextInt();
                                            sc = new Scanner(System.in);
                                            ((Gorila)primates.get(primate)).setIQ(IQ);
                                            break;
                                        } else {
                                            System.out.println("A este primate no se le puede modificare el IQ");
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Lista de Primates: ");
                                for (Primate p : primates) {
                                    System.out.println("[" + primates.indexOf(p) + "] " + p);
                                }
                                System.out.println("Ingrese la posicion del primate que desea eliminar: ");
                                int pos = sc.nextInt();
                                primates.remove(pos);
                                System.out.println("El primate fue eliminado con exito");
                                break;
                            case 4:
                                System.out.println("1]Listar Monos\n"
                                        + "2]Listar Gorilas\n"
                                        + "Listar Todos los Primates\n"
                                        + "Ingrese una opcion: ");
                                int opt = sc.nextInt();
                                if (opt == 1) {
                                    System.out.println("Lista de Monos: ");
                                    for (Primate p : primates) {
                                        if (p instanceof Mono) {
                                            System.out.println("[" + primates.indexOf(p) + "] " + p);
                                        }
                                    }
                                } else if (opt == 2) {
                                    System.out.println("Lista de Gorilas: ");
                                    for (Primate p : primates) {
                                        if (p instanceof Gorila) {
                                            System.out.println("[" + primates.indexOf(p) + "] " + p);
                                        }
                                    }
                                } else {
                                    System.out.println("Lista de todos los Primates: ");
                                    for (Primate p : primates) {
                                        System.out.println("[" + primates.indexOf(p) + "] " + p);
                                    }
                                }
                                break;
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    if (inge == false) {
                        System.out.println("Se debe ingresar sesion como Ingeniero para tener acceso");
                    } else {

                    }
                    System.out.println();
                    break;
                case 5:
                    if (inge == false) {
                        System.out.println("Se debe ingresar sesion como Ingeniero para tener acceso");
                    } else {

                    }
                    System.out.println();
                    break;
                case 6:
                    if (inge == false) {
                        System.out.println("No se ha iniciado sesion todavia");
                    } else {
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
