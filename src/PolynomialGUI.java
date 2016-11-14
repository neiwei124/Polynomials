
import java.awt.*;

public class PolynomialGUI extends javax.swing.JFrame {

    static String operatorMessage;
    static String operator;
    
    public PolynomialGUI() {
        initComponents();
        getContentPane().setBackground(Color.red);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        drawingPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        polynomialInput = new javax.swing.JTextField();
        subtractButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        derivativeButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        graphButton = new javax.swing.JButton();
        operatorOutput = new javax.swing.JLabel();
        otherInput = new javax.swing.JTextField();
        resultButton = new javax.swing.JButton();
        resultOutput = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jLabel1.setText("Sick Polynomial Software");

        drawingPanel.setBackground(new java.awt.Color(255, 255, 255));

        org.jdesktop.layout.GroupLayout drawingPanelLayout = new org.jdesktop.layout.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );

        jLabel2.setText("Enter a polynomial here (Use ^ for exponents):");

        subtractButton.setText("Subtract");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        multiplyButton.setText("Multiply");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        derivativeButton.setText("Derivative");
        derivativeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivativeButtonActionPerformed(evt);
            }
        });

        divideButton.setText("Divide");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        graphButton.setText("Graph");
        graphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphButtonActionPerformed(evt);
            }
        });

        resultButton.setText("Result");
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Operations:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(drawingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 299, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(polynomialInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(graphButton)
                                        .addContainerGap(12, Short.MAX_VALUE))
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(layout.createSequentialGroup()
                                                .add(operatorOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(otherInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 310, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(18, 18, 18)
                                                .add(resultButton))
                                            .add(layout.createSequentialGroup()
                                                .add(jLabel3)
                                                .add(18, 18, 18)
                                                .add(addButton)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(subtractButton)
                                                .add(18, 18, 18)
                                                .add(multiplyButton)
                                                .add(33, 33, 33)
                                                .add(divideButton)
                                                .add(18, 18, 18)
                                                .add(derivativeButton)))
                                        .add(0, 0, Short.MAX_VALUE))))
                            .add(layout.createSequentialGroup()
                                .add(107, 107, 107)
                                .add(resultOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 413, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(50, 50, 50)
                .add(jLabel1)
                .add(36, 36, 36)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(polynomialInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(graphButton))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(subtractButton)
                            .add(derivativeButton)
                            .add(divideButton)
                            .add(multiplyButton)
                            .add(addButton)
                            .add(jLabel3))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(operatorOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(otherInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(resultButton)))
                        .add(18, 18, 18)
                        .add(resultOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(drawingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void graphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphButtonActionPerformed
        Graphics g = drawingPanel.getGraphics();
        g.setColor(Color.green);
        g.drawOval(100, 100, 30, 30);
        g.drawOval(300, 100, 30, 30);
        g.drawLine(100, 300, 300, 300);
        
    }//GEN-LAST:event_graphButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        operatorMessage = "Add";
        operator = "+";
        operatorOutput.setText(operatorMessage + " by:");
    }//GEN-LAST:event_addButtonActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        operatorMessage = "Subtract";
        operator = "-";
        operatorOutput.setText(operatorMessage + " by:");
    }//GEN-LAST:event_subtractButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        operatorMessage = "Multiply";
        operator = "x";
        operatorOutput.setText(operatorMessage + " by:");
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        operatorMessage = "Divide";
        operator = "/";
        operatorOutput.setText(operatorMessage + " by:");
    }//GEN-LAST:event_divideButtonActionPerformed

    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed
        resultOutput.setText("Original polynomial " + operator + " the other polynomial = new polynomial");
    }//GEN-LAST:event_resultButtonActionPerformed

    private void derivativeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivativeButtonActionPerformed
        resultOutput.setText("The derivative of this polynomial is [insert derivative here]");
    }//GEN-LAST:event_derivativeButtonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PolynomialGUI().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton derivativeButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JButton graphButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JLabel operatorOutput;
    private javax.swing.JTextField otherInput;
    private javax.swing.JTextField polynomialInput;
    private javax.swing.JButton resultButton;
    private javax.swing.JLabel resultOutput;
    private javax.swing.JButton subtractButton;
    // End of variables declaration//GEN-END:variables
}
