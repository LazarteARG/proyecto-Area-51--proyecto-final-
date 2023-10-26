package vista;

import controlador.CategoriaData;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

public class AdministrarCategoriaTabla extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarTodas = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

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

        jLabel1.setText("Buscar categoria:");

        jLabel2.setText("según");

        btnBuscarTodas.setText("Listar Todo");
        btnBuscarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTodasActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");

        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btnBuscarTodas))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnBuscar)
                    .addComponent(btnEliminar))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnEditar)
                        .addGap(39, 39, 39)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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
        ArrayList<Categoria> listaCompleta =  CategoriaData.listarTodasLasCategorias();
         ArrayList<Categoria> listaAMostrar = new  ArrayList<>();
        
        switch (seleccionado){
            case "ID": 
               vaciarTabla();
               Categoria cate =  CategoriaData.obtenerCategoriaXId(Integer.parseInt(jTextField1.getText()));
               agregarFila(cate);
                break;
            case "Nombre":
                  vaciarTabla();
                  listaAMostrar = new  ArrayList<>();
                  for (Categoria categoria : listaCompleta) {
                    if(categoria.getNombre().startsWith(jTextField1.getText())){  
                    listaAMostrar.add(categoria);
                    }
                }
                cargarTabla(listaAMostrar);
                break;
            case "TipoDeCamas":
                vaciarTabla();
                 listaAMostrar = new  ArrayList<>();
                  for (Categoria categoria : listaCompleta) {
                    if(categoria.getTipoDeCamas().startsWith(jTextField1.getText())){  
                    listaAMostrar.add(categoria);
                    }
                }
                cargarTabla(listaAMostrar);   
               break;
            case "CantidadDePersonas":
                vaciarTabla();
                 listaAMostrar = new  ArrayList<>();
                  for (Categoria categoria : listaCompleta) {
                    if(categoria.getTipoDeCamas().startsWith(jTextField1.getText())){  
                    listaAMostrar.add(categoria);
                    }
                }
                 cargarTabla(listaAMostrar);  
                break;
            case "PrecioNoche":
                  vaciarTabla();
                 listaAMostrar = new  ArrayList<>();
                  for (Categoria categoria : listaCompleta) {
                    if(categoria.getPrecioNoche() == (Double.parseDouble(jTextField1.getText()))){  
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public void agregarCabeceraTabla() {
        model.addColumn("idCategoria");
        model.addColumn("Nombre");
        model.addColumn("TipoDeCamas");
        model.addColumn("CantidadPersonas");
        model.addColumn("PrecioNoche");
    }

    public void agregarFila(Categoria categoria) {
        vaciarTabla();
        model.addRow(new Object[]{categoria.getIdCategoria(), categoria.getNombre(), categoria.getTipoDeCamas(), categoria.getCantidadCamas(), categoria.getPrecioNoche()});
    }

    public void cargarTabla(ArrayList<Categoria> listaCategoria) {
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







