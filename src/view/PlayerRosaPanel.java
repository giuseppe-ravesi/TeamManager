/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import model.GiocatoreInRosa;

/**
 *
 * @author enzov
 */
public class PlayerRosaPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlayerRosaPanel
     */
    private TeamManagerGUI parentFrame;

    private java.util.List<GiocatoreInRosa> rosa;

    private DefaultListModel<String> model;

    public PlayerRosaPanel(TeamManagerGUI parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();

        rosa = parentFrame.getTM().visualizzaRosa();

        model = new DefaultListModel<String>();

        initializeList();
    }

    private void initializeList() {
        model.clear();
        for (GiocatoreInRosa p : rosa) {
            model.addElement(p.toString());
        }

        jList1.setModel(model);

        // Imposta font monospaziato per allineare i campi
        jList1.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 13));

        String numGiocatoriRosa = rosa.size() + " / " + 22;
        numGiocatoriLabel.setText(numGiocatoriRosa);

        if (rosa.size() < 22) {
            jLabel1.setText("Rosa Attuale - Incompleta");
            numGiocatoriLabel.setForeground(Color.red);

        } else {
            jLabel1.setText("Rosa Attuale");
            numGiocatoriLabel.setForeground(Color.GREEN);
        }

        int indexList = 0;

        for (GiocatoreInRosa g : rosa) {
            if (g.getGiocatore().getId() != parentFrame.getSession().getUtenteLoggato().getId()) {
                indexList++;
            } else {
                break;
            }
        }

        jList1.setCellRenderer(new MyListRenderer(indexList));

    }

    public void initCard() {
        initializeList();
    }

    public void logout() {
        parentFrame.getSession().logout();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        numGiocatoriLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Nome Item 2 Data", " ", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setMaximumSize(new java.awt.Dimension(90, 90));
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Rosa Attuale");

        numGiocatoriLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numGiocatoriLabel.setText("NumGiocatori");
        numGiocatoriLabel.setMaximumSize(null);

        backButton.setBackground(new java.awt.Color(232, 253, 253));
        backButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numGiocatoriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numGiocatoriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        initializeList();
        parentFrame.cardLayout.show(parentFrame.getjPanel1(), "PLAYERPANEL");
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numGiocatoriLabel;
    // End of variables declaration//GEN-END:variables
}
