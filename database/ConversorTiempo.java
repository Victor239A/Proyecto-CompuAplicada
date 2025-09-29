package database;

public class ConversorTiempo {
    public double convertir(double valor, String desde, String hacia) {
        // Convertimos todo a segundos primero
        double segundos;
        switch (desde) {
            case "h": segundos = valor * 3600; break;
            case "min": segundos = valor * 60; break;
            case "s": segundos = valor; break;
            case "ms": segundos = valor / 1000; break;
            case "d": segundos = valor * 86400; break; // 1 día = 24h
            default: return valor;
        }

        // De segundos a la unidad destino
        switch (hacia) {
            case "h": return segundos / 3600;
            case "min": return segundos / 60;
            case "s": return segundos;
            case "ms": return segundos * 1000;
            case "d": return segundos / 86400;
            default: return valor;
        }
    }
}
