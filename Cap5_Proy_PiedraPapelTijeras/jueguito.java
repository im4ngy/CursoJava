import java.util.Scanner;

public class jueguito {
    private static final String PIEDRA="P";
    private static final String PAPEL="L";
    private static final String TIJERAS="T";

    private static final String[] JUGADAS={PIEDRA, PAPEL, TIJERAS};

    private static final String BIENVENIDA="PIEDRA, PAPEL, TIJERAS\n";
    private static final String PEDIR_JUGADA="Teclea "+PIEDRA+" (piedra), "+PAPEL+" (papel o )"+TIJERAS+" (tijeras) para jugar.\n Suerte ^-^\n";

    private static int comprobacion(String jugada_usuario){
        for(int i=0; i<JUGADAS.length; i++){
            if(jugada_usuario.equalsIgnoreCase(JUGADAS[i])){
                return i;
            }
        }
        return 5;
    }

    private static int jugada_aleatoria(){
        return(int)(Math.random()*JUGADAS.length);
        
    }

    private static int resultado(int jugada_usuario, int jugada_ordenador){
        int resta=jugada_usuario-jugada_ordenador;
        if(resta<0){
            resta=resta+JUGADAS.length;
        }
        return resta;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println(BIENVENIDA);
        String jugada_usuario;
        while(true){
            System.out.println(PEDIR_JUGADA);
            jugada_usuario=scanner.nextLine();
            if(jugada_usuario.equalsIgnoreCase("S")){
                break;
            }
            int jugada_usuario_ent=comprobacion(jugada_usuario);
            if(jugada_usuario_ent==5){
                continue;
            }

            int jugada_ordenador=jugada_aleatoria();

            switch(resultado(jugada_usuario_ent, jugada_ordenador)){
                case 0:
                System.out.println("HAS EMPATADO\n"+JUGADAS[jugada_ordenador]+" empata con "+JUGADAS[jugada_usuario_ent]);
                break;
                case 1:
                System.out.println("HAS GANADO\n"+JUGADAS[jugada_ordenador]+" pierde contra "+JUGADAS[jugada_usuario_ent]);
                break;
                default:
                System.out.println("HAS PERDIDO\n"+JUGADAS[jugada_ordenador]+" gana contra "+JUGADAS[jugada_usuario_ent]);
                break;
            }


            

            
        }

        scanner.close();
    }
}
