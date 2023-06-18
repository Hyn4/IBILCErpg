public class Missao<N extends Number, E extends Inimigo, R extends Item> {

    public boolean done(){
        if((Integer)n<=0){
            return true;
        }else return false;
    }

    private N n;
    private E e;
    private R r;
    
    public Missao(N n, E e, R r) {
        this.n = n;
        this.e = e;
        this.r = r;
    }

    public N getN() {
        return n;
    }
    public void setN(N n) {
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
}
