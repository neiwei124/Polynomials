package polynomials;


import java.awt.*;
import java.util.ArrayList;

public class PolynomialGUI extends javax.swing.JFrame {

    static String operatorMessage;
    static String operator;
    int xMin, xMax, yMin, yMax, axisXMin, axisXMax, axisYMin, axisYMax;
    int gSize;
    pf pMain;
    pf derivative;
    pf composition;
    pf pRandom;
    String result;
    String[] EB = new String[2];
    ArrayList <pf> pfList = new ArrayList();
    Color[] c = {Color.black, Color.green, Color.blue, Color.magenta, Color.orange};
    int switchColor = 0;
    boolean clearMainGraph = true;
    boolean clearDerivativeGraph = true;
    boolean clearResultGraph = true;
    boolean graphingInverse = false;
    boolean clearInverse = true;
    boolean clearCompositionGraph = true;
    boolean clearRandomGraph = true;
    boolean drawWhiteLines = false;
    boolean drError = false;

    public PolynomialGUI() {
        initComponents();
        tabbedPanel.setVisible(false);
        reInitializeButton.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultOutput1 = new javax.swing.JLabel();
        appTitle = new javax.swing.JLabel();
        drawingPanel = new javax.swing.JPanel();
        inputPromptLabel = new javax.swing.JLabel();
        mainPolynomialInput = new javax.swing.JTextField();
        errorMessage = new javax.swing.JLabel();
        helpText = new javax.swing.JLabel();
        tabbedPanel = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        getValueLabel = new javax.swing.JLabel();
        inputValue = new javax.swing.JTextField();
        displayValue = new javax.swing.JLabel();
        getValue = new javax.swing.JButton();
        derivativeOutput = new javax.swing.JLabel();
        yIntOutput = new javax.swing.JLabel();
        negEndBehaviour = new javax.swing.JLabel();
        posEndBehaviour = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        graphMain = new javax.swing.JButton();
        derivativeGraph = new javax.swing.JButton();
        inverseGraph = new javax.swing.JButton();
        compositionGraph = new javax.swing.JButton();
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
        clearAllButton = new javax.swing.JButton();
        compositionInput = new javax.swing.JTextField();
        compositionLabel = new javax.swing.JLabel();
        randPolynomialInput = new javax.swing.JLabel();
        pRandomInput = new javax.swing.JTextField();
        pRandomGraph = new javax.swing.JButton();
        errorOutput = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        initializeButton = new javax.swing.JButton();
        reInitializeButton = new javax.swing.JButton();

        resultOutput1.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appTitle.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 36)); // NOI18N
        appTitle.setText("Polynomial Software");

        drawingPanel.setBackground(new java.awt.Color(255, 255, 255));
        drawingPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        errorMessage.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        helpText.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 11)); // NOI18N
        helpText.setText(" (No spaces, use ^ for exponents, and in expanded form):");

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

        derivativeOutput.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        negEndBehaviour.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 14)); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(getValueLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(inputValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(getValue)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(displayValue, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jPanel3Layout.createSequentialGroup()
                                .add(yIntOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 510, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(derivativeOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 522, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 81, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, posEndBehaviour, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(negEndBehaviour, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(getValueLabel)
                        .add(inputValue)
                        .add(getValue))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(displayValue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .add(10, 10, 10)
                .add(derivativeOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(yIntOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(negEndBehaviour, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(posEndBehaviour, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(301, 301, 301))
        );

        tabbedPanel.addTab("Features", jPanel3);

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
                .add(mpEqualButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(81, Short.MAX_VALUE))
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
                        .add(rpOperationSign, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(p2Input, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 213, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(rpEqualButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(184, 184, 184)
                        .add(jLabel3)))
                .addContainerGap(66, Short.MAX_VALUE))
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
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2 Random Polynomials", jPanel5);

        tabbedPanel.addTab("Operations", jTabbedPane1);

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

        compositionGraph.setFont(new java.awt.Font("Myriad Web Pro Condensed", 1, 12)); // NOI18N
        compositionGraph.setText("Graph Composition");
        compositionGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositionGraphActionPerformed(evt);
            }
        });

        domain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        domain.setText("Domain:");

        range.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        range.setText("Range:");

        xMinLabel.setText("xMin:");

        xMinInput.setText("-10");
        xMinInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMinInputActionPerformed(evt);
            }
        });

        xMaxLabel.setText("xMax:");

        xMaxInput.setText("10");
        xMaxInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMaxInputActionPerformed(evt);
            }
        });

        yMinLabel.setText("yMin:");

        yMinInput.setText("-10");
        yMinInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yMinInputActionPerformed(evt);
            }
        });

        yMaxLabel.setText("yMax:");

        yMaxInput.setText("10");
        yMaxInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yMaxInputActionPerformed(evt);
            }
        });

        clearAllButton.setText("Clear All...");
        clearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllButtonActionPerformed(evt);
            }
        });

        compositionInput.setText("x^2");

        compositionLabel.setText("Enter g(x) for composition:");

        randPolynomialInput.setText("Graph a random polynomial:");

        pRandomInput.setText("2x^2+1");

        pRandomGraph.setText("Graph");
        pRandomGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pRandomGraphActionPerformed(evt);
            }
        });

        jLabel1.setText("(Enter integer domain/range)");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(errorOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 377, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(clearAllButton))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                                .add(321, 321, 321)
                                .add(pRandomInput))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                                        .add(compositionInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(compositionGraph))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, compositionLabel))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(pRandomGraph))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                                .add(graphMain)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(randPolynomialInput)
                                .add(43, 43, 43))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                                .add(domain)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(xMinLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(xMinInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(xMaxLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(xMaxInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(71, 71, 71)
                                .add(range, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(yMinLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(yMinInput, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(yMaxLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(yMaxInput, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                                        .add(6, 6, 6)
                                        .add(jLabel1))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                                        .add(derivativeGraph)
                                        .add(18, 18, 18)
                                        .add(inverseGraph)))
                                .add(0, 0, Short.MAX_VALUE)))
                        .add(9, 9, 9)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(domain)
                    .add(xMinLabel)
                    .add(xMinInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xMaxLabel)
                    .add(xMaxInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(range)
                    .add(yMinLabel)
                    .add(yMinInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(yMaxLabel)
                    .add(yMaxInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1)
                .add(13, 13, 13)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(randPolynomialInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(graphMain))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(inverseGraph)
                    .add(derivativeGraph)
                    .add(pRandomInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(16, 16, 16)
                        .add(compositionLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(compositionGraph)
                            .add(compositionInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(28, 28, 28)
                        .add(errorOutput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(79, 79, 79))
                    .add(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pRandomGraph)
                        .add(38, 38, 38)
                        .add(clearAllButton)
                        .add(97, 97, 97))))
        );

        tabbedPanel.addTab("Graphing", jPanel2);

        initializeButton.setText("Initialize");
        initializeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initializeButtonActionPerformed(evt);
            }
        });

        reInitializeButton.setText("Initialize Different Polynomial...");
        reInitializeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reInitializeButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(drawingPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(55, 55, 55)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(mainPolynomialInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(initializeButton)
                                .add(11, 11, 11)
                                .add(errorMessage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 239, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(inputPromptLabel)
                            .add(helpText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 309, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 47, Short.MAX_VALUE)
                        .add(tabbedPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 630, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(24, 24, 24))))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(reInitializeButton)
                .add(240, 240, 240))
            .add(layout.createSequentialGroup()
                .add(53, 53, 53)
                .add(appTitle)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(39, 39, 39)
                .add(appTitle)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
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
                            .add(errorMessage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(tabbedPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 320, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(reInitializeButton)
                .add(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        if (drawWhiteLines) {
            g.setColor(Color.white);
        }
        else{
            g.setColor(c[switchColor%c.length]);
        }
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
        pfList.remove(p);
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
    
    public void operation(pf p1, pf p2, String s, String op){
        boolean invalidInput = false;
        //ummm i want to display an algebraic form of division but all it has is get numerical value on the rational function class..
        //so this only goes to multiply :(
        switch (op) {
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
    
    private void mainPolynomialInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainPolynomialInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainPolynomialInputActionPerformed

    public void getY (pf p) {
        try {
        double x = Double.parseDouble(inputValue.getText());
        double y = p.calculate(x);
        displayValue.setText("The y-value is " + y);
        }
        catch (Exception e){
            displayValue.setText("Invalid input.");
        }
    }
    
    private void initializeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initializeButtonActionPerformed
        if (mainPolynomialInput.getText().isEmpty()) {
            errorMessage.setText("Input field is empty.");
        }
        else{
            try{
                pMain = new pf(mainPolynomialInput.getText());
                errorMessage.setText("");
                derivative = pMain.differentiate();
                pRandom = new pf(pRandomInput.getText());
                initializeButton.setEnabled(false);
                tabbedPanel.setVisible(true);
                reInitializeButton.setVisible(true);
                yIntOutput.setText("y-int: " + pMain.yInt);
                derivativeOutput.setText("Derivative: " + derivative.print());
                mainPolynomialInput.setText(pMain.print());
                EB = pMain.getEndBehavior();
                negEndBehaviour.setText(EB[0]);
                posEndBehaviour.setText(EB[1]);

            }
            catch (Exception e){
                errorMessage.setText("Invalid input.");
            }  
        }
        
        
    }//GEN-LAST:event_initializeButtonActionPerformed

    private void reInitializeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reInitializeButtonActionPerformed
        tabbedPanel.setVisible(false);
        reInitializeButton.setVisible(false);
        initializeButton.setEnabled(true);
    }//GEN-LAST:event_reInitializeButtonActionPerformed

    private void rpEqualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpEqualButtonActionPerformed
        if (p1Input.getText().isEmpty() || p2Input.getText().isEmpty() 
                || rpOperationSign.getText().isEmpty()) {
            rpOutput.setText("One of the field is empty.");
        }
        else{
            try{
                pf p1 = new pf(p1Input.getText());
                pf p2 = new pf(p2Input.getText());
                if (p2.print().equals("0") && rpOperationSign.getText().equals("/")) {
                        rpOutput.setText("Cannot divide by zero!");
                    }
                else{
                    operation(p1, p2, "rp", rpOperationSign.getText());
                }
            }
            catch(Exception E){
                rpOutput.setText("Invalid input for one of the polynomial(s).");
            }
        }

    }//GEN-LAST:event_rpEqualButtonActionPerformed

    //gets result from operations
    private void mpEqualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpEqualButtonActionPerformed
        if (otherInput.getText().isEmpty() || mpOperationSign.getText().isEmpty()) {
            mpOutput.setText("One of the field is empty.");
        }
        else{
            try{
                pf other = new pf(otherInput.getText());
                if (other.print().equals("0") && mpOperationSign.getText().equals("/")) {
                    mpOutput.setText("Cannot divide by zero!");
                }
                else{
                    operation(pMain, other, "mp", mpOperationSign.getText());
                }
            }
            catch(Exception E){
                mpOutput.setText("Invalid polynomial input.");
            }
        }
    }//GEN-LAST:event_mpEqualButtonActionPerformed

    private void otherInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherInputActionPerformed

    private void clearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllButtonActionPerformed
        Graphics g = drawingPanel.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, gSize, gSize);
        graphAxis();
        derivativeGraph.setText("Graph Derivative");
        clearDerivativeGraph = true;
        clearGraph(derivative);
        compositionGraph.setText("Graph Composition");
        clearCompositionGraph = true;
        graphMain.setText("Graph Main Polynomial");
        clearMainGraph = true;
        clearGraph(pMain);
        inverseGraph.setText("Graph Inverse");
        clearInverse = true;
        clearInverse();
        pRandomGraph.setText("Graph");
        clearRandomGraph = true;
        
    }//GEN-LAST:event_clearAllButtonActionPerformed

    private void yMaxInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yMaxInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yMaxInputActionPerformed

    private void yMinInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yMinInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yMinInputActionPerformed

    private void xMaxInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMaxInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xMaxInputActionPerformed

    private void xMinInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMinInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xMinInputActionPerformed

    //graphs inverse
    private void inverseGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverseGraphActionPerformed
        setDomainAndRange();
        if(drError == false){
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
        }
    }//GEN-LAST:event_inverseGraphActionPerformed

    //graphs derivative
    private void derivativeGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derivativeGraphActionPerformed
        setDomainAndRange();
        if(drError == false){
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
        }
    }//GEN-LAST:event_derivativeGraphActionPerformed

    //graphs original polynomial
    private void graphMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphMainActionPerformed
        setDomainAndRange();
        if(drError == false){
            if (clearMainGraph == false) {
                clearGraph(pMain);
                graphMain.setText("Graph Main Polynomial");
                clearMainGraph = true;
            }
            else if (clearMainGraph == true) {
                graphMain.setText("Clear");
                pfList.add(pMain);
                graph(pMain);
                clearMainGraph = false;
            }
        }
    }//GEN-LAST:event_graphMainActionPerformed

    private void getValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getValueActionPerformed
        if (inputValue.getText().isEmpty()) {
            displayValue.setText("The input field is empty.");
        }
        else{
            getY(pMain);
        }
    }//GEN-LAST:event_getValueActionPerformed

    private void inputValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValueActionPerformed

    }//GEN-LAST:event_inputValueActionPerformed

    //compose
    private void compositionGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compositionGraphActionPerformed
        if (compositionInput.getText().isEmpty()) {
            errorOutput.setText("Input field is empty");
        }
        else{
            try{
                composition = pMain.composition(new pf(compositionInput.getText()));
                Graphics g = drawingPanel.getGraphics();
                setDomainAndRange();
                if (drError == false) {
                    if (clearCompositionGraph == false) {
                        drawWhiteLines = true;
                        g.setColor(Color.white);
                        g.fillRect(0, 0, gSize, gSize);
                        graph(composition);
                        graphAxis();
                        drawWhiteLines = false;
                        for (int i = 0; i < pfList.size(); i++) {
                            graph(pfList.get(i));
                            if (clearRandomGraph == true) {
                                graph(pRandom);
                            }
                        }
                        compositionGraph.setText("Graph Composition");
                        clearCompositionGraph = true;
                    }
                    else if (clearCompositionGraph == true) {
                        compositionGraph.setText("Clear");
                        graph(composition);
                        clearCompositionGraph = false;
                    }
                }
                errorOutput.setText("");
            }
            catch(Exception e){
                errorOutput.setText("Invalid input.");
            }
        }
    }//GEN-LAST:event_compositionGraphActionPerformed

    private void pRandomGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pRandomGraphActionPerformed
        if (pRandomInput.getText().isEmpty()) {
            errorOutput.setText("Input field is empty");
        }
        else{
            try {
                pRandom = new pf(pRandomInput.getText());
                Graphics g = drawingPanel.getGraphics();
                setDomainAndRange();
                if (drError == false) {
                    if (clearRandomGraph == false) {
                        drawWhiteLines = true;
                        g.setColor(Color.white);
                        g.fillRect(0, 0, gSize, gSize);
                        graph(pRandom);
                        graphAxis();
                        drawWhiteLines = false;
                        for (int i = 0; i < pfList.size(); i++) {
                            graph(pfList.get(i));
                            if (clearCompositionGraph == true) {
                                graph(composition);
                            }
                        }
                        pRandomGraph.setText("Graph");
                        clearRandomGraph = true;  
                    }
                    else if (clearRandomGraph == true) {
                        pRandomGraph.setText("Clear");
                        graph(pRandom);
                        clearRandomGraph = false;
                    }
                }
                errorOutput.setText("");
            }
            catch(Exception e){
                errorOutput.setText("Invalid Input.");
            }
        }
        

    }//GEN-LAST:event_pRandomGraphActionPerformed

    public void setDomainAndRange(){
        if (xMinInput.getText().isEmpty() || xMaxInput.getText().isEmpty() 
                || yMinInput.getText().isEmpty() || yMaxInput.getText().isEmpty()) {
            errorOutput.setText("One of the domain/range field is empty.");
            drError = true;
        }
        else {
            try{    
                xMin = Integer.parseInt(xMinInput.getText());
                xMax = Integer.parseInt(xMaxInput.getText());
                yMin = Integer.parseInt(yMinInput.getText());
                yMax = Integer.parseInt(yMaxInput.getText());

                axisXMin = xMin;
                axisXMax = xMax;
                axisYMin = yMin;
                axisYMax = yMax;
                drError = false;
                errorOutput.setText("");
            }
            catch(Exception E){
                errorOutput.setText("Invalid input for one of the domain/range.");
                drError = true;
            }
        }
    }
    
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
    private javax.swing.JButton clearAllButton;
    private javax.swing.JButton compositionGraph;
    private javax.swing.JTextField compositionInput;
    private javax.swing.JLabel compositionLabel;
    private javax.swing.JButton derivativeGraph;
    private javax.swing.JLabel derivativeOutput;
    private javax.swing.JLabel displayValue;
    private javax.swing.JLabel domain;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel errorOutput;
    private javax.swing.JButton getValue;
    private javax.swing.JLabel getValueLabel;
    private javax.swing.JButton graphMain;
    private javax.swing.JLabel helpText;
    private javax.swing.JButton initializeButton;
    private javax.swing.JLabel inputPromptLabel;
    private javax.swing.JTextField inputValue;
    private javax.swing.JButton inverseGraph;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JTextField mainPolynomialInput;
    private javax.swing.JButton mpEqualButton;
    private javax.swing.JLabel mpLabel;
    private javax.swing.JTextField mpOperationSign;
    private javax.swing.JLabel mpOutput;
    private javax.swing.JLabel negEndBehaviour;
    private javax.swing.JTextField otherInput;
    private javax.swing.JTextField p1Input;
    private javax.swing.JTextField p2Input;
    private javax.swing.JButton pRandomGraph;
    private javax.swing.JTextField pRandomInput;
    private javax.swing.JLabel posEndBehaviour;
    private javax.swing.JLabel randPolynomialInput;
    private javax.swing.JLabel range;
    private javax.swing.JButton reInitializeButton;
    private javax.swing.JLabel resultOutput1;
    private javax.swing.JButton rpEqualButton;
    private javax.swing.JTextField rpOperationSign;
    private javax.swing.JLabel rpOutput;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JTextField xMaxInput;
    private javax.swing.JLabel xMaxLabel;
    private javax.swing.JTextField xMinInput;
    private javax.swing.JLabel xMinLabel;
    private javax.swing.JLabel yIntOutput;
    private javax.swing.JTextField yMaxInput;
    private javax.swing.JLabel yMaxLabel;
    private javax.swing.JTextField yMinInput;
    private javax.swing.JLabel yMinLabel;
    // End of variables declaration//GEN-END:variables
}
