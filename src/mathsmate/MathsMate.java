/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author Aaron
 */
public class MathsMate extends javax.swing.JFrame {
    JPanel cardsContainer;
    /**
     * Creates new form MainMenu
     */
    public MathsMate() {
        initComponents();
        MainMenu mainCard = new MainMenu();
        AlgebraMenu algebraCard = new AlgebraMenu();
        GeometryMenu geometryCard = new GeometryMenu();
        TrigMenu trigCard = new TrigMenu();
        ExtrasMenu extrasCard = new ExtrasMenu();
        PointsCalc calcCard = new PointsCalc();
        GrindsFinder grindsCard = new GrindsFinder();
        CourseFinder courseCard = new CourseFinder();
        
        cardsContainer = new JPanel(new CardLayout());
        cardsContainer.add(mainCard, "MAIN");
        cardsContainer.add(algebraCard, "ALGEBRA_MENU");
        cardsContainer.add(geometryCard, "GEOMETRY_MENU");
        cardsContainer.add(trigCard, "TRIG_MENU");
        cardsContainer.add(extrasCard, "EXTRAS_MENU");
        cardsContainer.add(calcCard, "POINTS_CALC");
        cardsContainer.add(grindsCard,"GRINDS_FINDER");
        cardsContainer.add(courseCard, "COURSE_FINDER");
        this.add(cardsContainer);
        CardLayout cl = (CardLayout)(cardsContainer.getLayout());
        cl.show(cardsContainer, "MAIN");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maths Mate");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(52, 152, 219));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 640));
        setMinimumSize(new java.awt.Dimension(400, 640));
        setPreferredSize(new java.awt.Dimension(400, 640));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MathsMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathsMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathsMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathsMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathsMate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
