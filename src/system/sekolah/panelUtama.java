/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.sekolah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @
 */
public class panelUtama extends javax.swing.JPanel {

    /**
     * Creates new form guru
     */
    public panelUtama() {
        initComponents();
     
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background31 = new design.background3();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(657, 501));
        setPreferredSize(new java.awt.Dimension(785, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel1.setText("Selamat datang di Aplikasi Sistemasi Sekolah...");

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel2.setText("Aplikasi ini di buat untuk mempermudah sekolah dalam pendataan siswa, guru, dan lainnya.");

        javax.swing.GroupLayout background31Layout = new javax.swing.GroupLayout(background31);
        background31.setLayout(background31Layout);
        background31Layout.setHorizontalGroup(
            background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background31Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        background31Layout.setVerticalGroup(
            background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background31Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(484, Short.MAX_VALUE))
        );

        add(background31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 550));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private design.background3 background31;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}