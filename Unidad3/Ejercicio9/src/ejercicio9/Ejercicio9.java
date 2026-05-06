
package ejercicio9;
import javax.swing.*;
import java.awt.*;

/**
 * Ejercicio 9: Lista de Tareas.
 * Demuestra el uso de JList con DefaultListModel para manipulación dinámica
 * de elementos (añadir y eliminar) y el uso de JScrollPane.
 */
public class Ejercicio9 extends JFrame {
    
    public Ejercicio9() {
        setTitle("Ejercicio 9: Lista de Tareas");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // El JList necesita un 'Model' para poder añadir/quitar elementos en tiempo real
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.addElement("Estudiar TAP");
        modelo.addElement("Hacer commit en GitHub");
        modelo.addElement("Revisar rúbricas");
        
        JList<String> lista = new JList<>(modelo);
        //  JList no tiene scroll por sí solo así que lo envolvemos en un JScrollPane
        add(new JScrollPane(lista), BorderLayout.CENTER); 

        JPanel pnlAcciones = new JPanel();
        JTextField txtTarea = new JTextField(12);
        JButton btnAdd = new JButton("+");
        JButton btnDel = new JButton("-");

        // Tooltips para mejorar la experiencia de usuario (UX)
        btnAdd.setToolTipText("Agregar tarea");
        btnDel.setToolTipText("Eliminar tarea seleccionada");

        // Acción para agregar elementos
        btnAdd.addActionListener(e -> {
            String nuevaTarea = txtTarea.getText().trim();
            if(!nuevaTarea.isEmpty()) {
                modelo.add(0, nuevaTarea);
                txtTarea.setText(""); // Limpiar campo después de agregar
                txtTarea.requestFocus();
            }
        });

        // Acción para eliminar elementos seleccionados
        btnDel.addActionListener(e -> {
            int index = lista.getSelectedIndex();
            if(index != -1) {
                modelo.remove(index);
            } else {
                modelo.clear();
                JOptionPane.showMessageDialog(this, "Selecciona un elemento para borrar");
            }
        });

        pnlAcciones.add(txtTarea); 
        pnlAcciones.add(btnAdd); 
        pnlAcciones.add(btnDel);
        
        add(pnlAcciones, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio9().setVisible(true);
        });
    }
}