
package examnu1u2;

import java.util.Scanner;

public class ExamU1U2 {

    
    public static void main(String[] args) {
        
        Scanner cute = new Scanner(System.in);
        
        System.out.println("Ingrese primer producto adquirido: ");
        String j1 =cute.nextLine();
        System.out.println("Ingrese el precio original: ");
        double precio1 = cute.nextDouble();
       
       cute.nextLine();
       
        System.out.println("Ingre segundo producto adquirido: ");
        String j2 =cute.nextLine();
        System.out.println("Ingrese el precio original: ");
        double precio2 = cute.nextDouble();
      
      cute.nextLine();
      
        System.out.println("Ingrese tercer producto adquirido: ");
        String j3 =cute.nextLine();
        System.out.println("Ingrese el precio original: ");
        double precio3 = cute.nextDouble();
       
       cute.nextLine();
       
        double preciod1 = (precio1*30)/100;
        double preciod2 = (precio2*65)/100;
        double preciod3 = (precio3*15)/100;
        
        double preciof1 = precio1-preciod1;
        double preciof2 = precio2-preciod2;
        double preciof3 = precio3-preciod3;
        
        double preciototal = preciof1+preciof2+preciof3;
        
        cute.close();
        
        System.out.println("El precio final del videojuego1 "+j1+"es: "+preciof1+" pesos");
        System.out.println("El precio final del videojuego2 "+j2+"es: "+preciof2+" pesos");
        System.out.println("El precio final del videojuego3 "+j3+"es: "+preciof3+" pesos");
        System.out.println("El total final de su compra es de: "+preciototal+" pesos");
        System.out.println("Gracias por su compra tkm <3");
        

    }
    
}
