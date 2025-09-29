import control.Controlador;
import views.VistaInicial;

public class Main {
    public static void main(String[] args) {
       
        Controlador controlador = new Controlador();
        VistaInicial vista = new VistaInicial();
        vista.establecerControlador(controlador);
        vista.mostrar();
    }
}
