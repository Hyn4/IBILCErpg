public class CombatManager{
    private Player jogador;
    private Inimigo adversario;
    private boolean turno;
    private Acao<String,Object> acao;

    public CombatManager(Player jogador, Inimigo adversario) {
        this.jogador = jogador;
        this.adversario = adversario;
        iniciarCombate();
    }

    public void iniciarCombate(){
        jogador.ativarHabilidadePassiva();
        jogador.getInventario().getHabilidadeEquipada().reiniciarRecarga();
        if(jogador.getVelocidade() >= adversario.getVelocidade()){
            turno = true;
        }
        
        while(jogador.estaVivo() && adversario.estaVivo()){
            System.out.println("Vida do jogador: " + jogador.getVidaAtual());
            System.out.println("Vida do adversario: " + adversario.getVidaAtual());
            System.out.println("--------------------------------------------------------------------------------------");

            if(turno){
                acao = jogador.turnoNoCombate();
                adversario.reacaoInimigo(acao);
                turno = false;
                jogador.getInventario().getHabilidadeEquipada().decrementarRecarga();//diminui o tempo de recarga da habilidada em 1
            }else{
                acao = adversario.turnoNoCombate();
                jogador.reacaoJogador(acao);
                turno = true;
            }
        }
        jogador.desativarHabilidadePassiva();

        //SE COLOCAR A OPCAO DE CORRER, TEM QUE MUDAR ESSE IF TAMBEM!!!
        if(jogador.estaVivo()){
            System.out.println("JOGADOR VENCEU!!!");
            jogador.receberExperiencia(adversario.getExpRecompensa());
        }else{
            System.out.println("Jogador foi eliminado.");
        }

        //retornar ao mapa
    }
    
    
}
