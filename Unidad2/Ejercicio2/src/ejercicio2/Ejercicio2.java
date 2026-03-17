
package ejercicio2;

import javax.swing.*;
import java.awt.*;

public class Ejercicio2 extends JFrame {
    public Ejercicio2(){
        setTitle("Ejercicio 2");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        setLayout(new BorderLayout());
        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(Color.red);
        panelNorte.add(new JLabel("Norte"));
        
        JPanel panelSur = new JPanel();
        panelSur.setBackground(Color.green);
        panelSur.add(new JLabel("Sur"));
        
        JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.pink);
        panelCentral.add(new JLabel("Centro"));
        
        add(panelNorte,BorderLayout.NORTH);
        add(panelSur,BorderLayout.SOUTH);
        add(panelCentral,BorderLayout.CENTER);
        setVisible(true);
        

        
        


    }

    public static void main(String[] args) {
        new Ejercicio2();

    }
    
}
