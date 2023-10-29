package vista;

import controlador.HuespedData;
import java.awt.Color;
import java.awt.Desktop;
import static java.awt.Desktop.getDesktop;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Huesped;

public class RegistrarHuesped extends javax.swing.JInternalFrame {

    int idAEliminar;
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
        llenarComboCorreos();
        textoAyuda.setBackground(Color.LIGHT_GRAY);
        btnEditar.setEnabled(false);
    }

    public RegistrarHuesped(int idAEliminar) {
        initComponents();
        tabla.setModel(modelo);
        agregarCabeceraTabla();
        llenarComboCorreos();
        textoAyuda.setBackground(Color.LIGHT_GRAY);
        btnEditar.setEnabled(false);
        this.idAEliminar = idAEliminar;
        llenarImputsBtnEliminarDeOtraVentana(idAEliminar);
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
        terminacionesCorreo = new javax.swing.JComboBox<>();
        btnSalir2 = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(700, 505));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 20));

        jLabel3.setText("DNI:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 198, -1, -1));

        jLabel5.setText("ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 20));

        jLabel6.setText("Domicilio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel8.setText("Celular:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel9.setText("Estado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jLabel10.setText("ABDUCCION DE HUESPED (REGISTRO HUESPED)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 0, -1, -1));
        getContentPane().add(fieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 180, -1));
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
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 160, 20, 0));

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 10, 0));

        listarTodos_checkBox.setText("LISTAR TODOS");
        listarTodos_checkBox.setToolTipText("PRESIONE BUSCAR PARA VER LA LISTA COMPLETA DE HUESPEDES");
        listarTodos_checkBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listarTodos_checkBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        listarTodos_checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarTodos_checkBoxActionPerformed(evt);
            }
        });
        getContentPane().add(listarTodos_checkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 10, 0));
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

        getContentPane().add(terminacionesCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 160, -1));

        btnSalir2.setText("Lista Huespedes");
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

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
        } else if (!fieldCelular.getText().isEmpty()) {
            int result = buscarPorCelular(Integer.parseInt(fieldCelular.getText()));
            if (result != 0) {
                buscarPorId(result);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado al huesped con ese celular");
            }
        } else if (!fieldCorreo.getText().isEmpty()) {
            String correo = fieldCorreo.getText();
            int id = buscarPorCorreo(correo);
            if (id != 0) {
                buscarPorId(id);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado al huesped con ese correo");
            }

        } else if (!fieldDomicilio.getText().isEmpty()) {
            String domicilio = fieldDomicilio.getText();
            int id = buscarPorDomicilio(domicilio);
            if (id != 0) {
                buscarPorId(id);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado al huesped con ese domicilio");
            }
        } else if (radioButton.isSelected()) {
            agregarFilas(HuespedData.listadeHuespedActivos());
        } else if (!radioButton.isSelected()) {
            agregarFilas(HuespedData.listadeHuespedNoActivos());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en el boton registrar");
            System.out.println("error en el metodo actionPerformed btnRegistrarActionPerformed(). por favor, verifique. error:" + e.getMessage());

        }//poner mas verificaciones: de no usen numeros en el nombre, apellido; que no se pueda usar "@" o otro signo en los campos (excepto en correo); 
        //VERIFICACIONES YA HECHAS:
        /*
            _Correo valido
            _dni sin letras ni signos
            _dni obligatorio de 8 digitos
            _campos vacios*/

        if (fieldNombre.getText().isEmpty() || fieldApellido.getText().isEmpty() || fieldDNI.getText().isEmpty() 
                || fieldCorreo.getText().isEmpty() || fieldCelular.getText().isEmpty() || fieldDomicilio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede haber campos vacios, por favor complete todos los campos");
        } else if(!verificarSoloLetrasYEspaciosER(fieldApellido.getText()) || !verificarLetrasNumeroYEspacios(fieldNombre.getText())){
            JOptionPane.showMessageDialog(this, "El nombre o el apellido poseen algun caracter no alfabetico, no debe tener puntos,numeros,"
                    + " ni cualquier otro signo, verifique y presione editar nuevamente");

        
        }else if (!verificadorSoloNumerosER(fieldDNI.getText())) {
            JOptionPane.showMessageDialog(this, "El dni posee algun caracter no numerico, no debe tener letras,"
                    + " puntos, ni cualquier otro signo, verifique y presione registrar nuevamente");
        } else if (fieldDNI.getText().length() != 8 && fieldDNI.getText().length() !=7) {
            JOptionPane.showMessageDialog(this, "El dni debe tener obligatoriamente 8 digitoso 7 digitos, ni mas, ni menos,"
                    + " verifique y presione registrar nuevamente");
        } else if (!verificarLetrasNumeroYEspacios(fieldDomicilio.getText())) {
            JOptionPane.showMessageDialog(this, "El domicilio poseen algun caracter no alfabetico, no debe tener puntos,numeros,"
                    + " ni cualquier otro signo, verifique y presione editar nuevamente");

        } else if (!(verificarCorreo(fieldCorreo.getText().trim()))) {
            JOptionPane.showMessageDialog(this, "El nombre de la direccion de correo no es valida, "
                    + "verifique y presione registrar nuevamente");
        } else if (terminacionesCorreo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Asegurate de seleccionar alguna extension @ para que la direccion de correo "
                    + "electronico sea valida");
        } else if(!verificadorSoloNumerosER(fieldCelular.getText())){
            JOptionPane.showMessageDialog(this, "El celular posee algun caracter no numerico, no debe tener letras, ni cualquier "
                    + "otro signo, verifique y presione editar nuevamente");
        }else{
            String nombre = fieldNombre.getText();
            String apellido = fieldApellido.getText();
            String domicilio = fieldDomicilio.getText();
            String correo = fieldCorreo.getText().trim() + terminacionesCorreo.getSelectedItem();
            int dni = Integer.parseInt(fieldDNI.getText().trim());
            int celular = Integer.parseInt(fieldCelular.getText().trim());

            Huesped huespedAct = new Huesped(nombre, apellido, dni, domicilio, correo, celular, true);
            HuespedData.subirHuesped(huespedAct);
            limpiarFields();
            borrarFilasTabla();
        }
    

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (fieldID.getText().isEmpty() || fieldNombre.getText().isEmpty() || fieldApellido.getText().isEmpty() || fieldDNI.getText().isEmpty() || fieldCorreo.getText().isEmpty() || fieldCelular.getText().isEmpty() || fieldDomicilio.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Le ha faltado colocar algun dato, verifique he intentelo de nuevo");

        } else if (!verificarSoloLetrasYEspaciosER(fieldNombre.getText()) || !verificarSoloLetrasYEspaciosER(fieldApellido.getText())) {

            JOptionPane.showMessageDialog(this, "El nombre o el apellido poseen algun caracter no alfabetico, no debe tener puntos,numeros,"
                    + " ni cualquier otro signo, verifique y presione editar nuevamente");

        } else if (!verificadorSoloNumerosER(fieldDNI.getText().trim())) {

            JOptionPane.showMessageDialog(this, "El dni posee algun caracter no numerico, no debe tener letras, "
                    + "puntos, ni cualquier otro signo, verifique y presione editar nuevamente");

        } else if (fieldDNI.getText().trim().length() != 8 && fieldDNI.getText().trim().length() != 7) {

            JOptionPane.showMessageDialog(this, "El dni debe tener obligatoriamente 8 digitos, ni mas, "
                    + "ni menos, verifique y presione editar nuevamente");

        } else if (!verificarLetrasNumeroYEspacios(fieldDomicilio.getText())) {
            JOptionPane.showMessageDialog(this, "El domicilio poseen algun caracter no alfabetico, no debe tener puntos,numeros,"
                    + " ni cualquier otro signo, verifique y presione editar nuevamente");

        } else if (!verificadorSoloNumerosER(fieldCelular.getText().trim())) {

            JOptionPane.showMessageDialog(this, "El celular posee algun caracter no numerico, no debe tener letras, ni cualquier otro signo, verifique y presione editar nuevamente");

        } else if (!(verificarCorreo(fieldCorreo.getText().trim()))) {
            JOptionPane.showMessageDialog(this, "El nombre de la direccion de correo no es valida, verifique y presione editar nuevamente");
        } else if (terminacionesCorreo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Asegurate de seleccionar alguna extension @ para que la direccion de correo electronico sea valida");
        } else {
            String correo = fieldCorreo.getText().trim() + terminacionesCorreo.getSelectedItem();
            String nombre = fieldNombre.getText();
            String apellido = fieldApellido.getText();
            String domicilio = fieldDomicilio.getText();
            int id = Integer.parseInt(fieldID.getText());
            int dni = Integer.parseInt(fieldDNI.getText().trim());
            int celular = Integer.parseInt(fieldCelular.getText().trim());
            boolean estado = radioButton.isSelected();
            int condicion = 1;
            if (!estado) {
                condicion = JOptionPane.showConfirmDialog(this, "El estado esta en inactivo, ¿el dato es correcto?");
            } else {
                condicion = 0;
            }
            if (condicion == 0) {
                HuespedData.actualizarHuesped(new Huesped(id, nombre, apellido, dni, domicilio, correo, celular, estado));
                limpiarFields();
                borrarFilasTabla();
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

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        ListaHuesped lh = new ListaHuesped();
        JDesktopPane desktop = getDesktopPane();

        desktop.add(lh);

        lh.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnSalir2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiarValores;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir2;
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
    private javax.swing.JComboBox<String> terminacionesCorreo;
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
        terminacionesCorreo.setSelectedIndex(0);
        btnEditar.setEnabled(false);
        fieldID.setEditable(true);

    }

    public void buscarPorId(int idHuesped) {

        Huesped huesped = HuespedData.obtenerHuespedXid(idHuesped);

        fieldID.setText(huesped.getIdHuesped() + "");
        fieldNombre.setText(huesped.getNombre());
        fieldApellido.setText(huesped.getApellido());
        fieldDNI.setText(huesped.getDNI() + "");
        fieldDomicilio.setText(huesped.getDomicilio());
        fieldCelular.setText(huesped.getCelular() + "");

        if (huesped.isEstado()) {
            radioButton.setSelected(true);
        } else {
            radioButton.setSelected(false);
        }

        //COLOCA EL CORREO
        String correoHuesped = huesped.getCorreo();
        String correoName = "";
        boolean flag = true, flag2 = true;

        for (int i = 0; i < correoHuesped.length(); i++) {
            if (flag2 && !(correoHuesped.charAt(i) == '@')) {
                correoName = correoName + correoHuesped.charAt(i);
                if (flag && correoHuesped.endsWith(terminacionesCorreo.getItemAt(i))) {
                    terminacionesCorreo.setSelectedIndex(i);
                    flag = false;
                }
            } else {
                flag2 = false;
            }
        }
        fieldCorreo.setText(correoName);

        btnEditar.setEnabled(true);
        fieldID.setEditable(false);
    }

    public void buscarPorDNI(int dni) {
        Huesped huesped = HuespedData.obtenerHuespedXDni(dni);

        fieldID.setText(huesped.getIdHuesped() + "");
        fieldNombre.setText(huesped.getNombre());
        fieldApellido.setText(huesped.getApellido());
        fieldDNI.setText(huesped.getDNI() + "");
        fieldDomicilio.setText(huesped.getDomicilio());
        fieldCelular.setText(huesped.getCelular() + "");

        if (huesped.isEstado()) {
            radioButton.setSelected(true);
        } else {
            radioButton.setSelected(false);
        }

        //COLOCA EL CORREO
        String correoHuesped = huesped.getCorreo();
        String correoName = "";
        boolean flag = true, flag2 = true;

        for (int i = 0; i < correoHuesped.length(); i++) {
            if (flag2 && !(correoHuesped.charAt(i) == '@')) {
                correoName = correoName + correoHuesped.charAt(i);
                if (flag && correoHuesped.endsWith(terminacionesCorreo.getItemAt(i))) {
                    terminacionesCorreo.setSelectedIndex(i);
                    flag = false;
                }
            } else {
                flag2 = false;
            }
        }
        fieldCorreo.setText(correoName);

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
        char[] letras = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        for (char letra : letras) {
            if (cadena.toLowerCase().contains(letra + "")) {
                return false;
            } else if (fieldID.getText().contains(letra + "")) {
                return false;
            }
        }
        return true;
    }

    public int buscarPorCelular(int cel) {
        for (Huesped Huesped : HuespedData.listaCompletaHuespedes()) {
            if (Huesped.getCelular() == cel) {
                return Huesped.getIdHuesped();
            }
        }
        return 0;
    }

    public int buscarPorCorreo(String correo) {
        for (Huesped Huesped : HuespedData.listaCompletaHuespedes()) {
            if (Huesped.getCorreo().startsWith(correo)) {
                return Huesped.getIdHuesped();
            }
        }
        return 0;
    }

    public int buscarPorDomicilio(String domicilio) {
        for (Huesped Huesped : HuespedData.listaCompletaHuespedes()) {
            if (Huesped.getDomicilio().startsWith(domicilio)) {
                return Huesped.getIdHuesped();
            }
        }
        return 0;
    }

    public boolean verificarCorreo(String nombreCorreo) {
        String ultimaLetraCorreo = nombreCorreo.substring(nombreCorreo.length() - 1, nombreCorreo.length());
        String primeraLetraCorreo = nombreCorreo.substring(0, 1);

        //SE CREAN LAS BANDERAS
        boolean letrado = false, signado = false, numerado = false, punteado = false;
        //SE CREAN LOS ARRAYLIST
        String[] abc = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        ArrayList<String> letras = new ArrayList<>();
        ArrayList<String> numeros1 = new ArrayList<>();
        for (String l : abc) {
            letras.add(l);
        }
        for (String num : numeros) {
            numeros1.add(num);
        }

        //SE EMPIEZAN LAS VERIFICACIONES
        for (int i = 0; i < nombreCorreo.length(); i++) {
            System.out.println("vuelta " + i + ", letra: " + nombreCorreo.toLowerCase().substring(i, i + 1));
            if (letras.contains(nombreCorreo.toLowerCase().substring(i, i + 1))) {
                System.out.println("entra if letrado");

                letrado = true;
                continue;

                /*int j = 0;
                for (; j < letras.length; j++) {
                    if (nombreCorreo.toLowerCase().substring(i, i + 1).equals(letras[j])) {
                        letrado = true;
                        continue;
                    }
                }*/
            } else if (numeros1.contains(nombreCorreo.substring(i, i + 1))) {
                //if (nombreCorreo.substring(i, i + 1).equals("0") || nombreCorreo.substring(i, i + 1).equals("1") || nombreCorreo.substring(i, i + 1).equals("2") || nombreCorreo.substring(i, i + 1).equals("3") || nombreCorreo.substring(i, i + 1).equals("4") || nombreCorreo.substring(i, i + 1).equals("5") || nombreCorreo.substring(i, i + 1).equals("6") || nombreCorreo.substring(i, i + 1).equals("7") || nombreCorreo.substring(i, i + 1).equals("8") || nombreCorreo.substring(i, i + 1).equals("9")) {
                System.out.println("entra if numerico");
                numerado = true;
                continue;
            } else if (nombreCorreo.contains(".")) {
                System.out.println("entra if punto");
                punteado = true;
                continue;
            } else {
                System.out.println("entra if signado");
                signado = true;
                break;
            }
        }
        System.out.println("primera letra nombre correo: " + primeraLetraCorreo);
        System.out.println("ultima letra nombre correo: " + ultimaLetraCorreo);
        System.out.println("nombreCorreo: " + nombreCorreo);
        System.out.println("letrado: " + letrado);
        System.out.println("signado: " + signado);

        return !nombreCorreo.contains("@") && !nombreCorreo.contains(".com") && !primeraLetraCorreo.equals(".") && !ultimaLetraCorreo.equals(".") && !nombreCorreo.toLowerCase().contains("ñ") && letrado && !(signado) && (nombreCorreo.length() > 5 && nombreCorreo.length() < 31);

    }

    public void llenarComboCorreos() {
        terminacionesCorreo.addItem("SELECCIONE UNO");
        terminacionesCorreo.addItem("@gmail.com");
        terminacionesCorreo.addItem("@hotmail.com");
        terminacionesCorreo.addItem("@outlook.com");
        terminacionesCorreo.addItem("@icloud.com");
        terminacionesCorreo.addItem("@protonmail.com");
        terminacionesCorreo.addItem("@me.com");
        terminacionesCorreo.addItem("@mac.com");
        terminacionesCorreo.addItem("@gmx.es");
        terminacionesCorreo.addItem("@yahoo.com");
    }

    public void llenarImputsBtnEliminarDeOtraVentana(int id) {
        buscarPorId(id);

    }

    /*-------------------------------------- OTROS VERIFICADORES------------------------------------------------------------------------------*/
    public boolean verificadorSoloNumerosER(String texto) {
        /*Expresión regular*/
        if (texto.matches("\\d+")) {
            int numeroEntero = Integer.parseInt(texto);
            return true;

        } else {
            return false;
        }
    }

    public boolean verificarSoloLetrasER(String texto) {
        /*Expresion regular*/
        if (texto.matches("[a-zA-Z]+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarSoloLetrasYEspaciosER(String texto) {
        /*Expresion regular*/
        if (texto.matches("[a-zA-Z ]+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificadorNumerosEnterosYDecimalesER(String texto) {
        /* Expresión regular que permite números enteros o decimales */
        if (texto.matches("\\d+|\\d*\\.\\d+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarLetrasNumeroYEspacios(String texto) {
        if (texto.matches("[a-zA-Z0-9 ]+")) {
            return true;
        } else {
            return false;
        }
    }
 
    /**//*--------------------------------------------------------------------------------------------------------------------------------*/
}
