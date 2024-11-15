/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nmyper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jaman
 */
public class dbconnet {
    private static Connection conn;
    public static Connection getkoneksi(){
        String host ="jdbc:mysql://localhost/apper",
                user ="root",
                pass ="";
        try{
            conn =(Connection)DriverManager.getConnection(host,user,pass);
        }catch(SQLException err)  {
            JOptionPane.showMessageDialog(null,err.getMessage());
            
        }return conn;
    }
    static Object getConnection()  {
        throw new UnsupportedOperationException("Not supported yet.");}
}
