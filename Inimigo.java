public class Inimigo extends Personagem{
    private int expRecompensa;
    private int contadorTurnos;

    public Inimigo(){
        this.setAtaqueBase(5);
        this.setDefesaBase(2);
        this.setMultiplicadorAtaque(1);
        this.setMultiplicadorDefesa(1);
        this.setVelocidade(5);
        this.setVidaMaxima(20);
        this.setVidaAtual(20);
        this.setVivo(true);
        this.setDebuffDano(1);
        this.expRecompensa = 10;
    public Inimigo(String nome, String tag, boolean vivo, int vidaMaxima, int vidaAtual, int ataqueBase, int defesaBase, int velocidade, float multiplicadorAtaque, float multiplicadorDefesa, int expRecompensa) {
        super(nome, tag, vivo, vidaMaxima, vidaAtual, ataqueBase, defesaBase, velocidade, multiplicadorAtaque, multiplicadorDefesa);
        this.expRecompensa = expRecompensa;
    }

    public int getExpRecompensa() {
        return expRecompensa;
    }
    
  

    @Override
    public int receberDano(float dano){
        System.out.println("Dano ao adversario: " + super.receberDano(dano));
        return 0;
    }

    public Acao<String,Object> inimigoAtacar(){
        Acao<String,Object> turno = new Acao<String,Object>();
        turno.setT("ATAQUE");
        turno.setV((getAtaqueBase()*getMultiplicadorAtaque())*getDebuffDano());
        setDebuffDano(1);
        System.out.println(turno.getT());
        return turno;
    }

    public Acao<String,Object> inimigoDefender(){
        Acao<String,Object> turno = new Acao<String,Object>();
        turno.setT("DEFESA");
        turno.setV(0.5f);
        setDebuffDano(1);
        System.out.println(turno.getT());
        return turno;
    } 

    public void reacaoInimigo(Acao<String,Object> acao){
        switch(acao.getT()){
            case "ATAQUE": 
                receberDano((Float)acao.getV());
                break;
            case "DEFESA":
                setDebuffDano((Float)acao.getV());
                break;
            case "HABILIDADE":
                if(acao.getV() != null){//se for nulo, a hablidade foi acao propria do jogador
                    Acao<String,Object> efeitoHabilidade = (Acao<String,Object>)acao.getV();
                    switch(efeitoHabilidade.getT()){
                        case "REDUCAO_DE_DEFESA":
                            setMultiplicadorDefesa((Float)efeitoHabilidade.getV());
                            System.out.println("Defesa do adversario diminuida pela metade!!!");
                            break;
                        case "DANO":
                            receberDano((Float)efeitoHabilidade.getV());
                            break;
                        case "REDUCAO_DE_DANO":
                            setMultiplicadorAtaque((Float)efeitoHabilidade.getV());
                            break;
                        case "VAMPIRISMO":
                            receberDano((Float)efeitoHabilidade.getV());
                            break;
                    }
                }
            
                break;
            case "ITEM":
                //n faz nada eu acho
                break;
            
        }
    }

    public void incrementarContadorTurnos(){
        setContadorTurnos(getContadorTurnos()+1);
    }

    public int getContadorTurnos() {
        return contadorTurnos;
    }

    public void setContadorTurnos(int contadorTurnos) {
        this.contadorTurnos = contadorTurnos;
    }

    public int getExpRecompensa() {
        return expRecompensa;
    }

   
}
