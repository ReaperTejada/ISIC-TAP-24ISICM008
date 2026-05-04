package ejerciciof;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EjercicioF extends JFrame{
public EjercicioF(){
       setTitle("EjercicioF: MouseListener");
       setSize(250,200);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new FlowLayout(FlowLayout.CENTER, 20, 40));
       setLocationRelativeTo(null);
       
       JTextField campo = new JTextField(20);
       JLabel contador = new JLabel("Contador: 0");
       
         campo.addKeyListener(new KeyAdapter(){
             @Override
             public void keyReleased(KeyEvent e){
               int total = campo.getText().length();
               contador.setText("Caracteres: " + total);         
             }
         });
       
       add(new JLabel("Escribe algo: "));
       add(campo);
       add(contador);
       
       
     
     
     
     
     
       
       }
          public static void main(String[] args) {
       
        new EjercicioF().setVisible(true);
    
}
}
