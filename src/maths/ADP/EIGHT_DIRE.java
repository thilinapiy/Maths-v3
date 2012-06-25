/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EIGHT_DIRE.java
 *
 * Created on Sep 22, 2010, 5:46:14 PM
 */

package maths.ADP;
import javax.swing.JOptionPane;
/**
 *
 * @author Ayesh
 */
public class EIGHT_DIRE extends javax.swing.JFrame {

    int i=0;
    int j=0;
     private String[] questions = new String[20];
  {
    questions[0] = "1.ළමයාට ගිණිකොනෙන් තිබෙන්නෙ කුමක්ද?";
    questions[1] = "2.ළමයාට උතුරෙන්  තිබෙන්නෙ කුමක්ද?";
    questions[2] = "3.ළමයාට  වයබෙන්්  තිබෙන්නෙ කුමක්ද?";
    questions[3] = "4.ළමයාට  දකුනෙන්  තිබෙන්නෙ කුමක්ද?";
    questions[4] = "5.ළමයාට ඊසානෙන් තිබෙන්නෙ කුමක්ද?";
    questions[5] = "6.ළමයාට නිරිතෙන්  තිබෙන්නෙ කුමක්ද?";
    questions[6] = "7.ළමයාට බටහිරෙන්  තිබෙන්නෙ කුමක්ද?";
    questions[7] = "8.පොතට දකුනෙන් තිබෙන්නෙ මොනවාද?";
    questions[8] = "9.නිවසට  වයබෙන් තිබෙන්නෙ මොනවාද??";
    questions[9] = "10.පුසාට නිරිතෙන්  තිබෙන්නෙ මොනවාද?";

    questions[10] = "11.ගසට ගිණිකොනෙන් තිබෙන්නෙ මොනවාද?";
    questions[11] = "12.මකනයට නගෙනහිරෙන් තිබෙන්නෙ මොනවාද?";
    questions[12] = "13.කාරයට උතුරෙන් තිබෙන්නෙ මොනවාද?";
    questions[13] = "14.ළමයට බටහිරෙන් තිබෙන්නෙ කුමක්ද?";
    questions[14] = "ළමයාට  නගෙනහිරෙන් තිබෙන්නෙ කුමක්ද?";

  }

      public String[] answers=new String[20];
  {
      answers[0]="නිවස";
      answers[1]="පොත";
      answers[2]="ගස";
      answers[3]="කාර් එක";
      answers[4]="පුසා";

      answers[5]="රුලර් එක";
      answers[6]="මකනය";
      answers[7]="ළමයා සහ කාර් එක";
      answers[8]="ළමයා සහ ගස";
      answers[9]="ළමයා සහ රුලර් එක";

      answers[10]="ළමයා සහ නිවස";
      answers[11]="ළමයා සහ පැන්සල";
      answers[12]="ළමයා සහ පොත";
      answers[13]="මකනය";
      answers[14]="පැන්සල";

  }
    /** Creates new form EIGHT_DIRE */
    public EIGHT_DIRE() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 54));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maths/ADP/EIGHT_DIR.JPG"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Iskoola Pota", 0, 14));
        jButton1.setText("හරිද බලමු");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        jLabel4.setText("1.ළමයාට ගිණිකොනෙන් තිබෙන්නෙ කුමක්ද? ");

        jComboBox1.setFont(new java.awt.Font("Iskoola Pota", 0, 14));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..............", "පොත", "ගස", "නිවස", "කාර් එක", "පුසා" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(205, 205, 205))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 54));

        jLabel2.setFont(new java.awt.Font("Iskoola Pota", 1, 24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("දිශා 8 හදුනා ගනිමු");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Iskoola Pota", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ගණිතය");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

}//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.jComboBox1.getSelectedItem().equals(answers[j])){

            JOptionPane.showMessageDialog(null,"නිවැරදයි...!!!","නිවැරදයි...!!!",JOptionPane.PLAIN_MESSAGE);
            i++;
            j++;
           setvalues(i);

        } else
            JOptionPane.showMessageDialog(null,"වැරදයි... නැවත හදන්න.","වැරදයි",JOptionPane.WARNING_MESSAGE);
}//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EIGHT_DIRE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables



    public void setvalues(int i){
        this.jLabel4.setText(questions[i]);

        if(i==5)
              jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "................","රුලර් එක","මකනය","පොත සහ රුලර් එක","ළමයා සහ කාර් එක","ළමයා සහ ගස","ළමයා සහ රුලර් එක"}));
        else  if(i==10)
       jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "................","මකනය","ළමයා සහ පොත","පැන්සල","ළමයා සහ පැන්සල","ළමයා සහ නිවස"}));
      else if(i>14){
            this.jComboBox1.hide();
           JOptionPane.showMessageDialog(null,"පලමු වටය අවසන්…..","අවසන්....",JOptionPane.PLAIN_MESSAGE);

    }
}
}
