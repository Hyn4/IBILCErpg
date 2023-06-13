public class Biologo extends Inimigo {
    
    public Biologo(){
        super();
    }



    @Override
    public Acao<String,Object> turnoNoCombate(){
        System.out.println("Turno do Biologo");
        return super.inimigoAtacar();
    }
}
