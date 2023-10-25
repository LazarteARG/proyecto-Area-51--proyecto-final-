package vista;

import controlador.CategoriaData;
import controlador.ReservaData;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;


public class HacerReserva2 extends javax.swing.JInternalFrame {
  private int cantidadPersonas;
  private LocalDate diaEntrada; 
  private LocalDate diaSalida;
  DefaultTableModel modelo = new DefaultTableModel();
  
    public HacerReserva2(int cantidadPersonas,  LocalDate diaEntrada, LocalDate diaSalida) {
        initComponents();
        
        tabla.setModel(modelo);
        agregarCabeceraTabla();
        
        
        this.diaEntrada = diaEntrada;
        this.diaSalida = diaSalida;
        this.cantidadPersonas = cantidadPersonas;
        
        categoríaSegunCantidadPersonas();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_reservar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();

        setClosable(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("Seleccione una opción de la tabla:");

        btn_reservar.setText("Reservar");
        btn_reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservarActionPerformed(evt);
            }
        });

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_reservar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reservar)
                    .addComponent(btn_volver))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        HacerReserva hacerreserva = new HacerReserva();
                
        JDesktopPane desktop = getDesktopPane();
        desktop.add(hacerreserva);
        hacerreserva.setVisible(true);
        dispose();   


    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservarActionPerformed



    }//GEN-LAST:event_btn_reservarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reservar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void agregarCabeceraTabla(){
     modelo.addColumn("idCategoria");
     modelo.addColumn("Nombre");
     modelo.addColumn("Tipo de Camas");
     modelo.addColumn("Cantidad de Personas");
     modelo.addColumn("Cantidad de Camas");
     modelo.addColumn("Precio Noche");   
    }
    
    private void agregarFilaTabla(Categoria categoria){
        modelo.addRow(new Object [] {categoria.getIdCategoria(), categoria.getNombre(), categoria.getTipoDeCamas(), categoria.getCantidadPersonas(), categoria.getCantidadCamas(), categoria.getPrecioNoche()});
    }
    
    
    public void categoríaSegunCantidadPersonas(){
               
        for (Categoria categoria : CategoriaData.listaCategoriaesActivas()) {
            if(categoria.getCantidadPersonas() == cantidadPersonas){
                agregarFilaTabla(categoria);    
                System.out.println(categoria.getNombre());
            }
        }
 
    }





}
