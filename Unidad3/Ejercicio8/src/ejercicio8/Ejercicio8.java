
package ejercicio8;
import javax.swing.*;
import java.awt.*;

/**
 * Ejercicio 8: Control de Sistema.
 * Demuestra el uso de JSlider y JProgressBar sincronizados mediante un ChangeListener.
 */
public class Ejercicio8 extends JFrame {
    
    public Ejercicio8() {
        setTitle("Ejercicio 8: Control de Sistema");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        setLocationRelativeTo(null);

        // 1. JSlider: Selección de rango mediante deslizamiento
        JSlider slider = new JSlider(0, 100, 0);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // 2. JProgressBar: Visualización de un estado de carga
        JProgressBar barra = new JProgressBar(0, 100);
        barra.setValue(50);
        barra.setStringPainted(true);

        // Evento: ChangeListener (específico para sliders)
        slider.addChangeListener(e -> {
            int valor = slider.getValue();
            barra.setValue(100 - valor); // Sincroniza la barra con el slider
        });

        // Adición de componentes al frame
        add(new JLabel("Ajuste de Nivel:"));
        add(slider);
        add(barra);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecución en el hilo de despacho de eventos de Swing
            new Ejercicio8();
    }
}
