public class Missao<E extends Inimigo, R extends Item> {


    public boolean done(){
        if((Integer)n<=0){
            return true;
        }else{
            System.out.println("Ainda falta derrotar " + getN() + " " + getE().getTag() + " para completar a missão.");
        } return false;
    }



    
    private String nome;
    private int n;
    private int total;
    private E e;
    private R r;
    
    public Missao(E e, R r, String nome, int total) {
        this.e = e;
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
    public E getE() {
        return e;
    }
    public void setE(E e) {
        this.e = e;
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
