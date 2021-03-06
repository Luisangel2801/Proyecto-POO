import java.util.ArrayList;

public class Heroe extends Personaje{
    private double velocidad;
    private double fuerza;
    private int numVidas;
    private ArrayList<Potenciador> potenciador = new ArrayList<Potenciador>();

    public Heroe(){
    }

    public Heroe(double velocidad, double fuerza,int numVidas) {
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.salud = 100;
        this.numVidas = numVidas;
    }

    public Heroe(String nombre, double salud, double habilidad, double velocidad, double fuerza,int numVidas) {
        super(nombre, salud, habilidad);
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.salud = 100;
        this.numVidas = numVidas;
    }

    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    public double getFuerza() {
        return fuerza;
    }
    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public int getNumVidas() {
        return numVidas;
    }
    public void setNumVidas(int numVidas) {
        this.numVidas = numVidas;
    }

    public ArrayList<Potenciador> getPotenciador() {
        return potenciador;
    }

    public void setPotenciador(ArrayList<Potenciador> potenciador) {
        this.potenciador = potenciador;
    }

    public void equipa(Potenciador p){

    }

    @Override
    public void ataca(Personaje p) {
        if(p instanceof Jefe){

            double valorJefe = p.getHabilidad() + ((Math.random()*101) * ((Jefe) p).getNivel());
            double valorHeroe =  this.habilidad + (this.velocidad + this.fuerza) / 2;
            if( valorJefe > valorHeroe){
                this.salud = this.salud - ((Jefe)p).getArma().getDanio();
            }else{
                p.setSalud(p.getSalud() - this.fuerza);
            }
        }else if(p instanceof Heroe) {
            if(this.habilidad > p.getHabilidad()){

            }
        }
    }

    @Override
    public String toString() {
        return  super.toString() + "Heroe{" +
                "velocidad=" + velocidad +
                ", fuerza=" + fuerza +
                ", numVidas=" + numVidas +
                ", potenciador=" + potenciador +
                "} " + "\n" ;
    }
}
