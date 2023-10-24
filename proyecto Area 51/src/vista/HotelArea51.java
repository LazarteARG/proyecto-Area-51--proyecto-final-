package vista;

public class HotelArea51 extends javax.swing.JFrame {

    public HotelArea51() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MItemRHuesped = new javax.swing.JMenuItem();
        MItemLHuesped = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1235, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        jMenuBar1.setMaximumSize(new java.awt.Dimension(300, 32768));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(250, 50));

        jMenu1.setText("Huesped");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MItemRHuesped.setText("RegistrarHuesped");
        MItemRHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemRHuespedActionPerformed(evt);
            }
        });
        jMenu1.add(MItemRHuesped);

        MItemLHuesped.setText("ListaHuesped");
        MItemLHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemLHuespedActionPerformed(evt);
            }
        });
        jMenu1.add(MItemLHuesped);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Habitaciones");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reservas");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MItemRHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemRHuespedActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        RegistrarHuesped registrarHuesped = new RegistrarHuesped();
        registrarHuesped.setVisible(true);
        jDesktopPane1.add(registrarHuesped);
        jDesktopPane1.moveToFront(registrarHuesped);

    }//GEN-LAST:event_MItemRHuespedActionPerformed

    private void MItemLHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemLHuespedActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ListaHuesped listahuesped = new ListaHuesped();
        listahuesped.setVisible(true);
        jDesktopPane1.add(listahuesped);
        jDesktopPane1.moveToFront(listahuesped);
    }//GEN-LAST:event_MItemLHuespedActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
//        jDesktopPane1.removeAll();
//        jDesktopPane1.repaint();
//        ListaHuesped listahuesped = new ListaHuesped();
//        listahuesped.setVisible(true);
//        jDesktopPane1.add(listahuesped);
//        jDesktopPane1.moveToFront(listahuesped);
    }//GEN-LAST:event_jMenu1MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HotelArea51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelArea51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelArea51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelArea51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelArea51().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MItemLHuesped;
    private javax.swing.JMenuItem MItemRHuesped;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables

}
