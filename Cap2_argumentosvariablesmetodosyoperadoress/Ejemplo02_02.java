public class Ejemplo02_02 {
    public static void main(String args[]){
        int numPeras=Integer.valueOf(args[0]);
        int numManzanas=Integer.valueOf(args[1]);
        int numFruta=numManzanas+numPeras;
        System.out.println("Hay "+numFruta+" piezas de fruta");
    }
}
