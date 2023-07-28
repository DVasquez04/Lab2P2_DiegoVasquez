/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_diegovasquez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Diego Vasquez
 */
public class Lab2P2_DiegoVasquez {
    static int contChefsMatutinos;
    static int contChefsVespertinos;
    static int contChefsTotal;
    static int contMeserosTotal;
    static int contMeserosMatutinos;
    static int contMeserosVespertinos;
    static int contBartMatutinos;
    static int contBartVespertinos;
    static int contBartTotal;
    static int contMesasTotal;
    static int contPrecioMesas;
    public static void main(String[] args) {
        ArrayList <Chefs> chefs = new ArrayList();
        ArrayList <Mesero> meseros = new ArrayList();
        ArrayList <Bartender> bartenders = new ArrayList();
        ArrayList <Mesa> mesas = new ArrayList();
        
        
        
        Scanner lea = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        while(seguir){
            System.out.println("""
                               =Bienvendio al Programa=
                               1. Inicio de Sesion
                               2. Salir
                               Ingrese una opcion: """);
            int op = lea.nextInt();
            switch(op){
                case 1:{
                    boolean Admin = true;
                    while (Admin){
                        System.out.println("Ingrese el Usuario: ");
                        String user = sc.next().trim();
                        System.out.println("Ingrese la contraseña: ");
                        String pass = sc.next().trim();
                        if (user.equals("gerente") && pass.equals("g3r$nt0")) {
                            System.out.println("Inicio de Sesion Exitoso! \n Bienvenido Gerente! \n");
                            Admin = false;
                        }else{
                            System.out.println("Lo lamento, su usuario no tiene privilegios de Gerente.");
                        }//fin if
                    }//fin inicio de ses
                    boolean next = true;
                    
                    while(next){
                        System.out.println("""
                                           =Sub Menu Objetos=
                                           1.Chefs
                                           2.Meseros
                                           3.Bartenders
                                           4.Mesas
                                           5.Salir de Sesion
                                           Ingrese con que desea Trabajar: """);
                        int opcion = lea.nextInt();
                        switch(opcion){
                            case 1:{
                                boolean nextChef = true;
                                while(nextChef){
                                    System.out.println("""
                                                       =Sub Menu Chefs=
                                                       1.Crear Chefs
                                                       2.Modificar Chefs
                                                       3.Eliminar Chefs
                                                       4.Listar Chefs
                                                       5.Salir sub menu Chefs""");
                                    int opChef = lea.nextInt();
                                        
                                    switch(opChef){
                                        case 1:{
                                            if(contChefsTotal >= 14 ){
                                                System.out.println("Numero Maximo de Chefs Alcanzado \n Elimine un cheff antes de poder agregar otro.");
                                            }else{
                                                sc = new Scanner(System.in);
                                                System.out.println("=CREAR CHEFS=");
                                                System.out.println("Ingrese el Nombre: ");
                                                String nombre = sc.nextLine();
                                                System.out.println("Ingrese la Edad: ");
                                                int edad = lea.nextInt();
                                                while(edad <= 0){
                                                    System.out.println("Edad invalida \nIntentelo de nuevo");
                                                    edad = lea.nextInt();
                                                }//fin valid edad
                                                System.out.println("Ingrese que turno trabajara: (matutino/vespertino)");
                                                String turno = sc.next();
                                                boolean validTurn = true;
                                                while(validTurn){
                                                    if(turno.equalsIgnoreCase("matutino")||turno.equalsIgnoreCase("vespertino")){
                                                        validTurn = false;
                                                    }else{
                                                        System.out.println("Turno invalido \n Ingrese el turno de nuevo: ");
                                                        turno = sc.next();
                                                    }//fin if
                                                }//fin valid Turn
                                                System.out.println("Ingrese el numero de Estrellas Michelin: ");
                                                int estrellas = lea.nextInt();
                                                while(estrellas <0 ){
                                                    System.out.println("No se aceptan numeros negativos \n Ingrese el numero de estrellas: ");
                                                    estrellas = lea.nextInt();
                                                }//fin valid estrellas
                                                System.out.println("Ingrese el sueldo: ");
                                                double sueldo = lea.nextDouble();
                                                while(sueldo < 0.0){
                                                    System.out.println("Porfavor pagale un numero positivo al chef ._.\n ingrese el sueldo: ");
                                                    sueldo = lea.nextDouble();
                                                }//fin valid sueldo
                                                if(turno.equalsIgnoreCase("matutino") && contChefsMatutinos >= 7){
                                                    System.out.println("Numero de chefs matutinos exedido \n No se pudo agregar el chef");
                                                }else if(turno.equalsIgnoreCase("matutino") && contChefsMatutinos < 7){
                                                    Chefs chef = new Chefs(nombre, edad, turno, estrellas, sueldo);
                                                    chefs.add(chef);
                                                    System.out.println("Chef agregado Exitosamente! ");
                                                    contChefsMatutinos++;
                                                    contChefsTotal++;
                                                }else if(turno.equalsIgnoreCase("vespertino") && contChefsVespertinos >= 7){
                                                    System.out.println("Numero de chefs vespertinos exedido \n No se pudo agregar el chef");
                                                }else if(turno.equalsIgnoreCase("vespertino") && contChefsVespertinos < 7){
                                                    Chefs chef = new Chefs(nombre, edad, turno, estrellas, sueldo);
                                                    chefs.add(chef);
                                                    System.out.println("Chef agregado Exitosamente! ");
                                                    contChefsVespertinos++;
                                                    contChefsTotal++;
                                                }//fin if de turnos
                                            }//fin chefs total +14
                                        }//fin case 1
                                        break;
                                        case 2:{
                                            if(contChefsTotal == 0){
                                                System.out.println("Primero Ingrese un chef con la opcion 1 antes de modificar :p");
                                            }else{
                                                System.out.println("=Modificar Chefs= \n");
                                                System.out.println("Ingrese el chef que desea eliminar: ");
                                                PrintChefs(chefs);
                                                int p = lea.nextInt();
                                                while(p<=0 || p > chefs.size()){
                                                    System.out.println("Posicion invalida... \n Intentelo de nuevo: ");
                                                    p = lea.nextInt();
                                                }
                                                p--;
                                                System.out.println("Ha decidido modificar el chef: "+chefs.get(p).getNombre());
                                                if(chefs.get(p).getTurno().equalsIgnoreCase("matutino")){
                                                    contChefsMatutinos--;
                                                }else if(chefs.get(p).getTurno().equalsIgnoreCase("vespertino")){
                                                    contChefsVespertinos--;
                                                }//fin if
                                                
                                                System.out.println("Ingrese el nuevo Nombre: ");
                                                    String nombre = sc.nextLine();
                                                    //chefs.get(p).setNombre(nombre);
                                                    System.out.println("Ingrese la nueva Edad: ");
                                                    int edad = lea.nextInt();
                                                    while(edad <= 0){
                                                        System.out.println("Edad invalida \nIntentelo de nuevo");
                                                        edad = lea.nextInt();
                                                    }//fin valid edad
                                                    //chefs.get(p).setEdad(edad);
                                                    System.out.println("Ingrese que turno trabajara: (matutino/vespertino)");
                                                    String turno = sc.next();
                                                    boolean validTurn = true;
                                                    while(validTurn){
                                                        if(turno.equalsIgnoreCase("matutino")||turno.equalsIgnoreCase("vespertino")){
                                                            validTurn = false;
                                                        }else{
                                                            System.out.println("Turno invalido \n Ingrese el turno de nuevo: ");
                                                            turno = sc.next();
                                                        }//fin if
                                                    }//fin valid Turn
                                                    //chefs.get(p).setTurno(turno);
                                                
                                                    System.out.println("Ingrese el numero de Estrellas Michelin: ");
                                                    int estrellas = lea.nextInt();
                                                    while(estrellas <0 ){
                                                        System.out.println("No se aceptan numeros negativos \n Ingrese el numero de estrellas: ");
                                                        estrellas = lea.nextInt();
                                                    }//fin valid estrellas
                                                    //chefs.get(p).setEstrellas(estrellas);
                                                    System.out.println("Ingrese el sueldo: ");
                                                    double sueldo = lea.nextDouble();
                                                    while(sueldo < 0.0){
                                                        System.out.println("Porfavor pagale un numero positivo al chef ._.\n ingrese el sueldo: ");
                                                        sueldo = lea.nextDouble();
                                                    }//fin valid sueldo
                                                    //chefs.get(p).setSueldo(sueldo);
                                                    if(turno.equalsIgnoreCase("matutino") && contChefsMatutinos >= 7){
                                                    System.out.println("Numero de chefs matutinos exedido \n No se pudo agregar el chef");
                                                }else if(turno.equalsIgnoreCase("matutino") && contChefsMatutinos < 7){
                                                    chefs.get(p).setNombre(nombre);
                                                    chefs.get(p).setEdad(edad);
                                                    chefs.get(p).setTurno(turno);
                                                    chefs.get(p).setEstrellas(estrellas);
                                                    chefs.get(p).setSueldo(sueldo);
                                                    contChefsMatutinos++;
                                                    System.out.println("Chef Modificado Exitosamente \n");
                                                }else if(turno.equalsIgnoreCase("vespertino") && contChefsVespertinos >= 7){
                                                    System.out.println("Numero de chefs vespertinos exedido \n No se pudo agregar el chef");
                                                }else if(turno.equalsIgnoreCase("vespertino") && contChefsVespertinos < 7){
                                                    chefs.get(p).setNombre(nombre);
                                                    chefs.get(p).setEdad(edad);
                                                    chefs.get(p).setTurno(turno);
                                                    chefs.get(p).setEstrellas(estrellas);
                                                    chefs.get(p).setSueldo(sueldo);
                                                    contChefsVespertinos++;
                                                    System.out.println("Chef Modificado Exitosamente \n");
                                                }//fin if de turnos
                                            }//fin if menor de 1 chef
                                        }//fin case 2
                                        break;
                                        case 3:{
                                            if(contChefsTotal == 0){
                                                System.out.println("Primero ingrese un chef con la opcion 1 antes de eliminar :p");
                                            }else{
                                                System.out.println("=Eliminar Chefs= \n");
                                                PrintChefs(chefs);
                                                System.out.println("Ingrese que chef desea despedir: ");
                                                int p = lea.nextInt();
                                                while(p<=0 || p > chefs.size()){
                                                    System.out.println("Posicion invalida... \n Intentelo de nuevo: ");
                                                    p = lea.nextInt();
                                                }
                                                p--;
                                                if(chefs.get(p).getTurno().equalsIgnoreCase("matutino")){
                                                    contChefsMatutinos--;
                                                }else if(chefs.get(p).getTurno().equalsIgnoreCase("vespertino")){
                                                    contChefsVespertinos--;
                                                }//fin if
                                                contChefsTotal--;
                                                chefs.remove(p);
                                                System.out.println("Chef despedido exitosamente! :(");
                                            }//fin if mas de 1 chef
                                        }//fin case 3
                                        break;
                                        case 4:{
                                            //listar
                                            if(contChefsTotal == 0){
                                                System.out.println("Primero Ingrese un chef");
                                            }else{
                                                PrintChefs(chefs);
                                            }
                                        }//fin case 4
                                        break;
                                        case 5:{
                                            nextChef = false;
                                        }//fin case 5
                                        break;
                                        default:{
                                            System.out.println("Opcion Invalida \nIntentelo de nuevo: ");
                                        }//fin default
                                        break; 
                                    }//fin switch opChef
                                }//fin while nextChef
                            }//fin case chefs
                            break;
                            case 2:{
                                boolean nextMesero = true;
                                while (nextMesero){
                                    System.out.println("""
                                                       =Sub Menu Meseros=
                                                       1.Crear Meseros
                                                       2.Modificar Meseros
                                                       3.Eliminar Meseros
                                                       4.Listar Meseros
                                                       5.Salir sub menu Meseros""");
                                    int opMesero = lea.nextInt();
                                    switch(opMesero){
                                        case 1:{
                                            //crear mesero.
                                            if(contMeserosTotal >= 8 ){
                                                System.out.println("Numero Maximo de Meseros Alcanzado \n Elimine un Mesero antes de poder agregar otro.");
                                            }else{
                                                sc = new Scanner(System.in);
                                                System.out.println("=CREAR Meseros=");
                                                System.out.println("Ingrese el Nombre: ");
                                                String nombre = sc.nextLine();
                                                System.out.println("Ingrese la Edad: ");
                                                int edad = lea.nextInt();
                                                while(edad <= 0){
                                                    System.out.println("Edad invalida \nIntentelo de nuevo");
                                                    edad = lea.nextInt();
                                                }//fin valid edad
                                                System.out.println("Ingrese que turno trabajara: (matutino/vespertino)");
                                                String turno = sc.next();
                                                boolean validTurn = true;
                                                while(validTurn){
                                                    if(turno.equalsIgnoreCase("matutino")||turno.equalsIgnoreCase("vespertino")){
                                                        validTurn = false;
                                                    }else{
                                                        System.out.println("Turno invalido \n Ingrese el turno de nuevo: ");
                                                        turno = sc.next();
                                                    }//fin if
                                                }//fin valid Turn
                                                
                                                System.out.println("Ingrese el sueldo: ");
                                                double sueldo = lea.nextDouble();
                                                while(sueldo < 0.0){
                                                    System.out.println("Porfavor pagale un numero positivo al mesero ._.\n ingrese el sueldo: ");
                                                    sueldo = lea.nextDouble();
                                                }//fin valid sueldo
                                                System.out.println("Ingrese sus propinas: ");
                                                double propinas = lea.nextDouble();                                                
                                                if(turno.equalsIgnoreCase("matutino") && contMeserosMatutinos >= 7){
                                                    System.out.println("Numero de Meseros matutinos exedido \n No se pudo agregar el chef");
                                                }else if(turno.equalsIgnoreCase("matutino") && contMeserosMatutinos < 7){
                                                    Mesero mesero = new Mesero(nombre, edad, turno, sueldo, propinas);
                                                    meseros.add(mesero);
                                                    System.out.println("Mesero agregado Exitosamente! ");
                                                    contMeserosMatutinos++;
                                                    contMeserosTotal++;
                                                }else if(turno.equalsIgnoreCase("vespertino") && contMeserosVespertinos >= 7){
                                                    System.out.println("Numero de Meseros vespertinos exedido \n No se pudo agregar el chef");
                                                }else if(turno.equalsIgnoreCase("vespertino") && contMeserosVespertinos < 7){
                                                    Mesero mesero = new Mesero(nombre, edad, turno, sueldo, propinas);
                                                    meseros.add(mesero);
                                                    System.out.println("Mesero agregado Exitosamente! ");
                                                    contMeserosVespertinos++;
                                                    contMeserosTotal++;
                                                }//fin if de turnos
                                            }//fin meseros total +14
                                        }
                                        break;
                                        case 2:{
                                            //modificar
                                            if(contMeserosTotal == 0){
                                                System.out.println("Primero Ingrese un Mesero con la opcion 1 antes de modificar :p");
                                            }else{
                                                System.out.println("=Modificar Meseros= \n");
                                                System.out.println("Ingrese el Mesero que desea eliminar: ");
                                                PrintMeseros(meseros);
                                                int p = lea.nextInt();
                                                while(p<=0 || p > meseros.size()){
                                                    System.out.println("Posicion invalida... \n Intentelo de nuevo: ");
                                                    p = lea.nextInt();
                                                }
                                                p--;
                                                System.out.println("Ha decidido modificar el Mesero: "+meseros.get(p).getNombre());
                                                if(meseros.get(p).getTurno().equalsIgnoreCase("matutino")){
                                                    contMeserosMatutinos--;
                                                }else if(meseros.get(p).getTurno().equalsIgnoreCase("vespertino")){
                                                    contMeserosVespertinos--;
                                                }//fin if
                                                
                                                System.out.println("Ingrese el nuevo Nombre: ");
                                                    String nombre = sc.nextLine();
                                                    System.out.println("Ingrese la nueva Edad: ");
                                                    int edad = lea.nextInt();
                                                    while(edad <= 0){
                                                        System.out.println("Edad invalida \nIntentelo de nuevo");
                                                        edad = lea.nextInt();
                                                    }//fin valid edad
                                                    
                                                    System.out.println("Ingrese que turno trabajara: (matutino/vespertino)");
                                                    String turno = sc.next();
                                                    boolean validTurn = true;
                                                    while(validTurn){
                                                        if(turno.equalsIgnoreCase("matutino")||turno.equalsIgnoreCase("vespertino")){
                                                            validTurn = false;
                                                        }else{
                                                            System.out.println("Turno invalido \n Ingrese el turno de nuevo: ");
                                                            turno = sc.next();
                                                        }//fin if
                                                    }//fin valid Turn
                                                    
                                                    System.out.println("Ingrese el sueldo: ");
                                                    double sueldo = lea.nextDouble();
                                                    while(sueldo < 0.0){
                                                        System.out.println("Porfavor pagale un numero positivo al mesero hombe ._.\n ingrese el sueldo: ");
                                                        sueldo = lea.nextDouble();
                                                    }//fin valid sueldo
                                                    System.out.println("Ingrese las nuevas propinas: ");
                                                    double propinas = lea.nextDouble();
                                                    while(propinas < 0.0){
                                                        System.out.println("Invalido, tiene que ser positivo\n Intentelo de nuevo: ");
                                                        propinas = lea.nextDouble();
                                                    }
                                                    if(turno.equalsIgnoreCase("matutino") && contMeserosMatutinos >= 4){
                                                    System.out.println("Numero de Meseros matutinos exedido \n No se pudo agregar el Mesero");
                                                }else if(turno.equalsIgnoreCase("matutino") && contMeserosMatutinos < 4){
                                                    meseros.get(p).setNombre(nombre);
                                                    meseros.get(p).setEdad(edad);
                                                    meseros.get(p).setTurno(turno);
                                                    meseros.get(p).setSueldo(sueldo);
                                                    meseros.get(p).setPropina(propinas);
                                                    contMeserosMatutinos++;
                                                    System.out.println("Meseros Modificado Exitosamente \n");
                                                }else if(turno.equalsIgnoreCase("vespertino") && contMeserosVespertinos >= 4){
                                                    System.out.println("Numero de Meseros vespertinos exedido \n No se pudo agregar el Mesero");
                                                }else if(turno.equalsIgnoreCase("vespertino") && contMeserosVespertinos < 4){
                                                    meseros.get(p).setNombre(nombre);
                                                    meseros.get(p).setEdad(edad);
                                                    meseros.get(p).setTurno(turno);
                                                    meseros.get(p).setSueldo(sueldo);
                                                    meseros.get(p).setPropina(propinas);
                                                    contMeserosVespertinos++;
                                                    System.out.println("Mesero Modificado Exitosamente \n");
                                                }//fin if de turnos
                                            }//fin if menor de 1 Mesero
                                        }
                                        break;
                                        case 3:{
                                            if(contMeserosTotal == 0){
                                                System.out.println("Primero ingrese un Mesero con la opcion 1 antes de eliminar :p");
                                            }else{
                                                System.out.println("=Eliminar Meseros= \n");
                                                PrintMeseros(meseros);
                                                System.out.println("Ingrese que Mesero desea despedir: ");
                                                int p = lea.nextInt();
                                                while(p<=0 || p > meseros.size()){
                                                    System.out.println("Posicion invalida... \n Intentelo de nuevo: ");
                                                    p = lea.nextInt();
                                                }
                                                p--;
                                                if(meseros.get(p).getTurno().equalsIgnoreCase("matutino")){
                                                    contMeserosMatutinos--;
                                                }else if(meseros.get(p).getTurno().equalsIgnoreCase("vespertino")){
                                                    contMeserosVespertinos--;
                                                }//fin if
                                                contMeserosTotal--;
                                                meseros.remove(p);
                                                System.out.println("Mesero despedido exitosamente! :(");
                                            }//fin if mas de 1 Mesero
                                        }//fin case 3
                                        break;
                                        case 4:{
                                            if(contMeserosTotal == 0){
                                                System.out.println("Primero ingrese un mesero xd");
                                            }else{
                                               PrintMeseros(meseros); 
                                            }
                                        }
                                        break;
                                        case 5:{
                                            nextMesero = false;
                                        }
                                        break;
                                        default:{
                                            System.out.println("Opcion Invalida\n Intentelo de nuevo: ");
                                        }//fin default
                                    }
                                }//fin while nextMesero
                            }//fin case Meseros
                            break;
                            case 3:{
                                boolean nextBartender = true;
                                while(nextBartender){
                                    System.out.println("""
                                                       =Sub Menu Bartenders=
                                                       1.Crear Bartender
                                                       2.Modificar Bartender
                                                       3.Eliminar Bartender
                                                       4.Listar Bartenders
                                                       5.Salir sub menu Bartenders""");
                                    int opBartender = lea.nextInt();
                                    switch(opBartender){
                                        case 1:{
                                            if(contBartTotal >= 4 ){
                                                System.out.println("Numero Maximo de Bartenders Alcanzado \n Elimine un Mesero antes de poder agregar otro.");
                                            }else{
                                                sc = new Scanner(System.in);
                                                System.out.println("=CREAR Bartenders=");
                                                System.out.println("Ingrese el Nombre: ");
                                                String nombre = sc.nextLine();
                                                System.out.println("Ingrese la Edad: ");
                                                int edad = lea.nextInt();
                                                while(edad <= 0){
                                                    System.out.println("Edad invalida \nIntentelo de nuevo");
                                                    edad = lea.nextInt();
                                                }//fin valid edad
                                                System.out.println("Ingrese que turno trabajara: (matutino/vespertino)");
                                                String turno = sc.next();
                                                boolean validTurn = true;
                                                while(validTurn){
                                                    if(turno.equalsIgnoreCase("matutino")||turno.equalsIgnoreCase("vespertino")){
                                                        validTurn = false;
                                                    }else{
                                                        System.out.println("Turno invalido \n Ingrese el turno de nuevo: ");
                                                        turno = sc.next();
                                                    }//fin if
                                                }//fin valid Turn
                                                
                                                System.out.println("Ingrese el sueldo: ");
                                                double sueldo = lea.nextDouble();
                                                while(sueldo < 0.0){
                                                    System.out.println("Porfavor pagale un numero positivo al Bartender ._.\n ingrese el sueldo: ");
                                                    sueldo = lea.nextDouble();
                                                }//fin valid sueldo
                                                System.out.println("Ingrese la cantidad disponible para este Bartender: ");
                                                int LicorDisp = lea.nextInt();
                                                while(LicorDisp < 0){
                                                    System.out.println("Cantidad invalida \n intentelo de nuevo: ");
                                                    LicorDisp = lea.nextInt();
                                                }
                                                if(turno.equalsIgnoreCase("matutino") && contBartMatutinos >= 2){
                                                    System.out.println("Numero de Bartenders matutinos exedido \n No se pudo agregar el Bartender");
                                                }else if(turno.equalsIgnoreCase("matutino") && contBartMatutinos < 2){
                                                    Bartender bart = new Bartender(nombre, edad, turno, sueldo, LicorDisp);
                                                    bartenders.add(bart);
                                                    System.out.println("Bartender agregado Exitosamente! ");
                                                    contBartMatutinos++;
                                                    contBartTotal++;
                                                }else if(turno.equalsIgnoreCase("vespertino") && contBartVespertinos >= 2){
                                                    System.out.println("Numero de Bartenders vespertinos exedido \n No se pudo agregar el Bartender");
                                                }else if(turno.equalsIgnoreCase("vespertino") && contMeserosVespertinos < 2){
                                                    Bartender bart = new Bartender(nombre, edad, turno, sueldo, LicorDisp);
                                                    bartenders.add(bart);
                                                    System.out.println("Bartender agregado Exitosamente! ");
                                                    contBartVespertinos++;
                                                    contBartTotal++;
                                                }//fin if de turnos
                                            }//fin meseros total +4
                                        }//fin case
                                        break;
                                        case 2:{
                                            if(contBartTotal == 0){
                                                System.out.println("Primero Ingrese un Bartender con la opcion 1 antes de modificar :p");
                                            }else{
                                                System.out.println("=Modificar Bartenders= \n");
                                                System.out.println("Ingrese el Bartender que desea eliminar: ");
                                                PrintBartenders(bartenders);
                                                int p = lea.nextInt();
                                                while(p<=0 || p > bartenders.size()){
                                                    System.out.println("Posicion invalida... \n Intentelo de nuevo: ");
                                                    p = lea.nextInt();
                                                }
                                                p--;
                                                System.out.println("Ha decidido modificar el bartender: "+bartenders.get(p).getNombre());
                                                if(bartenders.get(p).getTurno().equalsIgnoreCase("matutino")){
                                                    contBartMatutinos--;
                                                }else if(bartenders.get(p).getTurno().equalsIgnoreCase("vespertino")){
                                                    contBartVespertinos--;
                                                }//fin if
                                                
                                                System.out.println("Ingrese el nuevo Nombre: ");
                                                    String nombre = sc.nextLine();
                                                    System.out.println("Ingrese la nueva Edad: ");
                                                    int edad = lea.nextInt();
                                                    while(edad <= 0){
                                                        System.out.println("Edad invalida \nIntentelo de nuevo");
                                                        edad = lea.nextInt();
                                                    }//fin valid edad
                                                    
                                                    System.out.println("Ingrese que turno trabajara: (matutino/vespertino)");
                                                    String turno = sc.next();
                                                    boolean validTurn = true;
                                                    while(validTurn){
                                                        if(turno.equalsIgnoreCase("matutino")||turno.equalsIgnoreCase("vespertino")){
                                                            validTurn = false;
                                                        }else{
                                                            System.out.println("Turno invalido \n Ingrese el turno de nuevo: ");
                                                            turno = sc.next();
                                                        }//fin if
                                                    }//fin valid Turn
                                                    
                                                    System.out.println("Ingrese el sueldo: ");
                                                    double sueldo = lea.nextDouble();
                                                    while(sueldo < 0.0){
                                                        System.out.println("Porfavor pagale un numero positivo al barti weon ._.\n ingrese el sueldo: ");
                                                        sueldo = lea.nextDouble();
                                                    }//fin valid sueldo
                                                    System.out.println("Ingrese la nueva cantidad de licores disponible: ");
                                                    int LicorDisp = lea.nextInt();
                                                    while(LicorDisp < 0){
                                                        System.out.println("Tiene que ser positivo jaja \");n intentelo de nuevo:");
                                                        LicorDisp = lea.nextInt();
                                                    }
                                                    if(turno.equalsIgnoreCase("matutino") && contBartMatutinos >= 2){
                                                    System.out.println("Numero de Bartenders matutinos exedido \n No se pudo agregar el Bartender");
                                                }else if(turno.equalsIgnoreCase("matutino") && contBartMatutinos < 2){
                                                    bartenders.get(p).setNombre(nombre);
                                                    bartenders.get(p).setEdad(edad);
                                                    bartenders.get(p).setTurno(turno);
                                                    bartenders.get(p).setSueldo(sueldo);
                                                    bartenders.get(p).setLicoresDisp(LicorDisp);
                                                    contBartMatutinos++;
                                                    System.out.println("Bartender Modificado Exitosamente \n");
                                                }else if(turno.equalsIgnoreCase("vespertino") && contBartVespertinos >= 2){
                                                    System.out.println("Numero de Meseros vespertinos exedido \n No se pudo agregar el Bartender");
                                                }else if(turno.equalsIgnoreCase("vespertino") && contMeserosVespertinos < 2){
                                                    bartenders.get(p).setNombre(nombre);
                                                    bartenders.get(p).setEdad(edad);
                                                    bartenders.get(p).setTurno(turno);
                                                    bartenders.get(p).setSueldo(sueldo);
                                                    bartenders.get(p).setLicoresDisp(LicorDisp);
                                                    contBartVespertinos++;
                                                    System.out.println("Bartender Modificado Exitosamente \n");
                                                }//fin if de turnos
                                            }//fin if menor de 1 bart
                                        }//fin case
                                        break;
                                        case 3:{
                                            if(contBartTotal == 0){
                                                System.out.println("Primero ingrese un Bartender con la opcion 1 antes de eliminar :p");
                                            }else{
                                                System.out.println("=Eliminar Bartenders= \n");
                                                PrintBartenders(bartenders);
                                                System.out.println("Ingrese que Barti desea despedir: ");
                                                int p = lea.nextInt();
                                                while(p<=0 || p > bartenders.size()){
                                                    System.out.println("Posicion invalida... \n Intentelo de nuevo: ");
                                                    p = lea.nextInt();
                                                }
                                                p--;
                                                if(bartenders.get(p).getTurno().equalsIgnoreCase("matutino")){
                                                    contBartMatutinos--;
                                                }else if(bartenders.get(p).getTurno().equalsIgnoreCase("vespertino")){
                                                    contBartVespertinos--;
                                                }//fin if
                                                contMeserosTotal--;
                                                bartenders.remove(p);
                                                System.out.println("Bartender despedido exitosamente! :(");
                                            }//fin if mas de 1 Mesero
                                        }//fin case
                                        break;
                                        case 4:{
                                            if(contBartTotal == 0){
                                                System.out.println("Primero ingrese un bartender xd");
                                            }else{
                                               PrintBartenders(bartenders);
                                            }
                                        }//fin case
                                        break;
                                        case 5:{
                                            nextBartender = false;
                                        }//fin case
                                        break;
                                        default:{
                                            System.out.println("Opcion invalida \n Intentelo de nuevo: ");
                                        }//fin default
                                    }//fin switch
                                }//fin while bar
                            }//fin case Bartenders
                            break;
                            case 4:{
                                boolean nextMesa = true;
                                while(nextMesa){
                                    System.out.println("""
                                                       =Sub Menu Mesas=
                                                       1.Crear Mesa
                                                       2.Modificar Mesa
                                                       3.Eliminar Mesa
                                                       4.Listar Mesas
                                                       5.Listar Precio total
                                                       6.Salir sub menu Mesas""");
                                    int opMesa = lea.nextInt();
                                    switch(opMesa){
                                        case 1:{
                                            if(contMesasTotal >= 10 ){
                                                System.out.println("Numero Maximo de Mesas Alcanzado \n Elimine un Mesero antes de poder agregar otro.");
                                            }else{
                                                sc = new Scanner(System.in);
                                                System.out.println("=CREAR Mesas=");
                                                System.out.println("Ingrese el numero de platos: ");
                                                int platos = lea.nextInt();
                                                while(platos < 0){
                                                    System.out.println("Tiene que ser positivo\n intentelo de nuevo:");
                                                    platos = lea.nextInt();
                                                }
                                                System.out.println("Ingrese el numero de utensilios: ");
                                                int uten = lea.nextInt();
                                                while(uten < 0){
                                                    System.out.println("Tiene que ser positivo\n intentelo de nuevo:");
                                                    uten = lea.nextInt();
                                                }
                                                System.out.println("Ingrese el precio: ");
                                                double precio = lea.nextDouble();
                                                while(precio < 0){
                                                    System.out.println("Tiene que ser positivo\n intentelo de nuevo:");
                                                    precio = lea.nextDouble();
                                                }
                                                Mesa mesa = new Mesa(platos, uten, precio);
                                                mesas.add(mesa);
                                                System.out.println("Mesa agregada exitosamente!");
                                                contMesasTotal++;
                                            }//fin meseros total +4
                                        }//fin case
                                        break;
                                        case 2:{
                                            if(contMesasTotal == 0){
                                                System.out.println("Primero Ingrese una mesa con la opcion 1 antes de modificar :p");
                                            }else{
                                                System.out.println("=Modificar Mesas= \n");
                                                System.out.println("Ingrese la Mesa que desea modificar: ");
                                                PrintMesas(mesas);
                                                int p = lea.nextInt();
                                                while(p<=0 || p > mesas.size()){
                                                    System.out.println("Posicion invalida... \n Intentelo de nuevo: ");
                                                    p = lea.nextInt();
                                                }
                                                p--;
                                                System.out.println("Ha decidido modificar la mesa: "+(p+1));
                                                System.out.println("=modificar Mesas=\n");
                                                
                                            }
                                        }//fin case
                                        break;
                                        case 3:{
                                            
                                        }//fin case
                                        break;
                                        case 4:{
                                            
                                        }//fin case
                                        break;
                                        case 5:{
                                            
                                        }//fin case
                                        break;
                                        case 6:{
                                            nextMesa= false;
                                        }//fin case
                                        break;
                                        default: {
                                            System.out.println("Opcion invalida");
                                        }
                                        break;
                                    }
                                }//fin while
                            }//fin case mesas
                            break;
                            case 5:{
                                next = false;
                            }//fin salir sesion
                            break;
                            default:{
                                System.out.println("Opcion Invalida\nIntentelo de nuevo: ");
                            }
                            break;
                        }//fin switch objetos
                    }//fin while next
                }//fin case 1
                break;
                case 2:{
                   seguir = false; 
                }//fin case 2
                break;
                default: {
                    System.out.println("Opion Invalida\n Intentelo de nuevo: ");
                }//fin default
            }//fin switch
        }//fin while
    }//fin main
    static void PrintChefs(ArrayList <Chefs> c){
        for (int i = 0; i < c.size(); i++) {
            System.out.println("Chef "+(i+1));
            System.out.println(c.get(i).toString());
            System.out.println("");
        }//fin for
    }//fin print chefs
    
    static void PrintMeseros(ArrayList <Mesero> m){
        for (int i = 0; i < m.size(); i++) {
            System.out.println("Mesero "+(i+1));
            System.out.println(m.get(i).toString());
            System.out.println("");
        }//fin for
    }//fin print chefs
    
    static void PrintBartenders(ArrayList <Bartender> b){
        for (int i = 0; i < b.size(); i++) {
            System.out.println("Bartender "+(i+1));
            System.out.println(b.get(i).toString());
            System.out.println("");
        }//fin for
    }//fin print chefs
    
    static void PrintMesas(ArrayList <Mesa> mm){
        for (int i = 0; i < mm.size(); i++) {
            System.out.println("Mesa "+(i+1));
            System.out.println(mm.get(i).toString());
            System.out.println("");
        }//fin for
    }
}//fin clase
