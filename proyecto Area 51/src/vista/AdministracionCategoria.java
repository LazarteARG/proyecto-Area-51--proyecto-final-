package vista;

import controlador.CategoriaData;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import modelo.Categoria;

public class AdministracionCategoria extends javax.swing.JInternalFrame {

    public AdministracionCategoria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbEditarCategoria = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        fieldID = new javax.swing.JTextField();
        jbRegistrarCategoria = new javax.swing.JButton();
        jbEliminarCategoria = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        fieldTiposdeCamas = new javax.swing.JTextField();
        fieldCantdePersonas = new javax.swing.JTextField();
        fieldCantdeCamas = new javax.swing.JTextField();
        fieldPrecioxNoche = new javax.swing.JTextField();
        jbLimpiarValores = new javax.swing.JButton();
        jbListadeCategoria = new javax.swing.JButton();

        jbEditarCategoria.setText("Editar");
        jbEditarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarCategoriaActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setRows(3);
        jTextArea1.setText("*Para registrar, editar o eliminar una categoria primero ingrese \nlos datos en los campos respectivos y luego use el boton que necesita.\nPero si necesita ver la lista de categoria aprete el boton 'Lista'.");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("ADMINISTRACION DE CATEGORIA");

        fieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIDActionPerformed(evt);
            }
        });

        jbRegistrarCategoria.setText("Registrar");
        jbRegistrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarCategoriaActionPerformed(evt);
            }
        });

        jbEliminarCategoria.setText("Eliminar");
        jbEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarCategoriaActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Tipos de camas:");

        jLabel5.setText("Cant. de personas:");

        jLabel6.setText("Cant. de camas:");

        jLabel7.setText("Precio x Noche:");

        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });

        fieldCantdeCamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCantdeCamasActionPerformed(evt);
            }
        });

        fieldPrecioxNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPrecioxNocheActionPerformed(evt);
            }
        });

        jbLimpiarValores.setText("Limpiar");
        jbLimpiarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarValoresActionPerformed(evt);
            }
        });

        jbListadeCategoria.setText("Lista");
        jbListadeCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListadeCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jbRegistrarCategoria))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fieldPrecioxNoche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(fieldCantdeCamas, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldCantdePersonas, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldID)
                                    .addComponent(fieldNombre)
                                    .addComponent(fieldTiposdeCamas))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbLimpiarValores)
                                    .addComponent(jbListadeCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jbEditarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbEliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jTextArea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbLimpiarValores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbListadeCategoria)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(fieldTiposdeCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fieldCantdePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(fieldCantdeCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(fieldPrecioxNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistrarCategoria)
                    .addComponent(jbEditarCategoria)
                    .addComponent(jbEliminarCategoria)
                    .addComponent(jbSalir))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEditarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarCategoriaActionPerformed
        
        try {
            if (fieldCantdeCamas.getText().isEmpty() || fieldCantdePersonas.getText().isEmpty() || fieldID.getText().isEmpty() || fieldNombre.getText().isEmpty() || fieldPrecioxNoche.getText().isEmpty() || fieldTiposdeCamas.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Le ha faltado colocar algun dato, verifique he intentelo de nuevo");
            }else if(verificadorSoloNumeros(fieldID.getText())){
                int id= Integer.parseInt(fieldID.getText());
                String  nombre= fieldNombre.getText();
                String  tipoCamas= fieldTiposdeCamas.getText();
                int cantPersonas=Integer.parseInt(fieldCantdePersonas.getText());
                int cantCamas=Integer.parseInt(fieldCantdeCamas.getText());
                double precioxNoche= Double.parseDouble(fieldPrecioxNoche.getText());
            
                Categoria c=new Categoria(id, nombre, tipoCamas, cantPersonas, cantCamas, precioxNoche);
                
                CategoriaData.actualizarCategoria(c);

            }else{
                JOptionPane.showMessageDialog(this, "Verifique que los numeros ingresados no posean letras");        
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Verifique que los numeros ingresados no posean letras.");
            System.out.println("NumberFormatException en boton editar, error= "+e.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error en el boton Editar");
            System.out.println("Error en el metodo jbEditarCategoriaActionPerformed(), por favor revise.");    
        }


    }//GEN-LAST:event_jbEditarCategoriaActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void fieldCantdeCamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCantdeCamasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCantdeCamasActionPerformed

    private void fieldPrecioxNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPrecioxNocheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPrecioxNocheActionPerformed

    private void fieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIDActionPerformed
        if (verificadorSoloNumeros(fieldID.getText())) {
            int idCategoria = Integer.parseInt(fieldID.getText());
            CategoriaData.eliminarCategoria(idCategoria);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Id no valido");
        }
    }//GEN-LAST:event_fieldIDActionPerformed

    private void jbEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarCategoriaActionPerformed

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void jbRegistrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarCategoriaActionPerformed
        try {
            String nombre = fieldNombre.getText();
            String tipoDeCamas = fieldTiposdeCamas.getText();
            int cantidadPersonas = Integer.parseInt(fieldCantdePersonas.getText());
            int cantidadCamas = Integer.parseInt(fieldCantdeCamas.getText());
            double precioNoche = Double.parseDouble(fieldPrecioxNoche.getText());

            if (fieldNombre.getText().isEmpty() || fieldTiposdeCamas.getText().isEmpty() || fieldCantdePersonas.getText().isEmpty() || fieldCantdeCamas.getText().isEmpty() || fieldPrecioxNoche.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios, por favor complete todos los campos.");
            } else if (!verificadorSoloLetras(fieldNombre.getText()) && !verificadorSoloLetras(fieldTiposdeCamas.getText())) {
                JOptionPane.showMessageDialog(this, "No se puede usar numeros en los campos 'Nombre' y 'Tipos de camas'.");
            } else if (!verificadorSoloNumeros(fieldCantdeCamas.getText()) &&  !verificadorSoloNumeros(fieldCantdePersonas.getText())) {
                JOptionPane.showConfirmDialog(this, "No se puede usar letras en los campos 'Cant. de camas' y 'Cant. de personas'.");
            } else if (!verificadorParaPrecioxNoche(fieldPrecioxNoche.getText())) {
                JOptionPane.showMessageDialog(this, "No se puede usar letras en el campo 'Precio x Noche'.");
            } else {
                Categoria categoria = new Categoria(nombre, tipoDeCamas, cantidadPersonas,cantidadCamas, precioNoche);
                CategoriaData.subirCategoria(categoria);
                
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en el boton Registrar");
            System.out.println("Error en el metodo jbRegistrarCategoriaActionPerformed(), por favor revise.");
        }
    }//GEN-LAST:event_jbRegistrarCategoriaActionPerformed

    private void jbLimpiarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarValoresActionPerformed
         fieldCantdeCamas.setText("");
         fieldCantdePersonas.setText("");
         fieldID.setText("");
         fieldNombre.setText("");
         fieldPrecioxNoche.setText("");
         fieldTiposdeCamas.setText("");
    }//GEN-LAST:event_jbLimpiarValoresActionPerformed

    private void jbListadeCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListadeCategoriaActionPerformed
       AdministrarCategoriaTabla act = new AdministrarCategoriaTabla();
      
        JDesktopPane desktop = getDesktopPane();
        desktop.add(act);
        act.setVisible(true);
        dispose();   
    }//GEN-LAST:event_jbListadeCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldCantdeCamas;
    private javax.swing.JTextField fieldCantdePersonas;
    private javax.swing.JTextField fieldID;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldPrecioxNoche;
    private javax.swing.JTextField fieldTiposdeCamas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbEditarCategoria;
    private javax.swing.JButton jbEliminarCategoria;
    private javax.swing.JButton jbLimpiarValores;
    private javax.swing.JButton jbListadeCategoria;
    private javax.swing.JButton jbRegistrarCategoria;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables
    
    public boolean verificadorSoloNumeros(String cadena) {
        char[] letras = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        for (char letra : letras) {
            if (cadena.toLowerCase().contains(letra + "")) {
                return false;
            } else if (fieldID.getText().contains(letra + "")) {
                return false;
            } else if (fieldCantdeCamas.getText().contains(letra + "")) {
                return false;
            } else if (fieldCantdePersonas.getText().contains(letra + "")) {
                return false;
            } else if (fieldPrecioxNoche.getText().contains(letra + "")) {
                return false;
            }
        }
        return true;
    }
    
    public boolean verificadorSoloLetras (String cadena) {
     char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
     
     for (char numero : numeros) {
         if (cadena.toLowerCase().contains(numero + "")) {
             return false;
         } else if (fieldNombre.getText().contains(numero + "")) {
             return false;
         } else if (fieldTiposdeCamas.getText().contains(numero + "")) {
             return false;
         }
     }
     return true;
 }
     public boolean verificadorParaPrecioxNoche (String cadena) {
     char[] letras = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
     
     for (char letra : letras) {
        if (cadena.toLowerCase().contains( letra + "")) {
            return false;
        } else if (fieldPrecioxNoche.getText().contains(letra + "")) {
         return false;}
     }
     return true;
 }
}
