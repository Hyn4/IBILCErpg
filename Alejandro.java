public class Alejandro extends Inimigo {
    public Missao<ErvasMedicinais> primeiraMissao = new Missao<ErvasMedicinais>("BIOLOGO", new ErvasMedicinais(), "Missão do Arboreto", 3);
    public Missao<PedacoDePau> segundaMissao = new Missao<PedacoDePau>("TRADUTOR", new PedacoDePau(), "Missão do Inglês", 3);
    public Missao<DentesDeVampiro> terceiraMissao = new Missao<DentesDeVampiro>("MATEMATICO", new DentesDeVampiro(), "Missão do Phibonacci", 3);

    public Missao<ErvasMedicinais> getPrimeiraMissao() {
        return primeiraMissao;
    }

}
