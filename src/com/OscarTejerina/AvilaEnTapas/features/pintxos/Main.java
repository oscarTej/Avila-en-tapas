package com.OscarTejerina.AvilaEnTapas.features.pintxos;

import com.OscarTejerina.AvilaEnTapas.features.pintxos.domain.DeletePintxoUseCase;
import com.OscarTejerina.AvilaEnTapas.features.pintxos.domain.Pintxo;
import com.OscarTejerina.AvilaEnTapas.features.pintxos.presentation.MainPintxo;

import java.util.Scanner;

public class Main {

    private static Scanner entrada = new Scanner(System.in);

    public static void Main(String[] args) {
        System.out.println(" hola que tal, eres 1-usuario o 2-establecimiento?");

        int opcion = entrada.nextInt();
        // mientras el numero sea diferente a 1 y 2 no te deja y volvemos a meter el nextint para recoger el dato que se repite el bucle hasta que meta 1 y 2
        while (opcion != 1 && opcion != 2) {
            System.out.println("Opcion no encontrada,eres 1-usuario o 2-establecimiento ");
            opcion = entrada.nextInt();
        }
        switch (opcion) {

            case 1:
                System.out.println("hola ha entrado en el modo usuario: \n1: Consultar todas las tapas. \n2:Consultar ubna tapa especifica");

                int opcionUsuario = entrada.nextInt();

                switch (opcionUsuario) {
                    case 1:
                        //aqui estamos cogiendo dentro dela main pintxos el printxPintxos y que me devuelva todos lsos pintxos
                        MainPintxo.printPintxos();
                        break;
                    case 2:
                        System.out.println(" dame el id del pincho del 1 al 5 ");
                        // aqui estas cogiendo la funcion print pintxo y cogiendo el id que pedimos por scanner
                        MainPintxo.printPintxo(entrada.nextLine());

                        break;
                }
                break;
            case 2:
                System.out.println("hola esta en modo establecimiento pulse una funcion " +
                        "eliminar pintxo (1)\n" +
                        "Ver todos los pintxos (2)\n" +
                        "ver pintxo en especifico(3)\n" +
                        "crear pintxo(4)\n" +
                        "actualizar pintxo (5)\n ");
                int opcionEstablecimiento = entrada.nextInt();

                switch (opcionEstablecimiento) {
                    case 1:


                        System.out.println(" ¿que pintxo desea eliminar ?" +
                                "tosta de solomillo (1)\n" +
                                "secreto (2)\n" +
                                "croquetas(3)\n" +
                                "carpaccio(4)\n" +
                                "preñao (5)\n ");

                        MainPintxo.deletePintxo(entrada.next());


                        break;
                    case 2:
                        MainPintxo.printPintxos();
                        break;
                    case 3:
                        System.out.println("que pintxo desea ver id de 1 al 5 ");

                        MainPintxo.printPintxo(entrada.next());
                        break;

                    case 4:
                        System.out.println("vamos a subir un pintxo dame un id");
                        String idNuevo=entrada.next();
                        System.out.println("Dame uin nombre");
                        String nombreNuevo=entrada.next();
                        System.out.println("Dame los ingredientes");
                        String ingredientesNuevos=entrada.next();
                        System.out.println("Dame una valoracion");
                        String valoracionNuevo=entrada.next();
                        System.out.println("Dime un establecimiento");
                        String establecimientoNuevo=entrada.next();
                        System.out.println("Dame una media");
                        String mediaNuevo =entrada.next();
                        System.out.println("cuantos participantes han participado");
                        String participantesNuevo = entrada.next();
                        System.out.println("numero de votos");
                        String votosNuevos = entrada.next();
                    // hemos creado este objeto de tipo pintxo para que guarde las variables nuevas
                        Pintxo pintxo= new Pintxo(idNuevo,nombreNuevo,ingredientesNuevos,valoracionNuevo,establecimientoNuevo,mediaNuevo,participantesNuevo,votosNuevos);
                        // metemos en el caso de uso create el nuevo pintxo que hemos creado
                        MainPintxo.createPintxo(pintxo);
                        break;
                    case 5:
                        System.out.println("que datos desea modificar");
                        System.out.println("vamos a subir un pintxo dame un id");
                        String idUpdate=entrada.next();
                        System.out.println("Dame uin nombre");
                        String nombreUpdate=entrada.next();
                        System.out.println("Dame los ingredientes");
                        String ingredientesUpdate=entrada.next();
                        System.out.println("Dame una valoracion");
                        String valoracionUpdate=entrada.next();
                        System.out.println("Dime un establecimiento");
                        String establecimientoUpdate=entrada.next();
                        System.out.println("Dame una media");
                        String mediaUpdate =entrada.next();
                        System.out.println("cuantos participantes han participado");
                        String participantesUpdate = entrada.next();
                        System.out.println("numero de votos");
                        String votosUpdate = entrada.next();

                        Pintxo pintxoUpdate= new Pintxo(idUpdate,nombreUpdate,ingredientesUpdate,valoracionUpdate,establecimientoUpdate,mediaUpdate,participantesUpdate,votosUpdate);

                        MainPintxo.updatePintxo(pintxoUpdate);

                        break;
                }
                break;
        }


    }
}
