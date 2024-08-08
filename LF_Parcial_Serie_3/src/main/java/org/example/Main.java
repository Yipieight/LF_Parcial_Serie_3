package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //Se creo una expresion regular para poder validar los campos y se separa cada uno con este caracter '|'
        String regex = "^\\d{13}\\|\\d{8}\\|\\d{15}\\|\\d{10}\\|[a-zA-Z\\s]+\\|\\d{10}\\|[a-zA-Z\\s]+\\|\\d+(\\.\\d{1,2})?\\|[A-Z]{3}$";
        Pattern pattern = Pattern.compile(regex);

        /* Esta expresion regular valida estos campos en este orden:
        -	DPI
        -	Número de teléfono
        -	IMEI del dispositivo
        -	Cuenta Origen
        -	Banco Origen
        -	Cuenta Destino
        -	Banco Destino
        -	Monto
        -	Moneda
        */

        //Se crearon 2 strings y 1 falta para verificar que si se hace match con la expresion regular que se creo y con la otra no
        String[] ejemplos = {
                "1234567890123|12345678|123456789012345|1234567890|Banco Uno|0987654321|Banco Dos|1000.50|USD",
                "9876543210987|87654321|543210987654321|0987654321|Banco Tres|1234567890|Banco Cuatro|250|GTQ",
                "9876543210987|87654321|543210987654321|0987654321|Banco Tres|1234567890|Banco Cuatro|250|EUR"
        };

        for (String ejemplo : ejemplos) {
            Matcher matcher = pattern.matcher(ejemplo);
            if (matcher.matches()) {
                System.out.println("La cadena es válida: " + ejemplo);
            } else {
                System.out.println("La cadena no es válida: " + ejemplo);
            }
        }
    }
}
