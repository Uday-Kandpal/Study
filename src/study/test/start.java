package study.test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class start
        extends JFrame {

    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;

    public start() {
        initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTextArea1 = new JTextArea();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jButton1 = new JButton();

        setDefaultCloseOperation(3);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                start.this.formKeyPressed(evt);
            }
        });
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), " begining", 0, 0, new Font("Agency FB", 1, 24), Color.darkGray));

        this.jPanel2.setBorder(new SoftBevelBorder(0, Color.pink, Color.red, Color.orange, Color.lightGray));

        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setText("Set of Instructions");

        this.jTextArea1.setColumns(20);
        this.jTextArea1.setEditable(false);
        this.jTextArea1.setFont(new Font("Monospaced", 1, 24));
        this.jTextArea1.setLineWrap(true);
        this.jTextArea1.setRows(10);
        this.jTextArea1.setText("1. These are the set of instructions  for the test.\n2. Read them carefully before the start of the paper.\n3. The time alloted to you is --:--:--.");
        this.jTextArea1.setToolTipText("INSTRUCTIONS");
        this.jTextArea1.setWrapStyleWord(true);
        this.jTextArea1.setDisabledTextColor(new Color(153, 153, 153));
        this.jScrollPane1.setViewportView(this.jTextArea1);

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(62, 62, 62).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -2, 232, -2).addComponent(this.jScrollPane1, -2, 992, -2)).addContainerGap(27, 32767)));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, 32767).addComponent(this.jScrollPane1, -2, 581, -2).addContainerGap()));

        this.jLabel2.setBackground(new Color(204, 204, 255));
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setIcon(new ImageIcon(getClass().getResource("/study/test/authority.JPG")));
        this.jLabel2.setText("Authority Signature ");
        this.jLabel2.setToolTipText("Here is the signature of the signing authority for the proof of the paper");
        this.jLabel2.setBorder(BorderFactory.createLineBorder(new Color(102, 102, 255), 5));
        this.jLabel2.setHorizontalTextPosition(4);
        this.jLabel2.setIconTextGap(50);
        this.jLabel2.setOpaque(true);

        this.jLabel3.setFont(new Font("Tahoma", 1, 18));
        this.jLabel3.setText("Type of test  :");

        this.jLabel4.setFont(new Font("Tahoma", 1, 18));
        this.jLabel4.setText("Date of Examination");

        this.jLabel5.setBackground(new Color(102, 102, 0));
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setIcon(new ImageIcon(getClass().getResource("/study/test/biometric.JPG")));
        this.jLabel5.setText("Biometric Scanned Image (if there)");
        this.jLabel5.setAlignmentX(0.5F);
        this.jLabel5.setAutoscrolls(true);
        this.jLabel5.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 0), 5));
        this.jLabel5.setDisabledIcon(new ImageIcon(getClass().getResource("/study/test/biometric_disabled.JPG")));
        this.jLabel5.setHorizontalTextPosition(4);
        this.jLabel5.setIconTextGap(50);
        this.jLabel5.setOpaque(true);
        this.jLabel5.setVerticalTextPosition(1);

        this.jButton1.setBackground(new Color(51, 153, 0));
        this.jButton1.setFont(new Font("Tahoma", 1, 14));
        this.jButton1.setIcon(new ImageIcon(getClass().getResource("/study/test/next_active.JPG")));
        this.jButton1.setText("Next");
        this.jButton1.setDisabledIcon(new ImageIcon(getClass().getResource("/study/test/next_inactive.JPG")));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(51, 51, 51).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel3, -2, 362, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel4, -2, 444, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel2, -1, -1, 32767).addGap(18, 18, 18).addComponent(this.jLabel5, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton1, -2, 172, -2)).addComponent(this.jPanel2, -2, -1, -2))).addContainerGap(53, 32767)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel3, -2, 31, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel4, -1, -1, 32767).addGap(6, 6, 6))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel2, -2, -1, -2).addGap(23, 23, 23).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel2, -1, -1, 32767).addComponent(this.jButton1).addComponent(this.jLabel5)).addGap(29, 29, 29)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, -1, 32767).addContainerGap()));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -1, -1, 32767).addContainerGap()));

        pack();
    }

    private void formKeyPressed(KeyEvent evt) {
        dispose();
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(() -> {
            new start().setVisible(true);
        });
    }
}
