
package Clinica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenerarExcel {
    
    public static void Grabar(String cad, String NombreArchivo)
        {
        File f = new File(NombreArchivo);
        FileWriter fw;
        try {
              fw = new FileWriter(f);
              fw.write(cad);
              fw.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerarExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
    
}
