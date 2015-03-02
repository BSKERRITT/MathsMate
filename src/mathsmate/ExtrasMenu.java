/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.awt.CardLayout;
import java.awt.LayoutManager;

/**
 *
 * @author Aaron
 */
public class ExtrasMenu extends javax.swing.JPanel {

    /**
     * Creates new form AlgebraMenu
     */
    public ExtrasMenu() {
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

        mainMenuPanel = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        pointsBtn = new javax.swing.JButton();
        courseBtn = new javax.swing.JButton();
        grindsBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        screenTitleLbl = new javax.swing.JLabel();
        nameBg = new javax.swing.JLabel();

        mainMenuPanel.setBackground(new java.awt.Color(52, 152, 219));
        mainMenuPanel.setPreferredSize(new java.awt.Dimension(400, 640));
        mainMenuPanel.setLayout(null);

        copyrightLbl.setBackground(new java.awt.Color(255, 255, 255));
        copyrightLbl.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        copyrightLbl.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyrightLbl.setText("Copyright © 2015 | Maths Mate");
        copyrightLbl.setAlignmentY(0.0F);
        mainMenuPanel.add(copyrightLbl);
        copyrightLbl.setBounds(30, 580, 340, 30);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/homeIcon.png"))); // NOI18N
        homeBtn.setAlignmentY(0.0F);
        homeBtn.setBorderPainted(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        homeBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        homeBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(homeBtn);
        homeBtn.setBounds(300, 10, 80, 50);

        titleLbl.setBackground(new java.awt.Color(255, 255, 255));
        titleLbl.setFont(new java.awt.Font("Calibri Light", 0, 60)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Maths Mate");
        titleLbl.setAlignmentY(0.0F);
        mainMenuPanel.add(titleLbl);
        titleLbl.setBounds(50, 80, 310, 74);

        pointsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/pointsIcon.png"))); // NOI18N
        pointsBtn.setAlignmentY(0.0F);
        pointsBtn.setBorderPainted(false);
        pointsBtn.setContentAreaFilled(false);
        pointsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pointsBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        pointsBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        pointsBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        pointsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(pointsBtn);
        pointsBtn.setBounds(50, 170, 310, 100);

        courseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/courseFinderIcon.png"))); // NOI18N
        courseBtn.setAlignmentY(0.0F);
        courseBtn.setBorderPainted(false);
        courseBtn.setContentAreaFilled(false);
        courseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        courseBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        courseBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        courseBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        courseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(courseBtn);
        courseBtn.setBounds(50, 410, 310, 100);

        grindsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/grindsFinderIcon.png"))); // NOI18N
        grindsBtn.setAlignmentY(0.0F);
        grindsBtn.setBorderPainted(false);
        grindsBtn.setContentAreaFilled(false);
        grindsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grindsBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        grindsBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        grindsBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        grindsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grindsBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(grindsBtn);
        grindsBtn.setBounds(50, 290, 310, 100);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/backIcon.png"))); // NOI18N
        backBtn.setAlignmentY(0.0F);
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        backBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        backBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(backBtn);
        backBtn.setBounds(20, 10, 80, 50);

        screenTitleLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        screenTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        screenTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screenTitleLbl.setText("Extras Menu");
        mainMenuPanel.add(screenTitleLbl);
        screenTitleLbl.setBounds(110, 10, 180, 50);

        nameBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/nameIcon.png"))); // NOI18N
        nameBg.setText("hello");
        mainMenuPanel.add(nameBg);
        nameBg.setBounds(90, 10, 220, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    private void pointsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "POINTS_CALC");
        }
    }//GEN-LAST:event_pointsBtnActionPerformed

    private void courseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseBtnActionPerformed

    private void grindsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grindsBtnActionPerformed
       
    }//GEN-LAST:event_grindsBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JButton courseBtn;
    private javax.swing.JButton grindsBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nameBg;
    private javax.swing.JButton pointsBtn;
    private javax.swing.JLabel screenTitleLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
