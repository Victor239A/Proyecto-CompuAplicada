package modulos;

public class ConversorDatos {
    public double convertir(double valor, String desde, String hacia) {
        double bytes;

        switch (desde) {
            case "B": bytes = valor; break;
            case "KB": bytes = valor * 1024; break;
            case "MB": bytes = valor * 1024 * 1024; break;
            case "GB": bytes = valor * 1024 * 1024 * 1024; break;
            case "TB": bytes = valor * Math.pow(1024, 4); break;
            default: return valor;
        }

        switch (hacia) {
            case "B": return bytes;
            case "KB": return bytes / 1024;
            case "MB": return bytes / (1024 * 1024);
            case "GB": return bytes / (1024 * 1024 * 1024);
            case "TB": return bytes / Math.pow(1024, 4);
            default: return valor;
        }
    }
}
