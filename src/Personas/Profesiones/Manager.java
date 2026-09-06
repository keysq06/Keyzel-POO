package src.Personas.Profesiones;

import java.util.Vector;

import src.Personas.Persona;

public class Manager extends Persona {
    private Vector<Abogado> abogados;
    private Vector<Artista> artistas;

    public Manager(String pName, int pEdad) {
        super(pName,(byte)pEdad); // cuando se desea llamar al constructor del padre, se debe hacer solo dentro de otro constructor y debe ser la primer línea de código
        abogados = new Vector<Abogado>();
        artistas = new Vector<Artista>();
    }

    public void contratarAbogado(Abogado pAbogado) {
        abogados.add(pAbogado);
        System.out.println(pAbogado.getNombre()+" ahora trabaja con "+this.getNombre());
    }

    public void contratarArtista(Artista pArtista) {
        artistas.add(pArtista);
        System.out.println(pArtista.getNombre()+" ahora lava para "+this.getNombre());
    }

    // estoy encapsulando al no exponer la lista de dealers, solo retorno la cantidad
    public int getCantidadArtistas() {
        return artistas.size();
    }

    public int getCantidadabogados() {
        return abogados.size();
    }

    //un sabor del polimorfismo
    public void despedir(Persona pPersona) {
        if (pPersona!=null) {
            if (pPersona instanceof Abogado abogado) {
                abogados.remove(abogado);
            } else if (pPersona instanceof Artista artista) {
                artistas.remove(artista);
            }
        }
    }
}