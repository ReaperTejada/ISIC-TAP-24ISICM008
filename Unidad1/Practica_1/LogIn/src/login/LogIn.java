package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogIn extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LogIn() {
        setTitle("Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(30, 30, 30));

        // Etiqueta usuario
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(50, 80, 100, 25);
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(lblUsuario);

        // Campo usuario
        txtUsuario = new JTextField();
        txtUsuario.setBounds(150, 80, 180, 25);
        panel.add(txtUsuario);

        // Etiqueta contraseña
        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setBounds(50, 120, 100, 25);
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(lblPassword);

        // Campo contraseña
        txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 120, 180, 25);
        panel.add(txtPassword);

        // Botón login
        btnLogin = new JButton("Iniciar sesión");
        btnLogin.setBounds(120, 180, 150, 35);
        btnLogin.setBackground(new Color(0, 153, 255));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
        btnLogin.setBorder(BorderFactory.createLineBorder(Color.RED,3,true));
        panel.add(btnLogin);
        
        btnLogin.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {

        String usuario = txtUsuario.getText();
        String password = String.valueOf(txtPassword.getPassword());

        //Valida si hay datos vacios
        if(usuario.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llena todos los campos");
            //Cambio de color si hay datos vacios
            btnLogin.setBackground(Color.ORANGE);
        
        //Valida si los datos son correctos
        } else if(usuario.equals("Cristian") && password.equals("1234")) {
            //Cambia de color se es correcto el campo
            btnLogin.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Acceso Concedido");
        
        //Valida si los datos son incorrectos
        } else {
            //Cambio de color si los datos son incorrectos
            btnLogin.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            
        }
    }
});
        // Icono de fondo
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/candado.png"));
        
        Image img = icono.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(img);
        JLabel lblIcono = new JLabel(iconoEscalado);
        panel.add(lblIcono);
        lblIcono.setBounds(175, 10, 50, 50);
        setIconImage(icono.getImage());

        add(panel);
    }

    public static void main(String[] args) {
        new LogIn().setVisible(true);
    }
}