package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Habitacion;

public class HabitacionDataBORRADOR {
    //Atributos
 private static Connection con = Conexion.getConexion();
 private static String sql; 
 private static PreparedStatement ps;
 private static ResultSet rs;
 
 

public static void subirHabitacion(Habitacion habitacion){
   sql="INSERT INTO habitacion (idCategoria, piso, estado) VALUES (?,?,?)";
 try{
   ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
   
   ps.setInt(1,habitacion.getIdCategoria());
   ps.setInt(2,habitacion.getPiso());
   ps.setInt(3, habitacion.getEstado());
   
   
   ps.executeUpdate();
   rs = ps.getGeneratedKeys();
   
   if(rs.next()){
    habitacion.setIdCategoria(1);
    JOptionPane.showConfirmDialog(null,"Habitación agregada con exito");
    }
 }catch(SQLException ex){
     JOptionPane.showMessageDialog(null, "Error al subir la habitación");
     System.out.println("Error clase HabitaciónData metodo subirHabitacion "+ex.getMessage());
 }
}
 
public static void actualizarHabitacion(Habitacion habitacion){
    sql="UPDATE habitacion SET idCategoria=?, piso=?, estado? VALUES (?,?,?) WHERE idHabitacion = ?";
    try{
      ps = con.prepareStatement(sql);
              
      ps.setInt(1, habitacion.getIdCategoria());
      ps.setInt(2, habitacion.getPiso());
      ps.setInt(3, habitacion.getEstado());
      
      ps.setInt(4,habitacion.getIdHabitacion());
      int f = ps.executeUpdate();
      
      if(f>0){
        JOptionPane.showConfirmDialog(null, "Habitación modificada con exito");
          System.out.println("Filas afectadas: "+f);
      }
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"Error al actualizar la habitación");
        System.out.println("Error en la Clase HabitacionData metodo actualizarHabitacion() "+ex.getMessage());
    }
}

 //int idHabitacion, int idCategoria, int piso, int estado)

public static void bajarHabitacion(int idHabitacion){
    sql="UPDATE habitacion SET estado = 0 WHERE idHuesped = ? ";
    try{
    ps = con.prepareStatement(sql);
    ps.setInt(1, idHabitacion);
    
    int fila = ps.executeUpdate();
    if(fila == 1){
        JOptionPane.showMessageDialog(null, "Se ha dado de baja la habitación exitosamente");
    }
    
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al dar de baja habitación");
        System.out.println("Error en la clase HabitacionData metodo bajarHabitación() "+ex.getMessage());
}

}



public static ArrayList<Habitacion> listaHabitaciones(){
 ArrayList <Habitacion> lista =  new ArrayList<>();
 sql = "SELECT * FROM habitacion";
 try{
   ps = con.prepareStatement(sql);
   rs = ps.executeQuery();
   
   while(rs.next()){
     Habitacion habitacion = new Habitacion();
     habitacion.setIdHabitacion(rs.getInt(1));
     habitacion.setIdCategoria(rs.getInt(2));
     habitacion.setPiso(3);
     habitacion.setEstado(rs.getInt(4));
     
     lista.add(habitacion);
   }
 }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Error al obtener lista de todas las habitaciones");
     System.out.println("Error en la clase HabitacionData metodo listaDeHabitaciones() "+ex.getMessage());
 }
 return lista;   
}


public static ArrayList<Habitacion> listaHabitacionesActivas(){
  ArrayList <Habitacion> lista =  new ArrayList<>();
  sql = "SELECT * FROM habitacio WHERE estado = 1";
  try{
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();
    
     while(rs.next()){
     Habitacion habitacion = new Habitacion();
     habitacion.setIdHabitacion(rs.getInt(1));
     habitacion.setIdCategoria(rs.getInt(2));
     habitacion.setPiso(3);
     habitacion.setEstado(rs.getInt(4));
     
     lista.add(habitacion);
   }
    
  }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Error al cargar la lista de habitaciones activas");
      System.out.println("Error en las clase HabitacionData metodo listaHabitacionesActivas() "+ex.getMessage());
  }
    
 return lista;   
}

public static ArrayList<Habitacion> listaHabitacionesBajas(){
  ArrayList <Habitacion> lista =  new ArrayList<>();
  sql = "SELECT * FROM habitacio WHERE estado = 0";
  try{
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();
    
     while(rs.next()){
     Habitacion habitacion = new Habitacion();
     habitacion.setIdHabitacion(rs.getInt(1));
     habitacion.setIdCategoria(rs.getInt(2));
     habitacion.setPiso(3);
     habitacion.setEstado(rs.getInt(4));
     
     lista.add(habitacion);
   }
    
  }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Error al cargar la lista de habitaciones en baja");
      System.out.println("Error en las clase HabitacionData metodo listaHabitacionesBajas() "+ex.getMessage());
  }
    
 return lista;   
}

public static boolean isLibre(Habitacion habitacion){
    sql="SELECT * FROM reserva WHERE idHabitacion=? AND estado=1";
    
     try {
         ps=con.prepareStatement(sql);
         ps.setInt(1, habitacion.getIdHabitacion());
         
         rs=ps.executeQuery();
         
         if(rs.next()){
           return false;
         }
         
     } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Error al verificar si la habitacion esta libre");
      System.out.println("Error en las clase HabitacionData metodo isLibre() "+ex.getMessage());
  }
    return true;
}

}