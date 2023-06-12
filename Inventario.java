
public class Inventario {
    private Habilidade habilidadeEquipada;

    public Habilidade getHabilidadeEquipada() {
        return habilidadeEquipada;
    }

    public Inventario(){
        habilidadeEquipada = new PedacoDePau();
        // habilidadeEquipada.setContadorRecarga(0);
        System.out.println(habilidadeEquipada.getContadorRecarga());
    }

    
}
