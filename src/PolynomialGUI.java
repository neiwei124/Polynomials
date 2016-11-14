
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

        resultOutput1 = new javax.swing.JLabel();
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
        operationLabel = new javax.swing.JLabel();
        displayPolynomial = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        graphButton1 = new javax.swing.JButton();
        inverseButton = new javax.swing.JButton();

        resultOutput1.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 36)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Enter a polynomial here:");

        polynomialInput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        subtractButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        subtractButton.setText("Subtract");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        multiplyButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        multiplyButton.setText("Multiply");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        derivativeButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        derivativeButton.setText("Derivative");
        derivativeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivativeButtonActionPerformed(evt);
            }
        });

        divideButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        divideButton.setText("Divide");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        graphButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        graphButton.setText("Graph");
        graphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphButtonActionPerformed(evt);
            }
        });

        operatorOutput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 3, 12)); // NOI18N

        otherInput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N

        resultButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        resultButton.setText("Result");
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        resultOutput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        operationLabel.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 18)); // NOI18N
        operationLabel.setText("Operations:");

        displayPolynomial.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 11)); // NOI18N
        jLabel4.setText(" (Use ^ for exponents):");

        graphButton1.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        graphButton1.setText("Graph");
        graphButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphButton1ActionPerformed(evt);
            }
        });

        inverseButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        inverseButton.setText("Inverse");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(50, 50, 50)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(drawingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(36, 36, 36)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 299, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(polynomialInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(graphButton))
                            .add(operationLabel)
                            .add(layout.createSequentialGroup()
                                .add(addButton)
                                .add(18, 18, 18)
                                .add(subtractButton)
                                .add(18, 18, 18)
                                .add(multiplyButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(divideButton))
                            .add(displayPolynomial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(derivativeButton)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(resultOutput, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(operatorOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(otherInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 310, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(12, 12, 12)
                                        .add(resultButton))
                                    .add(layout.createSequentialGroup()
                                        .add(12, 12, 12)
                                        .add(graphButton1))))
                            .add(inverseButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(50, 50, 50)
                .add(jLabel1)
                .add(36, 36, 36)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(drawingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(graphButton1)
                            .add(layout.createSequentialGroup()
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(polynomialInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(graphButton))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(displayPolynomial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(20, 20, 20)
                                .add(operationLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(addButton)
                                    .add(subtractButton)
                                    .add(multiplyButton)
                                    .add(divideButton))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(resultButton)
                                        .add(otherInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(operatorOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(71, 71, 71)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(derivativeButton)
                                    .add(resultOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(inverseButton)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void graphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphButtonActionPerformed
        Graphics g = drawingPanel.getGraphics();
        g.setColor(Color.green);
        g.drawOval(100, 100, 30, 30);
        g.drawOval(300, 100, 30, 30);
        g.drawLine(100, 300, 300, 300);
        displayPolynomial.setText("Simplified polynomial");
        
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

    private void graphButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphButton1ActionPerformed
        Graphics g = drawingPanel.getGraphics();
        g.setColor(Color.red);
        g.drawLine(10, 10, 400, 400);
    }//GEN-LAST:event_graphButton1ActionPerformed

    
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
    private javax.swing.JLabel displayPolynomial;
    private javax.swing.JButton divideButton;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JButton graphButton;
    private javax.swing.JButton graphButton1;
    private javax.swing.JButton inverseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JLabel operationLabel;
    private javax.swing.JLabel operatorOutput;
    private javax.swing.JTextField otherInput;
    private javax.swing.JTextField polynomialInput;
    private javax.swing.JButton resultButton;
    private javax.swing.JLabel resultOutput;
    private javax.swing.JLabel resultOutput1;
    private javax.swing.JButton subtractButton;
    // End of variables declaration//GEN-END:variables
}
