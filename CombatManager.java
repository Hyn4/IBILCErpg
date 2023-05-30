public class CombatManager{
    private Jogador jogador;
    private Inimigo adversario;
    private boolean turno;

    public CombatManager(Jogador jogador, Inimigo adversario) {
        this.jogador = jogador;
        this.adversario = adversario;
    }

    public void iniciarCombate(){
        if(jogador.getVelocidade() >= adversario.getVelocidade()){
            turno = true;
        }
    
        while(jogador.estaVivo() && adversario.estaVivo()){
            if(turno){
                int acao = jogador.turnoNoCombate();
                if(acao != 0){ //se != 0, o turno foi uma acao externa

                }
                
            }else{
                adversario.turnoNoCombate();
            }
        }


        //SE COLOCAR A OPCAO DE CORRER, TEM QUE MUDAR ESSE IF TAMBEM!!!
        if(jogador.estaVivo()){
            //mensagem: "jogador" venceu a luta!
            jogador.receberExperiencia(adversario.getExpRecompensa());
        }else{

        }

        //retornar ao mapa
    }
    
    
}
