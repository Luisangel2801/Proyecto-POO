import java.io.*;
import java.util.ArrayList;

public class Archivo {
    public Archivo(){ }

    public ArrayList<Heroe> leerHeroe() {
        ArrayList<Heroe> heroes = new ArrayList<>();

        try {
            FileReader fr = new FileReader("Heroes.txt");
            BufferedReader br = new BufferedReader(fr);
            for (int i = 0; i < 2; i++) {
                Heroe h = new Heroe();
                String linea = br.readLine();

                //INSTANCIO EL NOMBRE
                h.setNombre((linea.substring(linea.indexOf(':') + 2, linea.indexOf(',') - 1)));
                linea = linea.substring(linea.indexOf(',') + 1);

                //INSTANCIO LA SALUD
                h.setSalud(Double.parseDouble(linea.substring(linea.indexOf(':') + 1, linea.indexOf(','))));
                linea = linea.substring(linea.indexOf(',') + 1);

                //INSTANCIO LA HABILIDAD
                h.setHabilidad(Double.parseDouble(linea.substring(linea.indexOf(':') + 1, linea.indexOf(','))));
                linea = linea.substring(linea.indexOf(',') + 1);

                //INSTANCIO LA VELOCIDA
                h.setVelocidad(Double.parseDouble(linea.substring(linea.indexOf(':') + 1, linea.indexOf(','))));
                linea = linea.substring(linea.indexOf(',') + 1);

                //INSTANCIO LA FUERZA
                h.setFuerza(Double.parseDouble(linea.substring(linea.indexOf(':') + 1, linea.indexOf(','))));
                linea = linea.substring(linea.indexOf(',') + 1);

                //INSTANCIO EL NUM VIDAS
                h.setNumVidas (Integer.parseInt (linea.substring(linea.indexOf(':') + 1, linea.indexOf('}'))));

                //AGREGO A LA ARRAY LIST
                heroes.add(h);
            }
            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.err.println("Archivo  \"Heroes.txt\" no encontrado");
        } catch (IOException e) {
            System.err.println("Error en el archivo \"Heroes.txt\"");
        }
        return heroes;
    }

    public ArrayList<Potenciador> agregarPotenciador(){
        ArrayList<Potenciador> potenciadores = new ArrayList<Potenciador>();
        Archivo archivo = new Archivo();
        ArrayList<Heroe> h = archivo.leerHeroe();
        System.out.println("Inicio : " + h.get(0).getPotenciador());
        try {
            FileReader fr = new FileReader("Potenciadores.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            int n = Integer.parseInt(linea);

            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j < n/2 ; j++) {
                    Potenciador p = new Potenciador();
                    linea = br.readLine();

                    //INSTANCIAR NOMBRE
                    p.setNombre(linea.substring(linea.indexOf('=') + 2, linea.indexOf(',') - 1));
                    linea = linea.substring(linea.indexOf(',') + 1);

                    //INSTANCIAR DESCRIPCION
                    p.setDescripcion(linea.substring(linea.indexOf('=') + 2, linea.indexOf(',') - 1));
                    linea = linea.substring(linea.indexOf(',') + 1);

                    //INSTANCIAR SALUD
                    p.setSalud(Double.parseDouble(linea.substring(linea.indexOf('=') + 2, linea.indexOf(',') - 1)));
                    linea = linea.substring(linea.indexOf(',') + 1);

                    //INSTANCIAR HABILIDAD
                    p.setSalud(Double.parseDouble(linea.substring(linea.indexOf('=') + 2, linea.indexOf(',') - 1)));
                    linea = linea.substring(linea.indexOf(',') + 1);

                    //INSTANCIAR FUERZA
                    p.setSalud(Double.parseDouble(linea.substring(linea.indexOf('=') + 2, linea.indexOf(',') - 1)));
                    linea = linea.substring(linea.indexOf(',') + 1);

                    //INSTANCIAR VELOCIDAD
                    p.setSalud(Double.parseDouble(linea.substring(linea.indexOf('=') + 2, linea.indexOf(']') - 1)));

                    potenciadores.add(p);
                }
                System.out.println(potenciadores);
                h.get(i).setPotenciador(potenciadores);
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.err.println("Archivo \"Potenciador.txt\" no encontrado");
        } catch (IOException e) {
            System.err.println("Error en el archivo \"Potenciador.txt\"");
        }
        return potenciadores;
    }
/*
    public ArrayList<Potenciador> agregarPotenciador(Heroe h1){
        ArrayList<Potenciador> potenciadores = new ArrayList<>();
        try {
            FileReader fr = new FileReader("Potenciadores.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();

            int n = Integer.parseInt(linea);

            for (int i = 0; i < n/2; i++) {
                Potenciador p = new Potenciador();
                linea = br.readLine();

                //INSTANCIAR NOMBRE
                p.setNombre(linea.substring(linea.indexOf('=') + 2, linea.indexOf(',') - 1));
                linea = linea.substring(linea.indexOf(',') + 1);

                //INSTANCIAR DESCRIPCION
                p.setDescripcion(linea.substring(linea.indexOf('=') + 2, linea.indexOf(',') - 1));
                linea = linea.substring(linea.indexOf(',') + 1);

                //INSTANCIAR SALUD
                p.setSalud(Double.parseDouble(linea.substring(linea.indexOf('=') + 2, linea.indexOf(',') - 1)));
                linea = linea.substring(linea.indexOf(',') + 1);

                //INSTANCIAR HABILIDAD
                p.setSalud(Double.parseDouble(linea.substring(linea.indexOf('=') + 2, linea.indexOf(',') - 1)));
                linea = linea.substring(linea.indexOf(',') + 1);

                //INSTANCIAR FUERZA
                p.setSalud(Double.parseDouble(linea.substring(linea.indexOf('=') + 2, linea.indexOf(',') - 1)));
                linea = linea.substring(linea.indexOf(',') + 1);

                //INSTANCIAR VELOCIDAD
                p.setSalud(Double.parseDouble(linea.substring(linea.indexOf('=') + 2, linea.indexOf(']') - 1)));

                potenciadores.add(p);
                h1.setPotenciador(potenciadores);
            }


            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.err.println("Archivo \"Potenciador.txt\" no encontrado");
        } catch (IOException e) {
            System.err.println("Error en el archivo \"Potenciador.txt\"");
        }
        return potenciadores;
    }*/



    public void guardarPersonajeCadena(Personaje p){
        try {
            FileWriter fw = new FileWriter("Personaje.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            if (p instanceof Jefe) { // nos permite distinguir si es una instancia de la clase JEFE
                bw.write(" Es un jefe: ");
                Jefe j = (Jefe)p;
                bw.write(j.toString());
                System.out.println(" Jefe");
            } else {
                bw.write("Es un heroe: ");
                System.out.println(" Heroe ");
            }
            bw.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
