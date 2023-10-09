package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Reserva;

public class ReservaData {

    private static Connection con = Conexion.getConexion();
    private static String sql;
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static void subirReserva(Reserva r) {

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

    public static ArrayList<Reserva> listarMateriasActivas(){
        ArrayList<Reserva> reservas=new ArrayList<>();
        sql="SELECT * FROM reserva WHERE estado=1";
        try {
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();

            while(rs.next()){
                reservas.add(new Reserva(rs.getInt(1),HabitacionesData.obtenerHabitacionXId(rs.getInt(3)),HuespedData.obtenerHuespedXid(rs.getInt(2)), rs.getDate(4).toLocalDate(), rs.getDate(5).toLocalDate(), rs.getInt(6), rs.getDouble(7), rs.getBoolean(8)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido actualizar la reserva, error: "+ex.getMessage());
            System.out.println("error en metodo actualizarReserva en reservaData error: "+ex.getMessage());
        }
        return reservas;
    }
}
