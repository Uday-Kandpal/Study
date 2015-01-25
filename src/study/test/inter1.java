package study.test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class inter1
        extends JFrame {

    TimeUnit t;
    int i = 0;
    long hour=1;
    long minute=59;
    long second=59;
    long millis=999;
    Timer t1;

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

        inter1.this.hrs.setText(hour + "");
        inter1.this.sec.setText(second + "");
        inter1.this.min.setText(minute + "");
        inter1.this.milli.setText(millis + "");

    };
    private JLabel hrs;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JLabel milli;
    private JLabel min;
    private JLabel sec;

    public inter1() {
        initComponents();

        this.t1 = new Timer(1, this.taskPerformer);
        this.t1.start();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.hrs = new JLabel();
        this.min = new JLabel();
        this.sec = new JLabel();
        this.jLabel6 = new JLabel();
        this.milli = new JLabel();
        this.jPanel3 = new JPanel();

        setDefaultCloseOperation(3);

        this.jPanel1.setBackground(new Color(204, 255, 255));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 755, 32767));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));

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
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.hrs, -2, 52, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -2, 14, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.min, -2, 52, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2, -2, 14, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.sec, -2, 52, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel6, -2, 14, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.milli, -2, 52, -2).addContainerGap(23, 32767)));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(33, 33, 33).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel6, -2, 34, -2).addComponent(this.milli, -2, 34, -2)).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1, -2, 34, -2).addComponent(this.jLabel2, -2, 34, -2).addComponent(this.hrs, -2, 34, -2).addComponent(this.min, -2, 34, -2).addComponent(this.sec, -2, 34, -2))).addContainerGap(33, 32767)));

        this.jPanel3.setBackground(new Color(204, 204, 255));

        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));

        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 551, 32767));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addComponent(this.jPanel3, -1, -1, 32767))));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel3, -1, -1, 32767).addContainerGap()));

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
            Logger.getLogger(inter1.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(() -> {
            new inter1().setVisible(true);
        });
    }
}
