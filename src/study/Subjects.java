package study;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Clob;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Subjects
        extends JFrame {

    Functions f;
    Functions FUN = new Functions();
    URL u;
    String path;
    DefaultListModel s;
    DefaultListModel ss;
    int pats = 0;
    int surviva = 0;
    private String port;
    private String cricval;
    private String striko;
    private String kid;
    private String[] stud;
    private String satra;
    private String name_the_string;
    Clob sad;
    private String[] pona;
    private String tit;
    private String sa;
    private JPanel Back;
    private JPanel Data;
    private JComboBox Head;
    private JTextField Hidden;
    private JComboBox Path;
    private JComboBox Topic;
    private JComboBox autoG;
    private JTextArea data;
    private JLabel info;
    private JButton jButton1;
    private JList jList1;
    private JList jList2;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;

    public Subjects() {
        initComponents();
    }

    private void initComponents() {
        this.jScrollPane4 = new JScrollPane();
        this.Back = new JPanel();
        this.l1 = new JLabel();
        this.l2 = new JLabel();
        this.l3 = new JLabel();
        this.l4 = new JLabel();
        this.Head = new JComboBox();
        this.Path = new JComboBox();
        this.Topic = new JComboBox();
        this.autoG = new JComboBox();
        this.Data = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.data = new JTextArea();
        this.jScrollPane2 = new JScrollPane();
        this.jList1 = new JList();
        this.Hidden = new JTextField();
        this.jPanel1 = new JPanel();
        this.jPanel2 = new JPanel();
        this.jScrollPane3 = new JScrollPane();
        this.jList2 = new JList();
        this.info = new JLabel();
        this.jButton1 = new JButton();
        this.jMenuBar1 = new JMenuBar();
        this.jMenu1 = new JMenu();
        this.jMenuItem2 = new JMenuItem();
        this.jMenuItem3 = new JMenuItem();
        this.jMenuItem4 = new JMenuItem();
        this.jMenuItem5 = new JMenuItem();
        this.jMenuItem1 = new JMenuItem();
        this.jMenu2 = new JMenu();
        this.jMenuItem6 = new JMenuItem();
        this.jMenuItem7 = new JMenuItem();
        this.jMenu3 = new JMenu();
        this.jMenu4 = new JMenu();

        setDefaultCloseOperation(3);
        setTitle("STUDY Explorer");
        setCursor(new Cursor(12));
        setUndecorated(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowIconified(WindowEvent evt) {
                Subjects.this.formWindowIconified(evt);
            }

            @Override
            public void windowOpened(WindowEvent evt) {
                Subjects.this.formWindowOpened(evt);
            }
        });
        this.Back.setBackground(new Color(0, 102, 102));
        this.Back.setForeground(new Color(204, 255, 204));
        this.Back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                Subjects.this.BackMouseEntered(evt);
            }
        });
        this.Back.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent evt) {
                Subjects.this.BackMouseMoved(evt);
            }
        });
        this.l1.setBackground(new Color(51, 51, 51));
        this.l1.setFont(new Font("Tahoma", 1, 18));
        this.l1.setForeground(new Color(255, 255, 255));
        this.l1.setText("Heading:");
        this.l1.setBorder(new LineBorder(new Color(204, 204, 204), 3, true));

        this.l2.setBackground(new Color(51, 51, 51));
        this.l2.setFont(new Font("Tahoma", 1, 18));
        this.l2.setForeground(new Color(255, 255, 255));
        this.l2.setText("Path");
        this.l2.setBorder(new LineBorder(new Color(204, 204, 204), 3, true));

        this.l3.setBackground(new Color(51, 51, 51));
        this.l3.setFont(new Font("Tahoma", 1, 18));
        this.l3.setForeground(new Color(255, 255, 255));
        this.l3.setText("Topic");
        this.l3.setBorder(new LineBorder(new Color(204, 204, 204), 3, true));

        this.l4.setBackground(new Color(51, 51, 51));
        this.l4.setFont(new Font("Tahoma", 1, 18));
        this.l4.setForeground(new Color(255, 255, 255));
        this.l4.setText("Sub Topic");
        this.l4.setBorder(new LineBorder(new Color(204, 204, 204), 3, true));

        this.Head.setBackground(new Color(0, 102, 102));
        this.Head.setFont(new Font("Tahoma", 1, 18));
        this.Head.setForeground(new Color(204, 255, 204));
        this.Head.setModel(new DefaultComboBoxModel(new String[]{"Select", "Science", "Social Studies", "Mathematics", "Computer Science", "General Knowledge"}));
        this.Head.setBorder(new LineBorder(new Color(204, 204, 204), 3, true));
        this.Head.setOpaque(false);
        this.Head.addActionListener((ActionEvent evt) -> {
            Subjects.this.HeadActionPerformed(evt);
        });
        this.Path.setBackground(new Color(0, 102, 102));
        this.Path.setFont(new Font("Tahoma", 1, 18));
        this.Path.setForeground(new Color(204, 255, 204));
        this.Path.setModel(new DefaultComboBoxModel(new String[]{"select", "dynamic", "static"}));
        this.Path.setBorder(new LineBorder(new Color(204, 204, 204), 3, true));
        this.Path.setOpaque(false);
        this.Path.addActionListener((ActionEvent evt) -> {
            Subjects.this.PathActionPerformed(evt);
        });
        this.Topic.setBackground(new Color(0, 102, 102));
        this.Topic.setFont(new Font("Tahoma", 1, 18));
        this.Topic.setForeground(new Color(204, 255, 204));
        this.Topic.setModel(new DefaultComboBoxModel(new String[]{"Select", ".study", ".rtf", ".txt", ".ttf", ".mht", ".xml", ".docx", ".xps", ".doc", ".usk", ".uskr", ".uskp", ".regs", ".BINDINGS", ".odt"}));
        this.Topic.setBorder(new LineBorder(new Color(204, 204, 204), 3, true));

        this.autoG.setBackground(new Color(0, 102, 102));
        this.autoG.setFont(new Font("Tahoma", 1, 18));
        this.autoG.setForeground(new Color(204, 255, 204));
        this.autoG.setModel(new DefaultComboBoxModel(new String[]{"Select", "autoguess"}));
        this.autoG.setBorder(new LineBorder(new Color(204, 204, 204), 3, true));
        this.autoG.setOpaque(false);

        this.Data.setBorder(new LineBorder(new Color(153, 255, 255), 3, true));
        this.Data.setToolTipText("data");
        this.Data.setAutoscrolls(true);

        this.data.setBackground(new Color(0, 102, 102));
        this.data.setColumns(20);
        this.data.setFont(new Font("Monospaced", 1, 18));
        this.data.setForeground(new Color(204, 255, 204));
        this.data.setLineWrap(true);
        this.data.setRows(5);
        this.data.setWrapStyleWord(true);
        this.data.setBorder(new LineBorder(new Color(102, 0, 102), 3, true));
        this.data.setDoubleBuffered(true);
        this.data.setFocusCycleRoot(true);
        this.data.setSelectedTextColor(new Color(255, 255, 51));
        this.jScrollPane1.setViewportView(this.data);

        this.jList1.setBackground(new Color(51, 153, 0));
        this.jList1.setFont(new Font("Tahoma", 1, 18));
        this.jList1.setForeground(new Color(153, 255, 0));
        this.jList1.setModel(new DefaultListModel());
        this.jList1.setSelectionMode(0);
        this.jList1.setSelectionBackground(new Color(153, 0, 0));
        this.jList1.setSelectionForeground(new Color(204, 255, 204));
        this.jList1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                Subjects.this.jList1MouseClicked(evt);
            }
        });
        this.jScrollPane2.setViewportView(this.jList1);

        GroupLayout DataLayout = new GroupLayout(this.Data);
        this.Data.setLayout(DataLayout);
        DataLayout.setHorizontalGroup(DataLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane1, GroupLayout.Alignment.TRAILING, -1, 716, 32767).addComponent(this.jScrollPane2, -1, 716, 32767));

        DataLayout.setVerticalGroup(DataLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, DataLayout.createSequentialGroup().addComponent(this.jScrollPane1, -1, 215, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane2, -2, 193, -2)));

        this.Hidden.setBackground(new Color(204, 255, 153));
        this.Hidden.setFont(new Font("Segoe Print", 1, 18));
        this.Hidden.setForeground(new Color(0, 102, 102));
        this.Hidden.setText("Type search here");
        this.Hidden.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                Subjects.this.HiddenMouseClicked(evt);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                Subjects.this.HiddenMouseExited(evt);
            }
        });
        this.Hidden.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent evt) {
                Subjects.this.HiddenFocusLost(evt);
            }
        });
        this.Hidden.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                Subjects.this.HiddenKeyReleased(evt);
            }
        });
        this.jPanel2.setBackground(new Color(0, 204, 0));

        this.jList2.setBackground(new Color(204, 255, 204));
        this.jList2.setBorder(new LineBorder(new Color(0, 153, 153), 3, true));
        this.jList2.setFont(new Font("Segoe Print", 1, 18));
        this.jList2.setForeground(new Color(0, 102, 51));
        this.jList2.setModel(new DefaultListModel());
        this.jList2.setSelectionBackground(new Color(0, 102, 102));
        this.jList2.setSelectionForeground(new Color(153, 153, 0));
        this.jList2.setValueIsAdjusting(true);
        this.jList2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                Subjects.this.jList2MouseClicked(evt);
            }
        });
        this.jScrollPane3.setViewportView(this.jList2);

        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane3, -1, 210, 32767).addContainerGap()));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane3, -1, 659, 32767).addContainerGap()));

        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767));

        this.info.setFont(new Font("Tahoma", 1, 14));
        this.info.setForeground(new Color(255, 255, 0));
        this.info.setBorder(new LineBorder(new Color(204, 153, 0), 1, true));

        this.jButton1.setText("jButton1");
        this.jButton1.addActionListener((ActionEvent evt) -> {
            Subjects.this.jButton1ActionPerformed(evt);
        });
        GroupLayout BackLayout = new GroupLayout(this.Back);
        this.Back.setLayout(BackLayout);
        BackLayout.setHorizontalGroup(BackLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(BackLayout.createSequentialGroup().addGap(22, 22, 22).addGroup(BackLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Data, -1, -1, 32767).addGroup(BackLayout.createSequentialGroup().addComponent(this.l1, -2, 523, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Head, 0, 0, 32767)).addGroup(BackLayout.createSequentialGroup().addComponent(this.l2, -2, 523, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Path, 0, 189, 32767)).addGroup(BackLayout.createSequentialGroup().addComponent(this.l3, -2, 523, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Topic, 0, 189, 32767)).addGroup(BackLayout.createSequentialGroup().addComponent(this.l4, -2, 523, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.autoG, 0, 189, 32767)).addComponent(this.Hidden, -1, 722, 32767).addComponent(this.info, GroupLayout.Alignment.TRAILING, -1, 722, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -2, -1, -2).addGap(180, 180, 180)).addGroup(BackLayout.createSequentialGroup().addGap(280, 280, 280).addComponent(this.jButton1).addContainerGap(807, 32767)));

        BackLayout.setVerticalGroup(BackLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(BackLayout.createSequentialGroup().addGroup(BackLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, BackLayout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, 0, -1, 32767)).addGroup(GroupLayout.Alignment.LEADING, BackLayout.createSequentialGroup().addGap(22, 22, 22).addComponent(this.info, -2, 23, -2).addGap(18, 18, 18).addGroup(BackLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.l1).addComponent(this.Head, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(BackLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.l2).addComponent(this.Path, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(BackLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.l3).addComponent(this.Topic, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(BackLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.l4).addComponent(this.autoG, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.Hidden, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Data, -2, -1, -2))).addGap(18, 18, 18).addComponent(this.jButton1).addContainerGap(118, 32767)));

        this.jScrollPane4.setViewportView(this.Back);

        this.jMenuBar1.setBackground(new Color(204, 255, 204));

        this.jMenu1.setBackground(new Color(0, 153, 102));
        this.jMenu1.setForeground(new Color(204, 255, 204));
        this.jMenu1.setText("File");
        this.jMenu1.setOpaque(true);

        this.jMenuItem2.setAccelerator(KeyStroke.getKeyStroke(77, 2));
        this.jMenuItem2.setBackground(new Color(204, 255, 204));
        this.jMenuItem2.setFont(new Font("Segoe Print", 1, 18));
        this.jMenuItem2.setForeground(new Color(0, 153, 0));
        this.jMenuItem2.setIcon(new ImageIcon(getClass().getResource("/icons/icon1.png")));
        this.jMenuItem2.setText("Maximise");
        this.jMenuItem2.setOpaque(true);
        this.jMenuItem2.setRolloverIcon(new ImageIcon(getClass().getResource("/study/1.png")));
        this.jMenuItem2.addActionListener((ActionEvent evt) -> {
            Subjects.this.jMenuItem2ActionPerformed(evt);
        });
        this.jMenu1.add(this.jMenuItem2);

        this.jMenuItem3.setAccelerator(KeyStroke.getKeyStroke(69, 2));
        this.jMenuItem3.setBackground(new Color(204, 255, 204));
        this.jMenuItem3.setFont(new Font("Segoe Print", 1, 18));
        this.jMenuItem3.setForeground(new Color(0, 153, 0));
        this.jMenuItem3.setIcon(new ImageIcon(getClass().getResource("/icons/icon1.png")));
        this.jMenuItem3.setText("Extract text file ");
        this.jMenuItem3.setOpaque(true);
        this.jMenuItem3.addActionListener((ActionEvent evt) -> {
            Subjects.this.jMenuItem3ActionPerformed(evt);
        });
        this.jMenu1.add(this.jMenuItem3);

        this.jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(70, 2));
        this.jMenuItem4.setBackground(new Color(204, 255, 204));
        this.jMenuItem4.setFont(new Font("Segoe Print", 1, 18));
        this.jMenuItem4.setForeground(new Color(0, 153, 0));
        this.jMenuItem4.setIcon(new ImageIcon(getClass().getResource("/icons/icon1.png")));
        this.jMenuItem4.setText("Export text files");
        this.jMenuItem4.setOpaque(true);
        this.jMenuItem4.addActionListener((ActionEvent evt) -> {
            Subjects.this.jMenuItem4ActionPerformed(evt);
        });
        this.jMenu1.add(this.jMenuItem4);

        this.jMenuItem5.setAccelerator(KeyStroke.getKeyStroke(70, 10));
        this.jMenuItem5.setBackground(new Color(204, 255, 204));
        this.jMenuItem5.setFont(new Font("Segoe Print", 1, 18));
        this.jMenuItem5.setForeground(new Color(0, 153, 0));
        this.jMenuItem5.setIcon(new ImageIcon(getClass().getResource("/icons/icon1.png")));
        this.jMenuItem5.setText("Extract as other file");
        this.jMenuItem5.setOpaque(true);
        this.jMenuItem5.addActionListener((ActionEvent evt) -> {
            Subjects.this.jMenuItem5ActionPerformed(evt);
        });
        this.jMenu1.add(this.jMenuItem5);

        this.jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(115, 8));
        this.jMenuItem1.setBackground(new Color(204, 255, 204));
        this.jMenuItem1.setFont(new Font("Segoe Print", 1, 18));
        this.jMenuItem1.setForeground(new Color(0, 153, 0));
        this.jMenuItem1.setIcon(new ImageIcon(getClass().getResource("/icons/icon1.png")));
        this.jMenuItem1.setText("Exit  ");
        this.jMenuItem1.setOpaque(true);
        this.jMenuItem1.addActionListener((ActionEvent evt) -> {
            Subjects.this.jMenuItem1ActionPerformed(evt);
        });
        this.jMenu1.add(this.jMenuItem1);

        this.jMenuBar1.add(this.jMenu1);

        this.jMenu2.setBackground(new Color(0, 153, 102));
        this.jMenu2.setForeground(new Color(204, 255, 204));
        this.jMenu2.setText("Expand");
        this.jMenu2.setOpaque(true);

        this.jMenuItem6.setAccelerator(KeyStroke.getKeyStroke(122, 2));
        this.jMenuItem6.setBackground(new Color(204, 255, 204));
        this.jMenuItem6.setFont(new Font("Segoe Print", 1, 18));
        this.jMenuItem6.setForeground(new Color(0, 102, 0));
        this.jMenuItem6.setText("Full Screen");
        this.jMenuItem6.setOpaque(true);
        this.jMenuItem6.addActionListener((ActionEvent evt) -> {
            Subjects.this.jMenuItem6ActionPerformed(evt);
        });
        this.jMenu2.add(this.jMenuItem6);

        this.jMenuItem7.setAccelerator(KeyStroke.getKeyStroke(65, 2));
        this.jMenuItem7.setBackground(new Color(204, 255, 204));
        this.jMenuItem7.setFont(new Font("Segoe Print", 1, 18));
        this.jMenuItem7.setForeground(new Color(0, 102, 0));
        this.jMenuItem7.setText("Add Files to the database");
        this.jMenuItem7.setOpaque(true);
        this.jMenuItem7.addActionListener((ActionEvent evt) -> {
            Subjects.this.jMenuItem7ActionPerformed(evt);
        });
        this.jMenu2.add(this.jMenuItem7);

        this.jMenuBar1.add(this.jMenu2);

        this.jMenu3.setBackground(new Color(204, 255, 0));
        this.jMenu3.setText("                                                                                                                                                                                                                               ");
        this.jMenu3.setOpaque(true);
        this.jMenu3.setRolloverIcon(new ImageIcon("D:\\Users\\VISHNU\\Documents\\NetBeansProjects\\softworld\\src\\softworld\\1.png"));
        this.jMenuBar1.add(this.jMenu3);

        this.jMenu4.setBackground(new Color(51, 102, 0));
        this.jMenu4.setForeground(new Color(204, 255, 204));
        this.jMenu4.setText("Minimise");
        this.jMenu4.setFont(new Font("Segoe UI", 1, 18));
        this.jMenu4.setOpaque(true);
        this.jMenu4.addMenuListener(new MenuListener() {
            @Override
            public void menuCanceled(MenuEvent evt) {
            }

            @Override
            public void menuDeselected(MenuEvent evt) {
            }

            @Override
            public void menuSelected(MenuEvent evt) {
                Subjects.this.jMenu4MenuSelected(evt);
            }
        });
        this.jMenu4.addActionListener((ActionEvent evt) -> {
            Subjects.this.jMenu4ActionPerformed(evt);
        });
        this.jMenuBar1.add(this.jMenu4);

        setJMenuBar(this.jMenuBar1);
        this.jMenuBar1.getAccessibleContext().setAccessibleParent(this.jPanel1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane4, -1, 1095, 32767));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane4, -1, 842, 32767));

        pack();
    }

    private void formWindowOpened(WindowEvent evt) {
        Graphics2D g = (Graphics2D) this.Back.getGraphics();
        g.setColor(Color.white);
        g.drawOval(100, 200, 200, 130);
        this.Back.paint(g);
        this.Back.update(g);
    }

    private void HeadActionPerformed(ActionEvent evt) {
        this.l1.setText(this.Head.getSelectedItem() + ":");
        if (this.Hidden.getText().equals("C:\\STUDY")) {
        }
    }

    private void PathActionPerformed(ActionEvent evt) {
        if (this.Path.getSelectedItem().toString().toLowerCase().equals("static")) {
            System.out.println(this.Hidden.getText());
            this.l2.setText("Path:static");
        }
        if (this.Path.getSelectedItem().toString().toLowerCase().equals("dynamic")) {
            this.l2.setText("Path:dynamic");
        }
    }

    private void HiddenKeyReleased(KeyEvent evt) {
        this.s = ((DefaultListModel) this.jList1.getModel());
        this.s.removeAllElements();

        File j = new File("C:\\STUDY\\buffer.usk");
        try {
            this.port = this.f.last_word(this.Hidden.getText()).replace("null", "");
        } catch (Exception ex) {
            this.port = this.Hidden.getText().replace("null", "");
        }
        Functions.File_Input(this.port.replace("null", ""), "C:\\STUDY\\buffer.usk", this.Data);
        String key = Functions.File_Output("C:\\STUDY\\buffer.usk").replace("null", "");
        File fp = new File("C:\\STUDY\\" + this.l1.getText().replace(":", "") + "\\");
        if (fp.isDirectory()) {
            this.stud = fp.list();
        }
        for (int i = 0; i <= this.stud.length - 1; i++) {
            if ((this.stud[i].endsWith(this.Topic.getSelectedItem().toString())) && (this.Topic.getSelectedItem() != "Select")) {
                if ((this.stud[i].toLowerCase().contains(this.Hidden.getText())) || (this.stud[i].contains(this.Hidden.getText().toLowerCase()))) {
                    this.s.addElement(this.stud[i]);
                }
            }
            if ((!this.stud[i].endsWith(this.Topic.getSelectedItem().toString())) && (this.Topic.getSelectedItem() == "Select")) {
                if ((this.stud[i].toLowerCase().contains(this.Hidden.getText())) || (this.stud[i].contains(this.Hidden.getText().toLowerCase()))) {
                    this.s.addElement(this.stud[i]);
                }
                if (this.autoG.getSelectedItem().toString().toLowerCase().matches("autoguess")) {
                    if (this.stud[i].toLowerCase().contains(".study")) {
                        this.info.setText("The file  doesn't require formating if was not externally modified.");
                    } else {
                        this.info.setText("The file will be formatted for display.");
                        File fxop = new File("C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + this.stud[i]);
                        int ij = 0;
                        if (fxop.getName().charAt(ij) == '.') {
                            this.name_the_string = fxop.getName().substring(0, ij);
                        }
                        System.out.println("echo : " + fxop.getName());
                        System.out.println(this.stud[i]);
                        this.sa = Functions.File_Output("C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + this.stud[i]);
                        System.out.println(this.sa);
                        this.sa = ("Title :" + this.stud[i] + ";;\n" + this.sa.replace("\n", "\n #:").replace("\t", "<break>").replace("<hr>", "\n").replace("<br>", "<break>").replace("null", ""));

                        System.out.println(this.sa + ".sa");
                        Functions.File_Input(this.sa, "C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + this.stud[i], this);
                        Functions.File_Copy("C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + this.name_the_string + ".study", "C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + this.stud[i]);
                        File fxp = new File("C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + this.stud[i]);
                        fxp.delete();
                    }
                }
            }
        }
        this.l2.setText("C:\\STUDY\\" + this.l1.getText().replace(":", "") + "\\" + this.Hidden.getText().replace("null", ""));
    }

    private void jList1MouseClicked(MouseEvent evt) {
        this.cricval = ((String) this.jList1.getSelectedValue());
        this.l3.setText(this.jList1.getSelectedValue().toString().replace("null", ""));
        this.l2.setText("C:\\STUDY\\" + this.l1.getText().replace(":", "") + "\\" + this.jList1.getSelectedValue().toString().replace("null", ""));
        this.Hidden.setText("");
        this.satra = Functions.File_Output(this.l2.getText());
        String[] split = null;
        try {
            split = this.satra.split(";;");
            this.data.setText(this.satra.replace(split[0], "").replace("null", "").replace(";;", "<eof>"));
        } catch (Exception ex) {
            this.data.setText("");
        }
        this.ss = ((DefaultListModel) this.jList2.getModel());
        this.ss.removeAllElements();
        if (split != null) {
            for (int p = 1; p < split.length; p++) {
                String[] piles = split[p].split(":");
                if (piles[0].contains("//")) {
                    this.data.setText(this.data.getText().replace(piles[0], piles[0].replace("//", "<!-")));
                    this.data.setText(this.data.getText().replace(piles[1] + "\n", piles[1] + ">"));
                }
                this.ss.addElement(piles[0].replace("null", ""));
            }
        }
        this.tit = split[0].split(":")[1];
    }

    private void BackMouseMoved(MouseEvent evt) {
        if (this.surviva == 1) {
            this.striko = Functions.File_Output("C:\\STUDY\\DEFAULTS\\File_name\\Filename.usk").replace("null", "");
            this.kid = this.striko;
            File fp = new File(this.striko.replace("null", ""));
            System.out.println(this.striko);
            if (fp.exists()) {
                this.striko = fp.getName();
            }
            System.out.println(this.striko);
            this.data.setText(Functions.File_Output("C:\\STUDY\\" + this.l1.getText().replace(":", "") + "\\" + this.striko.replace("null", "")));
            Functions.File_Copy("C:\\STUDY\\" + this.l1.getText().replace(":", "") + "\\" + this.striko.replace("null", ""), this.kid);
            this.surviva = 0;
            JOptionPane.showMessageDialog(this.rootPane, "File Added successfully");
        }
    }

    private void jList2MouseClicked(MouseEvent evt) {
        int gola = this.data.getText().indexOf(this.jList2.getSelectedValue().toString());
        int paramgola = gola + this.jList2.getSelectedValue().toString().length() - 1;
        this.data.setSelectedTextColor(Color.BLUE);
        this.data.setSelectionColor(Color.MAGENTA);
        this.data.select(gola, paramgola);
        this.l4.setText("Sub Topic : : " + this.jList2.getSelectedValue().toString());
    }

    private void HiddenMouseClicked(MouseEvent evt) {
        if (this.Hidden.getText().equals("Type search here")) {
            this.Hidden.setText("");
        }
    }

    private void HiddenFocusLost(FocusEvent evt) {
        if (this.Hidden.getText().equals("")) {
            this.Hidden.setText("Type search here");
            this.info.setText("");
        }
    }

    private void HiddenMouseExited(MouseEvent evt) {
        if (this.Hidden.getText() == null) {
            this.Hidden.setText("Type search here");
        }
    }

    private void formWindowIconified(WindowEvent evt) {
    }

    private void jMenuItem1ActionPerformed(ActionEvent evt) {
        System.exit(this.pats);
    }

    private void jMenuItem2ActionPerformed(ActionEvent evt) {
        if (getState() == 0) {
            setState(6);
        }
    }

    private void jMenuItem3ActionPerformed(ActionEvent evt) {
        if (!this.l2.getText().endsWith(".txt")) {
            String name = JOptionPane.showInputDialog("Enter the name to create");
            File fps = new File(this.l2.getText());
            Functions.File_Copy("C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + name + ".txt", this.l2.getText());
            String dat = Functions.File_Output(this.l2.getText());
            int i = 0;
            if (dat.charAt(i) == '\n') {
                dat = dat.substring(0, i);
            }
            String extract = Functions.File_Output("C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + name + ".txt");
            extract = extract.replace(":", "  ").replace("<break>", "\n").replace("<hr>", "\n").replace("//", "").replace(";;", "\n").replace("null", "").replace("#", " ").replace(fps.getName(), "").replace(dat, "").replace("title", "").replace("Title", "").replace("\n", "");

            Functions.File_Input(extract, "C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + name + ".txt", this.Data);
            this.info.setText("File extracted sucessfully at thee same path.");
            File op = new File("C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + name + ".txt");
            try {
                Desktop.getDesktop().open(op);
            } catch (IOException ex) {
            }
        } else {
            this.info.setText("it is already is a text file");
        }
    }

    private void jMenuItem4ActionPerformed(ActionEvent evt) {
        FileChooser fg = new FileChooser();
        fg.show();
    }

    private void BackMouseEntered(MouseEvent evt) {
        String pot = Functions.File_Output("C:\\STUDY\\DEFAULTS\\File_name\\Filename.usk").replace("null", "");
        if (!pot.matches("")) {
            File flop = new File("C:\\STUDY\\" + this.Head.getSelectedItem().toString());
            String[] st = flop.list();
            for (String st1 : st) {
                if (st1.endsWith(".txt")) {
                    Functions.File_Copy(pot, st1);
                    flop = new File(st1);
                    flop.delete();
                }
            }
        }
    }

    private void jMenuItem5ActionPerformed(ActionEvent evt) {
        String ext = JOptionPane.showInputDialog("Enter the extension :");
        if (!this.l2.getText().endsWith(ext)) {
            String name = JOptionPane.showInputDialog("Enter the name to create");
            File fps = new File(this.l2.getText());
            Functions.File_Copy("C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + name + "." + ext, this.l2.getText());
            String dat = Functions.File_Output(this.l2.getText());
            int i = 0;
            if (dat.charAt(i) == '\n') {
                dat = dat.substring(0, i);
            }
            String extract = Functions.File_Output("C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + name + "." + ext);
            extract = extract.replace(":", "  ").replace("<break>", "\n").replace("<hr>", "\n").replace("//", "").replace(";;", "\n").replace("null", "").replace("#", " ").replace(fps.getName(), "").replace(fps.getPath(), "").replace(dat, "").replace("title", "").replace("Title", "").replace("\n", "");

            Functions.File_Input(extract, "C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + name + "." + ext, this.Data);
            this.info.setText("File extracted sucessfully at thee same path.");
            File op = new File("C:\\STUDY\\" + this.Head.getSelectedItem().toString() + "\\" + name + "." + ext);
            try {
                Desktop.getDesktop().open(op);
            } catch (IOException ex) {
            }
        } else {
            this.info.setText("it is already is a " + ext + " file");
        }
    }

    private void jMenuItem6ActionPerformed(ActionEvent evt) {
        Text t = new Text();
        t.data = this.data.getText();
        t.meta = (this.l1.getText() + "-" + this.l3.getText());
        t.tit = this.tit;
        t.show();
    }

    private void jMenuItem7ActionPerformed(ActionEvent evt) {
        FileChooser choozy = new FileChooser();
        choozy.show();
        this.surviva = 1;
    }

    private void jMenu4ActionPerformed(ActionEvent evt) {
    }

    private void jMenu4MenuSelected(MenuEvent evt) {
        setState(1);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Subjects().setVisible(true);
        });
    }
}
