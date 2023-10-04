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
 
 /**hecho por juan*/
 //metodos
 public static void subirHuesped(Huesped huesped){
    sql="INSERT INTO huesped (nombre, apellido, dni, correo, celular, domicilio, estado) VALUES (?,?,?,?,?,?,?)";
     try {
         ps= con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
         
         ps.setString(1, huesped.getNombre());
         ps.setString(2,huesped.getApellido());
         ps.setInt(3, huesped.getDNI());
         ps.setString(4, huesped.getCorreo());
         ps.setInt(5,huesped.getCelular());
         ps.setString(6,huesped.getDomicilio());
         ps.setBoolean(7, huesped.isEstado());
         
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
    /**hecho por tam*/
    public static void actualizarHuesped(Huesped huesped){
         sql="UPDATE alumno SET nombre=?,apellido=?,dni=?,correo=?,celular=?,domicilio=?, estado=? WHERE idHuesped=?";
         try {
             ps=con.prepareStatement(sql);
             ps.setString(1, huesped.getNombre());
             ps.setString(2, huesped.getApellido());
             ps.setInt(3, huesped.getDNI());
             ps.setString(4, huesped.getCorreo());
             ps.setInt(5, huesped.getIdHuesped());
             ps.setString(6, huesped.getDomicilio());
             ps.setBoolean(7, huesped.isEstado());
                     
             ps.setInt(8, huesped.getIdHuesped());


             int f=ps.executeUpdate();

             if(f>0){
                 JOptionPane.showMessageDialog(null, "huesped actulizado correctamente");
                 System.out.println("filas afectadas: "+f);
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "No se pudieron actualizar los datos del huesped");
             System.out.println("Error en la Clase copia_HuespedData, metodo actualizarHuesped "+ ex.getMessage());
         }

     }
    
  //**Hecho por Ariel Lazarte*/
 
 public static void bajarHuesped(int idHuesped) {
     
     try {
         String sql = "UPDATE huesped SET estado = 0 WHERE idHuesped = ? ";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1, idHuesped);
         int fila = ps.executeUpdate();
         
         if (fila == 1) {
             JOptionPane.showMessageDialog(null, "Se ha dado de baja al huesped de la nave nudri");
         }
     } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "*Error*: no se ha podido dar de baja al huesped al ser humano");
     }
     
 }
    
    
    
}


//**PROYECTO AREA 51*/
//**PRIMERA REGLA DEL AREA 51: NUNCA HABLAR DEL AREA 51 (solo esta permitido si vas hablar bien de nosotros, nos vas a dar plata o nos vas a dar una empanada de carne)*/
//**Quisiera una milanesa¨*/
    
      

