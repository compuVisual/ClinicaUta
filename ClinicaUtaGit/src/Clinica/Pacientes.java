
package Clinica;

public class Pacientes {
    
        
    private long cedula;
    private String  nombre;
    private int edad;
    private String telefono;    
    private String fecha;
    private String hora;
    
    public Pacientes(long cedula){
    this.cedula=cedula;
    }
    
    public Pacientes(long cedula, String nombre, int edad, String telefono, String fecha){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.fecha = fecha;
    }

    public Pacientes(long cedula, String nombre, int edad, String telefono, String fecha, String hora){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.fecha = fecha;
        this.hora = hora;
    }


    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;

    }
}
