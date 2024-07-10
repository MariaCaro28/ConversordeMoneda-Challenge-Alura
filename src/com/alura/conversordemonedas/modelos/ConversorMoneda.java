package com.alura.conversordemonedas.modelos;

//Contiene la lógica para realizar la conversión de monedas utilizando la API de conversión.
import com.alura.conversordemonedas.service.ConsultaApi;

public class ConversorMoneda {
    private final ConsultaApi api = new ConsultaApi();

    public double convertir(double monto, String monedaEntrada, String monedaSalida) {
        double tasaConversion = api.obtenerTasaConversion(monedaEntrada, monedaSalida);
        return monto * tasaConversion;
    }
}

