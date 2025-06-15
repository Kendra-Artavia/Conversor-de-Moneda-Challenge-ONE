package org.example.model;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConversorMonedas {

    public Monedas obtenerTasas(String monedaBase) {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/fdedd2a77392a0a967fdb2b5/latest/" + monedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo recibir el recurso", e);
        }
    }

    public void verMenu() {
        System.out.println("""
            ╔══════════════════════════════════════════════════════════════╗
            ║              BIENVENIDO AL SISTEMA DE CONVERSOR DE MONEDAS   ║
            ╠══════════════════════════════════════════════════════════════╣
            ║  1) Dólar (USD)           → Colón Costarricense (CRC)        ║
            ║  2) Colón Costarricense   → Dólar (USD)                      ║
            ║  3) Dólar (USD)           → Peso Argentino (ARS)             ║
            ║  4) Peso Argentino        → Dólar (USD)                      ║
            ║  5) Dólar (USD)           → Real Brasileño (BRL)             ║
            ║  6) Real Brasileño        → Dólar (USD)                      ║
            ║  7) Dólar (USD)           → Peso Colombiano (COP)            ║
            ║  8) Peso Colombiano       → Dólar (USD)                      ║
            ║  9) Salir                                                    ║
            ╚══════════════════════════════════════════════════════════════╝
            """);
    }


    public void convertir(int opcion, double cantidad) {
        String base = obtenerMonedaBase(opcion);
        String destino = obtenerMonedaDestino(opcion);

        if (base == null || destino == null) {
            System.out.println("Opción inválida.");
            return;
        }

        Monedas tasas = obtenerTasas(base);
        Double tasa = tasas.getConversion_rates().get(destino);

        if (tasa == null) {
            System.out.println("No se encontró la tasa para " + destino);
            return;
        }

        double resultado = cantidad * tasa;
        System.out.printf("El valor %.2f [%s] equivale a %.2f [%s]%n", cantidad, base, resultado, destino);
    }

    private String obtenerMonedaBase(int opcion) {
        return switch (opcion) {
            case 1, 3, 5, 7 -> "USD";
            case 2 -> "CRC";
            case 4 -> "ARS";
            case 6 -> "BRL";
            case 8 -> "COP";
            default -> null;
        };
    }

    private String obtenerMonedaDestino(int opcion) {
        return switch (opcion) {
            case 1 -> "CRC";
            case 2 -> "USD";
            case 3 -> "ARS";
            case 4 -> "USD";
            case 5 -> "BRL";
            case 6 -> "USD";
            case 7 -> "COP";
            case 8 -> "USD";
            default -> null;
        };
    }
}
