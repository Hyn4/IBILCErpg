public class DentesDeVampiro extends Habilidade {
    public DentesDeVampiro(){
        setNome("Dentes De Vampiro");
        setContadorRecarga(0);
        setTempoDeRecarga(2);
        setEfeito(new Acao<String,Object>());
        getEfeito().setT("VAMPIRISMO");
        getEfeito().setV(5f);
    }
}
