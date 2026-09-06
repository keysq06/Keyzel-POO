package src.Personas.Profesiones;

import src.Personas.Persona;

public class Abogado extends Persona {
    private int cantidadCasos;
    private final int PRECIO_CASO = 2000; 
    private final double IMP_VENTAS = 0.13;
    private int dinero;
    private String nombresAbogados[] = {"Nacho", "lila","sol"};

    public Abogado(String pName, int pCantidadCasos) {
        this.nombre = pName;
        this.cantidadCasos = pCantidadCasos;
        this.dinero = 0;
    }

    public int atender(int pCantidad) {
        int atendido = 0;
        if (pCantidad<=this.cantidadCasos) {
            atendido = pCantidad;
        } else {
            atendido = this.cantidadCasos;
        }

        //this.dinero = this.dinero + (pCantidad * PRECIO_DROGA);
        this.dinero += atendido * PRECIO_CASO; 
        this.cantidadCasos -= atendido;

        System.out.println("Otro cliente feliz con "+atendido+" de servicio.");
        return atendido;
    }

    public int getDinero(){
        return this.dinero;

    }

    public void setNombreFalse(){
    this.nombre = nombresAbogados[(int)(Math.random() * 3)];
    }

    @Override
    public void reducirDeudaConIngreso(double pIngreso){
        pIngreso -= pIngreso*IMP_VENTAS;
        super.reducirDeudaConIngreso(pIngreso);

    }

    public void defender() {
        System.out.println("Voy a juicio....");
    }
}
