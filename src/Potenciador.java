public class Potenciador extends Item{
    private double fuerza;
    private double velocidad;

    public Potenciador(){ }

    public Potenciador(double fuerza, double velocidad) {
        this.fuerza = fuerza;
        this.velocidad = velocidad;
    }

    public Potenciador(String nombre, String descripcion, double salud, double fuerza, double velocidad, double habilidad) {
        super(nombre, descripcion, salud, habilidad);
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.usar(0);
    }

    public double getFuerza() {
        return fuerza;
    }
    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
