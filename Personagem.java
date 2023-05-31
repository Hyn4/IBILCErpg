public class Personagem {
    private String nome;
    private String tag;
    
    public boolean vivo;

    private int vidaMaxima;
    private int vidaAtual;
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
        return vivo;
    }


}
