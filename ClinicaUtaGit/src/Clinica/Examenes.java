
package Clinica;

import java.util.Date;

public class Examenes {
    
    private long CedPac;  
    private String NomPac;
    private String NomDoc;
    private long CedDoc;
    private String Tipo;
    private Date FechaExamen;

    public Examenes(long CedPac, String NomPac, String NomDoc, long CedDoc, String Tipo, Date FechaExamen) {
        this.CedPac = CedPac;
        this.NomPac = NomPac;
        this.NomDoc = NomDoc;
        this.CedDoc = CedDoc;
        this.Tipo = Tipo;
        this.FechaExamen = FechaExamen;
    }
        
    public Examenes(long CedPac) {
        this.CedPac = CedPac;
    }                   

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Date getFechaExamen() {
        return FechaExamen;
    }

    public void setFechaExamen(Date FechaExamen) {
        this.FechaExamen = FechaExamen;
    }    

    public long getCedPac() {
        return CedPac;
    }

    public void setCedPac(long CedPac) {
        this.CedPac = CedPac;
    }

    public String getNomPac() {
        return NomPac;
    }

    public void setNomPac(String NomPac) {
        this.NomPac = NomPac;
    }

    public String getNomDoc() {
        return NomDoc;
    }

    public void setNomDoc(String NomDoc) {
        this.NomDoc = NomDoc;
    }

    public long getCedDoc() {
        return CedDoc;
    }

    public void setCedDoc(long CedDoc) {
        this.CedDoc = CedDoc;
    }

    public Examenes(long CedPac, String NomPac, String NomDoc, long CedDoc) {
        this.CedPac = CedPac;
        this.NomPac = NomPac;
        this.NomDoc = NomDoc;
        this.CedDoc = CedDoc;
    }
      
}