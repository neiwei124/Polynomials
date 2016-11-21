package polynomials;


import java.awt.*;
import java.util.ArrayList;

public class PolynomialGUI extends javax.swing.JFrame {

    static String operatorMessage;
    static String operator;
    int xMin = -10, xMax = 10, yMin = -10, yMax = 10;
    int gSize;
    pf pMain;
    pf derivative;
    pf result;
    ArrayList <pf> pfList = new ArrayList();
    Color[] c = {Color.black, Color.green, Color.blue, Color.magenta, Color.orange};
    int switchColor = 0;
    boolean clearGraph = true;
    boolean clearDerivativeGraph = true;
    boolean clearResultGraph = true;
    boolean graphingInverse = false;

    
    public PolynomialGUI() {
        initComponents();
        tabbedPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultOutput1 = new javax.swing.JLabel();
        appTitle = new javax.swing.JLabel();
        drawingPanel = new javax.swing.JPanel();
        inputPromptLabel = new javax.swing.JLabel();
        mainPolynomialInput = new javax.swing.JTextField();
        outputMessage = new javax.swing.JLabel();
        helpText = new javax.swing.JLabel();
        tabbedPanel = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        getValueLabel = new javax.swing.JLabel();
        inputValue = new javax.swing.JTextField();
        displayValue = new javax.swing.JLabel();
        getValue = new javax.swing.JButton();
        derivativeButton = new javax.swing.JButton();
        derivativeOutput = new javax.swing.JLabel();
        yIntOutput = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        graphMain = new javax.swing.JButton();
        derivativeGraph = new javax.swing.JButton();
        inverseGraph = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        xTangentInput = new javax.swing.JTextField();
        graphTangentLine = new javax.swing.JButton();
        compositionButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        mpLabel = new javax.swing.JLabel();
        otherInput = new javax.swing.JTextField();
        mpEqualButton = new javax.swing.JButton();
        mpOutput = new javax.swing.JLabel();
        mpOperationSign = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        p1Input = new javax.swing.JTextField();
        rpOperationSign = new javax.swing.JTextField();
        p2Input = new javax.swing.JTextField();
        rpEqualButton = new javax.swing.JButton();
        rpOutput = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        initializeButton = new javax.swing.JButton();

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

        inputPromptLabel.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 18)); // NOI18N
        inputPromptLabel.setText("Set Main Polynomial:");

        mainPolynomialInput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N
        mainPolynomialInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainPolynomialInputActionPerformed(evt);
            }
        });

        outputMessage.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        helpText.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 11)); // NOI18N
        helpText.setText(" (No spaces and use ^ for exponents):");

        getValueLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getValueLabel.setText("Find y-value at x=");

        inputValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValueActionPerformed(evt);
            }
        });

        displayValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        getValue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getValue.setText("get y-value");
        getValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getValueActionPerformed(evt);
            }
        });

        derivativeButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        derivativeButton.setText("Derivative");
        derivativeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivativeButtonActionPerformed(evt);
            }
        });

        derivativeOutput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(getValueLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(inputValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(getValue)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(displayValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 191, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(derivativeButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(derivativeOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 295, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(yIntOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 510, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(getValueLabel)
                        .add(inputValue)
                        .add(getValue))
                    .add(displayValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(derivativeOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(derivativeButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(yIntOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(177, 177, 177))
        );

        tabbedPanel.addTab("Features", jPanel3);

        graphMain.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        graphMain.setText("Graph Main Polynomial");
        graphMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphMainActionPerformed(evt);
            }
        });

        derivativeGraph.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        derivativeGraph.setText("Graph Derivative");
        derivativeGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivativeGraphActionPerformed(evt);
            }
        });

        inverseGraph.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        inverseGraph.setText("Graph Inverse");
        inverseGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseGraphActionPerformed(evt);
            }
        });

        jLabel1.setText("Graph Tangent Line at x =");

        graphTangentLine.setText("Graph Tangent");
        graphTangentLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphTangentLineActionPerformed(evt);
            }
        });

        compositionButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        compositionButton.setText("Composition");
        compositionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositionButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(graphMain)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(compositionButton))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(16, 16, 16)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(inverseGraph)
                            .add(derivativeGraph)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(xTangentInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(graphTangentLine)))))
                .add(0, 219, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(graphMain)
                    .add(compositionButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(derivativeGraph)
                .add(18, 18, 18)
                .add(inverseGraph)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(xTangentInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(graphTangentLine))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Graphing", jPanel2);

        mpLabel.setFont(new java.awt.Font("Myriad Web Pro Condensed", 3, 12)); // NOI18N
        mpLabel.setText("Main Polynomial");

        otherInput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        otherInput.setText("1x^2");
        otherInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherInputActionPerformed(evt);
            }
        });

        mpEqualButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        mpEqualButton.setText("=");
        mpEqualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpEqualButtonActionPerformed(evt);
            }
        });

        mpOutput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        mpOperationSign.setText("+");

        jLabel2.setText("(Only +,-,*,/)");

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(mpLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 107, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(36, 36, 36)
                        .add(mpOperationSign, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(43, 43, 43)
                        .add(otherInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 15, Short.MAX_VALUE)
                        .add(mpEqualButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(16, 16, 16))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(mpOutput, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .add(jPanel4Layout.createSequentialGroup()
                .add(122, 122, 122)
                .add(jLabel2)
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(45, 45, 45)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mpEqualButton)
                    .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(mpLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(mpOperationSign, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(otherInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 49, Short.MAX_VALUE)
                .add(mpOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(47, 47, 47))
        );

        jTabbedPane1.addTab("With Main Polynomial", jPanel4);

        p1Input.setText("2x^4+3x^3-4x^2+1");

        rpOperationSign.setText("+");

        p2Input.setText("6x^2+9x^4-8");

        rpEqualButton.setText("=");
        rpEqualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpEqualButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("(Only +,-,*,/)");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(rpOutput, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(p1Input, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(rpOperationSign, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(p2Input, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 213, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(rpEqualButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(218, 218, 218)
                        .add(jLabel3)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(53, 53, 53)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(p1Input, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rpOperationSign, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(p2Input, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rpEqualButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3)
                .add(33, 33, 33)
                .add(rpOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2 Random Polynomials", jPanel5);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jTabbedPane1)
                .addContainerGap())
        );

        tabbedPanel.addTab("Operations", jPanel1);

        initializeButton.setText("Initialize");
        initializeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initializeButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(293, 293, 293)
                        .add(appTitle))
                    .add(layout.createSequentialGroup()
                        .add(50, 50, 50)
                        .add(drawingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(28, 28, 28)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(mainPolynomialInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(initializeButton)
                                        .add(11, 11, 11)
                                        .add(outputMessage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(helpText)
                                    .add(inputPromptLabel)))
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(tabbedPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 607, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(37, 37, 37)
                .add(appTitle)
                .add(18, 18, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(drawingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(inputPromptLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(helpText)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(mainPolynomialInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(initializeButton))
                            .add(outputMessage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(tabbedPanel)))
                .add(515, 515, 515))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //graphs original polynomial
    private void graphMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphMainActionPerformed
        if (clearGraph == false) {
            clearGraph(pMain);
            graphMain.setText("Graph Main Polynomial");
            clearGraph = true;
        }
        else if (clearGraph == true) {
            pfList.add(pMain);
            graphMain.setText("Clear");
            graph(pMain);
            clearGraph = false;
        }
            
        
    }//GEN-LAST:event_graphMainActionPerformed

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
        graphAxis();

        double x, y, fx = 0;

        //draw the graph
        g.setColor(c[switchColor%c.length]);
        int xPos = 0, yPos = 0, oldX = 0, oldY = 0;
        
        for (x = xMin; x <= xMax; x += 0.0005) {
            fx = p.calculate(x);
            if (graphingInverse) {
                xPos = drawX(fx);
                yPos = drawY(x);
            }
            else{
                xPos = drawX(x);
                yPos = drawY(fx);
            }
            if (x != xMin) {
                g.drawLine(xPos, yPos, oldX, oldY);
            }
            oldX = xPos;
            oldY = yPos;

        }
        switchColor++;
        
    }
    
    //WHY DOESNT THE ARRAYLIST REMOVE THE DERIVATIVE FUNCTION?!?!?!?1@$%^&^*&%^$#%$#%%
    public void clearGraph(pf p) {
        Graphics g = drawingPanel.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, gSize, gSize);
        graphAxis();
        pfList.remove(p);
        for (int i = 0; i < pfList.size(); i++) {
            graph(pfList.get(i));
        }
        
    }
    
    //gets result from operations
    private void mpEqualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpEqualButtonActionPerformed
        pf other = new pf(otherInput.getText());
        operation(pMain, other, "mp");
        

    }//GEN-LAST:event_mpEqualButtonActionPerformed

    public void operation(pf p1, pf p2, String s){
        boolean invalidInput = false;
        //ummm i want to display an algebraic form of division but all it has is get numerical value on the rational function class..
        //so this only goes to multiply :(
        switch (mpOperationSign.getText()) {
            case "+":
                result = p1.add(p2);
                break;
            case "-":
                result = p1.subtract(p2);
                break;
            case "/":
                result = p1.divide(p2);
                break;
            case "*":
                result = p1.multiply(p2);
                break;
            default:
                if (s.equals("mp")) {
                    mpOutput.setText("Invalid operation input.");
                }
                else{
                    rpOutput.setText("Invalid operation input.");
                }
                invalidInput = true;
                
        }
        if (invalidInput == false) {
            if (s.equals("mp")) {
                    mpOutput.setText(result.print());
                }
                else{
                    rpOutput.setText(result.print());
                }  
        }
        
    }
    
    //get derivative
    private void derivativeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivativeButtonActionPerformed
        derivative = pMain.differentiate();
        derivativeOutput.setText("The derivative of this polynomial is " + derivative.print());
    }//GEN-LAST:event_derivativeButtonActionPerformed

    //graphs derivative
    private void derivativeGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivativeGraphActionPerformed
        derivative = pMain.differentiate();

        if (clearDerivativeGraph == false) {
            clearGraph(derivative);
            derivativeGraph.setText("Graph Derivative");
            clearDerivativeGraph = true;
        }
        else if (clearDerivativeGraph == true) {
            pfList.add(derivative);
            derivativeGraph.setText("Clear");
            graph(derivative);
            clearDerivativeGraph = false;
        }
       
    }//GEN-LAST:event_derivativeGraphActionPerformed

    //graphs inverse
    private void inverseGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseGraphActionPerformed
        graphingInverse = true;
        graph(pMain);
        graphingInverse = false;
    }//GEN-LAST:event_inverseGraphActionPerformed

    private void otherInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherInputActionPerformed

    //compose
    private void compositionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compositionButtonActionPerformed
        operatorMessage = "Compose";
        operator = "(o)";
        mpLabel.setText(operatorMessage + " by:");
    }//GEN-LAST:event_compositionButtonActionPerformed

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

    private void mainPolynomialInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainPolynomialInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainPolynomialInputActionPerformed

    public void getY (pf p) {
        double x = Double.parseDouble(inputValue.getText());
        double y = p.calculate(x);
        displayValue.setText("The y-value is " + y);
    }
    
    private void inputValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValueActionPerformed
        
    }//GEN-LAST:event_inputValueActionPerformed

    private void getValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getValueActionPerformed
        getY(pMain);
    }//GEN-LAST:event_getValueActionPerformed

    private void initializeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initializeButtonActionPerformed
        if (mainPolynomialInput.getText().isEmpty()) {
            outputMessage.setText("You did not type in anything.");
        }
        else{
            try{
                pMain = new pf(mainPolynomialInput.getText());
                tabbedPanel.setVisible(true);
                yIntOutput.setText("y-int: " + pMain.yInt);
                outputMessage.setText("Main polynomial initialized.");

            }
            catch (Exception e){
                outputMessage.setText("Invalid input.");
            }  
        }
    }//GEN-LAST:event_initializeButtonActionPerformed

    private void graphTangentLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphTangentLineActionPerformed
        //this is all integer input. we need to change the poylnomial constructor so we can actually
        //type doubles in
        int x = Integer.parseInt(xTangentInput.getText());
        double y = pMain.calculate(x);
        derivative = pMain.differentiate();
        int m = (int)(derivative.calculate(x));
        int b = (int)(y - m*x);
        String s = "x^1";
        if (b >= 0) {
            s += "+";
        }
        
        pf tLine = new pf(Integer.toString(m) + s + Integer.toString(b));
        graph(tLine);
        
    }//GEN-LAST:event_graphTangentLineActionPerformed

    private void rpEqualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpEqualButtonActionPerformed
        pf p1 = new pf(p1Input.getText());
        pf p2 = new pf(p2Input.getText());
        operation(p1, p2, "rp");
        
    }//GEN-LAST:event_rpEqualButtonActionPerformed

    
    public static void main(String args[]) {
        PolynomialGUI p = new PolynomialGUI();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PolynomialGUI().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton compositionButton;
    private javax.swing.JButton derivativeButton;
    private javax.swing.JButton derivativeGraph;
    private javax.swing.JLabel derivativeOutput;
    private javax.swing.JLabel displayValue;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JButton getValue;
    private javax.swing.JLabel getValueLabel;
    private javax.swing.JButton graphMain;
    private javax.swing.JButton graphTangentLine;
    private javax.swing.JLabel helpText;
    private javax.swing.JButton initializeButton;
    private javax.swing.JLabel inputPromptLabel;
    private javax.swing.JTextField inputValue;
    private javax.swing.JButton inverseGraph;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mainPolynomialInput;
    private javax.swing.JButton mpEqualButton;
    private javax.swing.JLabel mpLabel;
    private javax.swing.JTextField mpOperationSign;
    private javax.swing.JLabel mpOutput;
    private javax.swing.JTextField otherInput;
    private javax.swing.JLabel outputMessage;
    private javax.swing.JTextField p1Input;
    private javax.swing.JTextField p2Input;
    private javax.swing.JLabel resultOutput1;
    private javax.swing.JButton rpEqualButton;
    private javax.swing.JTextField rpOperationSign;
    private javax.swing.JLabel rpOutput;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JTextField xTangentInput;
    private javax.swing.JLabel yIntOutput;
    // End of variables declaration//GEN-END:variables
}
