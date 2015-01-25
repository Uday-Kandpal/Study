/*   1:    */ package study;
/*   2:    */ 
/*   3:    */ import java.awt.Color;
/*   4:    */ import java.awt.Container;
/*   5:    */ import java.awt.EventQueue;
/*   6:    */ import java.awt.Font;
/*   7:    */ import java.awt.event.ActionEvent;
/*   8:    */ import java.awt.event.ActionListener;
/*   9:    */ import java.awt.event.FocusAdapter;
/*  10:    */ import java.awt.event.FocusEvent;
/*  11:    */ import java.awt.event.MouseAdapter;
/*  12:    */ import java.awt.event.MouseEvent;
/*  13:    */ import javax.swing.GroupLayout;
/*  14:    */ import javax.swing.GroupLayout.Alignment;
/*  15:    */ import javax.swing.GroupLayout.ParallelGroup;
/*  16:    */ import javax.swing.GroupLayout.SequentialGroup;
/*  17:    */ import javax.swing.JFrame;
/*  18:    */ import javax.swing.JMenu;
/*  19:    */ import javax.swing.JMenuBar;
/*  20:    */ import javax.swing.JMenuItem;
/*  21:    */ import javax.swing.JPanel;
/*  22:    */ import javax.swing.JScrollPane;
/*  23:    */ import javax.swing.JTextPane;
/*  24:    */ import javax.swing.KeyStroke;
/*  25:    */ import javax.swing.border.LineBorder;
/*  26:    */ 
/*  27:    */ public class Text
/*  28:    */   extends JFrame
/*  29:    */ {
/*  30:    */   String data;
/*  31:    */   String meta;
/*  32:    */   String tit;
/*  33:    */   Color c;
/*  34: 24 */   Functions f = new Functions();
/*  35:    */   private String satra;
/*  36:    */   private JTextPane DATA;
/*  37:    */   private JMenu jMenu1;
/*  38:    */   private JMenuBar jMenuBar1;
/*  39:    */   private JMenuItem jMenuItem1;
/*  40:    */   private JPanel jPanel1;
/*  41:    */   private JScrollPane jScrollPane1;
/*  42:    */   
/*  43:    */   public Text()
/*  44:    */   {
/*  45: 28 */     initComponents();
/*  46: 29 */     this.DATA.setText("\n" + this.tit + "\n" + this.data);
/*  47:    */   }
/*  48:    */   
/*  49:    */   private void initComponents()
/*  50:    */   {
/*  51: 41 */     this.jPanel1 = new JPanel();
/*  52: 42 */     this.jScrollPane1 = new JScrollPane();
/*  53: 43 */     this.DATA = new JTextPane();
/*  54: 44 */     this.jMenuBar1 = new JMenuBar();
/*  55: 45 */     this.jMenu1 = new JMenu();
/*  56: 46 */     this.jMenuItem1 = new JMenuItem();
/*  57:    */     
/*  58: 48 */     setDefaultCloseOperation(2);
/*  59: 49 */     addFocusListener(new FocusAdapter()
/*  60:    */     {
/*  61:    */       public void focusGained(FocusEvent evt)
/*  62:    */       {
/*  63: 51 */         Text.this.formFocusGained(evt);
/*  64:    */       }
/*  65: 54 */     });
/*  66: 55 */     this.jPanel1.setBackground(new Color(51, 153, 0));
/*  67:    */     
/*  68: 57 */     this.DATA.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
/*  69: 58 */     this.DATA.setContentType("text/html");
/*  70: 59 */     this.DATA.setEditable(false);
/*  71: 60 */     this.DATA.setFont(new Font("Monospaced", 1, 12));
/*  72: 61 */     this.DATA.setForeground(new Color(204, 255, 204));
/*  73: 62 */     this.DATA.setInheritsPopupMenu(true);
/*  74: 63 */     this.DATA.addMouseListener(new MouseAdapter()
/*  75:    */     {
/*  76:    */       public void mouseEntered(MouseEvent evt)
/*  77:    */       {
/*  78: 65 */         Text.this.DATAMouseEntered(evt);
/*  79:    */       }
/*  80: 67 */     });
/*  81: 68 */     this.jScrollPane1.setViewportView(this.DATA);
/*  82:    */     
/*  83: 70 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  84: 71 */     this.jPanel1.setLayout(jPanel1Layout);
/*  85: 72 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 920, 32767).addContainerGap()));
/*  86:    */     
/*  87:    */ 
/*  88:    */ 
/*  89:    */ 
/*  90:    */ 
/*  91:    */ 
/*  92: 79 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -1, 465, 32767).addContainerGap()));
/*  93:    */     
/*  94:    */ 
/*  95:    */ 
/*  96:    */ 
/*  97:    */ 
/*  98:    */ 
/*  99:    */ 
/* 100: 87 */     this.jMenuBar1.setBackground(new Color(204, 255, 204));
/* 101:    */     
/* 102: 89 */     this.jMenu1.setBackground(new Color(0, 102, 0));
/* 103: 90 */     this.jMenu1.setForeground(new Color(204, 255, 204));
/* 104: 91 */     this.jMenu1.setText("Window");
/* 105: 92 */     this.jMenu1.setOpaque(true);
/* 106: 93 */     this.jMenu1.addActionListener(new ActionListener()
/* 107:    */     {
/* 108:    */       public void actionPerformed(ActionEvent evt)
/* 109:    */       {
/* 110: 95 */         Text.this.jMenu1ActionPerformed(evt);
/* 111:    */       }
/* 112: 98 */     });
/* 113: 99 */     this.jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(115, 8));
/* 114:100 */     this.jMenuItem1.setBackground(new Color(204, 255, 204));
/* 115:101 */     this.jMenuItem1.setFont(new Font("Segoe Print", 1, 12));
/* 116:102 */     this.jMenuItem1.setForeground(new Color(0, 102, 0));
/* 117:103 */     this.jMenuItem1.setText("Exit                                                                                                                                ");
/* 118:104 */     this.jMenuItem1.setOpaque(true);
/* 119:105 */     this.jMenuItem1.addActionListener(new ActionListener()
/* 120:    */     {
/* 121:    */       public void actionPerformed(ActionEvent evt)
/* 122:    */       {
/* 123:107 */         Text.this.jMenuItem1ActionPerformed(evt);
/* 124:    */       }
/* 125:109 */     });
/* 126:110 */     this.jMenu1.add(this.jMenuItem1);
/* 127:    */     
/* 128:112 */     this.jMenuBar1.add(this.jMenu1);
/* 129:    */     
/* 130:114 */     setJMenuBar(this.jMenuBar1);
/* 131:    */     
/* 132:116 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 133:117 */     getContentPane().setLayout(layout);
/* 134:118 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
/* 135:    */     
/* 136:    */ 
/* 137:    */ 
/* 138:122 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
/* 139:    */     
/* 140:    */ 
/* 141:    */ 
/* 142:    */ 
/* 143:127 */     pack();
/* 144:    */   }
/* 145:    */   
/* 146:    */   private void formFocusGained(FocusEvent evt) {}
/* 147:    */   
/* 148:    */   private void jMenu1ActionPerformed(ActionEvent evt) {}
/* 149:    */   
/* 150:    */   private void jMenuItem1ActionPerformed(ActionEvent evt)
/* 151:    */   {
/* 152:142 */     dispose();
/* 153:    */   }
/* 154:    */   
/* 155:    */   private void DATAMouseEntered(MouseEvent evt)
/* 156:    */   {
/* 157:148 */     String[] split = null;
/* 158:    */     try
/* 159:    */     {
/* 160:151 */       split = this.data.split("<eof>");
/* 161:    */     }
/* 162:    */     catch (Exception ex) {}
/* 163:155 */     for (int p = 1; p < split.length; p++)
/* 164:    */     {
/* 165:157 */       String[] piles = split[p].split(":");
/* 166:158 */       if (piles[0].startsWith("link")) {
/* 167:158 */         piles[1] = piles[1].replace(piles[0], "<a href =\" " + piles[0] + "\"> ");
/* 168:    */       }
/* 169:159 */       this.data = this.data.replace(piles[0].replace("null", ""), "<u><b><font size=13 color = red face=\"Monospaced,Times NewRoman\">" + piles[0].replace("null", "")).replace("\n", "</font></b></u><hr><><b><font color=blue>").replace("<eof>", "</font></b></u>").replace(":", ":<font face = Monospaced color =blue size =3>").replace("<break>", "<br>");
/* 170:    */       
/* 171:    */ 
/* 172:    */ 
/* 173:    */ 
/* 174:    */ 
/* 175:165 */       this.tit = this.tit.replace(".", "  ");
/* 176:    */     }
/* 177:168 */     setTitle(this.meta + "-" + this.tit + "[STUDY EXPLORER]");
/* 178:169 */     this.DATA.setText("\n<h1 align = center><font face =Monospaced size=8 color = maroon><u><b>" + this.tit + "</b></u></font></h1>" + "\n" + this.data);
/* 179:    */   }
/* 180:    */   
/* 181:    */   public static void main(String[] args)
/* 182:    */   {
/* 183:177 */     EventQueue.invokeLater(new Runnable()
/* 184:    */     {
/* 185:    */       public void run()
/* 186:    */       {
/* 187:179 */         new Text().setVisible(true);
/* 188:    */       }
/* 189:    */     });
/* 190:    */   }
/* 191:    */ }


/* Location:           C:\STUDY\STUDY.jar
 * Qualified Name:     study.Text
 * JD-Core Version:    0.7.0.1
 */