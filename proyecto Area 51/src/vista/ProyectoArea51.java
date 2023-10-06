/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.Huesped;
import controlador.HuespedData;
/**
 *
 * @author PC
 */
public class ProyectoArea51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*        System.out.println("REGISTRAR CLIENTE");
        HuespedData.subirHuesped(new Huesped("miku", "v", 64587455, "25 de mayo 200", "nani55@gmail.com", 859604423, true));
        System.out.println("-----------------------------------------------------------------------------------------------------");

  */      System.out.println("ACTUALIZAR HUESPED");
        
        HuespedData.actualizarHuesped(new Huesped(9,"graciela","nuniez",23456787,"25 de mayo 1234","granuniu4@gmail.com",123456790,true));
        
        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.println("DAR DE BAJA UN HUESPED");
        
        HuespedData.bajarHuesped(8);
        HuespedData.bajarHuesped(13);
        HuespedData.bajarHuesped(10);
        HuespedData.bajarHuesped(15);
        
        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.println("BUSCAR HUESPED POR DNI");
        
        System.out.println(HuespedData.obtenerHuespedXDni(32411432));
        System.out.println(HuespedData.obtenerHuespedXDni(12346533));
        
        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.println("LISTAR TODOS LOS HUESPEDES");
        
        for (Huesped h : HuespedData.listaCompletaHuespedes()) {
            System.out.println(h);
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.println("LISTAR HUESPEDES ACTIVOS");
        
        for (Huesped h : HuespedData.listadeHuespedActivos()) {
            System.out.println(h);
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.println("LISTAR HUESPEDES NO ACTIVOS");
        
        for (Huesped h : HuespedData.listadeHuespedNoActivos()) {
            System.out.println(h);
        }

        
    }
    
}
