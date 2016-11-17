package polynomials;


import java.awt.*;

public class PolynomialGUI extends javax.swing.JFrame {

    static String operatorMessage;
    static String operator;
    int xMin = -10, xMax = 10, yMin = -10, yMax = 10;
    int gSize;
    pf p1, p2;
    pf derivative;
    pf result;
    Color[] c = {Color.black, Color.green, Color.blue, Color.magenta, Color.orange};
    int switchColor = 0;
    boolean clearGraph = true;
    boolean clearDerivativeGraph = true;
    boolean clearResultGraph = true;

    
    public PolynomialGUI() {
        initComponents();
        //getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultOutput1 = new javax.swing.JLabel();
        appTitle = new javax.swing.JLabel();
        drawingPanel = new javax.swing.JPanel();
        inputPrompt = new javax.swing.JLabel();
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
        derivativeOutput = new javax.swing.JLabel();
        operationLabel = new javax.swing.JLabel();
        displayPolynomial = new javax.swing.JLabel();
        helpText = new javax.swing.JLabel();
        derivativeGraph = new javax.swing.JButton();
        inverseButton = new javax.swing.JButton();
        inverseOutput = new javax.swing.JLabel();
        inverseGraph = new javax.swing.JButton();
        operationOutput = new javax.swing.JLabel();
        compositionButton = new javax.swing.JButton();
        resultGraph = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        resultOutput1.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appTitle.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 36)); // NOI18N
        appTitle.setText("Polynomial Software");

        drawingPanel.setBackground(new java.awt.Color(255, 255, 255));
        drawingPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        drawingPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                drawingPanelMouseWheelMoved(evt);
            }
        });

        org.jdesktop.layout.GroupLayout drawingPanelLayout = new org.jdesktop.layout.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 401, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );

        inputPrompt.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 18)); // NOI18N
        inputPrompt.setText("Enter a polynomial here:");

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

        operatorOutput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 3, 14)); // NOI18N
        operatorOutput.setText("Add by:");

        otherInput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        otherInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherInputActionPerformed(evt);
            }
        });

        resultButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        resultButton.setText("Result");
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        derivativeOutput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        operationLabel.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 18)); // NOI18N
        operationLabel.setText("Operations:");

        displayPolynomial.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        helpText.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 11)); // NOI18N
        helpText.setText(" (Use ^ for exponents):");

        derivativeGraph.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        derivativeGraph.setText("Graph");
        derivativeGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivativeGraphActionPerformed(evt);
            }
        });

        inverseButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        inverseButton.setText("Inverse");
        inverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseButtonActionPerformed(evt);
            }
        });

        inverseOutput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        inverseGraph.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        inverseGraph.setText("Graph");
        inverseGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseGraphActionPerformed(evt);
            }
        });

        operationOutput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        compositionButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        compositionButton.setText("Composition");
        compositionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositionButtonActionPerformed(evt);
            }
        });

        resultGraph.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        resultGraph.setText("Graph");
        resultGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultGraphActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(50, 50, 50)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(434, 434, 434)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(inputPrompt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 299, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(polynomialInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(graphButton))
                            .add(operationLabel)
                            .add(displayPolynomial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(helpText)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(operatorOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(otherInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 294, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                            .add(inverseButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .add(derivativeButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(derivativeOutput, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                            .add(inverseOutput, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .add(layout.createSequentialGroup()
                                        .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(operationOutput, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(resultGraph, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(derivativeGraph)
                                    .add(inverseGraph)
                                    .add(resultButton))
                                .add(50, 50, 50))
                            .add(layout.createSequentialGroup()
                                .add(addButton)
                                .add(18, 18, 18)
                                .add(subtractButton)
                                .add(18, 18, 18)
                                .add(multiplyButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(divideButton)
                                .add(18, 18, 18)
                                .add(compositionButton))))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(appTitle)
                            .add(drawingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(50, 50, 50)
                .add(appTitle)
                .add(36, 36, 36)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(drawingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(inputPrompt)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(helpText)
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
                            .add(divideButton)
                            .add(compositionButton))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(resultButton)
                                .add(otherInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(operatorOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(operationOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(75, 75, 75)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, derivativeGraph)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(derivativeButton)
                                        .add(derivativeOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(inverseButton)
                                    .add(inverseOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(inverseGraph)))
                            .add(resultGraph))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //graphs original polynomial
    private void graphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphButtonActionPerformed
        if (clearGraph == false) {
            clearGraph();
            graphButton.setText("Graph");
            clearGraph = true;
        }
        else if (clearGraph == true) {
            graphButton.setText("Clear");
            p1 = new pf(polynomialInput.getText());
            graphAxis();
            graph(p1);
            clearGraph = false;
        }
        
        displayPolynomial.setText("Your polynomial is " + p1.print());
        
        
    }//GEN-LAST:event_graphButtonActionPerformed

    //method to draw x values onto java x position
    public int drawX(double x){
        int denom = xMax - xMin;
        double m = gSize/denom;
        double b = -1 * ((gSize*xMin)/denom);
        return (int)(m*x+b);
    }
    
    //method to draw y values onto java y position
    public int drawY(double y){
        int denom = yMin - yMax;
        double m = gSize/denom;
        double b = -1 * ((gSize*yMax)/denom);
        return (int)(m*y+b);
    }
    
    public void graphAxis() {
        gSize = drawingPanel.getHeight();
        Graphics g = drawingPanel.getGraphics();
        
        //draw the axis lines
        g.setColor(Color.red);
        g.drawLine(drawX(xMin), drawY(0), drawX(xMax), drawY(0));
        g.drawLine(drawX(0), drawY(yMin), drawX(0), drawY(yMax));

    }
    public void graph(pf p){
        gSize = drawingPanel.getHeight();
        Graphics g = drawingPanel.getGraphics();

        double x, y, fx = 0;

        //draw the graph
        g.setColor(c[switchColor%c.length]);
        int xPos = 0, yPos = 0, oldX = 0, oldY = 0;
        
        for (x = xMin; x <= xMax; x += 0.0005) {
            fx = p.calculate(x);
            xPos = drawX(x);
            yPos = drawY(fx);
            if (x != xMin) {
                g.drawLine(xPos, yPos, oldX, oldY);
            }
            oldX = xPos;
            oldY = yPos;

        }
        switchColor++;
        
    }
    
    public void clearGraph() {
        drawingPanel.revalidate();
        drawingPanel.repaint();
        graphAxis();
    }
    
    //add
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        operatorMessage = "Add";
        operator = "+";
        operatorOutput.setText(operatorMessage + " by:");
    }//GEN-LAST:event_addButtonActionPerformed

    //subtract
    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        operatorMessage = "Subtract";
        operator = "-";
        operatorOutput.setText(operatorMessage + " by:");
    }//GEN-LAST:event_subtractButtonActionPerformed

    //multiply
    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        operatorMessage = "Multiply";
        operator = "x";
        operatorOutput.setText(operatorMessage + " by:");
    }//GEN-LAST:event_multiplyButtonActionPerformed

    //divide
    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        operatorMessage = "Divide";
        operator = "/";
        operatorOutput.setText(operatorMessage + " by:");
    }//GEN-LAST:event_divideButtonActionPerformed

    //gets result from operations
    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed
        p2 = new pf(otherInput.getText());
        //ummm i want to display an algebraic form of division but all it has is get numerical value on the rational function class..
        //so this only goes to multiply :(
        switch (operator) {
            case "+":
                result = p1.add(p2);
                break;
            case "-":
                result = p1.subtract(p2);
                break;
            case "(o)":
                result = p1.composition(p2);
                break;
            default:
                result = p1.multiply(p2);
                break;
        }
        operationOutput.setText(p1.print() + " " + operator + p2.print() + " = " + result.print());
        
    }//GEN-LAST:event_resultButtonActionPerformed

    //get derivative
    private void derivativeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivativeButtonActionPerformed
        derivative = p1.differentiate();
        derivativeOutput.setText("The derivative of this polynomial is " + derivative.print());
    }//GEN-LAST:event_derivativeButtonActionPerformed

    //graphs derivative
    private void derivativeGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivativeGraphActionPerformed
        Graphics g = drawingPanel.getGraphics();
        g.setColor(Color.pink);
        
        if (clearDerivativeGraph == false) {
            clearGraph();
            derivativeGraph.setText("Graph");
            clearDerivativeGraph = true;
        }
        else if (clearDerivativeGraph == true) {
            derivativeGraph.setText("Clear");
            graphAxis();
            graph(derivative);
            clearDerivativeGraph = false;
        }
       
    }//GEN-LAST:event_derivativeGraphActionPerformed

    //graphs inverse
    private void inverseGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseGraphActionPerformed
        Graphics g = drawingPanel.getGraphics();
        g.setColor(Color.CYAN);
        g.drawLine(255, 0, 0, 255);
    }//GEN-LAST:event_inverseGraphActionPerformed

    //get inverse
    private void inverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseButtonActionPerformed
        inverseOutput.setText("The inverse of this polynomial is [inverse]");
    }//GEN-LAST:event_inverseButtonActionPerformed

    private void otherInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherInputActionPerformed

    //compose
    private void compositionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compositionButtonActionPerformed
        operatorMessage = "Compose";
        operator = "(o)";
        operatorOutput.setText(operatorMessage + " by:");
    }//GEN-LAST:event_compositionButtonActionPerformed

    private void resultGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultGraphActionPerformed
        Graphics g = drawingPanel.getGraphics();
        g.setColor(c[switchColor%c.length]);
        
        if (clearResultGraph == false) {
            clearGraph();
            resultGraph.setText("Graph");
            clearResultGraph = true;
        }
        else if (clearResultGraph == true) {
            resultGraph.setText("Clear");
            graphAxis();
            graph(result);
            clearResultGraph = false;
        }
        
    }//GEN-LAST:event_resultGraphActionPerformed

    private void drawingPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_drawingPanelMouseWheelMoved
        int scroll = evt.getWheelRotation();
        //-1 zooms out
        //1 zooms in
        if (scroll == -1) {
            xMin -= 5;
            xMax += 5;
            yMin -= 5;
            yMax += 5;
        }
        else {
            xMin /= 2;
            xMax /= 2;
            yMin /= 2;
            yMax /= 2;
        }
    }//GEN-LAST:event_drawingPanelMouseWheelMoved

    
    public static void main(String args[]) {
        PolynomialGUI p = new PolynomialGUI();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PolynomialGUI().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton compositionButton;
    private javax.swing.JButton derivativeButton;
    private javax.swing.JButton derivativeGraph;
    private javax.swing.JLabel derivativeOutput;
    private javax.swing.JLabel displayPolynomial;
    private javax.swing.JButton divideButton;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JButton graphButton;
    private javax.swing.JLabel helpText;
    private javax.swing.JLabel inputPrompt;
    private javax.swing.JButton inverseButton;
    private javax.swing.JButton inverseGraph;
    private javax.swing.JLabel inverseOutput;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JLabel operationLabel;
    private javax.swing.JLabel operationOutput;
    private javax.swing.JLabel operatorOutput;
    private javax.swing.JTextField otherInput;
    private javax.swing.JTextField polynomialInput;
    private javax.swing.JButton resultButton;
    private javax.swing.JButton resultGraph;
    private javax.swing.JLabel resultOutput1;
    private javax.swing.JButton subtractButton;
    // End of variables declaration//GEN-END:variables
}
