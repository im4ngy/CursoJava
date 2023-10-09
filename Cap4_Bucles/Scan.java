import java.util.Scanner;

public class Scan {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre=scanner.nextLine();
        System.out.println("Hola, "+nombre+" buenos dias.");
        scanner.close();
    }    
}
