package control;
import modulos.ConversorMasa;
import modulos.ConversorMoneda;
import modulos.ConversorTiempo;

public class ControladorConversor {
    private final ConversorMasa conversorMasa = new ConversorMasa();
    private final ConversorMoneda conversorMoneda = new ConversorMoneda();
    private final ConversorTiempo conversorTiempo = new ConversorTiempo();

    public double convertirMasa(double valor, String desde, String hacia) {
        return conversorMasa.convertir(valor, desde, hacia);
    }

    public double convertirMoneda(double valor, String desde, String hacia) {
        return conversorMoneda.convertir(valor, desde, hacia);
    }

    public double convertirTiempo(double valor, String desde, String hacia) {
        return conversorTiempo.convertir(valor, desde, hacia);
    }
}
