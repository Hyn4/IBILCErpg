public class Jogador extends Personagem{   
    private int progresso; //aumenta em 1 a cada ponto de progresso, controla qual inimigo pode lutar
    private int experiencia; // mede o progresso ate subir de nivel
    private int nivel; //muda a forca e defesa base do jogador

    
    public Turno<String,Integer> turnoNoCombate(){
        
    }
    
    public Turno<String,String> turnoNoCombate(){
        
    }
    

    public void receberExperiencia(int experienca){
        //mensagem: "jogador" recebeu x pontos de experiencia!
        this.experiencia += experienca;
        subirDeNivel();
    }

    private void subirDeNivel(){

    }

    public class Turno<T,V>{

    }
}
