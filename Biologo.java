public class Biologo extends Inimigo {
    
    public Biologo(){
        super();
        setNome("Biologo");
        setTag("BIOLOGO");
    }



    @Override
    public Acao<String,Object> turnoNoCombate(){
        System.out.println("Turno do Biologo");
        return super.inimigoAtacar();
    }
}
