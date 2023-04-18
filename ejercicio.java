public class ejercicio {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(45);
        persona.setTelefono(311233);
        persona.setNombre("Esteban");
        System.out.println(persona.getNombre());
        System.out.println("la edad de Esteban es: " +persona.getEdad());
        System.out.println("el telefono de Esteban es: " + persona.getTelefono());
        
}
}

class Persona{
    private int edad;
    private int telefono;
    private String nombre;

    public void setEdad(int edad ){
        this.edad = edad;
    }
    public int getEdad(){
    return this.edad;
    }
    public void setTelefono(int telefono ){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}

