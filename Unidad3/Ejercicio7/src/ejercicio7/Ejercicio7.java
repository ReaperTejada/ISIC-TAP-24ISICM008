
package ejercicio7;
import javax.swing.*;
import java.awt.*;

public class Ejercicio7 extends JFrame {
    public Ejercicio7() {
        setTitle("Ejercicio 7: Manejo de Componentes Graficos");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        // 1. JComboBox: Selección única en lista desplegable
        String[] opciones = {"Pequeña ($50)", "Mediana ($80)", "Grande ($120)"};
        JComboBox<String> comboTamaño = new JComboBox<>(opciones);

        // 2. JCheckBox: Selección múltiple (opcional)
        JCheckBox chkExtra = new JCheckBox("Queso Extra (+$15)");

        // 3. JRadioButton: Selección única entre opciones excluyentes
        // Requiere un ButtonGroup para funcionar correctamente
        JRadioButton rbEfectivo = new JRadioButton("Efectivo", false);
        JRadioButton rbTarjeta = new JRadioButton("Tarjeta");
        ButtonGroup grupoPago = new ButtonGroup();
        grupoPago.add(rbEfectivo);
        grupoPago.add(rbTarjeta);

        JButton btnCalcular = new JButton("Calcular Total");
        
        btnCalcular.addActionListener(e -> {
            int total = 0;
            if(comboTamaño.getSelectedIndex() == 0) total += 50;
            if(comboTamaño.getSelectedIndex() == 1) total += 80;
            if(comboTamaño.getSelectedIndex() == 2) total += 158;
            
            if(chkExtra.isSelected()) total += 15;
            
            String metodo = rbEfectivo.isSelected() ? "Efectivo" : "Tarjeta";
            JOptionPane.showMessageDialog(this, "Total: $" + total + "\nMétodo: " + metodo);
        });

        add(new JLabel(" Seleccione Tamaño:"));
        add(comboTamaño);
        add(chkExtra);
        JPanel pnlPago = new JPanel(); pnlPago.add(rbEfectivo); pnlPago.add(rbTarjeta);
        add(pnlPago);
        add(btnCalcular);

        setVisible(true);
    }


    public static void main(String[] args) {
        new Ejercicio7();
    }
}