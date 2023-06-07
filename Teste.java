import java.util.Scanner;

public class Teste {
    private static Scanner scan = new Scanner(System.in);
    private static int exp =1 ;

    public static void main(String[] args){
        Player jogador = new Player();
        Inimigo adversario = new Inimigo();
        CombatManager combate = new CombatManager(jogador, adversario);
        
        
        // while(exp != 0){
        //     exp = scan.nextInt();
        //     jogador.receberExperiencia(exp);
        // }     
        
    }
}
