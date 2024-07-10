package com.alura.conversordemonedas.service;

// Se encarga de interactar con la API, para obtener las tasas de conversión
import com.alura.conversordemonedas.modelos.Moneda;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
    private final Gson gson;

    public ConsultaApi() {
        gson = new Gson();
    }

    public double obtenerTasaConversion(String monedaEntrada, String monedaSalida) {
        String apiKey = "11c96a3c43b72473412a9462";
        String direccion = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaEntrada + "/" + monedaSalida;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Moneda moneda = gson.fromJson(json, Moneda.class);
            return moneda.conversion_rate();
        } catch (IOException | InterruptedException e) {
            System.out.println("Mensaje de error: " + e.getMessage());
        }
        return 0;
    }
}


