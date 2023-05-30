public class Personagem {
    private String nome;
    private String tag;
    public boolean vivo;
    private int vidaMaxima;
    private int vidaAtual;
    private int ataqueBase;
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

    // public int turnoNoCombate(){

    // }

}
