package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JTextField txtBase, txtAltura, txtRadio;

    public Main() {
        setTitle("Calculadora de Áreas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 5, 5));

        // Campos
        add(new JLabel("Base:"));
        txtBase = new JTextField();
        add(txtBase);

        add(new JLabel("Altura:"));
        txtAltura = new JTextField();
        add(txtAltura);

        add(new JLabel("Radio:"));
        txtRadio = new JTextField();
        add(txtRadio);

        // Botones
        JButton btnTriangulo = new JButton("Área Triángulo");
        JButton btnRectangulo = new JButton("Área Rectángulo");
        JButton btnCirculo = new JButton("Área Círculo");

        add(btnTriangulo);
        add(btnRectangulo);
        add(btnCirculo);

        // Eventos
        btnTriangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularTriangulo();
            }
        });

        btnRectangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularRectangulo();
            }
        });

        btnCirculo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularCirculo();
            }
        });
    }

    // Metodos de los calculos

    private void calcularTriangulo() {
        try {
            double base = Double.parseDouble(txtBase.getText());
            double altura = Double.parseDouble(txtAltura.getText());

            if (base <= 0 || altura <= 0) {
                throw new IllegalArgumentException("Valores deben ser positivos");
            }

            double area = (base * altura) / 2;
            JOptionPane.showMessageDialog(this, "Área del Triángulo: " + area);

        } catch (NumberFormatException e) {
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Error: Ingresa números válidos");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void calcularRectangulo() {
        try {
            double base = Double.parseDouble(txtBase.getText());
            double altura = Double.parseDouble(txtAltura.getText());

            if (base <= 0 || altura <= 0) {
                throw new IllegalArgumentException("Valores deben ser positivos");
            }

            double area = base * altura;
            JOptionPane.showMessageDialog(this, "Área del Rectángulo: " + area);

        } catch (NumberFormatException e) {
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Error: Ingresa números válidos");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void calcularCirculo() {
        try {
            double radio = Double.parseDouble(txtRadio.getText());

            if (radio <= 0) {
                throw new IllegalArgumentException("El radio debe ser positivo");
            }

            double area = Math.PI * Math.pow(radio, 2);
            JOptionPane.showMessageDialog(this, "Área del Círculo: " + area);

        } catch (NumberFormatException e) {
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Error: Ingresa números válidos");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    // Limpiar campos (Variación 1)
    private void limpiarCampos() {
        txtBase.setText("");
        txtAltura.setText("");
        txtRadio.setText("");
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}

