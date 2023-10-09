package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Categoria;

public class CategoiaData {
    //Atributos

    private static Connection con = Conexion.getConexion();
    private static String sql;
    private static PreparedStatement ps;
    private static ResultSet rs;

    //metodos
    //int idCategoria, String tipoDeCamas, int cantidadPersonas, int cantidadCamas, precioNoche) {
    public static void subirCategoria(Categoria categoria) {
        sql = "INSERT INTO categoria (tipoDeCamas, cantidadPersonas, cantidadCamas, precioNoche) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, categoria.getTipoDeCamas());
            ps.setInt(2, categoria.getCantidadPersonas());
            ps.setInt(3, categoria.getCantidadCamas());
            ps.setInt(4, categoria.getCantidadCamas());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                categoria.setIdCategoria(rs.getInt(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al subir la categoria");
            System.out.println("Error clase CategoriaData metodo subirCategoria " + ex.getMessage());
        }
    }

    public static void actualizarCategoria(Categoria categoria) {
        sql = "UPDATE categoria SET tipoDeCamas = ?, cantidadPersonas = ?, cantidadCamas= ?, precioNoche=?  WHERE  idCategoria = ?";
        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, categoria.getTipoDeCamas());
            ps.setInt(2, categoria.getCantidadPersonas());
            ps.setInt(3, categoria.getCantidadCamas());
            ps.setDouble(4, categoria.getPrecioNoche());

            ps.setInt(5, categoria.getIdCategoria());

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 1) {
                JOptionPane.showMessageDialog(null, "Categoria actualizada con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar Categoria");
        }
    }

    public static void eliminarCategoria(int idCategoria) {
        sql = "DELETE FROM categoria  WHERE idCategoria= ?";
        try {
          ps =con.prepareStatement(sql);
          ps.setInt(1,idCategoria);
          
          int filasAfectadas = ps.executeUpdate();
           if (filasAfectadas > 1){ 
          JOptionPane.showMessageDialog(null, "Categoria eliminada con exito");
           }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al eliminar Categoria");  
        }
    }
//int idCategoria, String tipoDeCamas, int cantidadPersonas, int cantidadCamas, precioNoche) {    
   public static ArrayList<Categoria> listaCategoriaesActivas(){
  ArrayList <Categoria> lista =  new ArrayList<>();
  sql = "SELECT * FROM categoria WHERE estado = 1";
  try{
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();
    
     while(rs.next()){
     Categoria categoria = new Categoria();
     categoria.setIdCategoria(rs.getInt(1));
     categoria.setTipoDeCamas(rs.getString(2));
     categoria.setCantidadPersonas(rs.getInt(rs.getInt(3)));
     categoria.setPrecioNoche(rs.getDouble(4));
     
     lista.add(categoria);
   }
    
  }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Error al cargar la lista de categorias");
      System.out.println("Error en las clase CategoriaData metodo listaCategorias() "+ex.getMessage());
  }
    
 return lista;   
} 
    
    
    

}
