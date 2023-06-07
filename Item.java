
public class Item {
    





    public static Acao<String,Object> habilidade(){
        Acao<String,Object> efeito = new Acao<String,Object>();

        efeito.setT("REDUCAO_DE_DEFESA");
        efeito.setV(0.5);

        return efeito;
    }
}
