package vista;

import controlador.CategoriaData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

public class AdministrarCategoriaTabla extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public AdministrarCategoriaTabla() {
        initComponents();
        tabla.setModel(model);
        agregarCabeceraTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnBuscarTodas = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre", "TipoDeCamas", "CantidadDePersonas", "PrecioNoche" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBuscarTodas.setText("Listar Todo");
        btnBuscarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTodasActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        btnEliminar.setText("Eliminar");

        jLabel3.setText("Buscar por");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btnBuscarTodas))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(113, 113, 113)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnEditar)
                        .addGap(39, 39, 39)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnBuscarTodas)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnBuscarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTodasActionPerformed
        ArrayList<Categoria> listaCategoria = CategoriaData.listarTodasLasCategorias();
        cargarTabla(listaCategoria);
    }//GEN-LAST:event_btnBuscarTodasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String seleccionado = (String) jComboBox1.getSelectedItem();
        ArrayList<Categoria> listaCompleta = CategoriaData.listarTodasLasCategorias();
        ArrayList<Categoria> listaAMostrar = new ArrayList<>();
        //ID, Nombre, TipoDeCamas, CantidadDePersonas, PrecioNoche
        switch (seleccionado) {
            case "ID":
                vaciarTabla();
                if (!jTextField1.getText().isEmpty()) {
                    Categoria cate = CategoriaData.obtenerCategoriaXId(Integer.parseInt(jTextField1.getText()));
                    if (cate.getPrecioNoche() != 0.0) {
                        agregarFila(cate);
                    }else{
                    JOptionPane.showMessageDialog(rootPane, "ID no encontrado en ninguna Categoria ");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese un ID ");
                }
                break;

            case "Nombre":
                vaciarTabla();
                listaAMostrar = new ArrayList<>();
                for (Categoria categoria : listaCompleta) {
                    if (categoria.getNombre().startsWith(jTextField1.getText())) {
                        listaAMostrar.add(categoria);
                    }
                }
                cargarTabla(listaAMostrar);
                break;
            case "TipoDeCamas":
                vaciarTabla();
                listaAMostrar = new ArrayList<>();
                for (Categoria categoria : listaCompleta) {
                    if (categoria.getTipoDeCamas().startsWith(jTextField1.getText())) {
                        listaAMostrar.add(categoria);
                    }
                }
                cargarTabla(listaAMostrar);
                break;
            case "CantidadDePersonas":
                vaciarTabla();
                listaAMostrar = new ArrayList<>();
                for (Categoria categoria : listaCompleta) {
                    if (categoria.getTipoDeCamas().startsWith(jTextField1.getText())) {
                        listaAMostrar.add(categoria);
                    }
                }
                cargarTabla(listaAMostrar);
                break;
            case "PrecioNoche":
                vaciarTabla();
                listaAMostrar = new ArrayList<>();
                for (Categoria categoria : listaCompleta) {
                    if (categoria.getPrecioNoche() == (Double.parseDouble(jTextField1.getText()))) {
                        listaAMostrar.add(categoria);
                    }
                }
                cargarTabla(listaAMostrar);
                break;
        }

    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarTodas;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public void agregarCabeceraTabla() {
        model.addColumn("idCategoria");
        model.addColumn("Nombre");
        model.addColumn("CantidadDeCamas");
        model.addColumn("TipoDeCamas");
        model.addColumn("CantidadPersonas");
        model.addColumn("PrecioNoche");
    }

    public void agregarFila(Categoria categoria) {
        model.addRow(new Object[]{categoria.getIdCategoria(), categoria.getNombre(), categoria.getCantidadCamas(), categoria.getTipoDeCamas(), categoria.getCantidadCamas(), categoria.getPrecioNoche()});
    }

    public void cargarTabla(ArrayList<Categoria> listaCategoria) {
        vaciarTabla();
        for (Categoria categoria : listaCategoria) {
            agregarFila(categoria);
        }

    }

    public void vaciarTabla() {
        int cantidadFilas = model.getRowCount();
        for (int i = cantidadFilas - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

}
