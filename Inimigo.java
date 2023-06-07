public class Inimigo extends Personagem{
    private int expRecompensa;
    private int debuffDano;//reduz o dano do proximo ataque do inimigo quando o jogador usa a acao defesa

    public Inimigo(){
        this.setAtaqueBase(5);
        this.setDefesaBase(2);
        this.setMultiplicadorAtaque(1);
        this.setMultiplicadorDefesa(1);
        this.setVelocidade(5);
        this.setVidaMaxima(20);
        this.setVidaAtual(20);
        this.setVivo(true);
        this.setDebuffDano(0);
        this.expRecompensa = 10;
    }

    public int getDebuffDano() {
        return debuffDano;
    }
    public void setDebuffDano(int debuffDano) {
        this.debuffDano = debuffDano;
    }
    public int getExpRecompensa() {
        return expRecompensa;
    }

    @Override
    public int receberDano(float dano){
        System.out.println("Dano ao adversario: " + super.receberDano(dano));
        return 0;
    }

    public void reacaoInimigo(Acao<String,Object> acao){
        switch(acao.getT()){
            case "ATAQUE": 
                receberDano((Float)acao.getV());
                break;
            case "DEFESA":
                setDebuffDano((int)acao.getV());
                break;
            case "HABILIDADE":
                if(acao.getV() != null){//se for nulo, a hablidade foi acao propria do jogador
                    Acao<String,Object> efeitoHabilidade = (Acao<String,Object>)acao.getV();
                    switch(efeitoHabilidade.getT()){
                        case "REDUCAO_DE_DEFESA":
                            setMultiplicadorDefesa((float)efeitoHabilidade.getV());
                            break;
                        case "DANO":
                            receberDano((int)efeitoHabilidade.getV());
                            break;
                        case "REDUCAO_DE_DANO":
                            setMultiplicadorAtaque((float)efeitoHabilidade.getV());
                            break;
                        //mais habilidades    
                    }   
                }
            
                break;
            case "ITEM":
                //n faz nada eu acho
                break;
            
        }
    }

    @Override
    public Acao<String,Object> turnoNoCombate(){
        Acao<String,Object> turno = new Acao<String,Object>();
        System.out.println("Turno do Adversario");
        turno.setT("ATAQUE");
        turno.setV((getAtaqueBase()*getMultiplicadorAtaque())-getDebuffDano());
        System.out.println(turno.getT());
        return turno;
    }
}
