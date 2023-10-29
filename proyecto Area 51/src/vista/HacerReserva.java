package vista;

import com.toedter.calendar.JDateChooser;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class HacerReserva extends javax.swing.JInternalFrame {

    public HacerReserva() {
        initComponents();
        
         diaEntrada.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                diaEntradaPropertyChange(evt);    
                 }});
         
             diaSalida.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                diaSalidaPropertyChange(evt);
            }
          
        });        
         
                 
    }

      private void diaSalidaPropertyChange(PropertyChangeEvent evt) {
           System.out.println("Cambio de diaSalida: " + evt.getPropertyName());
            if ("date".equals(evt.getPropertyName())) {
                verificarFechaSeleccionada(diaEntrada);
            }
            }
    
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarHabitaciones = new javax.swing.JButton();
        diaEntrada = new com.toedter.calendar.JDateChooser();
        diaSalida = new com.toedter.calendar.JDateChooser();
        cantidadPersonas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();

        setClosable(true);

        jLabel3.setText("fecha Entrada");

        jLabel4.setText("fecha Salida");

        jLabel5.setText("cantidadPersonas");

        btnBuscarHabitaciones.setText("Siguiente");
        btnBuscarHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHabitacionesActionPerformed(evt);
            }
        });

        diaEntrada.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                diaEntradaPropertyChange(evt);
            }
        });

        cantidadPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cantidadPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadPersonasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Hacer Reserva");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea2.setRows(2);
        jTextArea2.setText("*Para inicializar una reserva primero ingrese una fecha \nde entrada, una de salida y la cantidad de huespedes.\n\n\nLuego seleccione \"Siguiente\" para avanzar en la reserva.");
        jTextArea2.setAutoscrolls(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(42, 42, 42)
                                .addComponent(cantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnBuscarHabitaciones)))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(168, 168, 168))))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(diaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(diaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(51, 51, 51)
                .addComponent(btnBuscarHabitaciones)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void verificarFechaSeleccionada(JDateChooser dateChooser) {
        Date selectedDate = dateChooser.getDate();
        Date currentDate = new Date();
        
        if (selectedDate != null && selectedDate.before(currentDate)) {
            JOptionPane.showMessageDialog(this, "No puedes seleccionar una fecha anterior a la fecha actual.", "Error", JOptionPane.ERROR_MESSAGE);
            dateChooser.setDate(null);
        }else if (dateChooser == diaSalida) {
        Date entradaDate = diaEntrada.getDate();
        if (entradaDate != null && selectedDate != null && selectedDate.before(entradaDate)) {
            JOptionPane.showMessageDialog(this, "La fecha de salida no puede ser anterior a la fecha de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
            dateChooser.setDate(null);
        }}
    }
      
    
    
    
    
    
    private void btnBuscarHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHabitacionesActionPerformed
        int cantidadPersonasInt = Integer.parseInt(cantidadPersonas.getSelectedItem().toString());
        LocalDate diaEntradaLocalDate = diaEntrada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate diaSalidaLocalDate = diaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        HacerReserva2 hacerreserva = new HacerReserva2(cantidadPersonasInt, diaEntradaLocalDate,diaSalidaLocalDate);

                
        JDesktopPane desktop = getDesktopPane();
        desktop.add(hacerreserva);
        hacerreserva.setVisible(true);
        dispose();         
 
    }//GEN-LAST:event_btnBuscarHabitacionesActionPerformed

    private void cantidadPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadPersonasActionPerformed

    private void diaEntradaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_diaEntradaPropertyChange
      if ("date".equals(evt.getPropertyName())) {
            verificarFechaSeleccionada(diaEntrada);
        }
    }//GEN-LAST:event_diaEntradaPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarHabitaciones;
    private javax.swing.JComboBox<String> cantidadPersonas;
    private com.toedter.calendar.JDateChooser diaEntrada;
    private com.toedter.calendar.JDateChooser diaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables







}
