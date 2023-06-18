public class Missao<R extends Item> {


    public boolean done(){
        if((Integer)n<=0){
            return true;
        }else{
            System.out.println("Ainda falta derrotar " + getN() + " " + getInimigo() + " para completar a missão.");
        } return false;
    }



    
    private String nome;
    private int n;
    private int total;
    private String inimigo;
    private R r;
    
    public Missao(String inimigo, R r, String nome, int total) {
        this.inimigo = inimigo;
        this.r = r;
        this.nome = nome;
        this.total = total;
        this.n = total;
    }

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public String getInimigo() {
        return inimigo;
    }
    public void setE(String e) {
        this.inimigo = e;
    }
    public R getR() {
        return r;
    }
    public void setR(R r) {
        this.r = r;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    

}
