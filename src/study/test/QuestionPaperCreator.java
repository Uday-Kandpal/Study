package study.test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class QuestionPaperCreator
        extends JFrame {

    String[] subjectName;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextPane jTextPane1;

    public QuestionPaperCreator() {
        initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jTextField3 = new JTextField();
        this.jScrollPane2 = new JScrollPane();
        this.jTextPane1 = new JTextPane();
        this.jButton1 = new JButton();
        this.jMenuBar1 = new JMenuBar();
        this.jMenu1 = new JMenu();
        this.jMenu2 = new JMenu();

        setDefaultCloseOperation(3);

        this.jPanel1.setBackground(new Color(102, 255, 102));

        this.jPanel2.setBackground(new Color(0, 102, 0));
        this.jPanel2.setBorder(BorderFactory.createTitledBorder(null, "Step 1 of 2", 0, 0, new Font("Agency FB", 1, 24), Color.orange));

        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setForeground(new Color(153, 153, 0));
        this.jLabel1.setText("No of sets : ");

        this.jLabel2.setFont(new Font("Tahoma", 1, 18));
        this.jLabel2.setForeground(new Color(153, 153, 0));
        this.jLabel2.setText("no of questions per set");

        this.jLabel3.setFont(new Font("Tahoma", 1, 18));
        this.jLabel3.setForeground(new Color(153, 153, 0));
        this.jLabel3.setText("Name of the subjects : ");

        this.jTextField1.setFont(new Font("Tahoma", 1, 18));
        this.jTextField1.setForeground(new Color(51, 102, 0));

        this.jTextField2.setFont(new Font("Tahoma", 1, 18));
        this.jTextField2.setForeground(new Color(51, 102, 0));

        this.jTextField3.setFont(new Font("Tahoma", 1, 18));
        this.jTextField3.setForeground(new Color(51, 102, 0));
        this.jTextField3.addInputMethodListener(new InputMethodListener() {
            @Override
            public void caretPositionChanged(InputMethodEvent evt) {
            }

            @Override
            public void inputMethodTextChanged(InputMethodEvent evt) {
                QuestionPaperCreator.this.jTextField3InputMethodTextChanged(evt);
            }
        });
        this.jTextPane1.setBackground(new Color(102, 153, 0));
        this.jScrollPane2.setViewportView(this.jTextPane1);

        this.jButton1.setBackground(new Color(0, 102, 0));
        this.jButton1.setFont(new Font("Tahoma", 1, 18));
        this.jButton1.setForeground(new Color(102, 204, 0));
        this.jButton1.setText("Show Retreived Data");
        this.jButton1.addActionListener((ActionEvent evt) -> {
            QuestionPaperCreator.this.jButton1ActionPerformed(evt);
        });
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2, -2, 237, -2).addComponent(this.jLabel3).addComponent(this.jLabel1, -2, 192, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField1, -2, 444, -2).addComponent(this.jTextField3, -2, 444, -2).addComponent(this.jTextField2, -2, 444, -2))).addComponent(this.jScrollPane2, -2, 899, -2))).addGroup(jPanel2Layout.createSequentialGroup().addGap(283, 283, 283).addComponent(this.jButton1))).addContainerGap(41, 32767)));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(56, 56, 56).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jTextField1, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jTextField2, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jTextField3, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.jButton1).addGap(29, 29, 29).addComponent(this.jScrollPane2, -2, 196, -2).addContainerGap(118, 32767)));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(84, 84, 84).addComponent(this.jPanel2, -2, -1, -2).addContainerGap(115, 32767)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(60, 60, 60).addComponent(this.jPanel2, -2, -1, -2).addContainerGap(173, 32767)));

        this.jMenu1.setText("File");
        this.jMenuBar1.add(this.jMenu1);

        this.jMenu2.setText("Edit");
        this.jMenuBar1.add(this.jMenu2);

        setJMenuBar(this.jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        int i = 0;
        try {
            i = Integer.parseInt(this.jTextField1.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showInternalMessageDialog(this.rootPane, "Error : CHECK DATA INSERTED");
        }
        List lst = new List(i, true);
        for (int j = 0; j < i; j++) {
            lst.add(this.jTextField3.getText());
        }
        this.jTextPane1.add(lst);

        this.jTextPane1.setText("\nNo of sets = " + this.jTextField1.getText() + "\n" + "No. of questions : " + this.jTextField2.getText() + "\n" + "Name of subjects : ");
    }

    private void jTextField3InputMethodTextChanged(InputMethodEvent evt) {
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(QuestionPaperCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(() -> {
            new QuestionPaperCreator().setVisible(true);
        });
    }
}
