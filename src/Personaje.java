public abstract class  Personaje{
    protected String nombre;
    protected double salud;
    protected double habilidad;

    public Personaje(){ }

    public Personaje(String nombre, double habilidad) {
        this.nombre = nombre;
        this.habilidad = habilidad;
    }

    public Personaje(String nombre, double salud, double habilidad) {
        this.nombre = nombre;
        this.salud = salud;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(double habilidad) {
        this.habilidad = habilidad;
    }

    public abstract void ataca(Personaje p);

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
