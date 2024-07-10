package com.alura.conversordemonedas.principal;

//Se encarga de mostrar un menú interactivo al usuario
//para que pueda seleccionar la conversión de monedas que desea realizar.
import com.alura.conversordemonedas.modelos.ConversorMoneda;

import java.util.Scanner;

public class Menu {
    private final Scanner teclado = new Scanner(System.in);
    private final ConversorMoneda conversor = new ConversorMoneda();

    public void muestraElMenu() {
        int opcion = -1;
        while (opcion != 7) {
            String menu = """
                    ********************************************************
                    Sea bienvenido/a al Conversor de Moneda =)
                    
                    1 - Dólar => Peso Argentino.
                    2 - Peso Argentino => Dólar.
                    3 - Dólar => Real Brasileño.
                    4 - Real Brasileño => Dólar.
                    5 - Dólar => Peso Colombiano.
                    6 - Peso Colombiano => Dólar.
                    7 - Salir
                    Por favor, elija una opción válida.
                    ********************************************************
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1 -> convertirMoneda("USD", "ARS");
                case 2 -> convertirMoneda("ARS", "USD");
                case 3 -> convertirMoneda("USD", "BRL");
                case 4 -> convertirMoneda("BRL", "USD");
                case 5 -> convertirMoneda("USD", "COP");
                case 6 -> convertirMoneda("COP", "USD");
                case 7 -> System.out.println("Gracias por usar el conversor de moneda. ¡Adiós!");
                default -> System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        }
    }

    private void convertirMoneda(String monedaEntrada, String monedaSalida) {
        System.out.print("Ingrese la cantidad en " + monedaEntrada + ": ");
        double monto = teclado.nextDouble();
        double result = conversor.convertir(monto, monedaEntrada, monedaSalida);
        System.out.println("Resultado: " + result + " " + monedaSalida + ".");
    }
}

