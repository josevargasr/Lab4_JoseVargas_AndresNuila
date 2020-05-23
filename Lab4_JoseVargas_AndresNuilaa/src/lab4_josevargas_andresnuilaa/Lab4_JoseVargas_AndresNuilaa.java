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
        ArrayList<Medio_Transporte> medios_transporte = new ArrayList();
        ArrayList<Ingeniero> ingenieros = new ArrayList();
        boolean valid = true;
        while (valid) {
            System.out.println("----Elon Musk Universe Ride----\n"
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
                    double altura = sc.nextDouble();
                    System.out.println("Ingrese su peso(lb): ");
                    double peso = sc.nextDouble();
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
                                double altura2 = sc.nextDouble();
                                System.out.println("Ingrese su peso(lb): ");
                                double peso2 = sc.nextDouble();
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
                                    primates.add(new Mono(color, cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                } else {
                                    System.out.println("Ingrese el iq del gorila(130-139): ");
                                    iq = sc.nextInt();
                                    primates.add(new Gorila(iq, cant_comida, comidaPorKM, planeta, nacimiento, nombre2, grupo_sangre2, sexo2, altura2, peso2));
                                }
                                System.out.println("El primate fue creado con exito!");
                                break;
                            case 2:
                                System.out.println("Lista de todos los Primates: ");
                                for (Primate p : primates) {
                                    System.out.println("[" + primates.indexOf(p) + "] " + p);
                                }
                                System.out.println("Ingrese el indice del primate a modificar");
                                int primate = sc.nextInt();
                                System.out.println("1] Cambiar nombre");
                                System.out.println("2] Cambiar tipo de sangre");
                                System.out.println("3] Cambiar sexo");
                                System.out.println("4] Cambiar altura");
                                System.out.println("5] Cambiar peso");
                                System.out.println("6] Cambiar medio de transporte");
                                System.out.println("7] Cambiar cantidad de comida");
                                System.out.println("8] Cambiar comida por kilometro");
                                System.out.println("9] Cambiar planeta asigando");
                                System.out.println("10] Cambiar lugar de nacimiento");
                                System.out.println("11] Cambiar color de pelo");
                                System.out.println("12] Cambiar IQ ");
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
                                        String sangre2 = sc.next();
                                        primates.get(primate).setTipoSangre(sangre2);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el nuevo sexo del primate: ");
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
                                            ((Mono) primates.get(primate)).setColor(pelo);
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
                                            ((Gorila) primates.get(primate)).setIQ(IQ);
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
                        System.out.println("1]Agregar Medio de Transporte\n"
                                + "2]Modificar Medio de Transporte\n"
                                + "3]Eliminar Medio de Transporte\n"
                                + "4]Listar Medios de Transporte\n"
                                + "5]Agregar Primate a Medio de Transporte"
                                + "Ingrese una opcion:");
                        int opcion2 = sc.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Ingrese la cantidad de combustible en el tanque(1-100): ");
                                int combustible = sc.nextInt();
                                System.out.println("Ingrese la distancia que puede recorrer con el tanque lleno: ");
                                int distancia = sc.nextInt();
                                System.out.println("Ingrese la altitud: ");
                                int altitud = sc.nextInt();
                                System.out.println("1]Aereo Normal\n"
                                        + "2]Espacial\n"
                                        + "Ingrese el medio que desea crear: ");
                                int medio = sc.nextInt();
                                if (medio == 1) {
                                    System.out.println("1]Super\n"
                                            + "2]Regular\n"
                                            + "3]Diesel\n"
                                            + "Ingrese el tipo de gasolina: ");
                                    int tipo_gas = sc.nextInt();
                                    String gasolina = "";
                                    if (tipo_gas == 1) {
                                        gasolina = "Super";
                                    } else if (tipo_gas == 2) {
                                        gasolina = "Regular";
                                    } else {
                                        gasolina = "Diesel";
                                    }
                                    System.out.println("Ingrese el pais de partida: ");
                                    String pais_partida = sc.next();
                                    System.out.println("Ingrese el pais de llegada: ");
                                    String pais_llegada = sc.next();
                                    System.out.println("1]Helicoptero\n"
                                            + "2]Avion Comercial\n"
                                            + "Ingrese el tipo de aereo normal: ");
                                    int tipo_aereo = sc.nextInt();
                                    if (tipo_aereo == 1) {
                                        System.out.println("Ingrese el numero de helices: ");
                                        int helices = sc.nextInt();
                                        System.out.println("Ingrese el numero de patas: ");
                                        int patas = sc.nextInt();
                                        medios_transporte.add(new Helicoptero(helices, patas, gasolina, pais_partida, pais_llegada, combustible, distancia, altitud));
                                    } else {
                                        System.out.println("Ingrese el numero de pasajeros que puede llevar: ");
                                        int pasajeros = sc.nextInt();
                                        System.out.println("Funciona el piloto automatico(S/N): ");
                                        char pilot = sc.next().charAt(0);
                                        boolean pilotoa;
                                        if (pilot == 'S') {
                                            pilotoa = true;
                                        } else {
                                            pilotoa = false;
                                        }
                                        medios_transporte.add(new Avion(pasajeros, pilotoa, gasolina, pais_partida, pais_llegada, combustible, distancia, altitud));
                                    }
                                } else {
                                    System.out.println("1]Quimico Solido\n"
                                            + "2]Propelente Liquido\n"
                                            + "Ingrese el tipo de gasolina: ");
                                    int tipo_gas = sc.nextInt();
                                    String gasolina = "";
                                    if (tipo_gas == 1) {
                                        gasolina = "Quimico Solido";
                                    } else {
                                        gasolina = "Propelente Liquido";
                                    }
                                    System.out.println("Ingrese el planeta de partida: ");
                                    String planeta_partida = sc.next();
                                    System.out.println("Ingrese el planeta de llegada: ");
                                    String planeta_llegada = sc.next();
                                    System.out.println("1]Nave Espacial\n"
                                            + "2]Cohete\n"
                                            + "Ingrese el tipo de medio espacial: ");
                                    int tipo_espacial = sc.nextInt();
                                    if (tipo_espacial == 1) {
                                        System.out.println("Ingrese el numero de propulsores: ");
                                        int propulsores = sc.nextInt();
                                        medios_transporte.add(new Nave(propulsores, gasolina, planeta_partida, planeta_llegada, combustible, distancia, altitud));
                                    } else {
                                        System.out.println("Ingrese el numero de separaciones: ");
                                        int separaciones = sc.nextInt();
                                        medios_transporte.add(new Cohete(separaciones, gasolina, planeta_partida, planeta_llegada, combustible, distancia, altitud));
                                    }
                                }
                                System.out.println("El medio de transporte se agrego con exito");
                                break;
                            case 2:
                                System.out.println("Lista de todos los Medios de Transporte: ");
                                for (Medio_Transporte p : medios_transporte) {
                                    System.out.println("[" + medios_transporte.indexOf(p) + "] " + p);
                                }
                                System.out.println("Ingrese el indice del medio de transporte a modificar a modificar");
                                int mt = sc.nextInt();
                                System.out.println("1. Cambiar cantidad de combustible");
                                System.out.println("2. Cambiar Distancia en km con tanque lleno");
                                System.out.println("3. Cambiar altitud");
                                System.out.println("4. Cambiar tipo de gasolina(Normal)");
                                System.out.println("5. Cambiar pais de partida");
                                System.out.println("6. Cambiar pais de destino");
                                System.out.println("7. Cambiar numero de helices (Helicopteros)");
                                System.out.println("8. Cambiar numero de patas (Helicopteros)");
                                System.out.println("9. Cambiar numero de pasajeros (Avion comercial)");
                                System.out.println("10. Cambiar piloto automatico (Avion comercial)");
                                System.out.println("11. Cambiar tipo de combustible (espacial)");
                                System.out.println("12. Cambiar planeta de salida");
                                System.out.println("13. Cambiar planeta de destino");
                                System.out.println("14. Cambiar numero de propulsores (Nave)");
                                System.out.println("15. Cambiar numero de separadiones (Cohete)");
                                System.out.println("Ingrese una opcion");
                                int mod1 = sc.nextInt();
                                switch (mod1) {
                                    case 1:
                                        System.out.println("Ingrese la nueva cantidad de combustible");
                                        int can2 = sc.nextInt();
                                        sc = new Scanner(System.in);
                                        medios_transporte.get(mt).setCombustible(can2);
                                        System.out.println("La modificacion se hizo con exito");
                                        break;
                                    case 2:
                                        System.out.println("Ingrese la nueva distanca capaz de viajar con tanque lleno");
                                        int dis2 = sc.nextInt();
                                        sc = new Scanner(System.in);
                                        medios_transporte.get(mt).setDistancia(dis2);
                                        System.out.println("La modificacion se hizo con exito");
                                        break;
                                    case 3:
                                        System.out.println("Ingrese la nueva distanca capaz de viajar con tanque lleno");
                                        int alt2 = sc.nextInt();
                                        sc = new Scanner(System.in);
                                        medios_transporte.get(mt).setAltitud(alt2);
                                        System.out.println("La modificacion se hizo con exito");
                                        break;
                                    case 4:
                                        String gasolina2 = "";
                                        System.out.println("1. Super. \n2. Regular. \n3.Diesel.");
                                        System.out.println("Ingrese el nuevo tipo de gasolina");
                                        int gaso2 = sc.nextInt();
                                        sc = new Scanner(System.in);
                                        sc = new Scanner(System.in);
                                        switch (gaso2) {
                                            case 1:
                                                gasolina2 = "Super";
                                                break;
                                            case 2:
                                                gasolina2 = "Regular";
                                                break;
                                            case 3:
                                                gasolina2 = "Diesel";
                                                break;
                                            default:
                                                break;
                                        }
                                        ((Aereo_Normal) medios_transporte.get(mt)).setGasolina(gasolina2);
                                        System.out.println("La modificacion se hizo con exito");
                                        break;
                                    case 5:
                                        System.out.println("Ingresel el nuevo pais de partida");
                                        String partida2 = sc.next();
                                        sc = new Scanner(System.in);
                                        sc.next();
                                        ((Aereo_Normal) medios_transporte.get(mt)).setPaisSalida(partida2);
                                        System.out.println("La modificacion se hizo con exito");
                                        break;
                                    case 6:
                                        System.out.println("Ingresel el nuevo pais de llegada");
                                        String llegada2 = sc.next();
                                        sc = new Scanner(System.in);
                                        sc.next();
                                        ((Aereo_Normal) medios_transporte.get(mt)).setPaisLlegada(llegada2);
                                        System.out.println("La modificacion se hizo con exito");
                                        break;
                                    case 7:
                                        int helices2;
                                        if (medios_transporte.get(mt) instanceof Helicoptero) {
                                            System.out.println("Ingrese el numero nuevo de helices");
                                            helices2 = sc.nextInt();
                                            sc = new Scanner(System.in);
                                            ((Helicoptero) medios_transporte.get(mt)).setHelices(helices2);
                                            System.out.println("La modificacion se hizo con exito");
                                            break;
                                        } else {
                                            System.out.println("A este medio no se le pueden modificar las helices");
                                            break;
                                        }
                                    case 8:
                                        int patass2;
                                        if (medios_transporte.get(mt) instanceof Helicoptero) {
                                            System.out.println("Ingrese el numero nuevo de patas");
                                            patass2 = sc.nextInt();
                                            sc = new Scanner(System.in);
                                            ((Helicoptero) medios_transporte.get(mt)).setPatas(patass2);
                                            System.out.println("La modificacion se hizo con exito");
                                            break;
                                        } else {
                                            System.out.println("A este medio no se le pueden modificar las patas");
                                            break;
                                        }
                                    case 9:
                                        int pasajero2;
                                        if (medios_transporte.get(mt) instanceof Avion) {
                                            System.out.println("Ingrese el numero nuevo de pasajeros");
                                            pasajero2 = sc.nextInt();
                                            sc = new Scanner(System.in);
                                            ((Avion) medios_transporte.get(mt)).setNumeroPasajeros(pasajero2);
                                            System.out.println("La modificacion se hizo con exito");
                                            break;
                                        } else {
                                            System.out.println("A este medio no se le pueden modificar los pasajeros");
                                            break;
                                        }
                                    case 10:
                                        if (medios_transporte.get(mt) instanceof Avion) {
                                            System.out.println(((Avion) medios_transporte.get(mt)));
                                            System.out.println("Ahora sera cambiado a: ");
                                            if (((Avion) medios_transporte.get(mt)).isPilotoAutomatico() == true) {
                                                System.out.println("FALSO, no tiene piloto automatico");
                                                ((Avion) medios_transporte.get(mt)).setPilotoAutomatico(false);
                                                break;
                                            } else {
                                                System.out.println("VERDADERO, si tiene piloto automatico");
                                                ((Avion) medios_transporte.get(mt)).setPilotoAutomatico(true);
                                                break;
                                            }

                                        } else {
                                            System.out.println("A este vehiculo no se le puede cambiar el piuloto automatico");
                                        }
                                    case 11:
                                        if (medios_transporte.get(mt) instanceof Aero_Espacial) {
                                            String combustible2 = "";
                                            System.out.println("1. Quimico solido. \n2. Prepelente Liquido.");
                                            System.out.println("Ingrese el nuevo tipo de gasolina");
                                            int comb2 = sc.nextInt();
                                            sc = new Scanner(System.in);
                                            sc = new Scanner(System.in);
                                            switch (comb2) {
                                                case 1:
                                                    combustible2 = "Quimico solido";
                                                    break;
                                                case 2:
                                                    combustible2 = "Propelente liquido";
                                                    break;
                                                default:
                                                    break;
                                            }
                                            if (medios_transporte.get(mt) instanceof Nave) {
                                                ((Nave) medios_transporte.get(mt)).setCombustibe(combustible2);
                                            } else {
                                                ((Cohete) medios_transporte.get(mt)).setCombustibe(combustible2);
                                            }
                                            System.out.println("La modificacion se hizo con exito");
                                        } else {
                                            System.out.println("A este vehiculo no se le puede cambiar el combustible");
                                        }
                                        break;
                                    case 12:
                                        if (medios_transporte.get(mt) instanceof Aero_Espacial) {
                                            System.out.println("Ingrese el nuevo planeta de salida");
                                            String salida2 = sc.next();
                                            sc.next();
                                            sc = new Scanner(System.in);
                                            ((Aero_Espacial) medios_transporte.get(mt)).setPlanetaSalida(salida2);

                                        } else {
                                            System.out.println("A este vehiculo no le podemos asignar un nuevo planeta de salida");
                                        }
                                        break;
                                    case 13:
                                        if (medios_transporte.get(mt) instanceof Aero_Espacial) {
                                            System.out.println("Ingrese el nuevo planeta de destino");
                                            String destino2 = sc.next();
                                            sc.next();
                                            sc = new Scanner(System.in);
                                            ((Aero_Espacial) medios_transporte.get(mt)).setPlanetaLlegada(destino2);

                                        } else {
                                            System.out.println("A este vehiculo no le podemos asignar un nuevo planeta de destino");
                                        }
                                        break;
                                    case 14:
                                        int propulsores2 = 0;
                                        if (medios_transporte.get(mt) instanceof Nave) {
                                            System.out.println("Ingrese el nuevo numero de propulsores");
                                            propulsores2 = sc.nextInt();
                                            sc = new Scanner(System.in);
                                            ((Nave) medios_transporte.get(mt)).setPropulsores(propulsores2);
                                        } else {
                                            System.out.println("No se le puede signar un numero de propulsores");
                                        }

                                        break;
                                    case 15:
                                        int divisiones2 = 0;
                                        if (medios_transporte.get(mt) instanceof Cohete) {
                                            System.out.println("Ingrese el nuevo numero de divisiones");
                                            divisiones2 = sc.nextInt();
                                            sc = new Scanner(System.in);
                                            ((Cohete) medios_transporte.get(mt)).setSeparaciones(divisiones2);
                                        } else {
                                            System.out.println("No se le pueden asignar divisiones");
                                        }

                                        break;
                                    default:
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Lista de todos los Medios de Transporte: ");
                                for (Medio_Transporte p : medios_transporte) {
                                    System.out.println("[" + medios_transporte.indexOf(p) + "] " + p);
                                }
                                System.out.println("Ingrese el medio de transporte que desea eliminar: ");
                                int eliminar = sc.nextInt();
                                medios_transporte.remove(eliminar);
                                System.out.println("Se elimino con exito!");
                                break;
                            case 4:
                                System.out.println("Lista de todos los Medios de Transporte: ");
                                for (Medio_Transporte p : medios_transporte) {
                                    System.out.println("[" + medios_transporte.indexOf(p) + "] " + p);
                                }
                                break;
                            case 5:
                                System.out.println("Lista de todos los Medios de Transporte: ");
                                for (Medio_Transporte p : medios_transporte) {
                                    System.out.println("[" + medios_transporte.indexOf(p) + "] " + p);
                                }
                                System.out.println("Ingrese a cual medio le quiere agregar un primate: ");
                                int pos1 = sc.nextInt();
                                System.out.println("Lista de todos los Primates: ");
                                for (Primate p : primates) {
                                    System.out.println("[" + primates.indexOf(p) + "] " + p);
                                }
                                System.out.println("Ingrese la posicion del primate que desea agregar: ");
                                int pos2 = sc.nextInt();
                                medios_transporte.get(pos1).getPrimates().add(primates.get(pos2));
                                System.out.println("El primate fue agregado al medio de transporte!");
                                break;

                        }
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
