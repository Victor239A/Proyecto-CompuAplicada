package views;

import javax.swing.*;
import java.awt.*;
import control.Controlador;
import paneles.PanelMasa;
import paneles.PanelMoneda;
import paneles.PanelTiempo;
import paneles.PanelLongitud;
import paneles.PanelVolumen;
import paneles.PanelDatos;

public class VistaInicial extends JFrame {
    private Controlador controlador;
    private JTextArea historial;

    public VistaInicial() {
        setTitle("Conversor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 650); 
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        //pestañas
        JTabbedPane pestañas = new JTabbedPane(JTabbedPane.TOP); // arriba
        pestañas.setFont(new Font("Arial", Font.BOLD, 16));
        pestañas.setBackground(Color.WHITE);

       
        UIManager.put("TabbedPane.tabAreaInsets", new Insets(10, 40, 0, 40));

        //paneles
        PanelMasa panelMasa = new PanelMasa(this);
        PanelMoneda panelMoneda = new PanelMoneda(this);
        PanelTiempo panelTiempo = new PanelTiempo(this);
        PanelLongitud panelLongitud = new PanelLongitud(this);
        PanelVolumen panelVolumen = new PanelVolumen(this);
        PanelDatos panelDatos = new PanelDatos(this);

        pestañas.addTab("⚖ Masa", panelMasa);
        pestañas.addTab("💰 Moneda", panelMoneda);
        pestañas.addTab("⏳ Tiempo", panelTiempo);
        pestañas.addTab("📏 Longitud", panelLongitud);
        pestañas.addTab("🧪 Volumen", panelVolumen);
        pestañas.addTab("💾 Datos", panelDatos);

        //historial
        historial = new JTextArea(8, 30);
        historial.setEditable(false);
        historial.setFont(new Font("Monospaced", Font.PLAIN, 14));
        historial.setBackground(new Color(250, 250, 250));
        historial.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));

        JScrollPane scrollHistorial = new JScrollPane(historial);
        JPanel panelHistorial = new JPanel(new BorderLayout());
        panelHistorial.setBorder(BorderFactory.createTitledBorder("Historial de conversiones"));
        panelHistorial.add(scrollHistorial, BorderLayout.CENTER);

       
        setLayout(new BorderLayout(10, 10));
        add(pestañas, BorderLayout.CENTER);
        add(panelHistorial, BorderLayout.SOUTH);
    }

    public void establecerControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void agregarAlHistorial(String texto) {
        historial.append(texto + "\n");
    }

    public void mostrar() {
        setVisible(true);
    }
}
