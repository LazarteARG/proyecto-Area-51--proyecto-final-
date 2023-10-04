package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Huesped;

public class HuespedData {
   //Atributos
 private static Connection con = Conexion.getConexion();
 private static String sql; 
 private static PreparedStatement ps;
 private static ResultSet rs;
 
 
 //metodos
 public static void subirHuesped(Huesped huesped){
    sql="INSERT INTO huesped (nombre, apellido, dni, correo, celular, domicilio) VALUES (?,?,?,?,?,?)";
     try {
         ps= con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
         
         ps.setString(1, huesped.getNombre());
         ps.setString(2,huesped.getApellido());
         ps.setInt(3, huesped.getDNI());
         ps.setString(4, huesped.getCorreo());
         ps.setInt(5,huesped.getCelular());
         ps.setString(6,huesped.getDomicilio());
         
         ps.executeUpdate();
         rs = ps.getGeneratedKeys();
         if(rs.next()){
           huesped.setIdHuesped(rs.getInt(1));  
           JOptionPane.showConfirmDialog(null, "Huesped agregado con exito.");
         }
         
         
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "No se pudo subir el huesped");
         System.out.println("Error en la Clase HuespedData, metodo subirHuesped "+ ex.getMessage());
     }
 
 }
 
 
    
    
    
}
