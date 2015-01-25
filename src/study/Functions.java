/*   1:    */ package study;
/*   2:    */ 
/*   3:    */ import java.awt.Color;
/*   4:    */ import java.awt.Component;
/*   5:    */ import java.io.BufferedReader;
/*   6:    */ import java.io.File;
/*   7:    */ import java.io.FileReader;
/*   8:    */ import java.io.FileWriter;
/*   9:    */ import java.io.IOException;
/*  10:    */ import java.io.PrintStream;
/*  11:    */ import java.sql.Connection;
/*  12:    */ import java.sql.DriverManager;
/*  13:    */ import java.sql.Statement;
/*  14:    */ import javax.swing.JOptionPane;
/*  15:    */ 
/*  16:    */ public class Functions
/*  17:    */ {
/*  18:    */   private static Component create;
/*  19:    */   
/*  20:    */   public static void File_Copy(String dest, String source)
/*  21:    */   {
/*  22:    */     try
/*  23:    */     {
/*  24: 33 */       FileReader fr = new FileReader(source);
/*  25: 34 */       BufferedReader br = new BufferedReader(fr);
/*  26:    */       
/*  27: 36 */       FileWriter fw = new FileWriter(dest);
/*  28:    */       int inputline;
/*  29: 38 */       while ((inputline = br.read()) != -1)
/*  30:    */       {
/*  31: 40 */         fw.flush();
/*  32: 41 */         fw.write(inputline);
/*  33:    */       }
/*  34: 44 */       fr.close();
/*  35: 45 */       fw.close();
/*  36:    */     }
/*  37:    */     catch (Exception e) {}
/*  38:    */   }
/*  39:    */   
/*  40:    */   public static void File_Input(String data, String dest, Component create)
/*  41:    */   {
/*  42: 50 */     File fp = new File("C:\\STUDY\\DEFAULTS\\");
/*  43: 51 */     fp.delete();
/*  44:    */     try
/*  45:    */     {
/*  46: 58 */       FileWriter fw = new FileWriter(dest);
/*  47:    */       
/*  48:    */ 
/*  49:    */ 
/*  50: 62 */       fw.flush();
/*  51: 63 */       fw.write(data);
/*  52:    */       
/*  53:    */ 
/*  54:    */ 
/*  55: 67 */       fw.close();
/*  56:    */     }
/*  57:    */     catch (Exception e)
/*  58:    */     {
/*  59: 68 */       JOptionPane.showMessageDialog(create, "Some Error Occured");
/*  60:    */     }
/*  61:    */   }
/*  62:    */   
/*  63:    */   public static String File_Output(String source)
/*  64:    */   {
/*  65: 72 */     String string = null;
/*  66:    */     try
/*  67:    */     {
/*  68: 77 */       FileReader fr = new FileReader(source);
/*  69: 78 */       BufferedReader br = new BufferedReader(fr);
/*  70:    */       int inputline;
/*  71: 82 */       while ((inputline = br.read()) != -1)
/*  72:    */       {
/*  73: 86 */         char c = (char)inputline;
/*  74: 87 */         string = string + c;
/*  75:    */       }
/*  76: 89 */       fr.close();
/*  77:    */     }
/*  78:    */     catch (Exception e)
/*  79:    */     {
/*  80: 91 */       JOptionPane.showMessageDialog(create, e.getMessage() + "");string = source;
/*  81:    */     }
/*  82: 92 */     return string;
/*  83:    */   }
/*  84:    */   
/*  85:    */   private void Fetch_bg_color(Component c, Component Indicator)
/*  86:    */   {
/*  87: 96 */     String colors = File_Output("C:\\STUDY\\DEFAULTS\\color.usk");
/*  88: 97 */     String[] rgb = colors.split(";");
/*  89:    */     
/*  90: 99 */     int r = Integer.parseInt(rgb[0]);
/*  91:100 */     int g = Integer.parseInt(rgb[1]);
/*  92:101 */     int b = Integer.parseInt(rgb[2]);
/*  93:102 */     Color bc = new Color(r, g, b);
/*  94:103 */     c.setBackground(bc);
/*  95:104 */     Indicator.setBackground(bc);
/*  96:    */   }
/*  97:    */   
/*  98:    */   private void Fetch_fg_color(Component c, Component Indicator)
/*  99:    */   {
/* 100:108 */     String colors = File_Output("C:\\DV-AREA\\Defaults\\color.usk");
/* 101:109 */     String[] rgb = colors.split(";");
/* 102:    */     
/* 103:111 */     int r = Integer.parseInt(rgb[0]);
/* 104:112 */     int g = Integer.parseInt(rgb[1]);
/* 105:113 */     int b = Integer.parseInt(rgb[2]);
/* 106:114 */     Color bc = new Color(r, g, b);
/* 107:115 */     c.setForeground(bc);
/* 108:116 */     Indicator.setForeground(bc);
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setparameters(int[] param, Component[] c, Component[] Indicator)
/* 112:    */   {
/* 113:119 */     if (param.length <= 10)
/* 114:    */     {
/* 115:120 */       Fetch_fg_color(c[0], Indicator[0]);
/* 116:121 */       Fetch_bg_color(c[1], Indicator[1]);
/* 117:    */     }
/* 118:    */     else
/* 119:    */     {
/* 120:123 */       JOptionPane.showMessageDialog(create, "parameters invalid");
/* 121:    */     }
/* 122:    */   }
/* 123:    */   
/* 124:    */   Boolean New_Project(String File_name)
/* 125:    */     throws IOException
/* 126:    */   {
/* 127:126 */     if (!check_existence("C:\\DV-AREA\\DATA\\" + File_name + "\\").booleanValue())
/* 128:    */     {
/* 129:127 */       create_directory("C:\\DV-AREA\\DATA", File_name);
/* 130:128 */       create_directory("C:\\DV-AREA\\DATA\\" + File_name, "color");
/* 131:129 */       create_directory("C:\\DV-AREA\\DATA\\" + File_name, "font");
/* 132:130 */       create_directory("C:\\DV-AREA\\DATA\\" + File_name, "other");
/* 133:131 */       create_directory("C:\\DV-AREA\\DATA\\" + File_name, "Objects");
/* 134:132 */       create_directory("C:\\DV-AREA\\DATA\\" + File_name, "Formula");
/* 135:133 */       create_directory("C:\\DV-AREA\\DATA\\" + File_name, "Formula\\LHS");
/* 136:134 */       create_directory("C:\\DV-AREA\\DATA\\" + File_name, "Formula\\RHS");
/* 137:    */       try
/* 138:    */       {
/* 139:135 */         create_File("C:\\DV-AREA\\DATA\\" + File_name + "\\other\\register.regs");
/* 140:    */       }
/* 141:    */       catch (Exception ex) {}
/* 142:137 */       File_Input(File_Output(new StringBuilder().append("C:\\DV-AREA\\DATA\\").append(File_name).append("\\other\\register.regs").toString()).replace("null", "") + "C:\\DV-AREA\\DATA\\" + File_name + "\\other\\register.regs\n", "C:\\DV-AREA\\DATA\\" + File_name + "\\other\\register.regs", create);
/* 143:138 */       defaults();
/* 144:139 */       return Boolean.valueOf(true);
/* 145:    */     }
/* 146:141 */     return Boolean.valueOf(false);
/* 147:    */   }
/* 148:    */   
/* 149:    */   private Boolean check_existence(String path)
/* 150:    */   {
/* 151:144 */     File fp = new File(path);
/* 152:145 */     if (fp.exists()) {
/* 153:145 */       return Boolean.valueOf(true);
/* 154:    */     }
/* 155:146 */     return Boolean.valueOf(false);
/* 156:    */   }
/* 157:    */   
/* 158:    */   private Boolean create_File(String path)
/* 159:    */   {
/* 160:150 */     if (check_existence(path).booleanValue() != true)
/* 161:    */     {
/* 162:151 */       File fp = new File(path);
/* 163:152 */       return Boolean.valueOf(true);
/* 164:    */     }
/* 165:154 */     return Boolean.valueOf(false);
/* 166:    */   }
/* 167:    */   
/* 168:    */   private void create_directory(String path, String name)
/* 169:    */   {
/* 170:157 */     File fp = new File(path + "\\" + name + "\\");
/* 171:158 */     if (!fp.exists()) {
/* 172:159 */       fp.mkdir();
/* 173:    */     }
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void defaults()
/* 177:    */   {
/* 178:163 */     File rp = null;
/* 179:    */     
/* 180:165 */     String path4 = null;
/* 181:    */     try
/* 182:    */     {
/* 183:167 */       String path0 = "C:\\DV-AREA\\Defaults\\";
/* 184:168 */       String path1 = "C:\\DV-AREA\\Defaults\\color.usk";
/* 185:169 */       String path2 = "C:\\DV-AREA\\Defaults\\Filename.usk";
/* 186:170 */       String path3 = "C:\\DV-AREA\\Defaults\\font.usk";
/* 187:171 */       path4 = "C:\\DV-AREA\\Defaults\\other.usk";
/* 188:172 */       File fp = new File(path0);
/* 189:173 */       File gp = new File(path1);
/* 190:174 */       File sp = new File(path2);
/* 191:175 */       File xp = new File(path3);
/* 192:176 */       rp = new File(path4);
/* 193:177 */       fp.mkdir();
/* 194:178 */       gp.createNewFile();sp.createNewFile();rp.createNewFile();xp.createNewFile();
/* 195:    */     }
/* 196:    */     catch (Exception ex)
/* 197:    */     {
/* 198:179 */       JOptionPane.showMessageDialog(create, ex.getMessage() + " " + ex.getCause());
/* 199:    */     }
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void convertimage(String source)
/* 203:    */   {
/* 204:183 */     create_directory("C:\\DV-AREA", "Password_Protection");
/* 205:184 */     File fp = new File(source);
/* 206:185 */     String newsource = fp.getName().replace(".jpeg", "").replace(".jpg", "").replace(".gif", "").replace(".bmp", "").replace("png", "");
/* 207:186 */     File fpo = new File("C:\\DV-AREA\\Password_Protection\\" + newsource);
/* 208:187 */     File_Copy("C:\\DV-AREA\\Password_Protection\\" + newsource + ".usk" + source, source);
/* 209:188 */     fp.delete();
/* 210:189 */     fpo.setReadOnly();
/* 211:    */   }
/* 212:    */   
/* 213:    */   public void createFormula(String formula, String name, String Project_path)
/* 214:    */   {
/* 215:194 */     File fp = new File(Project_path + "\\Formula\\LHS\\");
/* 216:195 */     fp.mkdir();System.out.println(fp.getPath());
/* 217:196 */     File fop = new File(Project_path + "\\Formula\\RHS\\");
/* 218:197 */     fop.mkdir();System.out.println(fop.getPath());
/* 219:198 */     String[] equation = formula.split("=");
/* 220:199 */     String lhs = equation[0];
/* 221:200 */     String rhs = equation[1];
/* 222:201 */     if (name == null) {
/* 223:201 */       name = lhs + "=" + rhs + ".usk";
/* 224:    */     }
/* 225:202 */     create_File("C:\\DV-AREA\\Formula\\LHS\\" + name + ".usk");
/* 226:203 */     create_File("C:\\DV-AREA\\Formula\\RHS\\" + name + ".usk");
/* 227:204 */     File_Input(lhs, "C:\\DV-AREA\\Formula\\LHS\\" + name + ".usk", create);
/* 228:205 */     File_Input(rhs, "C:\\DV-AREA\\Formula\\RHS\\" + name + ".usk", create);
/* 229:206 */     File_Input(lhs, Project_path + "\\Formula\\LHS\\" + name + ".usk", create);
/* 230:207 */     File_Input(rhs, Project_path + "\\Formula\\RHS\\" + name + ".usk", create);
/* 231:208 */     File_Input(File_Output(new StringBuilder().append(Project_path).append("\\other\\register.regs").toString()).replace("null", "") + Project_path + "\\Formula\\LHS\\" + name + ".usk\n", Project_path + "\\other\\register.regs", create);
/* 232:209 */     File_Input(File_Output(new StringBuilder().append(Project_path).append("\\other\\register.regs").toString()).replace("null", "") + Project_path + "\\Formula\\RHS\\" + name + ".usk\n", Project_path + "\\other\\register.regs", create);
/* 233:    */   }
/* 234:    */   
/* 235:    */   public Object[] useFormula(String name, String Project_path, int key)
/* 236:    */   {
/* 237:214 */     File fp = new File(Project_path + "\\Formula\\");
/* 238:215 */     if (!fp.exists()) {
/* 239:215 */       fp.mkdir();
/* 240:    */     }
/* 241:216 */     String formula = File_Output(Project_path + "\\Formula\\LHS\\" + name + ".usk");
/* 242:217 */     String formula1 = File_Output(Project_path + "\\Formula\\RHS\\" + name + ".usk");
/* 243:218 */     System.out.println(formula + " " + formula1);
/* 244:219 */     Object[] o = parseAll(formula);
/* 245:220 */     Object[] p = parseAll(formula1);
/* 246:221 */     if (key == 0) {
/* 247:222 */       return o;
/* 248:    */     }
/* 249:223 */     return p;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public Object[] parseAll(String formula)
/* 253:    */   {
/* 254:228 */     Object[] o = null;
/* 255:229 */     char[] form = null;
/* 256:230 */     int[] p1 = null;int[] chkint = { 0 };int[] chkdouble = { 0 };int[] chklong = { 0 };double[] p2 = { 0.0D };long[] p3 = { 0L };
/* 257:231 */     for (int i = 0; i <= formula.length() - 1; i++) {
/* 258:    */       try
/* 259:    */       {
/* 260:234 */         p1[i] = Integer.parseInt("" + formula.charAt(i));
/* 261:235 */         chkint[i] = 1;
/* 262:    */       }
/* 263:    */       catch (Exception ex)
/* 264:    */       {
/* 265:    */         try
/* 266:    */         {
/* 267:238 */           p2[i] = Double.parseDouble("" + formula.charAt(i));
/* 268:239 */           chkint[i] = 0;
/* 269:240 */           chkdouble[i] = 1;
/* 270:    */         }
/* 271:    */         catch (Exception exe)
/* 272:    */         {
/* 273:    */           try
/* 274:    */           {
/* 275:244 */             p3[i] = Long.parseLong("" + formula.charAt(i));
/* 276:245 */             chkint[i] = 0;
/* 277:246 */             chkdouble[i] = 0;
/* 278:247 */             chklong[i] = 1;
/* 279:    */           }
/* 280:    */           catch (Exception exee)
/* 281:    */           {
/* 282:    */             try
/* 283:    */             {
/* 284:250 */               form[i] = formula.charAt(i);
/* 285:251 */               chkint[i] = 0;
/* 286:252 */               chkdouble[i] = 0;
/* 287:253 */               chklong[i] = 0;
/* 288:    */             }
/* 289:    */             catch (Exception exxe) {}
/* 290:    */           }
/* 291:    */         }
/* 292:    */       }
/* 293:    */     }
/* 294:262 */     Object[] p = four_val(o, p1, p2, p3, form, chkint, chkdouble, chklong);
/* 295:263 */     return p;
/* 296:    */   }
/* 297:    */   
/* 298:    */   public Object[] four_val(Object[] x, int[] p1, double[] p2, long[] p3, char[] p4, int[] chkint, int[] chkdouble, int[] chklong)
/* 299:    */   {
/* 300:266 */     Object[] o = null;
/* 301:268 */     for (int i = 0; i <= x.length - 1; i++)
/* 302:    */     {
/* 303:270 */       if (chkint[i] != 0) {
/* 304:270 */         o[i] = Integer.valueOf(p1[i]);
/* 305:    */       }
/* 306:271 */       if (chkint[i] == 0)
/* 307:    */       {
/* 308:272 */         if (chkdouble[i] != 0) {
/* 309:272 */           o[i] = Double.valueOf(p2[i]);
/* 310:    */         }
/* 311:273 */         if (chkdouble[i] == 0) {
/* 312:275 */           if (chklong[i] != 0) {
/* 313:275 */             o[i] = Long.valueOf(p3[i]);
/* 314:    */           } else {
/* 315:276 */             o[i] = Character.valueOf(p4[i]);
/* 316:    */           }
/* 317:    */         }
/* 318:    */       }
/* 319:    */     }
/* 320:281 */     return o;
/* 321:    */   }
/* 322:    */   
/* 323:    */   public void createObject(String Project_name, String Objectname)
/* 324:    */   {
/* 325:287 */     File_Input("\n", "C:\\DV-AREA\\DATA\\" + Project_name + "\\Objects\\" + Objectname + ".usk", create);
/* 326:288 */     File_Input("\n", "C:\\DV-AREA\\Defaults\\" + Objectname + ".usk", create);
/* 327:289 */     File_Input(File_Output(new StringBuilder().append("C:\\DV-AREA\\DATA\\").append(Project_name).append("\\other\\register.regs").toString()).replace("null", "") + "C:\\DV-AREA\\DATA\\" + Project_name + "\\Objects\\" + Objectname + ".usk\n", "C:\\DV-AREA\\DATA\\" + Project_name + "\\other\\register.regs", create);
/* 328:290 */     File_Input(File_Output(new StringBuilder().append("C:\\DV-AREA\\DATA\\").append(Project_name).append("\\other\\register.regs").toString()).replace("null", "") + "C:\\DV-AREA\\Defaults\\" + Objectname + ".usk\n", "C:\\DV-AREA\\DATA\\" + Project_name + "\\other\\register.regs", create);
/* 329:    */     try
/* 330:    */     {
/* 331:293 */       Class.forName("java.sql.DriverManager");
/* 332:    */       
/* 333:    */ 
/* 334:    */ 
/* 335:297 */       String query = "Create database if not exists ne; ";
/* 336:298 */       String query0 = "use ne; ";
/* 337:299 */       String query1 = " Create table if not exists objects(ProjectName varchar(1000),Objectname varchar(100),clip varchar(300) primary key);";
/* 338:    */       
/* 339:301 */       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ne", "root", "uday");
/* 340:302 */       Statement st = con.createStatement();
/* 341:303 */       st.execute(query);st.execute(query0);st.execute(query1);
/* 342:    */     }
/* 343:    */     catch (Exception ex)
/* 344:    */     {
/* 345:304 */       JOptionPane.showMessageDialog(create, ex.getMessage());
/* 346:    */     }
/* 347:305 */     System.out.println("Object created");
/* 348:    */   }
/* 349:    */   
/* 350:    */   public String[] Objectnamelist(String Project_name)
/* 351:    */   {
/* 352:309 */     File fp = new File("C:\\DV-AREA\\DATA\\" + Project_name + "\\Objects\\");
/* 353:310 */     String[] s = fp.list();
/* 354:    */     try
/* 355:    */     {
/* 356:312 */       Class.forName("java.sql.DriverManager");
/* 357:    */       
/* 358:    */ 
/* 359:    */ 
/* 360:316 */       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ne", "root", "uday");
/* 361:317 */       Statement st = con.createStatement();
/* 362:318 */       String query = "Create database if not exists ne; ";
/* 363:319 */       String query0 = "use ne; ";
/* 364:320 */       st.execute(query);st.execute(query0);
/* 365:321 */       for (int i = 0; i < s.length; i++)
/* 366:    */       {
/* 367:323 */         String query1 = "Insert into objects values('" + Project_name + "','" + s[i] + "',+'" + s[i].concat(new StringBuilder().append(s.toString().hashCode()).append("").toString()) + Math.random() + "Glide" + "');";
/* 368:324 */         st.execute(query1);
/* 369:    */       }
/* 370:    */     }
/* 371:    */     catch (Exception ex)
/* 372:    */     {
/* 373:325 */       JOptionPane.showMessageDialog(create, ex.getMessage());
/* 374:    */     }
/* 375:326 */     System.out.println("Object list generated");
/* 376:327 */     return s;
/* 377:    */   }
/* 378:    */   
/* 379:    */   public File[] Objectlist(String Project_name)
/* 380:    */   {
/* 381:331 */     File fp = new File("C:\\DV-AREA\\DATA\\" + Project_name + "\\Objects\\");
/* 382:332 */     File[] s = fp.listFiles();
/* 383:    */     try
/* 384:    */     {
/* 385:333 */       Class.forName("java.sql.DriverManager");
/* 386:    */       
/* 387:    */ 
/* 388:    */ 
/* 389:337 */       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ne", "root", "uday");
/* 390:338 */       Statement st = con.createStatement();
/* 391:339 */       String query = "Create database if not exists ne; ";
/* 392:340 */       String query0 = "use ne; ";
/* 393:341 */       st.execute(query);st.execute(query0);
/* 394:342 */       for (int i = 0; i < s.length; i++)
/* 395:    */       {
/* 396:343 */         String query1 = "Insert into objects values('" + Project_name + "','" + s[i] + "'" + s[i].toString() + Math.random() + "');";
/* 397:344 */         st.execute(query1);
/* 398:    */       }
/* 399:    */     }
/* 400:    */     catch (Exception ex)
/* 401:    */     {
/* 402:345 */       JOptionPane.showMessageDialog(create, ex.getMessage());
/* 403:    */     }
/* 404:346 */     return s;
/* 405:    */   }
/* 406:    */   
/* 407:    */   public void start()
/* 408:    */   {
/* 409:350 */     create_directory("C:\\DV-AREA", "");
/* 410:351 */     create_directory("C:\\DV-AREA", "Defaults");
/* 411:352 */     create_directory("C:\\DV-AREA", "DATA");
/* 412:353 */     create_directory("C:\\DV-AREA", "Password_protection");
/* 413:354 */     create_directory("C:\\DV-AREA", "Images");
/* 414:355 */     create_directory("C:\\DV-AREA", "Images");
/* 415:    */   }
/* 416:    */   
/* 417:    */   public void delete_Project(String path, String name)
/* 418:    */   {
/* 419:361 */     String net_path = path + "\\" + name + "\\";
/* 420:362 */     File fp = new File(net_path);
/* 421:363 */     String s_reg = File_Output(net_path + "other\\register.regs");
/* 422:364 */     String[] paths = s_reg.split("\n");
/* 423:365 */     File[] f_del = null;
/* 424:366 */     for (int i = 0; i < paths.length; i++) {
/* 425:    */       try
/* 426:    */       {
/* 427:368 */         f_del[i] = new File(paths[i]);
/* 428:369 */         f_del[i].delete();
/* 429:    */       }
/* 430:    */       catch (Exception ex)
/* 431:    */       {
/* 432:370 */         JOptionPane.showMessageDialog(create, "File " + paths[i] + " not deleted");
/* 433:    */       }
/* 434:    */     }
/* 435:    */   }
/* 436:    */   
/* 437:    */   public String checkChange()
/* 438:    */   {
/* 439:374 */     String Message = "No Changes Detected";
/* 440:375 */     File fp = new File("C:\\STUDY\\");
/* 441:376 */     String val0 = File_Output("C:\\STUDY\\DEFAULTS\\File Size\\STUDY.txt");
/* 442:377 */     String val1 = File_Output("C:\\STUDY\\DEFAULTS\\File Size\\Science.txt");
/* 443:378 */     String val2 = File_Output("C:\\STUDY\\DEFAULTS\\File Size\\Social studies.txt");
/* 444:379 */     String val3 = File_Output("C:\\STUDY\\DEFAULTS\\File Size\\Mathematics.txt");
/* 445:380 */     String val4 = File_Output("C:\\STUDY\\DEFAULTS\\File Size\\Computer Science.txt");
/* 446:381 */     String val5 = File_Output("C:\\STUDY\\DEFAULTS\\File Size\\General Knowledge.txt");
/* 447:383 */     if (fp.getTotalSpace() != Long.parseLong(val0))
/* 448:    */     {
/* 449:384 */       Message = "STUDY data Changed";
/* 450:385 */       File_Input(fp.getTotalSpace() + "", "C:\\STUDY\\DEFAULTS\\File Size\\STUDY.txt", create);
/* 451:    */     }
/* 452:387 */     if (fp.getTotalSpace() != Long.parseLong(val1))
/* 453:    */     {
/* 454:388 */       Message = "Science data Changed";
/* 455:389 */       File_Input(fp.getTotalSpace() + "", "C:\\STUDY\\DEFAULTS\\File Size\\Science.txt", create);
/* 456:    */     }
/* 457:391 */     if (fp.getTotalSpace() != Long.parseLong(val2))
/* 458:    */     {
/* 459:392 */       Message = "Social Science data Changed";
/* 460:393 */       File_Input(fp.getTotalSpace() + "", "C:\\STUDY\\DEFAULTS\\File Size\\Social science.txt", create);
/* 461:    */     }
/* 462:395 */     if (fp.getTotalSpace() != Long.parseLong(val3))
/* 463:    */     {
/* 464:396 */       Message = "Mathematics data Changed";
/* 465:397 */       File_Input(fp.getTotalSpace() + "", "C:\\STUDY\\DEFAULTS\\File Size\\Mathematics.txt", create);
/* 466:    */     }
/* 467:399 */     if (fp.getTotalSpace() != Long.parseLong(val4))
/* 468:    */     {
/* 469:400 */       Message = "Computer Science data Changed";
/* 470:401 */       File_Input(fp.getTotalSpace() + "", "C:\\STUDY\\DEFAULTS\\File Size\\Computer Science.txt", create);
/* 471:    */     }
/* 472:403 */     if (fp.getTotalSpace() != Long.parseLong(val5))
/* 473:    */     {
/* 474:404 */       Message = "General value data Changed";
/* 475:405 */       File_Input(fp.getTotalSpace() + "", "C:\\STUDY\\DEFAULTS\\File Size\\General Knowledge.txt", create);
/* 476:    */     }
/* 477:407 */     return Message;
/* 478:    */   }
/* 479:    */   
/* 480:    */   String last_word(String source)
/* 481:    */   {
/* 482:412 */     String cataloger = null;
/* 483:413 */     String[] pathos = null;
/* 484:414 */     pathos = source.split(" ");
/* 485:    */     try
/* 486:    */     {
/* 487:416 */       cataloger = pathos[(pathos.length - 1)];
/* 488:    */     }
/* 489:    */     catch (Exception ex) {}
/* 490:418 */     return cataloger;
/* 491:    */   }
/* 492:    */   
/* 493:    */   public String format(String format_string)
/* 494:    */   {
/* 495:422 */     format_string = format_string.replace("\n", "\n #:").replace("\t", "<break>").replace("<hr>", "\n").replace("<br>", "<break>");
/* 496:    */     
/* 497:    */ 
/* 498:    */ 
/* 499:    */ 
/* 500:427 */     System.out.println(format_string);
/* 501:428 */     return format_string;
/* 502:    */   }
/* 503:    */ }


/* Location:           C:\STUDY\STUDY.jar
 * Qualified Name:     study.Functions
 * JD-Core Version:    0.7.0.1
 */