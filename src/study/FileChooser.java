package study;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;

public class FileChooser
        extends JFrame {

    Color fg;
    Color bg;
    private String File_name;
    String Project_name;
    Rectangle r;
    Point p;
    File sp;
    int checker;
    private JFileChooser Files;
    private JButton Select;
    private JButton X;
    private JPanel jPanel1;
    private JButton maximise;

    public FileChooser() {
        initComponents();
        if (this.checker == 1) {
            this.Files.setFileSelectionMode(1);
        }
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.Files = new JFileChooser();
        this.maximise = new JButton();
        this.Select = new JButton();
        this.X = new JButton();

        setDefaultCloseOperation(3);
        setBounds(new Rectangle(100, 100, 200, 200));
        setUndecorated(true);

        this.jPanel1.setBackground(new Color(255, 204, 204));
        this.jPanel1.setBorder(new LineBorder(new Color(102, 0, 102), 4, true));
        this.jPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                FileChooser.this.jPanel1MouseClicked(evt);
            }

            @Override
            public void mouseReleased(MouseEvent evt) {
                FileChooser.this.jPanel1MouseReleased(evt);
            }
        });
        this.Files.setBackground(new Color(204, 204, 255));
        this.Files.setCurrentDirectory(new File("C:\\DV-AREA\\DATA"));
        this.Files.setFileSelectionMode(2);
        this.Files.setForeground(new Color(102, 102, 255));
        this.Files.setBorder(new LineBorder(new Color(153, 0, 51), 3, true));
        this.Files.setOpaque(true);
        this.Files.addActionListener((ActionEvent evt) -> {
            FileChooser.this.FilesActionPerformed(evt);
        });
        this.maximise.setFont(new Font("Tahoma", 1, 10));
        this.maximise.setForeground(new Color(153, 153, 255));
        this.maximise.setText("[]");
        this.maximise.setBorder(new LineBorder(new Color(51, 51, 255), 2, true));
        this.maximise.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                FileChooser.this.maximiseMouseEntered(evt);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                FileChooser.this.maximiseMouseExited(evt);
            }
        });
        this.maximise.addActionListener(FileChooser.this::maximiseActionPerformed);
        this.Select.setForeground(new Color(153, 153, 255));
        this.Select.setText("Select");
        this.Select.setBorder(new LineBorder(new Color(51, 51, 255), 2, true));
        this.Select.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                FileChooser.this.SelectMouseEntered(evt);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                FileChooser.this.SelectMouseExited(evt);
            }
        });
        this.Select.addActionListener(FileChooser.this::SelectActionPerformed);
        this.X.setForeground(new Color(153, 153, 255));
        this.X.setText("X");
        this.X.setBorder(new LineBorder(new Color(51, 51, 255), 2, true));
        this.X.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                FileChooser.this.XMouseEntered(evt);
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                FileChooser.this.XMouseExited(evt);
            }
        });
        this.X.addActionListener(FileChooser.this::XActionPerformed);
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.Files, -1, 574, 32767).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.maximise, -2, 25, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Select, -1, 509, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.X, -2, 22, -2).addContainerGap(16, 32767)))));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.maximise).addComponent(this.Select).addComponent(this.X)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Files, -2, 345, -2).addContainerGap(-1, 32767)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));

        pack();
    }

    private void SelectActionPerformed(ActionEvent evt) {
        File fp = new File("C:\\STUDY\\DEFAULTS\\File_name\\Filename.usk");
        if (!fp.exists()) {
            try {
                fp.createNewFile();
            } catch (IOException ex) {
            }
        }
        Functions f = new Functions();
    }

    private void XMouseEntered(MouseEvent evt) {
        this.fg = this.X.getForeground();
        this.bg = this.X.getBackground();
        this.X.setBackground(Color.red);
        this.X.setForeground(Color.white);
    }

    private void XMouseExited(MouseEvent evt) {
        this.X.setBackground(this.bg);
        this.X.setForeground(this.fg);
    }

    private void SelectMouseEntered(MouseEvent evt) {
        this.fg = this.Select.getForeground();
        this.bg = this.Select.getBackground();
        this.Select.setBackground(Color.blue);
        this.Select.setForeground(Color.white);
    }

    private void SelectMouseExited(MouseEvent evt) {
        this.Select.setBackground(this.bg);
        this.Select.setForeground(this.fg);
    }

    private void maximiseMouseEntered(MouseEvent evt) {
        this.fg = this.maximise.getForeground();
        this.bg = this.maximise.getBackground();
        this.maximise.setBackground(Color.white);
        this.maximise.setForeground(Color.magenta);
    }

    private void maximiseMouseExited(MouseEvent evt) {
        this.maximise.setBackground(this.bg);
        this.maximise.setForeground(this.fg);
    }

    private void XActionPerformed(ActionEvent evt) {
        dispose();
    }

    private void FilesActionPerformed(ActionEvent evt) {
        Functions f = new Functions();
        this.sp = this.Files.getSelectedFile();
        Functions.File_Input(this.sp.getPath(), "C:\\STUDY\\DEFAULTS\\File_name\\Filename.usk", this.Select);
    }

    private void maximiseActionPerformed(ActionEvent evt) {
        Functions f = new Functions();

        Functions.File_Copy("C:\\DV-AREA\\Images\\" + this.sp.getName(), this.sp.getPath());
        Functions.File_Copy("C:\\DV-AREA\\Password_Protection\\" + this.sp.getName().replace(this.sp.getName(), this.sp.getName().substring(0, this.sp.getName().length() - 4)).concat(".usk"), this.sp.getPath());
        this.sp.setExecutable(true);
        f.convertimage(this.sp.getPath());
        File df = new File("C:\\DV-AREA\\Password_Protection" + this.sp.getName());
        df.setExecutable(true);
    }

    private void jPanel1MouseClicked(MouseEvent evt) {
        setBounds(this.p.x, this.p.y, this.r.width, this.r.height);
    }

    private void jPanel1MouseReleased(MouseEvent evt) {
        this.r = getBounds();
        this.p = getMousePosition();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new FileChooser().setVisible(true);
        });
    }
}
