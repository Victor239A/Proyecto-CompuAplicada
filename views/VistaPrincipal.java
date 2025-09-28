package views;

import javax.swing.*;
import java.awt.*;
import control.ControladorConversor;
import paneles.PanelMasa;
import paneles.PanelMoneda;
import paneles.PanelTiempo;
import paneles.PanelLongitud;
import paneles.PanelTemperatura;
import paneles.PanelVolumen;
import paneles.PanelDatos;

public class VistaPrincipal extends JFrame {
    private ControladorConversor controlador;
    private JTextArea historial;

    public VistaPrincipal() {
        setTitle("Conversor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 650); // ventana un poco más grande
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(245, 245, 245));

        // Pestañas
        JTabbedPane pestañas = new JTabbedPane(JTabbedPane.TOP); // arriba
        pestañas.setFont(new Font("Arial", Font.BOLD, 16));
        pestañas.setBackground(Color.WHITE);

        // Centrar y dar más espacio entre pestañas
        UIManager.put("TabbedPane.tabAreaInsets", new Insets(10, 40, 0, 40));

        // Paneles
        PanelMasa panelMasa = new PanelMasa(this);
        PanelMoneda panelMoneda = new PanelMoneda(this);
        PanelTiempo panelTiempo = new PanelTiempo(this);
        PanelLongitud panelLongitud = new PanelLongitud(this);
        PanelTemperatura panelTemperatura = new PanelTemperatura(this);
        PanelVolumen panelVolumen = new PanelVolumen(this);
        PanelDatos panelDatos = new PanelDatos(this);

        pestañas.addTab("⚖ Masa", panelMasa);
        pestañas.addTab("💰 Moneda", panelMoneda);
        pestañas.addTab("⏳ Tiempo", panelTiempo);
        pestañas.addTab("📏 Longitud", panelLongitud);
        pestañas.addTab("🌡 Temperatura", panelTemperatura);
        pestañas.addTab("🧪 Volumen", panelVolumen);
        pestañas.addTab("💾 Datos", panelDatos);

        // Historial
        historial = new JTextArea(8, 30);
        historial.setEditable(false);
        historial.setFont(new Font("Monospaced", Font.PLAIN, 14));
        historial.setBackground(new Color(250, 250, 250));
        historial.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));

        JScrollPane scrollHistorial = new JScrollPane(historial);
        JPanel panelHistorial = new JPanel(new BorderLayout());
        panelHistorial.setBorder(BorderFactory.createTitledBorder("Historial de conversiones"));
        panelHistorial.add(scrollHistorial, BorderLayout.CENTER);

        // Layout principal
        setLayout(new BorderLayout(10, 10));
        add(pestañas, BorderLayout.CENTER);
        add(panelHistorial, BorderLayout.SOUTH);
    }

    public void establecerControlador(ControladorConversor controlador) {
        this.controlador = controlador;
    }

    public ControladorConversor getControlador() {
        return controlador;
    }

    public void agregarAlHistorial(String texto) {
        historial.append(texto + "\n");
    }

    public void mostrar() {
        setVisible(true);
    }
}
