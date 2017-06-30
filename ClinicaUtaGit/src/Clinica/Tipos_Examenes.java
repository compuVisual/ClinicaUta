
package Clinica;

public class Tipos_Examenes {
    
    
    private int IdTipoE;
    private String NombreExamen;
    private String DescripcionExamen;
    
    public Tipos_Examenes(int IdTipoE, String NombreExamen,String DescripcionExamen) {
    this.IdTipoE = IdTipoE;
    this.NombreExamen = NombreExamen;
    this.DescripcionExamen=DescripcionExamen;
    
    }

      public int getIdTipoExamen() {
        return IdTipoE;
    }

    public void setIdTipoE(int IdTipoE) {
        this.IdTipoE = IdTipoE;
    }

    public String getNombreExamen() {
        return NombreExamen;
    }

    public void setNombreExamen(String NombreExamen) {
        this.NombreExamen = NombreExamen;
    }       
    public String getDescripcionExamen(){
        return DescripcionExamen;
    }
    public void setDescripcionExamen(String DescripcionExamen){
        this.DescripcionExamen=DescripcionExamen;
    }
}
