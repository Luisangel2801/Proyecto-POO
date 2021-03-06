import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*ArrayList<Personaje> milista = new ArrayList<Personaje>();
        LinkedList<Personaje> p = new LinkedList<Personaje>();

        Potenciador p1 = new Potenciador();

        p1.usar(0);*/

        /*Calculadora cal = new Calculadora();
        System.out.println(cal.div(2,0));

        //Guardar el archivo

        Archivo pj = new Archivo();
        Jefe j = new Jefe(2);
        Heroe h = new Heroe();
        j.ataca(h);*/

        Archivo archivo = new Archivo();
        ArrayList<Heroe> h = archivo.leerHeroe();


        //ArrayList<Potenciador> p = archivo.agregarPotenciador();
        archivo.agregarPotenciador();
        //archivo.agregarPotenciador(h.get(0));
       // System.out.println(h.get(0));
        //System.out.println(h.get(1));

    }
}
