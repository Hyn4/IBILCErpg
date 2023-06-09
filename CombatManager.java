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
        jogador.getInventario().getHabilidadeEquipada().reiniciarRecarga();
        if(jogador.getVelocidade() >= adversario.getVelocidade()){
            turno = true;
        }
        
        while(jogador.estaVivo() && adversario.estaVivo()){
            System.out.println("Vida do jogador: " + jogador.getVidaAtual());
            System.out.println("Vida do adversario: " + adversario.getVidaAtual());
            System.out.println("--------------------------------------------------------------------------------------");

            if(turno){
                jogador.ativarHabilidadePassiva();
                acao = jogador.turnoNoCombate();
                adversario.reacaoInimigo(acao);
                jogador.getInventario().getHabilidadeEquipada().decrementarRecarga();//diminui o tempo de recarga da habilidada em 1
                turno = false;
            }else{
                acao = adversario.turnoNoCombate();
                jogador.reacaoJogador(acao);
                turno = true;
            }
        }
        jogador.desativarHabilidadePassiva();

        if(jogador.getVivo()){
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("JOGADOR VENCEU!!!");
            jogador.getMissoes().atualizarMissoes(adversario);
            jogador.receberExperiencia(adversario.getExpRecompensa());
        }else{
            System.out.println("Jogador foi eliminado.");
        }

        //retornar ao mapa
    }
    
    
}
