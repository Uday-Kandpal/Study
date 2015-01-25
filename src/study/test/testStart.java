package study.test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityResult;
import javax.persistence.PersistenceUnit;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class testStart
        extends JFrame {

    private JLabel footer;
    private JLabel header;
    private JLabel hrs;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JTextPane jTextPane1;
    private JTextPane jTextPane2;
    private JLabel milli;
    private JLabel min;
    private JLabel sec;

    int i = 0;
    long hour = 1;
    long minute = 59;
    long second = 59;
    long millis = 999;
    Timer t1;

    @PersistenceUnit
    EntityManagerFactory emf;

    EntityManager em = emf.createEntityManager();
    ActionListener taskPerformer = (ActionEvent evt) -> {
        if (millis > 0) {
            millis--;
        }
        if (second != 0 && millis == 0) {
            second--;
            millis = 999;
        }
        if (minute != 0 && second == 0) {
            minute--;
            second = 59;
        }
        if (hour != 0 && minute == 0) {
            hour--;
            second = 59;
        }
        if (minute == 0 && hour == 0 && second == 0) {
            t1.stop();

        }

        testStart.this.hrs.setText(hour + "");
        testStart.this.sec.setText(second + "");
        testStart.this.min.setText(minute + "");
        testStart.this.milli.setText(millis + "");

    };

    public testStart() {
        initComponents();
        this.t1 = new Timer(1, this.taskPerformer);
        this.t1.start();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.hrs = new JLabel();
        this.min = new JLabel();
        this.sec = new JLabel();
        this.jLabel6 = new JLabel();
        this.milli = new JLabel();
        this.jPanel1 = new JPanel();
        this.jScrollPane2 = new JScrollPane();
        this.jTextPane1 = new JTextPane();
        this.jScrollPane3 = new JScrollPane();
        this.jTextPane2 = new JTextPane();
        this.header = new JLabel();
        this.footer = new JLabel();
        this.jPanel3 = new JPanel();

        setDefaultCloseOperation(3);

        this.jPanel2.setBackground(new Color(153, 153, 153));

        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setText(":");

        this.jLabel2.setFont(new Font("Tahoma", 1, 18));
        this.jLabel2.setText(":");

        this.hrs.setFont(new Font("Tahoma", 1, 18));
        this.hrs.setText("00");

        this.min.setFont(new Font("Tahoma", 1, 18));
        this.min.setText("00");

        this.sec.setFont(new Font("Tahoma", 1, 18));
        this.sec.setText("00");

        this.jLabel6.setFont(new Font("Tahoma", 1, 18));
        this.jLabel6.setText(":");

        this.milli.setFont(new Font("Tahoma", 1, 18));
        this.milli.setText("00");

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.hrs, -2, 52, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -2, 14, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.min, -2, 52, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2, -2, 14, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.sec, -2, 52, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel6, -2, 14, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.milli, -2, 52, -2).addContainerGap(-1, 32767)));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(33, 33, 33).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel6, -2, 34, -2).addComponent(this.milli, -2, 34, -2)).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1, -2, 34, -2).addComponent(this.jLabel2, -2, 34, -2).addComponent(this.hrs, -2, 34, -2).addComponent(this.min, -2, 34, -2).addComponent(this.sec, -2, 34, -2))).addContainerGap(33, 32767)));

        this.jPanel1.setBackground(new Color(204, 255, 255));

        this.jTextPane1.setContentType("text/html");
        this.jTextPane1.setEditable(false);
        this.jScrollPane2.setViewportView(this.jTextPane1);

        this.jTextPane2.setBackground(new Color(255, 153, 153));
        this.jTextPane2.setContentType("text/html");
        this.jTextPane2.setEditable(false);
        this.jScrollPane3.setViewportView(this.jTextPane2);

        this.header.setFont(new Font("Tahoma", 1, 18));
        this.header.setHorizontalAlignment(0);
        this.header.setText("header");

        this.footer.setFont(new Font("Tahoma", 1, 18));
        this.footer.setHorizontalAlignment(0);
        this.footer.setText("base");

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane2, GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.footer, -2, 905, -2).addComponent(this.header, -2, 905, -2)).addGap(0, 26, 32767)).addComponent(this.jScrollPane3)).addContainerGap()));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.header, -2, 51, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jScrollPane3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane2, -2, 325, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.footer, -2, 51, -2)));

        this.jPanel3.setBackground(new Color(204, 204, 255));

        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));

        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 691, 32767));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addComponent(this.jPanel3, -1, -1, 32767))));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel3, -1, -1, 32767)));

        pack();
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
            Logger.getLogger(testStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(() -> {
            new testStart().setVisible(true);
        });
    }
}
