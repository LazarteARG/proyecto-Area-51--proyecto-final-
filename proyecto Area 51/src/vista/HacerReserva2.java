package vista;

import controlador.CategoriaData;
import controlador.HabitacionDataBORRADOR;
import controlador.ReservaData;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Habitacion;


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

        jLabel1 = new javax.swing.JLabel();
        jcCategorias = new javax.swing.JComboBox<>();
        jTextArea2 = new javax.swing.JTextArea();
        btn_reservar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jlPrecioTotal = new javax.swing.JLabel();
        jbIrRegistrarHuesped = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setText("Seleccione una opción de la tabla:");

        jcCategorias.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jcCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriasActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("*Busquen las habitaciones por la categorias de habitacion y luego selecione una \nhabitación de la tabla. Abajo a la derecha de la tabla saldra el precio.\n\nSí el huesped aun no se ha hospedado antes seleccione \"Registrar Huesped\",\nsino seleccione \"Reservar\".");

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

        jlPrecioTotal.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlPrecioTotal.setText("$0.0");

        jbIrRegistrarHuesped.setText("Registrar Huesped");
        jbIrRegistrarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIrRegistrarHuespedActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio total:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Selección de Habitación");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlPrecioTotal)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextArea2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btn_volver)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbIrRegistrarHuesped)
                                    .addGap(101, 101, 101)
                                    .addComponent(btn_reservar))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecioTotal)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reservar)
                    .addComponent(btn_volver)
                    .addComponent(jbIrRegistrarHuesped))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservarActionPerformed
        HacerReserva3 hacerreserva = new HacerReserva3();

        JDesktopPane desktop = getDesktopPane();
        desktop.add(hacerreserva);
        hacerreserva.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_reservarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        HacerReserva hacerreserva = new HacerReserva();

        JDesktopPane desktop = getDesktopPane();
        desktop.add(hacerreserva);
        hacerreserva.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_volverActionPerformed

    private void jbIrRegistrarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIrRegistrarHuespedActionPerformed
        HacerReserva hacerreserva = new HacerReserva();

        JDesktopPane desktop = getDesktopPane();
        desktop.add(hacerreserva);
        hacerreserva.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbIrRegistrarHuespedActionPerformed

    private void jcCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriasActionPerformed
        
    }//GEN-LAST:event_jcCategoriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reservar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton jbIrRegistrarHuesped;
    private javax.swing.JComboBox<String> jcCategorias;
    private javax.swing.JLabel jlPrecioTotal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

  
    private void agregarCabeceraTabla() {
        modelo.addColumn("Nro. Habit.");
        modelo.addColumn("Piso");
        modelo.addColumn("Categ.");
        modelo.addColumn("Tipo Camas");
        modelo.addColumn("Cant. de Personas");
        modelo.addColumn("Cant. de Camas");
        modelo.addColumn("Precio Noche");

        /* tabla.getColumn("Estado").setPreferredWidth(tabla.getColumn("Estado").getWidth() - 17);
        tabla.getColumn("Piso").setPreferredWidth(tabla.getColumn("Piso").getWidth() - 20);
        tabla.getColumn("Categoria").setPreferredWidth(tabla.getColumn("Categoria").getWidth() + 20);
        tabla.getColumn("Personas Maximas").setPreferredWidth(tabla.getColumn("Personas Maximas").getWidth() + 10);

         */
    }

    private void agregarFilaTabla(Habitacion habitacion) {
        Categoria categoria = CategoriaData.obtenerCategoriaXId(habitacion.getIdCategoria());
        modelo.addRow(new Object[]{habitacion.getIdHabitacion(), habitacion.getPiso(), categoria.getNombre(), categoria.getTipoDeCamas(), categoria.getCantidadPersonas(), categoria.getCantidadCamas(), categoria.getPrecioNoche()});
    }

    public void categoríaSegunCantidadPersonas() {
        Categoria c;
        for (Habitacion habitacion : HabitacionDataBORRADOR.listarHabitacionesLibres()) {
            c = CategoriaData.obtenerCategoriaXId(habitacion.getIdCategoria());
            if (c.getCantidadPersonas() == cantidadPersonas) {
                agregarFilaTabla(habitacion);
                System.out.println(habitacion.getIdCategoria());
            }
        }

    }

    public void llenarcbCategorias() {

        for (Categoria categoria : CategoriaData.listarTodasLasCategorias()) {
            jcCategorias.addItem(categoria.getIdCategoria() + " ");

        }

    }



}
