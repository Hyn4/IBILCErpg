public class Personagem {
    private String nome;
    private String tag;
    
    public boolean vivo;

    private int vidaMaxima;
    private int vidaAtual;
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    private int ataqueBase = 1;
    private int defesaBase;
    private int velocidade;

    private float multiplicadorAtaque;
    private float multiplicadorDefesa;


    public String getNome() {
        return nome;
    }
    public String getTag() {
        return tag;
    }
    public int getVidaMaxima() {
        return vidaMaxima;
    }
    public float getMultiplicadorAtaque() {
        return multiplicadorAtaque;
    }
    public void setMultiplicadorAtaque(float multiplicadorAtaque) {
        this.multiplicadorAtaque = multiplicadorAtaque;
    }
    public float getMultiplicadorDefesa() {
        return multiplicadorDefesa;
    }
    public void setMultiplicadorDefesa(float multiplicadorDefesa) {
        this.multiplicadorDefesa = multiplicadorDefesa;
    }
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }
    public void setAtaqueBase(int ataqueBase) {
        this.ataqueBase = ataqueBase;
    }
    public void setDefesaBase(int defesaBase) {
        this.defesaBase = defesaBase;
    }
    public int getVidaAtual() {
        return vidaAtual;
    }
    public int getAtaqueBase() {
        return ataqueBase;
    }
    public int getDefesaBase() {
        return defesaBase;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public boolean estaVivo(){
        if(getVidaAtual()<=0) setVivo(false);
        return vivo;
    }

    public Acao<String,Object> turnoNoCombate(){
        return null;
    }

    public int receberDano(float danoPuro){
        
        float dano = danoPuro - ((Float)(getDefesaBase()*getMultiplicadorDefesa()));
        if(dano < 0 ) dano = 0;
        setVidaAtual(getVidaAtual()-Math.round(dano));
        return Math.round(dano);
    }

}
