
package vista;

import javax.swing.table.DefaultTableModel;

public class ListadeReservas extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ListadeReservas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jrTodasReservas = new javax.swing.JRadioButton();
        jrReservasActivas = new javax.swing.JRadioButton();
        jrReservasNoActivas = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcOpcionBusqueda = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Lista de Reservas");

        jrTodasReservas.setText("Todas las reservas");

        jrReservasActivas.setText("Reservas activas");

        jrReservasNoActivas.setText("Reservas no activas");

        jButton1.setText("Buscar");

        jLabel2.setText("Buscar Reserva x Huesped:");

        jButton2.setText("Cancelar Reserva");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jrTodasReservas)
                        .addGap(79, 79, 79)
                        .addComponent(jrReservasActivas)
                        .addGap(91, 91, 91)
                        .addComponent(jrReservasNoActivas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcOpcionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addGap(118, 118, 118)
                        .addComponent(jButton2)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrTodasReservas)
                    .addComponent(jrReservasActivas)
                    .addComponent(jrReservasNoActivas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2)
                    .addComponent(jcOpcionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcOpcionBusqueda;
    private javax.swing.JRadioButton jrReservasActivas;
    private javax.swing.JRadioButton jrReservasNoActivas;
    private javax.swing.JRadioButton jrTodasReservas;
    // End of variables declaration//GEN-END:variables

    private void agregarCabeceraTabla() {
        modelo.addColumn("ID Reserva");
        modelo.addColumn("ID Huesped");
        modelo.addColumn("ID Habitación");
        modelo.addColumn("Fecha de entrada");
        modelo.addColumn("Fecha de salida");
        modelo.addColumn("Cant. de personas");
        modelo.addColumn("Monto a pagar");
        modelo.addColumn("Estado");
        
    }

    private void llenardeDatosHuesped() {
        jcOpcionBusqueda.addItem("Seleccione el dato para buscar");
        
        
    }
}

