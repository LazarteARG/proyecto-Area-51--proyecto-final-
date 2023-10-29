package vista;

import controlador.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Habitacion;

public class RegistrarHabitacion extends javax.swing.JInternalFrame {

    public RegistrarHabitacion() {
        initComponents();
        llenarComboCategorias();
        textoAyuda.setBackground(Color.WHITE);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        idField.setEditable(false);
    }

    public RegistrarHabitacion(ArrayList<String> datos) {
        initComponents();
        llenarComboCategorias();
        textoAyuda.setBackground(Color.WHITE);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        idField.setEditable(false);
        if (!datos.isEmpty()) {
            idField.setText(datos.get(0));
            pisoField.setText(datos.get(2));
            estadoRadioButtom.setSelected(datos.get(3).equals("Habilitada"));
            categoriasComboBox.setSelectedItem(datos.get(1));

            /*TIP: PASAR UNA CADENA CON PALABRAS O FRASES SEPARADAS POR UN CARACTER A UNA LIST
            List<String> id= Arrays.asList(c.split("-"));
            pisoField.setText(datos.get(2));*/
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pisoJLabel = new javax.swing.JLabel();
        categoriaJLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idJLabel = new javax.swing.JLabel();
        estadoJLabel = new javax.swing.JLabel();
        tituloVistaJLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        pisoField = new javax.swing.JTextField();
        estadoRadioButtom = new javax.swing.JRadioButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiarValores = new javax.swing.JButton();
        textoAyuda = new javax.swing.JTextArea();
        categoriasComboBox = new javax.swing.JComboBox<>();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(698, 431));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pisoJLabel.setText("Piso:");
        getContentPane().add(pisoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        categoriaJLabel.setText("Categoria:");
        getContentPane().add(categoriaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 20));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 198, -1, -1));

        idJLabel.setText("Numero de Habitacion:");
        getContentPane().add(idJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 20));

        estadoJLabel.setText("Habilitada para su uso:");
        getContentPane().add(estadoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        tituloVistaJLabel.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        tituloVistaJLabel.setText("HABILITAR ALOJAMIENTO PARA HUMANO(CREAR HABITACION)");
        getContentPane().add(tituloVistaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        idField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idFieldKeyReleased(evt);
            }
        });
        getContentPane().add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, -1));
        getContentPane().add(pisoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 210, -1));
        getContentPane().add(estadoRadioButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        btnEliminar.setText("Eliminar Habitacion");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 140, -1));

        btnBuscar.setText("Buscar Habitaciones");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        btnLimpiarValores.setText("Limpiar Valores");
        btnLimpiarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarValoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiarValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        textoAyuda.setEditable(false);
        textoAyuda.setColumns(20);
        textoAyuda.setRows(3);
        textoAyuda.setText("Para REGISTRAR o ELIMINAR una habitacion ingrese los datos.\nPara EDITAR puede ingresar TODOS los datos o buscar la habitacion\n\nPara buscar presione 'Buscar Habitaciones'");
        textoAyuda.setAutoscrolls(false);
        textoAyuda.setFocusable(false);
        textoAyuda.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(textoAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, 70));

        getContentPane().add(categoriasComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (!idField.getText().isEmpty()) {

            if (verificadorSoloNumeros(idField.getText())) {

                int seguro = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea eliminar?");
                if (seguro == 0) {
                    int idHabitacion = Integer.parseInt(idField.getText());
                    Habitacion h = HabitacionDataBORRADOR.obtenerHabitacionXId(idHabitacion);
                    if (h.getIdHabitacion() == 0) {
                        JOptionPane.showMessageDialog(this, "No se ha encontrado la habitacion con ese numero, verifique he intente de nuevo");
                    } else {
                        HabitacionDataBORRADOR.bajarHabitacion(idHabitacion);
                        limpiarFields();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "El ID No debe contener letras");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Para poder dar de baja una habitacion debe escribir su id, en caso de no conocerlo busuqelo con el boton buscar habitaciones");
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            if (idField.getText().isEmpty() || pisoField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Le ha faltado colocar algun dato, verifique he intentelo de nuevo");
            } else if (!verificadorSoloNumeros(pisoField.getText().trim())) {
                JOptionPane.showMessageDialog(this, "El piso posee algun caracter no numerico, no debe tener letras, puntos, ni cualquier otro signo, verifique y presione editar nuevamente");
            } else if (pisoField.getText().trim().length() > 3) {
                JOptionPane.showMessageDialog(this, "El piso solo puede tener hasta 3 digitos");
            } else if (pisoField.getText().trim().length() > 1 && pisoField.getText().substring(0, 1).equals("0")) {
                JOptionPane.showMessageDialog(this, "El piso no puede comenzar con 0 (cero)");
            } else if (categoriasComboBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Asegurese de seleccionar alguna categoria");
            } else {
                int piso = Integer.parseInt(pisoField.getText());
                int idcategoria = getIdCategoriaCombo(categoriasComboBox.getSelectedItem().toString());
                int estado = estadoRadioButtom.isSelected() ? 1 : 0;
                int condicion = 1;
                
                if (estado == 0) {
                    condicion = JOptionPane.showConfirmDialog(this, "El estado esta en inactivo, ¿desea subir la habitacion como inhabilitada?");
                } else {
                    condicion = 0;
                }

                if (condicion == 0) {
                    Habitacion h = new Habitacion(idcategoria, piso, estado);
                
                    HabitacionDataBORRADOR.subirHabitacion(h);
                    limpiarFields();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en el boton registrar");
            System.out.println("error en el metodo actionPerformed btnRegistrarActionPerformed(). por favor, verifique. ");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (idField.getText().isEmpty() || pisoField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le ha faltado colocar algun dato, verifique he intentelo de nuevo");
        } else if (!verificadorSoloNumeros(pisoField.getText().trim())) {
            JOptionPane.showMessageDialog(this, "El piso posee algun caracter no numerico, no debe tener letras, puntos, ni cualquier otro signo, verifique y presione editar nuevamente");
        } else if (pisoField.getText().trim().length() > 3) {
            JOptionPane.showMessageDialog(this, "El piso solo puede tener hasta 3 digitos");
        } else if (pisoField.getText().trim().length() > 1 && pisoField.getText().substring(0, 1).equals("0")) {
            JOptionPane.showMessageDialog(this, "El piso no puede comenzar con 0 (cero)");
        } else if (categoriasComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Asegurese de seleccionar alguna categoria");
        } else {

            int piso = Integer.parseInt(pisoField.getText());
            int id = Integer.parseInt(idField.getText());
            int idcategoria = getIdCategoriaCombo(categoriasComboBox.getSelectedItem().toString());
            boolean estado = estadoRadioButtom.isSelected();
            int condicion =1;
            

            if (!estado) {
                condicion = JOptionPane.showConfirmDialog(this, "El estado esta en inactivo, ¿el dato es correcto?");
            } else {
                condicion = 0;
            }

            if (condicion == 0) {
                Habitacion h = HabitacionDataBORRADOR.obtenerHabitacionXId(id);

                if (h.getIdHabitacion() == 0) {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado la habitacion con ese numero, verifique he intente de nuevo");
                } else {
                    HabitacionDataBORRADOR.actualizarHabitacion(new Habitacion(id, idcategoria, piso, (estadoRadioButtom.isSelected())?1:0),true);
                    limpiarFields();
                }
            } else {
                JOptionPane.showMessageDialog(this, "no se subira la habitacion");
            }

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarValoresActionPerformed
        limpiarFields();
    }//GEN-LAST:event_btnLimpiarValoresActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscarHabitacion bh = new BuscarHabitacion();
        bh.setVisible(true);
        this.setVisible(false);
        JDesktopPane desktop = getDesktopPane();
        desktop.add(bh);
        desktop.moveToFront(bh);
        this.dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void idFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idFieldKeyReleased
        if ((!btnEliminar.isEnabled()) && (!btnEditar.isEnabled())) {
            btnEliminar.setEnabled(true);
            btnEditar.setEnabled(true);
        }
    }//GEN-LAST:event_idFieldKeyReleased

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiarValores;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel categoriaJLabel;
    private javax.swing.JComboBox<String> categoriasComboBox;
    private javax.swing.JLabel estadoJLabel;
    private javax.swing.JRadioButton estadoRadioButtom;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField pisoField;
    private javax.swing.JLabel pisoJLabel;
    private javax.swing.JTextArea textoAyuda;
    private javax.swing.JLabel tituloVistaJLabel;
    // End of variables declaration//GEN-END:variables

    public void limpiarFields() {
        idField.setText("");
        pisoField.setText("");
        estadoRadioButtom.setSelected(false);
        categoriasComboBox.setSelectedIndex(0);

        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);

        idField.setEditable(true);

    }

    public boolean verificadorSoloNumeros(String cadena) {
        char[] letras = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        for (char letra : letras) {
            if (cadena.toLowerCase().contains(letra + "")) {
                return false;
            } else if (idField.getText().contains(letra + "")) {
                return false;
            }
        }
        return true;
    }

//    public boolean verificarSoloLetras(String nombre) {
//        //SE CREAN LOS ARRAYLIST
//        String[] abc ={" ","q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m","ñ"};
//    
//        ArrayList<String> letras = new ArrayList<>();
//
//        for (String l : abc) {
//            letras.add(l);
//        }
//        
//        //SE EMPIEZAN LAS VERIFICACIONES
//        for (int i = 0; i < nombre.length(); i++) {
//            if (!letras.contains(nombre.toLowerCase().substring(i, i + 1))) {
//                return false;
//            } 
//        }
//        
//        return true;
//
//    }
    public void llenarComboCategorias() {
        categoriasComboBox.addItem((String) "SELECCIONE UNA CATEGORIA");
        String texto;
        for (Categoria c : CategoriaData.listarTodasLasCategorias()) {
            texto = c.getIdCategoria() + "_ " + c.getNombre();
            categoriasComboBox.addItem((String) texto);
        }
    }
    
    public int getIdCategoriaCombo(String c) {
        int idC=0;

        try {

            if (c.substring(0, 2).contains("_")) {
                idC = Integer.parseInt(c.substring(0, 1).trim());
            } else if (c.substring(0, 3).contains("_")) {
                idC = Integer.parseInt(c.substring(0, 2));
            } else {
                idC = Integer.parseInt(c.substring(0, 3));
            }
            
        } catch (NumberFormatException e) {
        }
        return idC;
    }
}
