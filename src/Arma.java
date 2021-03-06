public class Arma extends Item{

    private double danio = 0;

    public Arma(){ }

    public Arma(String nombre, String descripcion, double salud, double habilidad) {
        super(nombre, descripcion, salud, habilidad);
    }

    public void asignarDanio(int nivel){
        this.danio = 25 * nivel;
    }

    public double getDanio() {
        return danio;
    }


}
