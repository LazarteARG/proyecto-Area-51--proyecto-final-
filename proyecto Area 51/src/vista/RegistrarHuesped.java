package vista;

import controlador.HuespedData;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
        textoAyuda.setBackground(Color.LIGHT_GRAY);
        btnEditar.setEnabled(false);
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
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoAyuda = new javax.swing.JTextArea();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1150, 505));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 20));

        jLabel3.setText("DNI:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 198, -1, -1));

        jLabel5.setText("ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 20));

        jLabel6.setText("Domicilio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel8.setText("Celular:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel9.setText("Estado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jLabel10.setText("ABDUCCION DE HUESPED (REGISTRO HUESPED)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 0, -1, -1));
        getContentPane().add(fieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 200, -1));
        getContentPane().add(fieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 200, -1));

        fieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldNombreKeyReleased(evt);
            }
        });
        getContentPane().add(fieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 200, -1));

        fieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldApellidoKeyReleased(evt);
            }
        });
        getContentPane().add(fieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 200, -1));
        getContentPane().add(fieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 200, -1));
        getContentPane().add(fieldDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 200, -1));
        getContentPane().add(fieldCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 200, -1));

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
        getContentPane().add(radioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        btnEliminar.setText("Eliminar Huesped");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 140, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        btnLimpiarValores.setText("Limpiar Valores");
        btnLimpiarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarValoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiarValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 450, 280));

        listarTodos_checkBox.setText("LISTAR TODOS");
        listarTodos_checkBox.setToolTipText("PRESIONE BUSCAR PARA VER LA LISTA COMPLETA DE HUESPEDES");
        listarTodos_checkBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listarTodos_checkBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        listarTodos_checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarTodos_checkBoxActionPerformed(evt);
            }
        });
        getContentPane().add(listarTodos_checkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 120, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jScrollPane2.setForeground(new java.awt.Color(102, 102, 102));

        textoAyuda.setEditable(false);
        textoAyuda.setColumns(20);
        textoAyuda.setRows(2);
        textoAyuda.setText("Para buscar,registrar o eliminar ingrese datos del huesped y use los botones,\n para editar primero busque el huesped, para buscar de nuevo primero limpie los valores");
        textoAyuda.setAutoscrolls(false);
        textoAyuda.setBorder(null);
        jScrollPane2.setViewportView(textoAyuda);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 500, 40));

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
            ArrayList<Huesped> apellidados = buscarPorApellidoTipeado();
            agregarFilas(apellidados);
            //sino solo por estado    
        } else if (radioButton.isSelected()) {
            agregarFilas(HuespedData.listadeHuespedActivos());
        } else if (!radioButton.isSelected()) {
            agregarFilas(HuespedData.listadeHuespedNoActivos());
        }
    }//GEN-LAST:event_radioButtonActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
  
        int seguro = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea eliminar?");

        if (seguro == 0) {
            if (!fieldID.getText().isEmpty()) {
                if (verificadorSoloNumeros(fieldID.getText())) {
                    int idHuesped = Integer.parseInt(fieldID.getText());
                    HuespedData.bajarHuesped(idHuesped);
                    limpiarFields();
                    borrarFilasTabla(); 

                } else {
                    JOptionPane.showMessageDialog(null, "No debe contener letras el ID");
                }
            } else if (!fieldDNI.getText().isEmpty()) {
                if (verificadorSoloNumeros(fieldDNI.getText())) {
                    int dni = Integer.parseInt(fieldDNI.getText());
                    int idHuesped = HuespedData.obtenerHuespedXDni(dni).getIdHuesped();
                    HuespedData.bajarHuesped(idHuesped);
                    limpiarFields();
                    borrarFilasTabla(); 
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No debe contener letras el DNI");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Para poder dar de baja un huesped debe escribir su id o su dni, en caso de no conocerlo busuqelo en la tabla y seleccionelo allí");
            }
           
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //buscar por id
        borrarFilasTabla();
        //si tiene id, busca por id
        if (listarTodos_checkBox.isSelected()) {
            limpiarFields();
            agregarFilas(HuespedData.listaCompletaHuespedes());
        } else if (!fieldID.getText().isEmpty()) {
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
        } else if(!fieldCelular.getText().isEmpty()){
            int result=buscarPorCelular(Integer.parseInt(fieldCelular.getText()));
            if(result!=0){
                buscarPorId(result); 
            }else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado al huesped con ese celular");
            }
        }else if(!fieldCorreo.getText().isEmpty()){
            String correo=fieldCorreo.getText();
            int id=buscarPorCorreo(correo);
            if(id!=0){
                buscarPorId(id); 
            }else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado al huesped con ese correo");
            }
            
        }else if(!fieldDomicilio.getText().isEmpty()){
            String domicilio=fieldDomicilio.getText();
            int id=buscarPorDomicilio(domicilio);
            if(id!=0){
                buscarPorId(id); 
            }else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado al huesped con ese domicilio");
            }
        }else if (radioButton.isSelected()) {
            agregarFilas(HuespedData.listadeHuespedActivos());
        } else if (!radioButton.isSelected()) {
            agregarFilas(HuespedData.listadeHuespedNoActivos());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            String nombre = fieldNombre.getText();
            String apellido = fieldApellido.getText();
            String domicilio = fieldDomicilio.getText();
            String correo = fieldCorreo.getText().trim();
            verificarCorreo(correo);
            int dni = Integer.parseInt(fieldDNI.getText());
            int celular = Integer.parseInt(fieldCelular.getText());
            //poner mas verificaciones: de no usen numeros en el nombre, apellido; que no se pueda usar "@" o otro signo en los campos (excepto en correo); 
            
            if (fieldNombre.getText().isEmpty() || fieldApellido.getText().isEmpty() || fieldDNI.getText().isEmpty() || fieldCorreo.getText().isEmpty() || fieldCelular.getText().isEmpty() || fieldDomicilio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios, por favor complete todos los campos");
                
            }else {
            Huesped huespedAct = new Huesped(nombre, apellido, dni, domicilio, correo, celular, true);
             HuespedData.subirHuesped(huespedAct);
            
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en el boton registrar");
             System.out.println("error en el metodo actionPerformed btnRegistrarActionPerformed(). por favor, verifique. ");
             
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (fieldID.getText().isEmpty() || fieldNombre.getText().isEmpty() || fieldApellido.getText().isEmpty() || fieldDNI.getText().isEmpty() || fieldCorreo.getText().isEmpty() || fieldCelular.getText().isEmpty() || fieldDomicilio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le ha faltado colocar algun dato, verifique he intentelo de nuevo");
        } else {
            String nombre = fieldNombre.getText();
            String apellido = fieldApellido.getText();
            String domicilio = fieldDomicilio.getText();
            String correo = fieldCorreo.getText();
            int id = Integer.parseInt(fieldID.getText());
            int dni = Integer.parseInt(fieldDNI.getText());
            int celular = Integer.parseInt(fieldCelular.getText());
            boolean estado = radioButton.isSelected();
            int condicion = 1;
            if (!estado) {
                condicion = JOptionPane.showConfirmDialog(this, "El estado esta en inactivo, ¿el dato es correcto?");
            } else {
                condicion = 0;
            }
            if (condicion == 0) {
                JOptionPane.showMessageDialog(this, "Se intentara actualizar el huesped");
                HuespedData.actualizarHuesped(new Huesped(id, nombre, apellido, dni, domicilio, correo, celular, estado));
            } else {
                JOptionPane.showMessageDialog(this, "no se subira el huesped");
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
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
                    agregarFila(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDNI(), huesped.isEstado());
                }
            }
        } else {
            ArrayList<Huesped> listaNombrados = buscarPorApellidoTipeado();
            if (radioButton.isSelected()) {
                listaNombrados = buscarHuespedesActivos(listaNombrados);
            }
            for (Huesped huesped : listaNombrados) {
                if (huesped.getNombre().toLowerCase().startsWith(fieldNombre.getText().toLowerCase())) {
                    agregarFila(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDNI(), huesped.isEstado());
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
                    agregarFila(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDNI(), huesped.isEstado());
                }
            }
        } else {
            ArrayList<Huesped> listaNombrados = buscarPorNombreTipeado();
            if (radioButton.isSelected()) {
                listaNombrados = buscarHuespedesActivos(listaNombrados);
            }
            for (Huesped huesped : listaNombrados) {
                if (huesped.getApellido().toLowerCase().startsWith(fieldApellido.getText().toLowerCase())) {
                    agregarFila(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDNI(), huesped.isEstado());
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
            fieldID.setEditable(false);
        }


    }//GEN-LAST:event_tablaMouseClicked

    private void radioButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_radioButtonPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonPropertyChange

    private void listarTodos_checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarTodos_checkBoxActionPerformed
        limpiarFields();
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox listarTodos_checkBox;
    private javax.swing.JRadioButton radioButton;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea textoAyuda;
    // End of variables declaration//GEN-END:variables

    public void agregarCabeceraTabla() {
        modelo.addColumn("id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dni");
        modelo.addColumn("Estado");
    }

    public void agregarFila(int id, String nombre, String apellido, int dni, boolean estado) {
        String estad = (estado) ? "Hospedada/o" : "No Hospedada/o";
        modelo.addRow(new Object[]{id, nombre, apellido, dni, estad});
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
        btnEditar.setEnabled(false);
        fieldID.setEditable(true);

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
        btnEditar.setEnabled(true);
        fieldID.setEditable(false);
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
        btnEditar.setEnabled(true);
        fieldID.setEditable(false);

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
            agregarFila(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDNI(), huesped.isEstado());

        }

    }

 public boolean verificadorSoloNumeros(String cadena) {
        char[] letras = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'ñ', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        for (char letra : letras) {
            if (cadena.toLowerCase().contains(letra + "")) {
                return false;
            } else if (fieldID.getText().contains(letra + "")) {
                return false;
            }
        }
        return true;
    }
    public int buscarPorCelular(int cel){
        for (Huesped Huesped : HuespedData.listaCompletaHuespedes()) {
            if(Huesped.getCelular()==cel){
                return Huesped.getIdHuesped();
            }
        }
        return 0;
    }
        public int buscarPorCorreo(String correo){
        for (Huesped Huesped : HuespedData.listaCompletaHuespedes()) {
            if(Huesped.getCorreo().startsWith(correo)){
                return Huesped.getIdHuesped();
            }
        }
        return 0;
    }
    
    public int buscarPorDomicilio(String domicilio){
        for (Huesped Huesped : HuespedData.listaCompletaHuespedes()) {
            if(Huesped.getDomicilio().startsWith(domicilio)){
                return Huesped.getIdHuesped();
            }
        }
        return 0;
    }

    public boolean verificarCorreo (String correo) {
        System.out.println(correo.substring(correo.length()-4, correo.length()));
        String variableMuyUtil = correo.substring(correo.length()-4, correo.length());
        boolean variableArroba = correo.contains(".@") && correo.contains("@.");
        String principiodelCorreo = correo.substring(0, correo.length()-5);
        System.out.println(principiodelCorreo);
        System.out.println(correo.charAt(0));
        String nombreCorreo;
        
        for (int contadorLetras = 0; contadorLetras < correo.length(); contadorLetras++) {            
            if ((correo.charAt(contadorLetras)== "@")) {
                nombreCorreo=nombreCorreo+correo.charAt(contadorLetras);
            }
        }
        
        return correo.contains("@") && variableMuyUtil.equals(".com") && !principiodelCorreo.contains(".com") && !(correo.charAt(0) == '@') && !(correo.charAt(0) == '.') && !(variableArroba);
        
    }
    
    
}
