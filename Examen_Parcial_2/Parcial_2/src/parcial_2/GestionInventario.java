
package parcial_2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GestionInventario extends JFrame implements ActionListener{

    
    //Etiqueta    
     JLabel lblProducto, lblPrecio, lblCantidad;

    // Campos de texto
    JTextField txtProducto , txtPrecio, txtCantidad;

    // Botones
    JButton btnAgregar , btnLimpiar, btnSalir;

    // Área de texto
    JTextArea areaTexto;

    // Barra de navegacion
    JScrollPane scroll;

public GestionInventario() {

        // Título
        setTitle("Gestión de Inventario - Cristian Tejada");

        // Tamaño
        setSize(500, 400);

        // Cerrar programa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout
        setLayout(new GridLayout(5, 2, 10, 10));
    
    
    // Componentes para los productos
        lblProducto = new JLabel("Nombre del Producto:");
        lblPrecio = new JLabel("Precio:");
        lblCantidad = new JLabel("Cantidad:");
        
        txtProducto = new JTextField();
        txtPrecio = new JTextField();
        txtCantidad = new JTextField();
        
        btnAgregar = new JButton("Agregar");
        btnLimpiar = new JButton("Limpiar");
        btnSalir = new JButton("Salir");

        areaTexto = new JTextArea(15, 20);
        areaTexto.setEditable(false);

        scroll = new JScrollPane(areaTexto);
        
        //Agregar los componentes
        add(lblProducto);
        add(txtProducto);

        add(lblPrecio);
        add(txtPrecio);

        add(lblCantidad);
        add(txtCantidad);

        add(btnAgregar);
        add(btnLimpiar);

        add(btnSalir);
        add(scroll);
        
        //Acciones
        btnAgregar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        btnSalir.addActionListener(this);

        // Visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // Boton de agregar
        if (e.getSource() == btnAgregar) {
            try {
                String producto = txtProducto.getText();
                double precio = Double.parseDouble(txtPrecio.getText());
                int cantidad = Integer.parseInt(txtCantidad.getText());
                double total = precio * cantidad;
                areaTexto.append(
                        "Producto: " + producto
                        + "  Precio: $" + precio
                        + "  Cantidad: " + cantidad
                        + "  Total: $" + total + "\n"
                );

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                        this,
                        "Error: Precio y Cantidad deben ser números.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        // Boton de limpiar
        if (e.getSource() == btnLimpiar) {
            txtProducto.setText("");
            txtPrecio.setText("");
            txtCantidad.setText("");
            txtProducto.requestFocus();
        }

        // Boton de salir
        if (e.getSource() == btnSalir) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        new GestionInventario();
    }
}