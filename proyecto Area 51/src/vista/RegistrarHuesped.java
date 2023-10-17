package vista;

import controlador.HuespedData;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Huesped;

public class RegistrarHuesped extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public RegistrarHuesped() {
        initComponents();
        tabla.setModel(modelo);
        agregarCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fieldCorreo = new javax.swing.JTextField();
        fieldID = new javax.swing.JTextField();
        fieldNombre = new javax.swing.JTextField();
        fieldApellido = new javax.swing.JTextField();
        fieldDNI = new javax.swing.JTextField();
        fieldDomicilio = new javax.swing.JTextField();
        fieldCelular = new javax.swing.JTextField();
        radioButton = new javax.swing.JRadioButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiarValores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        listarTodos_checkBox = new javax.swing.JCheckBox();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1100, 505));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 20));

        jLabel3.setText("DNI:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 198, -1, -1));

        jLabel5.setText("ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 20));

        jLabel6.setText("Domicilio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel8.setText("Celular:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jLabel9.setText("Estado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel10.setText("ADBDUCION DE HUESPED (REGISTRO HUESPED)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 0, -1, -1));
        getContentPane().add(fieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 200, -1));
        getContentPane().add(fieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 200, -1));

        fieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldNombreKeyReleased(evt);
            }
        });
        getContentPane().add(fieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 200, -1));

        fieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldApellidoKeyReleased(evt);
            }
        });
        getContentPane().add(fieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 200, -1));
        getContentPane().add(fieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 200, -1));
        getContentPane().add(fieldDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 200, -1));
        getContentPane().add(fieldCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 200, -1));

        radioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonActionPerformed(evt);
            }
        });
        radioButton.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                radioButtonPropertyChange(evt);
            }
        });
        getContentPane().add(radioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        btnEliminar.setText("Eliminar Huesped");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 140, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        btnLimpiarValores.setText("Limpiar Valores");
        btnLimpiarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarValoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiarValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 350, 280));

        listarTodos_checkBox.setText("LISTAR TODOS");
        listarTodos_checkBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        listarTodos_checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarTodos_checkBoxActionPerformed(evt);
            }
        });
        getContentPane().add(listarTodos_checkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonActionPerformed
        borrarFilasTabla();
        /*if (!fieldID.getText().isEmpty()) {
            int idHuesped = Integer.parseInt(fieldID.getText());
            buscarPorId(idHuesped);
            //si no, por DNI 
        } else if (!fieldDNI.getText().isEmpty()) {
            int dni = Integer.parseInt(fieldDNI.getText());
            buscarPorDNI(dni);
            //sino, por nombre y apellido    
        } else*/ if (!fieldNombre.getText().isEmpty() && !fieldApellido.getText().isEmpty()) {
            String nombreHuesped = fieldNombre.getText();
            String apellido = fieldApellido.getText();
            buscarPorNombreYApellido(nombreHuesped, apellido);
            //sino solo por nombre    
        } else if (!fieldNombre.getText().isEmpty() && fieldApellido.getText().isEmpty()) {
            String nombreHuesped = fieldNombre.getText();
            buscarPorNombre(nombreHuesped);
            //sino solo por apellido    
        } else if (fieldNombre.getText().isEmpty() && !fieldApellido.getText().isEmpty()) {
            ArrayList<Huesped> apellidados=buscarPorApellidoTipeado();
            agregarFilas(apellidados);
            //sino solo por estado    
        } else if (radioButton.isSelected()) {
            agregarFilas(HuespedData.listadeHuespedActivos());
        } else if (!radioButton.isSelected()) {
            agregarFilas(HuespedData.listadeHuespedNoActivos());
        }
    }//GEN-LAST:event_radioButtonActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //buscar por id
        borrarFilasTabla();
        //si tiene id, busca por id
        if(listarTodos_checkBox.isSelected()){
            limpiarFields();
            agregarFilas(HuespedData.listaCompletaHuespedes());
        }else if (!fieldID.getText().isEmpty()) {
            int idHuesped = Integer.parseInt(fieldID.getText());
            buscarPorId(idHuesped);
            //si no, por DNI 
        } else if (!fieldDNI.getText().isEmpty()) {
            int dni = Integer.parseInt(fieldDNI.getText());
            buscarPorDNI(dni);
            //sino, por nombre y apellido    
        } else if (!fieldNombre.getText().isEmpty() && !fieldApellido.getText().isEmpty()) {
            String nombreHuesped = fieldNombre.getText();
            String apellido = fieldApellido.getText();
            buscarPorNombreYApellido(nombreHuesped, apellido);
            //sino solo por nombre    
        } else if (!fieldNombre.getText().isEmpty() && fieldApellido.getText().isEmpty()) {
            String nombreHuesped = fieldNombre.getText();
            buscarPorNombre(nombreHuesped);
            //solo por estado    
        } else if (radioButton.isSelected()) {
            agregarFilas(HuespedData.listadeHuespedActivos());
        } else if (!radioButton.isSelected()) {
            agregarFilas(HuespedData.listadeHuespedNoActivos());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarValoresActionPerformed
        limpiarFields();
        borrarFilasTabla();
        listarTodos_checkBox.setSelected(false);
        

    }//GEN-LAST:event_btnLimpiarValoresActionPerformed

    private void fieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNombreKeyReleased
        if (fieldApellido.getText().isEmpty() && fieldNombre.getText().isEmpty()) {

            borrarFilasTabla();

        } else if (fieldApellido.getText().isEmpty()) {
            borrarFilasTabla();
            ArrayList<Huesped> listCompleta = HuespedData.listaCompletaHuespedes();

            if (radioButton.isSelected()) {
                listCompleta = buscarHuespedesActivos(listCompleta);
            }
            for (Huesped huesped : listCompleta) {
                if (huesped.getNombre().toLowerCase().startsWith(fieldNombre.getText().toLowerCase())) {
                    agregarFila(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDNI());
                }
            }
        } else {
            ArrayList<Huesped> listaNombrados=buscarPorApellidoTipeado();
            if(radioButton.isSelected()){
                listaNombrados =  buscarHuespedesActivos(listaNombrados);
            }
            for (Huesped huesped : listaNombrados){
                if (huesped.getNombre().toLowerCase().startsWith(fieldNombre.getText().toLowerCase())) {
                    agregarFila(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDNI());
                }
            }
        }

    }//GEN-LAST:event_fieldNombreKeyReleased

    private void fieldApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldApellidoKeyReleased
        if (fieldApellido.getText().isEmpty() && fieldNombre.getText().isEmpty()) {

            borrarFilasTabla();

        } else if (fieldNombre.getText().isEmpty()) {
            borrarFilasTabla();
            ArrayList<Huesped> listCompleta = HuespedData.listaCompletaHuespedes();
            if (radioButton.isSelected()) {
                listCompleta = buscarHuespedesActivos(listCompleta);
            }
            for (Huesped huesped : listCompleta) {
                if (huesped.getApellido().toLowerCase().startsWith(fieldApellido.getText().toLowerCase())) {
                    agregarFila(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDNI());
                }
            }
        } else {
            ArrayList<Huesped> listaNombrados=buscarPorNombreTipeado();
            if(radioButton.isSelected()){
                listaNombrados =  buscarHuespedesActivos(listaNombrados);
            }
            for (Huesped huesped : listaNombrados) {
                if (huesped.getApellido().toLowerCase().startsWith(fieldApellido.getText().toLowerCase())) {
                    agregarFila(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDNI());
                }
            }
        }

    }//GEN-LAST:event_fieldApellidoKeyReleased

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idHuespedSeleccionado = (int) tabla.getValueAt(filaSeleccionada, 0);
            fieldID.setText(idHuespedSeleccionado + "");
            buscarPorId(idHuespedSeleccionado);

        }


    }//GEN-LAST:event_tablaMouseClicked

    private void radioButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_radioButtonPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonPropertyChange

    private void listarTodos_checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarTodos_checkBoxActionPerformed
        
    }//GEN-LAST:event_listarTodos_checkBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiarValores;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldCelular;
    private javax.swing.JTextField fieldCorreo;
    private javax.swing.JTextField fieldDNI;
    private javax.swing.JTextField fieldDomicilio;
    private javax.swing.JTextField fieldID;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox listarTodos_checkBox;
    private javax.swing.JRadioButton radioButton;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public void agregarCabeceraTabla() {
        modelo.addColumn("id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dni");
    }

    public void agregarFila(int id, String nombre, String apellido, int dni) {
        modelo.addRow(new Object[]{id, nombre, apellido, dni});
    }

    private void borrarFilasTabla() {

        for (int f = modelo.getRowCount() - 1; f > -1; f--) {
            modelo.removeRow(f);
        }
    }

    public void limpiarFields() {
        fieldID.setText("");
        fieldNombre.setText("");
        fieldApellido.setText("");
        fieldCorreo.setText("");
        fieldDNI.setText("");
        fieldDomicilio.setText("");
        fieldCelular.setText("");

        radioButton.setSelected(false);

    }

    public void buscarPorId(int idHuesped) {

        Huesped huesped = HuespedData.obtenerHuespedXid(idHuesped);

        fieldNombre.setText(huesped.getNombre());
        fieldApellido.setText(huesped.getApellido());
        fieldCorreo.setText(huesped.getCorreo());
        fieldDNI.setText(huesped.getDNI() + "");
        fieldDomicilio.setText(huesped.getDomicilio());
        fieldCelular.setText(huesped.getCelular() + "");

        if (huesped.isEstado()) {
            radioButton.setSelected(true);
        } else {
            radioButton.setSelected(false);
        }

    }

    public void buscarPorDNI(int dni) {
        Huesped huesped = HuespedData.obtenerHuespedXDni(dni);

        fieldID.setText(huesped.getIdHuesped() + "");
        fieldNombre.setText(huesped.getNombre());
        fieldApellido.setText(huesped.getApellido());
        fieldCorreo.setText(huesped.getCorreo());
        //fieldDNI.setText(huesped.getDNI() + "");
        fieldDomicilio.setText(huesped.getDomicilio());
        fieldCelular.setText(huesped.getCelular() + "");

        if (huesped.isEstado()) {
            radioButton.setSelected(true);
        } else {
            radioButton.setSelected(false);
        }

    }

    public ArrayList<Huesped> buscarPorNombre(String nombreHuesped) {

        ArrayList<Huesped> listaCompleta = HuespedData.listaCompletaHuespedes();
        ArrayList<Huesped> listaMismoNombre = new ArrayList<>();
        for (Huesped huesped : listaCompleta) {
            //FUE EN ESTE IF
            if (huesped.getNombre().toLowerCase().startsWith(nombreHuesped.toLowerCase())) {
                listaMismoNombre.add(huesped);
            }
        }
        if (radioButton.isSelected()) {
            listaMismoNombre = buscarHuespedesActivos(listaMismoNombre);
        }
        agregarFilas(listaMismoNombre);

        return listaMismoNombre;

    }

    public void buscarPorNombreYApellido(String nombreHuesped, String apellido) {
        ArrayList<Huesped> listaCompleta = HuespedData.listaCompletaHuespedes();
        ArrayList<Huesped> listaMismoNombreYApellido = new ArrayList<>();
        for (Huesped huesped : listaCompleta) {
            //FUE EN ESTE IF
            if (huesped.getNombre().toLowerCase().startsWith(nombreHuesped.toLowerCase()) && huesped.getApellido().toLowerCase().startsWith(apellido.toLowerCase())) {
                listaMismoNombreYApellido.add(huesped);

            }
        }

        if (radioButton.isSelected()) {
            listaMismoNombreYApellido = buscarHuespedesActivos(listaMismoNombreYApellido);
        }
        agregarFilas(listaMismoNombreYApellido);

    }

    public ArrayList<Huesped> buscarPorApellidoTipeado() {
        borrarFilasTabla();
        ArrayList<Huesped> listCompleta = HuespedData.listaCompletaHuespedes();
        ArrayList<Huesped> listaNombrados = new ArrayList<>();
        for (Huesped huesped : listCompleta) {
            if (huesped.getApellido().startsWith(fieldApellido.getText())) {
                listaNombrados.add(huesped);
            }
        }

        if (radioButton.isSelected()) {
            listaNombrados = buscarHuespedesActivos(listaNombrados);
        }

        return listaNombrados;
    }

    public ArrayList<Huesped> buscarPorNombreTipeado() {
        borrarFilasTabla();
        ArrayList<Huesped> listCompleta = HuespedData.listaCompletaHuespedes();
        ArrayList<Huesped> listaNombrados = new ArrayList<>();
        for (Huesped huesped : listCompleta) {
            if (huesped.getNombre().startsWith(fieldNombre.getText())) {
                listaNombrados.add(huesped);

            }
        }

        return listaNombrados;
    }

    public ArrayList<Huesped> buscarHuespedesActivos(ArrayList<Huesped> lista) {
        ArrayList<Huesped> listaActivos = new ArrayList<>();
        for (Huesped huesped : lista) {
            if (huesped.isEstado()) {
                listaActivos.add(huesped);
            }
        }
        return listaActivos;
    }

    public void agregarFilas(ArrayList<Huesped> lista) {

        for (Huesped huesped : lista) {
            agregarFila(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDNI());

        }

    }

}
