public class Biologo extends Inimigo {
    
    public Biologo(){
        super();
    }



    @Override
    public Acao<String,Object> turnoNoCombate(){
        Acao<String,Object> turno = new Acao<String,Object>();
        System.out.println("Turno do Biologo");
        turno.setT("ATAQUE");
        turno.setV((getAtaqueBase()*getMultiplicadorAtaque())*getDebuffDano());
        setDebuffDano(1);
        System.out.println(turno.getT());
        return turno;
    }
}
