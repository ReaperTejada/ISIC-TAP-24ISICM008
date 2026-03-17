
package ejercicio3;

import javax.swing.*;
import java.awt.*;

public class Ejercicio3 extends JFrame{
    
    public Ejercicio3 (){
        setTitle("GATOS");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout (3,2,5,5));
        for(int i=1 ; i<=6 ; i++){
            add(new JButton ("Gato" + i));
            
        }
  setVisible(true);
    }
    
    public static void main(String[] args) {
        new Ejercicio3();
    }
}
