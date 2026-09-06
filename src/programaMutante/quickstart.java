package src.programaMutante;

import src.Personas.*;
import src.Poderes.*;
import src.Profesiones.*;

public class quickstart {
    public static void main(String[] args) {
        System.out.println("Hello clase de Poo");

        Persona key = new Persona();
        Persona p1 = new Persona("Keyzel Segura", (byte)19); 

        System.out.println(key.getNombre());
        key.cantar();

        System.out.println("-----------------------------");

        String nombreResultado = p1.getNombre();
        System.out.println(nombreResultado);
        p1.cantar();

        System.out.println("-----------------------------");

        System.out.println("Edad de "+key.getNombre()+ " " +key.getEdad());
        key.setEdad((byte)19);
        System.out.println("Edad de "+key.getNombre()+ " "+key.getEdad());

        System.out.println("-----------------------------");

    
        Persona xyz = p1;
        System.out.println("Edad de "+p1.getNombre()+ " " +p1.getEdad());
        System.out.println("Edad de "+xyz.getNombre()+ " "+xyz.getEdad());

        xyz.setEdad((byte)19);
        System.out.println("Edad de "+p1.getNombre()+ " " +p1.getEdad());

        key = xyz; 

        Abogado nacho = new Abogado("nacho torres", 200);

        nacho.atender(30);
        System.out.println("Ahora "+nacho.getNombre()+ " tiene "+nacho.getDinero());

        nacho.cantar();
 

        System.out.println("Ahora "+nacho.getNombre()+ " tiene "+nacho.getDinero());
        nacho.setNombreFalse();
        System.out.println("Ahora "+nacho.getNombre()+ " tiene "+nacho.getDinero());

        nacho.reducirDeudaConIngreso(1500);

        // probando el poder de la herencia en Persona y el polimorfismo de IPower y de Persona

        Persona profesionales[] = new Persona[10];
        IPower poderesDisponibles[] = {new PoderTiraCorazones(), new PoderTiraDinero()};

        for (int i = 0; i < 10; i++) {
            int tipoProfesion = (int)(Math.random()*3);
            System.out.println(tipoProfesion);
            switch (tipoProfesion) {
                case 0:
                    profesionales[i] = new Abogado("nacho "+i, 40*i);
                    break;
                case 1:
                    profesionales[i] = new Artista("sol "+i, 55);
                    break;
                case 2:
                    profesionales[i] = new Manager("lila"+i, i+10);
                    break;
                default:
                    profesionales[i] = new Abogado("nacho "+i, 40*i);
            }
            profesionales[i].setPower(poderesDisponibles[(int)(Math.random()*2)]);
        }

        for(Persona p : profesionales) {
            System.out.println("Ataca "+p.getNombre());
            p.atacar();
        }
    }
}