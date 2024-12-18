package menuOpciones;

import java.util.Scanner;

public class Opciones {

public int seleccionarOpcion(Scanner teclado){
    int opcion = -1;
    System.out.println("*****************************************");
    System.out.println("    Bienvenido al conversor de monedas \n");
    System.out.println("1 - Dolar  ==> Peso Argentino");
    System.out.println("2 - Peso Argentino  ==>  Dolar");
    System.out.println("3 - Dolar  ==> Real Brasileño");
    System.out.println("4 - Real Brasileño  ==>  Dolar");
    System.out.println("5 - Dolar  ==> Peso Colombiano");
    System.out.println("6 - Peso Colombiano  ==>  Dolar");
    System.out.println("7 - SALIR");
    System.out.println("\n*****************************************");
    System.out.print("\n Seleccione una opcion valida: ");

    try {
        opcion = teclado.nextInt();
        System.out.println(opcion);
    }catch (Exception e){
        System.out.println("Ocurrio un error  en opciones-----------: ");
        e.printStackTrace();
    }


    return opcion;

}

}
