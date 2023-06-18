public class Matematico extends Inimigo {
    private int danoAnterior;
    private int aux;

    private int proximoDano(){//phibonacci
        if(getDanoAnterior() == 0) return 1;
        return getDanoAnterior() + getAux();
    }


    public Matematico(){
        super();
        setAux(0);
        setDanoAnterior(0);
        setNome("Matematico");
        setAtaqueBase(0);
        setDefesaBase(3);
    }

    @Override
    public Acao<String,Object> turnoNoCombate(){
        int dano = proximoDano();
        setAux(danoAnterior);
        setDanoAnterior(dano);
        return new Acao<String,Object>("DANO_REAL",dano);
    }






    public int getDanoAnterior() {
        return danoAnterior;
    }


    public void setDanoAnterior(int danoAnterior) {
        this.danoAnterior = danoAnterior;
    }


    public int getAux() {
        return aux;
    }


    public void setAux(int aux) {
        this.aux = aux;
    }



    
}
