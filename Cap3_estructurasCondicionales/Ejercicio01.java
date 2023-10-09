public class Ejercicio01 {
    public static void main(String argcs[]){
        if(hasArguments(argcs)){
            System.out.println("Tiene "+longArguments(argcs)+" argumentos" );
            int mes=Integer.valueOf(argcs[0]);
            System.out.println("El mes dado es: "+mes(mes));
        }
        else{
            System.err.println("No tiene argumentos");
        }
        
    }

    private static boolean hasArguments(String argcs[]){
        return (argcs.length!=0);
    }

    private static int longArguments(String argcs[]){
        return argcs.length;
    }

    private static String mes(int n){
        String r="";
        if(n<1 || n >12){
            System.out.println("Eso no es un numero de mes");
        }
        else{
            switch(n){
                case 1:
                    r= "Enero";
                    break;
                case 2:
                    r="Febreor";
                    break;
                default:
                    r="No interesa ese mes";
            }
        }
        return r;
    }

}
