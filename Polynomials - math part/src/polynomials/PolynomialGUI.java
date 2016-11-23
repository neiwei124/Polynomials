package polynomials;


import java.awt.*;
import java.util.ArrayList;

public class PolynomialGUI extends javax.swing.JFrame {

    static String operatorMessage;
    static String operator;
    int xMin, xMax, yMin, yMax;
    int gSize;
    pf pMain;
    pf derivative;
    String result;
    ArrayList <pf> pfList = new ArrayList();
    Color[] c = {Color.black, Color.green, Color.blue, Color.magenta, Color.orange};
    int switchColor = 0;
    boolean clearGraph = true;
    boolean clearDerivativeGraph = true;
    boolean clearResultGraph = true;
    boolean graphingInverse = false;
    boolean clearInverse = true;
    
    int axisXMin;
    int axisXMax;
    int axisYMin;
    int axisYMax;

    
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
        jPanel2 = new javax.swing.JPanel();
        graphMain = new javax.swing.JButton();
        derivativeGraph = new javax.swing.JButton();
        inverseGraph = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        xTangentInput = new javax.swing.JTextField();
        graphTangentLine = new javax.swing.JButton();
        compositionButton = new javax.swing.JButton();
        DRLabel = new javax.swing.JLabel();
        domain = new javax.swing.JLabel();
        range = new javax.swing.JLabel();
        xMinLabel = new javax.swing.JLabel();
        xMinInput = new javax.swing.JTextField();
        xMaxLabel = new javax.swing.JLabel();
        xMaxInput = new javax.swing.JTextField();
        yMinLabel = new javax.swing.JLabel();
        yMinInput = new javax.swing.JTextField();
        yMaxLabel = new javax.swing.JLabel();
        yMaxInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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
        jPanel3 = new javax.swing.JPanel();
        getValueLabel = new javax.swing.JLabel();
        inputValue = new javax.swing.JTextField();
        displayValue = new javax.swing.JLabel();
        getValue = new javax.swing.JButton();
        derivativeButton = new javax.swing.JButton();
        derivativeOutput = new javax.swing.JLabel();
        yIntOutput = new javax.swing.JLabel();
        displayPolynomial = new javax.swing.JLabel();
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

        compositionButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        compositionButton.setText("Composition");
        compositionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositionButtonActionPerformed(evt);
            }
        });

        DRLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DRLabel.setText("Set Domain and Range");

        domain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        domain.setText("Domain:");

        range.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        range.setText("Range:");

        xMinLabel.setText("xMin:");

        xMinInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMinInputActionPerformed(evt);
            }
        });

        xMaxLabel.setText("xMax:");

        xMaxInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMaxInputActionPerformed(evt);
            }
        });

        yMinLabel.setText("yMin:");

        yMinInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yMinInputActionPerformed(evt);
            }
        });

        yMaxLabel.setText("yMax:");

        yMaxInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yMaxInputActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Set Domain and Range");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(graphMain)
                    .add(inverseGraph)
                    .add(derivativeGraph)
                    .add(compositionButton)
                    .add(DRLabel)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(xTangentInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(graphTangentLine))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(range, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(domain, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(xMinLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(xMinInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(xMaxLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(xMaxInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(yMinLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(yMinInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(yMaxLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(yMaxInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 15, Short.MAX_VALUE)
                                .add(jButton1)))))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(DRLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(domain)
                    .add(xMinLabel)
                    .add(xMinInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xMaxLabel)
                    .add(xMaxInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(range)
                    .add(yMinLabel)
                    .add(yMinInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(yMaxLabel)
                    .add(yMaxInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 8, Short.MAX_VALUE)
                .add(graphMain)
                .add(21, 21, 21)
                .add(compositionButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(derivativeGraph)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(inverseGraph)
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(xTangentInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(graphTangentLine))
                .add(20, 20, 20))
        );

        tabbedPanel.addTab("Graphing", jPanel2);

        mpLabel.setFont(new java.awt.Font("Myriad Web Pro Condensed", 3, 14)); // NOI18N
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
                .add(mpLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mpOperationSign, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(otherInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(mpEqualButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .add(63, 63, 63))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(mpOutput, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(jPanel4Layout.createSequentialGroup()
                .add(122, 122, 122)
                .add(jLabel2)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(45, 45, 45)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(mpLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(mpOperationSign, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(otherInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(mpEqualButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .add(18, 18, 18)
                .add(mpOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("With Main Polynomial", jPanel4);

        p1Input.setText("2x^4+3x^3-4x^2+1");

        rpOperationSign.setText("+");

        p2Input.setText("6x^2+9x^4-8");

        rpEqualButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
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
                        .add(p1Input, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 196, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(rpOperationSign, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(p2Input, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 213, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(rpEqualButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(193, 193, 193)
                        .add(jLabel3)))
                .addContainerGap(86, Short.MAX_VALUE))
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
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2 Random Polynomials", jPanel5);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
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

        displayPolynomial.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(displayPolynomial, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel3Layout.createSequentialGroup()
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
                        .addContainerGap(105, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(displayPolynomial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(getValueLabel)
                        .add(inputValue)
                        .add(getValue))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(displayValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(derivativeOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(derivativeButton)))
                .add(18, 18, 18)
                .add(yIntOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(343, 343, 343))
        );

        tabbedPanel.addTab("Features", jPanel3);

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
                .add(40, 40, 40)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(appTitle)
                    .add(layout.createSequentialGroup()
                        .add(drawingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(55, 55, 55)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(tabbedPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 630, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(mainPolynomialInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(initializeButton)
                                .add(11, 11, 11)
                                .add(outputMessage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(helpText)
                            .add(inputPromptLabel))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(39, 39, 39)
                .add(appTitle)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 20, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
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
                        .add(tabbedPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .add(drawingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(47, 47, 47))
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
            graphMain.setText("Clear");
            pfList.add(pMain);
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
        g.drawLine(drawX(axisXMin), drawY(0), drawX(axisXMax), drawY(0));
        g.drawLine(drawX(0), drawY(axisYMin), drawX(0), drawY(axisYMax));
         
        double m = gSize/(axisXMax - axisXMin);
        int incrementX = axisXMin;
        int incrementY = axisYMin;
        for (int i = 0; i < gSize/m; i++) {
                g.setColor(Color.red);
                g.drawLine(axisXMin - incrementX, drawY(0) , axisXMin - incrementX, drawY(0) + 5);
                g.drawLine(drawX(0), axisYMin - incrementY, drawX(0) + 5, axisYMin - incrementY);
                axisXMin += m;
                axisYMin += m;
         }
        restoreDefaultAxis();

    }
    
    public void restoreDefaultAxis(){
        axisXMin = xMin;
        axisXMax = xMax;
        axisYMin = yMin;
        axisYMax = yMax;
    }
    
    
    public void graph(pf p){
        gSize = drawingPanel.getHeight();
        Graphics g = drawingPanel.getGraphics();
        
        graphAxis();

        double x, y, fx = 0;

        //draw the graph
        g.setColor(c[switchColor%c.length]);
        //g.setColor(Color.blue);
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
        System.out.println(pfList.size());
        pfList.remove(p);
        System.out.println(pfList.size());
        for (int i = 0; i < pfList.size(); i++) {
                graph(pfList.get(i));
            }
        if (clearInverse == false) {
            graphingInverse = true;
            graph(pMain);
            graphingInverse = false;
        }
    }
    
    public void clearInverse(){
        Graphics g = drawingPanel.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, gSize, gSize);
        graphAxis();
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
                result = p1.add(p2).print();
                break;
            case "-":
                result = p1.subtract(p2).print();
                break;
            case "/":
                result = p1.divide(p2);
                break;
            case "*":
                result = p1.multiply(p2).print();
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
                    mpOutput.setText(result);
                }
                else{
                    rpOutput.setText(result);
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
        
        if (clearDerivativeGraph == false) {
            clearGraph(derivative);
            derivativeGraph.setText("Graph Derivative");
            clearDerivativeGraph = true;
        }
        else if (clearDerivativeGraph == true) {
            derivativeGraph.setText("Clear");
            pfList.add(derivative);
            graph(derivative);
            clearDerivativeGraph = false;
        }
       
    }//GEN-LAST:event_derivativeGraphActionPerformed

    //graphs inverse
    private void inverseGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseGraphActionPerformed
        if (clearInverse == false) {
            clearInverse();
            inverseGraph.setText("Graph Inverse");
            clearInverse = true;
        }
        else if (clearInverse == true) {
            graphingInverse = true;
            graph(pMain);
            graphingInverse = false;
            inverseGraph.setText("Clear");
            clearInverse = false;
        }
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
            axisXMin -= 5;
            axisYMin -= 5;
        }
        else {
            xMin /= 2;
            xMax /= 2;
            yMin /= 2;
            yMax /= 2;
            axisXMin /= 5;
            axisYMin /= 2;
        }
        
        graph(pMain);
        clearGraph(pMain);
        graph(pMain);
        
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
                derivative = pMain.differentiate();
                tabbedPanel.setVisible(true);
                yIntOutput.setText("y-int: " + pMain.yInt);
                outputMessage.setText("Main polynomial initialized.");
                displayPolynomial.setText("Your polynomial is: y=" + pMain.print());

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

    private void xMinInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMinInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xMinInputActionPerformed

    private void xMaxInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMaxInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xMaxInputActionPerformed

    private void yMinInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yMinInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yMinInputActionPerformed

    private void yMaxInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yMaxInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yMaxInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        xMin = Integer.parseInt(xMinInput.getText());
        xMax = Integer.parseInt(xMaxInput.getText());
        yMin = Integer.parseInt(yMinInput.getText());
        yMax = Integer.parseInt(yMaxInput.getText());
        
        axisXMin = xMin;
        axisXMax = xMax;
        axisYMin = yMin;
        axisYMax = yMax;
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
    private javax.swing.JLabel DRLabel;
    private javax.swing.JLabel appTitle;
    private javax.swing.JButton compositionButton;
    private javax.swing.JButton derivativeButton;
    private javax.swing.JButton derivativeGraph;
    private javax.swing.JLabel derivativeOutput;
    private javax.swing.JLabel displayPolynomial;
    private javax.swing.JLabel displayValue;
    private javax.swing.JLabel domain;
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
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel range;
    private javax.swing.JLabel resultOutput1;
    private javax.swing.JButton rpEqualButton;
    private javax.swing.JTextField rpOperationSign;
    private javax.swing.JLabel rpOutput;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JTextField xMaxInput;
    private javax.swing.JLabel xMaxLabel;
    private javax.swing.JTextField xMinInput;
    private javax.swing.JLabel xMinLabel;
    private javax.swing.JTextField xTangentInput;
    private javax.swing.JLabel yIntOutput;
    private javax.swing.JTextField yMaxInput;
    private javax.swing.JLabel yMaxLabel;
    private javax.swing.JTextField yMinInput;
    private javax.swing.JLabel yMinLabel;
    // End of variables declaration//GEN-END:variables
}
