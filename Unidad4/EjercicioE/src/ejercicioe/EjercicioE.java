
package ejercicioe;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;

public class EjercicioE extends JFrame{
    
    public EjercicioE(){
       setTitle("EjercicioE: MouseListener");
       setSize(400,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new GridBagLayout());
       setLocationRelativeTo(null);
       
       
       JLabel etiqueta = new JLabel("Pase el raton por aqui", SwingConstants.CENTER);
       etiqueta.setPreferredSize(new Dimension(300,100));
       etiqueta.setOpaque(true);
       etiqueta.setBackground(Color.YELLOW);
       
       
       
     
         etiqueta.addMouseListener(new MouseAdapter(){
         
             @Override
             public void mouseExited(MouseEvent e){
                etiqueta.setBackground(Color.RED);
            }

             @Override
             public void mouseEntered(MouseEvent e){
                etiqueta.setBackground(Color.GREEN);
            }

         });
       
       
       add(etiqueta);
     
       
       }
          public static void main(String[] args) {
       
        new EjercicioE().setVisible(true);
    
}


}

    

