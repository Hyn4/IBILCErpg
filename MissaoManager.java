import java.util.ArrayList;

public class MissaoManager {
    ArrayList<Missao<Inimigo,Habilidade>> missoes = new ArrayList<Missao<Inimigo,Habilidade>>();

    public void adicionarMissao(Missao<Inimigo,Habilidade> missao){
        missoes.add(missao);
    }
    
    public void atualizarMissoes(Inimigo inimigoDerrotado){
        for (Missao<Inimigo,Habilidade> missao : missoes) {
            if(missao.getE().getTag() == inimigoDerrotado.getTag()){
                missao.setN(missao.getN()-1);
                if(missao.done()) System.out.println("A missao " + missao.getNome() + " foi concluída! Retorne à quem a requisitou para coletar a recompensa!");
                return;
            }
        }
    }

    public Habilidade completarMissao(Missao<Inimigo,Habilidade> missaoConcluida){
        if(missaoConcluida.done()){
            System.out.println("Recompensa resgatada com sucesso! Você recebeu a habilidade " + missaoConcluida.getR().getNome());
            return missaoConcluida.getR();
        }else return null;
    }
}
