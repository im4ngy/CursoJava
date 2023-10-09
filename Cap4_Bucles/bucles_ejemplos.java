public class bucles_ejemplos {
    public static void main(String[] args){
        System.out.println("For each:");
        bucle_for_each(args);
        System.out.println("For:");
        bucle_for(args);
        System.out.println("While:");
        bucle_while(args);
        System.out.println("Do while:");
        bucle_do_while(args);
    }
    private static void bucle_for_each(String[] args){
        for (String s:args){
            System.out.println(s);
        }
    }
    private static void bucle_for(String[] args){
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
    private static void bucle_while(String[] args){
        int i=0;
        while(i<args.length && !args[i].equals("3")){
            System.out.println(args[i]);
            i++;
        }
    }
    private static void bucle_do_while(String[] args){
        int i=0;
        do{
            System.out.println(args[i]);
            i++;
        }while(i<args.length && !args[i].equals("3"));
    }
}
