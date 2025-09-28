package control;

import modulos.ConversorMasa;
import modulos.ConversorMoneda;
import modulos.ConversorTiempo;
import modulos.ConversorLongitud;
import modulos.ConversorTemperatura;
import modulos.ConversorVolumen;
import modulos.ConversorDatos;

public class ControladorConversor {
    private final ConversorMasa conversorMasa = new ConversorMasa();
    private final ConversorMoneda conversorMoneda = new ConversorMoneda();
    private final ConversorTiempo conversorTiempo = new ConversorTiempo();
    private final ConversorLongitud conversorLongitud = new ConversorLongitud();
    private final ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
    private final ConversorVolumen conversorVolumen = new ConversorVolumen();
    private final ConversorDatos conversorDatos = new ConversorDatos();

    public double convertirMasa(double valor, String desde, String hacia) {
        return conversorMasa.convertir(valor, desde, hacia);
    }

    public double convertirMoneda(double valor, String desde, String hacia) {
        return conversorMoneda.convertir(valor, desde, hacia);
    }

    public double convertirTiempo(double valor, String desde, String hacia) {
        return conversorTiempo.convertir(valor, desde, hacia);
    }

    public double convertirLongitud(double valor, String desde, String hacia) {
        return conversorLongitud.convertir(valor, desde, hacia);
    }

    public double convertirTemperatura(double valor, String desde, String hacia) {
        return conversorTemperatura.convertir(valor, desde, hacia);
    }

    public double convertirVolumen(double valor, String desde, String hacia) {
        return conversorVolumen.convertir(valor, desde, hacia);
    }

    public double convertirDatos(double valor, String desde, String hacia) {
        return conversorDatos.convertir(valor, desde, hacia);
    }
}
