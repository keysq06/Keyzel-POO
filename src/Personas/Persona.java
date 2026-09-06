package src.Personas;

import src.Personas.Poderes.*;

public class Persona {
    private byte edad;  
    protected String nombre;
    private double deudasAPagar;
    private IPower power;

    public Persona() { 
        edad = 19;
        nombre = "keyzel segura";
        deudasAPagar = 10000;
    }

    
    public Persona(byte pEdad, String pNombre) {
        this();
        this.edad = pEdad;
        this.nombre = pNombre;
    }

    
    public Persona(String pNombre, byte pEdad) {
        this();
        this.edad = pEdad;
        this.nombre = pNombre;
    }

    public Persona(String nombre) {
        this();
        this.edad = 0; 
        this.nombre = nombre;  
    }

    public String getNombre() {
        return this.nombre;
    }

    
    public byte getEdad() {
        return this.edad;
    }

    public void setEdad(byte pEdad) {
        this.edad = pEdad;
    }

    public void reducirDeudaConIngreso(double pIngreso) {
        System.out.println("Debo "+this.deudasAPagar+ " y le abono "+ pIngreso + " quedo debiendo "+ (this.deudasAPagar-pIngreso));
        this.deudasAPagar -= pIngreso;
        
    }

    public void cantar() {
        
        System.out.println("So I guess that it's true" + "\n" + 
            "Time can heal even the worst of wounds" +"\n" +
            "And the clichés I knew" + "\n" + 
            "Seem so commonplace when I saw you. Olivia Rodrigo");
    }
    
    public void setPower(IPower pPower) {
        this.power = pPower;
    }

    public void atacar() {
        this.power.dispararPoder();
    }
}