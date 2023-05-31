public class Inimigo extends Personagem{
    private int expRecompensa;

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
