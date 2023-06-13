public class Inimigo extends Personagem{
    private int expRecompensa;

    public Inimigo(String nome, String tag, boolean vivo, int vidaMaxima, int vidaAtual, int ataqueBase, int defesaBase, int velocidade, float multiplicadorAtaque, float multiplicadorDefesa, int expRecompensa) {
        super(nome, tag, vivo, vidaMaxima, vidaAtual, ataqueBase, defesaBase, velocidade, multiplicadorAtaque, multiplicadorDefesa);
        this.expRecompensa = expRecompensa;
    }

    public int getExpRecompensa() {
        return expRecompensa;
    }

    public void reacaoInimigo(Acao<String,Object> acao){
        switch(acao.getT()){
            case "ATAQUE": 
                //TOMA DANO
                break;
            case "DEFESA":
                //proximo ataque tem dano redusido
                break;
            case "HABILIDADE":
                //pega o efeito da habilidade e age de acordo
                break;
            case "ITEM":
                //n faz nada eu acho
                break;
            
        }
    }
}
