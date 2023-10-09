public class Ejemplo02_04 {
    public static void main(String args[]){
        int a=Integer.valueOf(args[0]), b=Integer.valueOf(args[1]);
        System.out.println(suma(a,b));
    }

    private static int suma(int a, int b){
        return (a+b);
    }

}
