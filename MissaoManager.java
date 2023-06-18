import java.util.ArrayList;

public class MissaoManager {
    ArrayList<Missao<Habilidade>> missoes = new ArrayList<Missao<Habilidade>>();

    public void adicionarMissao(Missao<Habilidade> missao){
        missoes.add(missao);
    }
    
    public void atualizarMissoes(Inimigo inimigoDerrotado){
        for (Missao<Habilidade> missao : missoes) {
            if(missao.getInimigo() == inimigoDerrotado.getTag()){
                missao.setN(missao.getN()-1);
                if(missao.done()) System.out.println("A missao " + missao.getNome() + " foi concluída! Retorne à quem a requisitou para coletar a recompensa!");
                return;
            }
        }
    }

    public Habilidade completarMissao(Missao<Habilidade> missaoConcluida){
        if(missaoConcluida.done()){
            System.out.println("Recompensa resgatada com sucesso! Você recebeu a habilidade " + missaoConcluida.getR().getNome());
            missoes.remove(missaoConcluida);
            return missaoConcluida.getR();
        }else return null;
    }
}
