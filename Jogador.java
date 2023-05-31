public class Jogador extends Personagem{   
    private int experiencia; // mede o progresso ate subir de nivel
    private int nivel; //muda a forca e defesa base do jogador

    //falta o constructor do jogador (comeca com 1 nos atributos base, nivel e multiplicadores, 0 de experiencia)

    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
   
    public Acao<String,Object> turnoNoCombate(){
        Acao<String,Object> turno = new Acao<String,Object>();
        System.out.println("Turno do Jogador");
        int opt=0;
        if(opt==0){//action listener de clicar no botao de ataque
            turno.setT("ATAQUE");
            turno.setV((this.getAtaqueBase()*this.getMultiplicadorAtaque()));
        }else if(opt == 1){//action listener de clicar no botao de defesa
            turno.setT("DEFESA");
            turno.setV(this.getDefesaBase()*this.getMultiplicadorDefesa());
        }else if(opt == 2){//action listener de clicar no botao de habilidade
            turno.setT("HABILIDADE");
            turno.setV("EFEITO");//EFEITO DA HABILIDADE
        }else if(opt == 3){//action listener de clicar no botao de item
            turno.setT("ITEM");
            turno.setV("EFEITO");//EFEITO DO ITEM
        }

        return turno;
    }

    public static void main(String[] args){
        
    }
    

    public void receberExperiencia(int experienca){
        System.out.println("Jogador recebeu "+ experienca + " pontos de experiência!!!");
        experienca += getExperiencia();
        setExperiencia(experienca);
        subirDeNivel();
    }

    private void subirDeNivel(){
        if(experiencia >= nivel*10){
            System.out.println("Jogador subiu de nível!!!");
            System.out.println("Vida Maxima aumentada para: "+ SubirDeNivelVida());
            System.out.println("Ataque aumentado para: " + SubirDeNivelAtaque());
            System.out.println("Defesa aumentada para: "+ SubirDeNivelDefesa());
        }else{
            System.out.println("Faltam " + getExperiencia()%10 + " pontos de experiência para subir de nível!");
        }
    }

    private int SubirDeNivelAtaque(){
        int maisAtaque = this.getAtaqueBase();
        maisAtaque++;
        setAtaqueBase(maisAtaque);
        return maisAtaque;
    }
    private int SubirDeNivelDefesa(){
        int maisDefesa = this.getDefesaBase();
        maisDefesa++;
        setDefesaBase(maisDefesa);
        return maisDefesa;
    }
    private int SubirDeNivelVida(){
        int maisVida = this.getVidaMaxima();
        maisVida++;
        setVidaMaxima(maisVida);
        return maisVida;
    }

   
}
