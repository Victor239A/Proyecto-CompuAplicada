package modulos;

public class ConversorVolumen {
    public double convertir(double valor, String desde, String hacia) {
        double litros;

        switch (desde) {
            case "L": litros = valor; break;
            case "mL": litros = valor / 1000; break;
            case "gal": litros = valor * 3.78541; break;
            case "oz": litros = valor * 0.0295735; break;
            case "m³": litros = valor * 1000; break;
            default: return valor;
        }

        switch (hacia) {
            case "L": return litros;
            case "mL": return litros * 1000;
            case "gal": return litros / 3.78541;
            case "oz": return litros / 0.0295735;
            case "m³": return litros / 1000;
            default: return valor;
        }
    }
}
