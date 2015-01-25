package study;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.MatteBorder;

public class mainFrame
        extends JFrame {

    private JPanel Internet;
    private JPanel clean;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JComboBox jComboBox4;
    private JComboBox jComboBox5;
    private JComboBox jComboBox6;
    private JComboBox jComboBox7;
    private JComboBox jComboBox8;
    private JDialog jDialog1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel plugin;
    private JPanel test;

    public mainFrame() {
        initComponents();
        this.test.setVisible(false);
        this.Internet.setVisible(false);
        this.plugin.setVisible(false);
        this.clean.setVisible(false);
    }

    private void initComponents() {
        this.jDialog1 = new JDialog();
        this.jButton5 = new JButton();
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jPanel2 = new JPanel();
        this.plugin = new JPanel();
        this.jLabel8 = new JLabel();
        this.jComboBox7 = new JComboBox();
        this.jComboBox8 = new JComboBox();
        this.jLabel9 = new JLabel();
        this.jButton8 = new JButton();
        this.clean = new JPanel();
        this.jLabel6 = new JLabel();
        this.jComboBox5 = new JComboBox();
        this.jComboBox6 = new JComboBox();
        this.jLabel7 = new JLabel();
        this.jButton9 = new JButton();
        this.Internet = new JPanel();
        this.jLabel4 = new JLabel();
        this.jComboBox3 = new JComboBox();
        this.jComboBox4 = new JComboBox();
        this.jLabel5 = new JLabel();
        this.jButton7 = new JButton();
        this.test = new JPanel();
        this.jLabel2 = new JLabel();
        this.jComboBox1 = new JComboBox();
        this.jComboBox2 = new JComboBox();
        this.jLabel3 = new JLabel();
        this.jButton6 = new JButton();
        this.jMenuBar1 = new JMenuBar();
        this.jMenu1 = new JMenu();
        this.jMenu2 = new JMenu();

        this.jDialog1.setTitle("Alert!");
        this.jDialog1.setBackground(new Color(0, 0, 102));
        this.jDialog1.setLocationByPlatform(true);
        this.jDialog1.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        this.jDialog1.setType(Window.Type.UTILITY);

        this.jButton5.setText("cancel");

        GroupLayout jDialog1Layout = new GroupLayout(this.jDialog1.getContentPane());
        this.jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jDialog1Layout.createSequentialGroup().addGap(356, 356, 356).addComponent(this.jButton5).addContainerGap(573, 32767)));

        jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup().addContainerGap(328, 32767).addComponent(this.jButton5).addGap(32, 32, 32)));

        setDefaultCloseOperation(3);

        this.jPanel1.setBackground(new Color(102, 255, 102));

        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setText("Please select the options given below : ");

        this.jButton1.setBackground(new Color(0, 102, 0));
        this.jButton1.setFont(new Font("Tahoma", 1, 18));
        this.jButton1.setForeground(new Color(102, 255, 102));
        this.jButton1.setText("Take a Test");
        this.jButton1.setToolTipText("to Take a test");
        this.jButton1.addActionListener((ActionEvent evt) -> {
            mainFrame.this.jButton1ActionPerformed(evt);
        });
        this.jButton2.setBackground(new Color(0, 102, 0));
        this.jButton2.setFont(new Font("Tahoma", 1, 18));
        this.jButton2.setForeground(new Color(102, 255, 102));
        this.jButton2.setText("Connect to internet");
        this.jButton2.setToolTipText("to connect to the internet to search for data that was marked by user");
        this.jButton2.addActionListener((ActionEvent evt) -> {
            mainFrame.this.jButton2ActionPerformed(evt);
        });
        this.jButton3.setBackground(new Color(0, 102, 0));
        this.jButton3.setFont(new Font("Tahoma", 1, 18));
        this.jButton3.setForeground(new Color(102, 255, 102));
        this.jButton3.setText("Add a plugin");
        this.jButton3.setToolTipText("adds plugins to update its features from resources outside its database");
        this.jButton3.addActionListener((ActionEvent evt) -> {
            mainFrame.this.jButton3ActionPerformed(evt);
        });
        this.jButton4.setBackground(new Color(0, 102, 0));
        this.jButton4.setFont(new Font("Tahoma", 1, 18));
        this.jButton4.setForeground(new Color(102, 255, 102));
        this.jButton4.setText("Clean database");
        this.jButton4.setToolTipText("removes unwanted temporary files");
        this.jButton4.addActionListener((ActionEvent evt) -> {
            mainFrame.this.jButton4ActionPerformed(evt);
        });
        this.jPanel2.setBackground(new Color(0, 102, 0));
        this.jPanel2.setBorder(new MatteBorder(new ImageIcon(getClass().getResource("/study/1.png"))));

        this.plugin.setBackground(new Color(102, 153, 0));

        this.jLabel8.setBackground(new Color(0, 102, 0));
        this.jLabel8.setFont(new Font("Tahoma", 1, 18));
        this.jLabel8.setForeground(new Color(102, 255, 102));
        this.jLabel8.setText("Choose Plugin Type: ");

        this.jComboBox7.setBackground(new Color(0, 102, 0));
        this.jComboBox7.setFont(new Font("Tahoma", 1, 18));
        this.jComboBox7.setForeground(new Color(102, 255, 102));
        this.jComboBox7.setModel(new DefaultComboBoxModel(new String[]{"English", "Hindi", "Maths", "Social studies", "Science", "Computer Science", "General knowledge"}));

        this.jComboBox8.setBackground(new Color(0, 102, 0));
        this.jComboBox8.setFont(new Font("Tahoma", 1, 18));
        this.jComboBox8.setForeground(new Color(102, 255, 102));
        this.jComboBox8.setModel(new DefaultComboBoxModel(new String[]{"General Tests", "Other tests"}));

        this.jLabel9.setBackground(new Color(0, 102, 0));
        this.jLabel9.setFont(new Font("Tahoma", 1, 18));
        this.jLabel9.setForeground(new Color(102, 255, 102));
        this.jLabel9.setText("Choose SourceType: ");

        this.jButton8.setBackground(new Color(0, 102, 102));
        this.jButton8.setFont(new Font("Tahoma", 1, 18));
        this.jButton8.setForeground(new Color(102, 153, 0));
        this.jButton8.setText("continue");

        GroupLayout pluginLayout = new GroupLayout(this.plugin);
        this.plugin.setLayout(pluginLayout);
        pluginLayout.setHorizontalGroup(pluginLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pluginLayout.createSequentialGroup().addGap(32, 32, 32).addGroup(pluginLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel8, -1, -1, 32767).addComponent(this.jLabel9, -1, 249, 32767)).addGap(18, 18, 18).addGroup(pluginLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jComboBox7, GroupLayout.Alignment.TRAILING, -2, 265, -2).addComponent(this.jComboBox8, GroupLayout.Alignment.TRAILING, -2, 265, -2)).addGap(45, 45, 45)).addGroup(pluginLayout.createSequentialGroup().addGap(165, 165, 165).addComponent(this.jButton8).addContainerGap()));

        pluginLayout.setVerticalGroup(pluginLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pluginLayout.createSequentialGroup().addGap(39, 39, 39).addComponent(this.jButton8).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pluginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox8, -2, -1, -2).addComponent(this.jLabel8)).addGap(57, 57, 57).addGroup(pluginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox7, -2, -1, -2).addComponent(this.jLabel9)).addContainerGap(27, 32767)));

        this.clean.setBackground(new Color(102, 153, 0));

        this.jLabel6.setBackground(new Color(0, 102, 0));
        this.jLabel6.setFont(new Font("Tahoma", 1, 18));
        this.jLabel6.setForeground(new Color(102, 255, 102));
        this.jLabel6.setText("Choose clean Method :");

        this.jComboBox5.setBackground(new Color(0, 102, 0));
        this.jComboBox5.setFont(new Font("Tahoma", 1, 18));
        this.jComboBox5.setForeground(new Color(102, 255, 102));
        this.jComboBox5.setModel(new DefaultComboBoxModel(new String[]{"English", "Hindi", "Maths", "Social studies", "Science", "Computer Science", "General knowledge"}));

        this.jComboBox6.setBackground(new Color(0, 102, 0));
        this.jComboBox6.setFont(new Font("Tahoma", 1, 18));
        this.jComboBox6.setForeground(new Color(102, 255, 102));
        this.jComboBox6.setModel(new DefaultComboBoxModel(new String[]{"General Tests", "Other tests"}));

        this.jLabel7.setBackground(new Color(0, 102, 0));
        this.jLabel7.setFont(new Font("Tahoma", 1, 18));
        this.jLabel7.setForeground(new Color(102, 255, 102));
        this.jLabel7.setText("Choose SourceType: ");

        this.jButton9.setBackground(new Color(0, 102, 102));
        this.jButton9.setFont(new Font("Tahoma", 1, 18));
        this.jButton9.setForeground(new Color(102, 153, 0));
        this.jButton9.setText("continue");

        GroupLayout cleanLayout = new GroupLayout(this.clean);
        this.clean.setLayout(cleanLayout);
        cleanLayout.setHorizontalGroup(cleanLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(cleanLayout.createSequentialGroup().addGap(32, 32, 32).addGroup(cleanLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel6, -1, -1, 32767).addComponent(this.jLabel7, -1, 249, 32767)).addGap(18, 18, 18).addGroup(cleanLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jComboBox5, GroupLayout.Alignment.TRAILING, -2, 265, -2).addComponent(this.jComboBox6, GroupLayout.Alignment.TRAILING, -2, 265, -2)).addGap(45, 45, 45)).addGroup(cleanLayout.createSequentialGroup().addGap(176, 176, 176).addComponent(this.jButton9).addContainerGap()));

        cleanLayout.setVerticalGroup(cleanLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(cleanLayout.createSequentialGroup().addGap(32, 32, 32).addComponent(this.jButton9).addGap(18, 18, 18).addGroup(cleanLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox6, -2, -1, -2).addComponent(this.jLabel6)).addGap(57, 57, 57).addGroup(cleanLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox5, -2, -1, -2).addComponent(this.jLabel7)).addContainerGap(27, 32767)));

        this.Internet.setBackground(new Color(102, 153, 0));

        this.jLabel4.setBackground(new Color(0, 102, 0));
        this.jLabel4.setFont(new Font("Tahoma", 1, 18));
        this.jLabel4.setForeground(new Color(102, 255, 102));
        this.jLabel4.setText("Choose Source: ");

        this.jComboBox3.setBackground(new Color(0, 102, 0));
        this.jComboBox3.setFont(new Font("Tahoma", 1, 18));
        this.jComboBox3.setForeground(new Color(102, 255, 102));
        this.jComboBox3.setModel(new DefaultComboBoxModel(new String[]{"English", "Hindi", "Maths", "Social studies", "Science", "Computer Science", "General knowledge"}));

        this.jComboBox4.setBackground(new Color(0, 102, 0));
        this.jComboBox4.setFont(new Font("Tahoma", 1, 18));
        this.jComboBox4.setForeground(new Color(102, 255, 102));
        this.jComboBox4.setModel(new DefaultComboBoxModel(new String[]{"General Tests", "Other tests"}));

        this.jLabel5.setBackground(new Color(0, 102, 0));
        this.jLabel5.setFont(new Font("Tahoma", 1, 18));
        this.jLabel5.setForeground(new Color(102, 255, 102));
        this.jLabel5.setText("Choose connection Type: ");

        this.jButton7.setBackground(new Color(0, 102, 102));
        this.jButton7.setFont(new Font("Tahoma", 1, 18));
        this.jButton7.setForeground(new Color(102, 153, 0));
        this.jButton7.setText("continue");

        GroupLayout InternetLayout = new GroupLayout(this.Internet);
        this.Internet.setLayout(InternetLayout);
        InternetLayout.setHorizontalGroup(InternetLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(InternetLayout.createSequentialGroup().addGap(32, 32, 32).addGroup(InternetLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel4, -1, -1, 32767).addComponent(this.jLabel5, -1, -1, 32767)).addGap(18, 18, 18).addGroup(InternetLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jComboBox3, GroupLayout.Alignment.TRAILING, -2, 265, -2).addComponent(this.jComboBox4, GroupLayout.Alignment.TRAILING, -2, 265, -2)).addGap(45, 45, 45)).addGroup(InternetLayout.createSequentialGroup().addGap(159, 159, 159).addComponent(this.jButton7).addContainerGap()));

        InternetLayout.setVerticalGroup(InternetLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(InternetLayout.createSequentialGroup().addGap(32, 32, 32).addComponent(this.jButton7).addGap(18, 18, 18).addGroup(InternetLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox4, -2, -1, -2).addComponent(this.jLabel4)).addGap(57, 57, 57).addGroup(InternetLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox3, -2, -1, -2).addComponent(this.jLabel5)).addContainerGap(27, 32767)));

        this.test.setBackground(new Color(102, 153, 0));

        this.jLabel2.setBackground(new Color(0, 102, 0));
        this.jLabel2.setFont(new Font("Tahoma", 1, 18));
        this.jLabel2.setForeground(new Color(102, 255, 102));
        this.jLabel2.setText("Choose Type: ");

        this.jComboBox1.setBackground(new Color(0, 102, 0));
        this.jComboBox1.setFont(new Font("Tahoma", 1, 18));
        this.jComboBox1.setForeground(new Color(102, 255, 102));
        this.jComboBox1.setModel(new DefaultComboBoxModel(new String[]{"English", "Hindi", "Maths", "Social studies", "Science", "Computer Science", "General knowledge"}));

        this.jComboBox2.setBackground(new Color(0, 102, 0));
        this.jComboBox2.setFont(new Font("Tahoma", 1, 18));
        this.jComboBox2.setForeground(new Color(102, 255, 102));
        this.jComboBox2.setModel(new DefaultComboBoxModel(new String[]{"General Tests", "Other tests"}));

        this.jLabel3.setBackground(new Color(0, 102, 0));
        this.jLabel3.setFont(new Font("Tahoma", 1, 18));
        this.jLabel3.setForeground(new Color(102, 255, 102));
        this.jLabel3.setText("Choose Subject : ");

        this.jButton6.setBackground(new Color(0, 102, 102));
        this.jButton6.setFont(new Font("Tahoma", 1, 18));
        this.jButton6.setForeground(new Color(102, 153, 0));
        this.jButton6.setText("continue");

        GroupLayout testLayout = new GroupLayout(this.test);
        this.test.setLayout(testLayout);
        testLayout.setHorizontalGroup(testLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(testLayout.createSequentialGroup().addGap(32, 32, 32).addGroup(testLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2, -1, -1, 32767).addComponent(this.jLabel3, -1, 249, 32767)).addGap(18, 18, 18).addGroup(testLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jComboBox1, GroupLayout.Alignment.TRAILING, -2, 265, -2).addComponent(this.jComboBox2, GroupLayout.Alignment.TRAILING, -2, 265, -2)).addGap(45, 45, 45)).addGroup(testLayout.createSequentialGroup().addGap(146, 146, 146).addComponent(this.jButton6).addContainerGap()));

        testLayout.setVerticalGroup(testLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(testLayout.createSequentialGroup().addGap(39, 39, 39).addComponent(this.jButton6).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(testLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox2, -2, -1, -2).addComponent(this.jLabel2)).addGap(57, 57, 57).addGroup(testLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jComboBox1, -2, -1, -2).addComponent(this.jLabel3)).addContainerGap(27, 32767)));

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.clean, -2, -1, -2).addComponent(this.test, -2, -1, -2).addComponent(this.Internet, -2, -1, -2).addComponent(this.plugin, -2, -1, -2)).addContainerGap()));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.test, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Internet, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.plugin, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.clean, -2, -1, -2).addContainerGap()));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(43, 43, 43).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton4, -2, 348, -2).addComponent(this.jButton3, -2, 348, -2).addComponent(this.jButton2, -2, 348, -2).addComponent(this.jButton1, -2, 348, -2).addComponent(this.jLabel1, -2, 417, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, 32767).addComponent(this.jPanel2, -2, -1, -2).addGap(20, 20, 20)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(65, 65, 65).addComponent(this.jLabel1, -2, 82, -2).addGap(18, 18, 18).addComponent(this.jButton1).addGap(27, 27, 27).addComponent(this.jButton2).addGap(41, 41, 41).addComponent(this.jButton3).addGap(34, 34, 34).addComponent(this.jButton4).addGap(0, 0, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel2, -2, -1, 32767))).addContainerGap()));

        jPanel1Layout.linkSize(1, new Component[]{this.jButton1, this.jButton2, this.jButton3, this.jButton4});

        this.jMenuBar1.setBackground(new Color(0, 102, 51));
        this.jMenuBar1.setFont(new Font("Tahoma", 1, 24));

        this.jMenu1.setText("File");
        this.jMenu1.setFont(new Font("Tahoma", 1, 24));
        this.jMenuBar1.add(this.jMenu1);

        this.jMenu2.setText("Edit");
        this.jMenu2.setFont(new Font("Tahoma", 1, 24));
        this.jMenuBar1.add(this.jMenu2);

        setJMenuBar(this.jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.test.setVisible(true);
        this.Internet.setVisible(false);
        this.plugin.setVisible(false);
        this.clean.setVisible(false);
        jComboBox1.removeAllItems();
        try {
            ConfigurationReader cfgr = new ConfigurationReader("file.conf");
            System.out.println(cfgr.generateConfigurationMap());
        } catch (FileNotFoundException ex) {
        }

        jComboBox1.addItem(test);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.test.setVisible(false);
        this.Internet.setVisible(true);
        this.plugin.setVisible(false);
        this.clean.setVisible(false);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        this.test.setVisible(false);
        this.Internet.setVisible(false);
        this.plugin.setVisible(true);
        this.clean.setVisible(false);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        this.test.setVisible(false);
        this.Internet.setVisible(false);
        this.plugin.setVisible(false);
        this.clean.setVisible(true);
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
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(() -> {
            new mainFrame().setVisible(true);
        });
    }
}
