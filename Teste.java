public class Teste {
    public static void main(String[] args){
        Player jogador = new Player();
        Biologo adversario = new Biologo();
        Traduteiro adversario2 = new Traduteiro();
        Traduteiro adversario3 = new Traduteiro();
        CombatManager combate = new CombatManager(jogador, adversario);
        CombatManager combate2 = new CombatManager(jogador, adversario2);   
    }
}
