package database;

public class ConversorMasa {
    public double convertir(double valor, String desde, String hacia) {
        // Convertimos todo a kilogramos primero
        double kg;
        switch (desde) {
            case "kg": kg = valor; break;
            case "g": kg = valor / 1000; break;
            case "lb": kg = valor * 0.453592; break;
            case "oz": kg = valor * 0.0283495; break;
            default: return valor;
        }

        // De kilogramos a la unidad destino
        switch (hacia) {
            case "kg": return kg;
            case "g": return kg * 1000;
            case "lb": return kg / 0.453592;
            case "oz": return kg / 0.0283495;
            default: return valor;
        }
    }
}
