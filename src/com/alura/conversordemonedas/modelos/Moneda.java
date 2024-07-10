package com.alura.conversordemonedas.modelos;
//Es una representación de la estructura de datos devuelta por la API
//de conversión de monedas.
import java.util.Map;

public record Moneda(
        String result,
        String base_code,
        String target_code,
        double conversion_rate,
        Map<String, Double> conversion_rates) {
}