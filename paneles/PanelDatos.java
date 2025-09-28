package paneles;

import views.VistaPrincipal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PanelDatos extends JPanel {
    private VistaPrincipal vista;
    private JTextField campoValor;
    private JComboBox<String> comboDesde, comboHacia;
    private JLabel resultado;

    public PanelDatos(VistaPrincipal vista) {
        this.vista = vista;

        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTitulo = new JLabel("Conversor de Datos Digitales");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(lblTitulo, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++;
        add(new JLabel("Valor:"), gbc);

        campoValor = new JTextField(10);
        gbc.gridx = 1;
        add(campoValor, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(new JLabel("Desde:"), gbc);

        comboDesde = new JComboBox<>(new String[]{"B", "KB", "MB", "GB", "TB"});
        gbc.gridx = 1;
        add(comboDesde, gbc);

        gbc.gridx = 0; gbc.gridy++;
        add(new JLabel("Hacia:"), gbc);

        comboHacia = new JComboBox<>(new String[]{"B", "KB", "MB", "GB", "TB"});
        gbc.gridx = 1;
        add(comboHacia, gbc);

        JButton btnConvertir = new JButton("Convertir");
        gbc.gridx = 0; gbc.gridy++;
        gbc.gridwidth = 2;
        add(btnConvertir, gbc);

        resultado = new JLabel("Resultado: ");
        gbc.gridy++;
        add(resultado, gbc);

        btnConvertir.addActionListener((ActionEvent e) -> {
            try {
                double valor = Double.parseDouble(campoValor.getText());
                String desde = (String) comboDesde.getSelectedItem();
                String hacia = (String) comboHacia.getSelectedItem();

                double res = vista.getControlador().convertirDatos(valor, desde, hacia);
                resultado.setText("Resultado: " + res);
                vista.agregarAlHistorial(valor + " " + desde + " → " + res + " " + hacia);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
