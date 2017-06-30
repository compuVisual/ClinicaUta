/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Diego
 */
public class Conectar {
//    private static Connection conn;
//    private static final String driver = "com.mysql.jdbc.Driver";
//    private static final String user="root";
//    private static final String password = "1234";
//    private static final String url ="jdbc:mysql://localhost:3306/laboratorio";


    Connection connect = null;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/laboratorio", "root", "");//Base de datos,usuario, contraseña
             JOptionPane.showMessageDialog(null, "Conexión correcta");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Fallo conexión. Intentalo más tarde");
        }
        return connect;
    }
}

   