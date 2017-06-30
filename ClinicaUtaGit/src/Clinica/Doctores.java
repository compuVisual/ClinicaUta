
package Clinica;

public class Doctores {
    
    private long cedula;    
    private String nombre;
    private String telefono;
    private String tipo;   
    private String Examenes;
    private String NombreExamen;
    
    public Doctores(long cedula) {
        this.cedula = cedula;
    }
    
    public Doctores(long cedula, String nombre, String telefono, String tipo, String Examenes) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipo = tipo;       
        this.Examenes = Examenes;        
    }
    
     public Doctores(long cedula, String nombre, String telefono, String tipo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipo = tipo;
    }
        
    public Doctores(long cedula, String nombre, String telefono, String tipo, String Examenes, String NombreExamen) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipo = tipo;
        this.Examenes = Examenes;
        this.NombreExamen = NombreExamen;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getExamenes() {
        return Examenes;
    }

    public void setExamenes(String area) {
        this.Examenes= Examenes;
    }

    public String getNombreExamen() {
        return NombreExamen;
    }

    public void setNombreExamen(String NombreArea) {
        this.NombreExamen = NombreExamen;
    }

}
