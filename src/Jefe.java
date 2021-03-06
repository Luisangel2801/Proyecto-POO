public class Jefe extends Personaje{
    private int nivel;
    private Arma arma;

    public Jefe(int nivel) {
        this.nivel = nivel;
            if(this.nivel == 1){
                this.salud = 100;
            }else if(this.nivel == 2){
                this.salud = 200;
            }else if(this.nivel == 3){
                this.salud = 300;
            }
        this.arma = new Arma();
            this.arma.asignarDanio(nivel);
    }

    public Jefe(String nombre, double habilidad, int nivel, Arma arma) {
        super(nombre, habilidad);
        this.nivel = nivel;
        if(this.nivel == 1){
            this.salud = 100;
        }else if(this.nivel == 2){
            this.salud = 200;
        }else if(this.nivel == 3){
            this.salud = 300;
        }
        this.arma = new Arma(arma.getNombre(),arma.getDescripcion(), arma.getSalud(), arma.getHabilidad());
        this.arma.asignarDanio(nivel);
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {
        return arma;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void ataca(Personaje p) {
        if(p instanceof Heroe){
            if(this.habilidad > p.habilidad){
                p.setSalud(p.getSalud() - this.arma.getDanio());
            }else{
                this.salud = this.salud - ((Heroe) p).getFuerza();
            }
        }else if(p instanceof Jefe){
            if(this.nivel > ((Jefe) p).nivel){
                ((Jefe) p).setSalud(0);
            }
        }
    }
}
