package modulos;

public class ConversorLongitud {
    public double convertir(double valor, String desde, String hacia) {
        // Pasar todo a metros
        double metros;
        switch (desde) {
            case "m": metros = valor; break;
            case "km": metros = valor * 1000; break;
            case "cm": metros = valor / 100; break;
            case "mm": metros = valor / 1000; break;
            case "mi": metros = valor * 1609.34; break;
            case "yd": metros = valor * 0.9144; break;
            case "ft": metros = valor * 0.3048; break;
            case "in": metros = valor * 0.0254; break;
            default: return valor;
        }

        // De metros a destino
        switch (hacia) {
            case "m": return metros;
            case "km": return metros / 1000;
            case "cm": return metros * 100;
            case "mm": return metros * 1000;
            case "mi": return metros / 1609.34;
            case "yd": return metros / 0.9144;
            case "ft": return metros / 0.3048;
            case "in": return metros / 0.0254;
            default: return valor;
        }
    }
}
