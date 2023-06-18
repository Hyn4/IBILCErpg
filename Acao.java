public class Acao<T,V>{
    private T t;
    private V v;

    public Acao(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public Acao(){};

    
    public void setT(T t){
        this.t = t;
    }
    public void setV(V v){
        this.v = v;
    }

    public T getT(){
        return t;
    }

    public V getV(){
        return v;
    }
}