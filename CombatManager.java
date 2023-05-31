public class CombatManager{
    private Player jogador;
    private Inimigo adversario;
    private boolean turno;
    private Acao<String,Object> acao;

    public CombatManager(Player jogador, Inimigo adversario) {
        this.jogador = jogador;
        this.adversario = adversario;
    }

    public void iniciarCombate(){
        if(jogador.getVelocidade() >= adversario.getVelocidade()){
            turno = true;
        }
    
        while(jogador.estaVivo() && adversario.estaVivo()){
            if(turno){
                acao = jogador.turnoNoCombate();
                adversario.reacaoInimigo(acao);

            }else{
                //acao do inimigo
            }
        }


        //SE COLOCAR A OPCAO DE CORRER, TEM QUE MUDAR ESSE IF TAMBEM!!!
        if(jogador.estaVivo()){
            //mensagem: "jogador" venceu a luta!
            jogador.receberExperiencia(adversario.getExpRecompensa());
        }else{
            //jogador perdeu a luta.
        }

        //retornar ao mapa
    }
    
    
}
