package database;

import java.util.HashMap;
import java.util.Map;

public class ConversorMoneda {

    private static final Map<String, Double> tasas = new HashMap<>();

    static {
        tasas.put("USD", 1.0);      // Dólar base
        tasas.put("EUR", 0.95);     // 1 USD = 0.95 EUR
        tasas.put("MXN", 20.0);     // 1 USD = 20 MXN
        tasas.put("GTQ", 7.8);      // 1 USD = 7.8 Quetzales
    }

    public double convertir(double valor, String desde, String hacia) {
        if (!tasas.containsKey(desde) || !tasas.containsKey(hacia)) {
            return valor;
        }

        // Primero convertir a USD
        double enUSD = valor / tasas.get(desde);
        // Luego convertir a la moneda destino
        return enUSD * tasas.get(hacia);
    }
}
