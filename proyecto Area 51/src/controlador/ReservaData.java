package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;

public class ReservaData {

    private static Connection con = Conexion.getConexion();
    private static String sql;
    private static PreparedStatement ps;
    private static ResultSet rs;

   //**Hecho por Ariel Lazarte*/
    
    public static void subirReserva(Reserva r) {
    sql= "INSERT INTO reserva (idReserva, idHabitacion, idHuesped, fechaEntrada, fechaSalida, cantidadPersonas, montoAPagar, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";
    
    try {
        ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        //revisar las posiciones de cada get para evitar problemas
        ps.setInt(1, r.getIdReserva());
        ps.setInt(2, r.getHabitacion().getIdHabitacion());
        ps.setInt(3, r.getHuesped().getIdHuesped());
        ps.setDate(4, Date.valueOf(r.getFechaIngreso()));
        ps.setDate(6, Date.valueOf(r.getFechaEgreso()));
        ps.setInt(7, r.getCantPersonas());
        ps.setDouble(8, r.getPrecioTotal());
        ps.setBoolean(9, r.isEstado());
        
        ps.executeUpdate();
        
                
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "*ERROR*: No se a podido guardar/subir la nueva reserva");
        System.out.println("Error: el error se encuentra en el metodo subirReserva(), por favor revise. ");
    }
        
    }
    
    
    //**Hecho por Ariel Lazarte*/
    
    public static void bajarReserva (int idReserva) {
       
        try {
            sql = "UPDATE reserva SET estado = 0 WHERE idReserva = ? ";
            ps= con.prepareStatement(sql);
            ps.setInt(1, idReserva);
            
            int fila = ps.executeUpdate();
            
            if (fila == 0) {
                System.out.println("Se ha dado de baja la reserva con exito ");
                
            }else {
                System.out.println("Error, no se pudo dar de baja la reserva ");
            }
                
               
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se ha podido dar de baja la reserva del humano del area 51 ");
            System.out.println("Error. el error se encuentra en el metodo bajarReserva(), por favor revise. ");
        }
 
        
    }
    
    
    //**Hecho por Ariel Lazarte*/
    
    public static void eliminarReserva (int idReserva) {
        
        try {
            sql = "DELETE reserva WHERE idReserva = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);
            
            int fila = ps.executeUpdate();
            
            if (fila < 0) {
                System.out.println("Se ha eliminado la reserva, no queda rastros de la abducción del area 51");
                
            } else {
                System.out.println("No se ha podido eliminar la reserva");
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "*ERROR*: No se ha podido eliminar la reserca del humano del area 51");
            System.out.println("Error. el error se encuentra en el metodo eliminarReserva(), por favor revise. ");
            
        }
        
    }
    
    //**Hecho por Ariel Lazarte*/
    
    public static Reserva buscarReservaPorHuesped (int idHuesped) {
        Reserva r = new Reserva();
        sql = "SELECT * FROM reserva WHERE idHuesped = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                r.setIdReserva(rs.getInt(1));
                r.setHuesped(HuespedData.obtenerHuespedXid(rs.getInt(2)));
                r.setHabitacion(HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)));
                r.setFechaIngreso(rs.getDate(4).toLocalDate());
                r.setFechaEgreso(rs.getDate(5).toLocalDate());
                r.setCantPersonas(rs.getInt(6));
                r.setPrecioTotal(rs.getDouble(7));
                r.setEstado(rs.getBoolean(8));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return r;
        
    }

    /**
     * hecho por tamara
     */
//idReserva,idHuesped,idHabitacion,fechaEntrada,fechaSalida,
//cantidadPersonas,montoAPagar,estado	
    public static void actualizarReserva(Reserva r) {
        sql = "UPDATE reserva SET idHuesped=?,idHabitacion=?,fechaEntrada=?,fechaSalida=?,cantidadPersonas=?,montoAPagar=?,estado=? WHERE idReserva=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, r.getHuesped().getIdHuesped());
            ps.setInt(2, r.getHabitacion().getIdHabitacion());
            ps.setDate(3, Date.valueOf(r.getFechaIngreso()));
            ps.setDate(4, Date.valueOf(r.getFechaEgreso()));
            ps.setInt(5, r.getCantPersonas());
            ps.setDouble(6, r.getPrecioTotal());
            ps.setBoolean(7, r.isEstado());
            ps.setInt(8, r.getIdReserva());

            int f = ps.executeUpdate();

            if (f > 0) {
                JOptionPane.showMessageDialog(null, "Actualizacion de reserva exitosa");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido actualizar la reserva, error: "+ex.getMessage());
            System.out.println("error en metodo actualizarReserva en reservaData error: "+ex.getMessage());
        }

    }
    /**
     * hecho por tam
     */

    public static ArrayList<Reserva> listarReservasActivas(){
        ArrayList<Reserva> reservas=new ArrayList<>();
        sql="SELECT * FROM reserva WHERE estado=1";
        try {
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();

            while(rs.next()){
                reservas.add(new Reserva(rs.getInt(1),HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)),HuespedData.obtenerHuespedXid(rs.getInt(2)), rs.getDate(4).toLocalDate(), rs.getDate(5).toLocalDate(), rs.getInt(6), rs.getDouble(7), rs.getBoolean(8)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido actualizar la reserva, error: "+ex.getMessage());
            System.out.println("error en metodo actualizarReserva en reservaData error: "+ex.getMessage());
        }
        return reservas;
    }
    
    
        public static ArrayList<Reserva> listarReservasBajas(){
        ArrayList<Reserva> lista =new ArrayList<>();
        sql="SELECT * FROM reserva WHERE estado=0";
        try {
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();

            while(rs.next()){
                lista.add(new Reserva(rs.getInt(1),HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)),HuespedData.obtenerHuespedXid(rs.getInt(2)), rs.getDate(4).toLocalDate(), rs.getDate(5).toLocalDate(), rs.getInt(6), rs.getDouble(7), rs.getBoolean(8)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ah podido cargar la lista de Reservas bajas: "+ex.getMessage());
            System.out.println("error en metodo listarMateriasBajas de la clase Reserva: "+ex.getMessage());
        }
        return lista;
    }
    
    
    
     public static ArrayList<Reserva> listarTodasLasReservas(){
        ArrayList<Reserva> lista=new ArrayList<>();
        sql="SELECT * FROM reserva";
        try {
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();

            while(rs.next()){
                lista.add(new Reserva(rs.getInt(1),HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)),HuespedData.obtenerHuespedXid(rs.getInt(2)), rs.getDate(4).toLocalDate(), rs.getDate(5).toLocalDate(), rs.getInt(6), rs.getDouble(7), rs.getBoolean(8)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido cargar la lista completa de Reservas: "+ex.getMessage());
            System.out.println("error en metodo listarTodasLasReservas en reservaData error: "+ex.getMessage());
        }
        return lista;
    }
    
    /**hecho por tam*/
     public static Reserva buscarReservaPorHabitacion(int idHabitacion){
        sql="SELECT * FROM reserva WHERE idHabitacion=?";
        Reserva reserva= new Reserva();
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            
            rs=ps.executeQuery();
            
            if(rs.next()){
                reserva.setIdReserva(rs.getInt(1));
                reserva.setHuesped(HuespedData.obtenerHuespedXid(rs.getInt(2)));
                reserva.setHabitacion(HabitacionDataBORRADOR.obtenerHabitacionXId(rs.getInt(3)));
                reserva.setFechaIngreso(rs.getDate(4).toLocalDate());
                reserva.setFechaEgreso(rs.getDate(5).toLocalDate());
                reserva.setCantPersonas(rs.getInt(6));
                reserva.setPrecioTotal(rs.getDouble(7));
                reserva.setEstado(rs.getBoolean(8));
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la reserva, error: "+ex.getMessage());
            System.out.println("error en metodo actualizarReserva en reservaData error: "+ex.getMessage());
        }
        return reserva;
    }
    
    
}




//VAMOS BOCAAAAAAAAAAAAAAAAAAAAAAAAAAAA
//¿Existira vida en otros planetas? no se, pero si tendras un buen rato en tu vida si te hospedas en el Hotel Area 51 ;)//