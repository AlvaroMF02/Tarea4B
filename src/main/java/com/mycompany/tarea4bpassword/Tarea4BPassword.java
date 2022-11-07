package com.mycompany.tarea4bpassword;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author alvaro
 */
public class Tarea4BPassword {

    public static void main(String[] args) {

        //OPC 1- PIN DE 4 
        for (int i = 0; i < 10; i++) {
            String pin = RandomStringUtils.randomNumeric(4);
            System.out.println(pin);
        }

        System.out.println("*************************************************");

        //OPC 2 - CONTRASEÑAS DE 8 CARACT CON NUM Y LETRAS
        for (int i = 0; i < 10; i++) {
            String passw = RandomStringUtils.randomAlphanumeric(8);
            System.out.println(passw);
        }

        System.out.println("*************************************************");

        //OPC 3 - CONJUNTO ALEA DE LO QUE YO ELIJA
        char[] conjuntoCaract = {'a', 'f', '*', '/', 'ñ'};
        int numero = 6;

        for (int i = 0; i < 10; i++) {
            String passw2 = RandomStringUtils.random(numero, conjuntoCaract);
            System.out.println(passw2);
        }

    }
}
