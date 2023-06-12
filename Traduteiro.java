public class Traduteiro extends Inimigo {

    public Traduteiro(){
        super();
    }

    @Override
    public Acao<String,Object> turnoNoCombate(){
        Acao<String,Object> turno = new Acao<String,Object>();
        System.out.println("Turno do Tradutor");
        turno.setT("ATAQUE");
        turno.setV((getAtaqueBase()*getMultiplicadorAtaque())*getDebuffDano());
        setDebuffDano(1);
        System.out.println(turno.getT());
        return turno;
    }
    
}
