public class Personagem {
    private String nome;
    private String tag;
    private boolean vivo;
    private int vidaMaxima;
    private int vidaAtual;
    private int ataqueBase = 1;
    private int defesaBase;
    private int velocidade;
    private float multiplicadorAtaque;
    private float multiplicadorDefesa;

    //Construtor padrao pra quando começar o jogo
    public Personagem(String nome, String tag, int vidaMaxima, int vidaAtual, int velocidade) {
        this.nome = nome;
        this.tag = tag;
        this.vivo = true;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaAtual;
        this.ataqueBase = 1;
        this.defesaBase = 1;
        this.velocidade = velocidade;
        this.multiplicadorAtaque = 1;
        this.multiplicadorDefesa = 1;
    }
    //Construtor completo
    public Personagem(String nome, String tag, boolean vivo, int vidaMaxima, int vidaAtual, int ataqueBase, int defesaBase, int velocidade, float multiplicadorAtaque, float multiplicadorDefesa) {
        this.nome = nome;
        this.tag = tag;
        this.vivo = vivo;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaAtual;
        this.ataqueBase = ataqueBase;
        this.defesaBase = defesaBase;
        this.velocidade = velocidade;
        this.multiplicadorAtaque = multiplicadorAtaque;
        this.multiplicadorDefesa = multiplicadorDefesa;
    }

    public Personagem(){
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public boolean getVivo() { return vivo;}
    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {this.nome = nome;}
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {this.tag = tag;}
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



}
