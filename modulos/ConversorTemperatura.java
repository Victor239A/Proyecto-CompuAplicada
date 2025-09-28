package modulos;

public class ConversorTemperatura {
    public double convertir(double valor, String desde, String hacia) {
        double celsius;

        switch (desde) {
            case "C": celsius = valor; break;
            case "F": celsius = (valor - 32) * 5/9; break;
            case "K": celsius = valor - 273.15; break;
            default: return valor;
        }

        switch (hacia) {
            case "C": return celsius;
            case "F": return (celsius * 9/5) + 32;
            case "K": return celsius + 273.15;
            default: return valor;
        }
    }
}
