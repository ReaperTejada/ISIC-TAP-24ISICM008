
package congruencialineal;


   public class CongruenciaLineal {

    public static void main(String[] args) {

        int a = 5;
        int c = 3;
        int m = 16;
        int xn = 5;

        for (int i = 1; i <= 7; i++) {

            int operacion = (a * xn) + c;
            int mod = operacion % m;
            double un = (double) mod / m;

            System.out.println("Iteracion: " + i);
            System.out.println("Xn = " + xn);
            System.out.println("(5Xn + 3) = " + operacion);
            System.out.println("mod 16 = " + mod);
            System.out.println("Un+1 = " + un);
            System.out.println("- - - - - - - - - -");

            xn = mod;
        }
    }
}


    
    
 