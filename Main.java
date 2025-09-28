import control.ControladorConversor;
import views.VistaPrincipal;

public class Main {
    public static void main(String[] args) {
       
        ControladorConversor controlador = new ControladorConversor();
        VistaPrincipal vista = new VistaPrincipal();
        vista.establecerControlador(controlador);
        vista.mostrar();
    }
}
