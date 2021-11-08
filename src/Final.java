
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.imageio.ImageIO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;


public class Final extends javax.swing.JFrame {
    public Final() {
        initComponents();
    }
    
    public static Final home = new Final();
    public static PuzzleGame puzzle = new PuzzleGame();
    public static int bri=0;
    public Brick br = new Brick();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GAMEZONE");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(java.awt.Color.orange);
        setIconImage(new ImageIcon("E:\\RealPOker\\src\\pc_pics\\H13.jpg").getImage());
        setResizable(false);

        jButton1.setText("PICTURE PUZZLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BRICK BREAKER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("POKER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poker.jpg"))); // NOI18N
        jButton4.setVerifyInputWhenFocusTarget(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzle.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(132, 132, 132)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        home.setVisible(false);
        br.main(null);
        
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        POkerForm.fr.setVisible(true);
        home.setVisible(false);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        puzzle.setVisible(true);
        home.setVisible(false);
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton2.doClick();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton3.doClick();
    }                                        
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt){
        jButton1.doClick();
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        Font font=new Font("Algerian",Font.BOLD,40);
        g.setFont(font);
        g.drawString("GAMING ZONE",260,100);
    }
    public static void main(String args[]) {
        home.setVisible(true);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    // End of variables declaration                   
}






//POKER




class POkerForm extends javax.swing.JFrame {
public POkerForm() {
        initComponents();
    }

String path="/pc_pics/";
int arr[]=new int[53],RES,game=0,p1_bet,p2_bet,pot=0,count=0;
public static int pass=0,minbet,startm,flag=-1,p1_money,p2_money,gamestage=-1;
public static String p1_name,p2_name;
long time,x,t=120000;
String p1c1="",p1c2="",p2c1="",p2c2="",p1_hand="",p2_hand="",tc1="",tc2="",tc3="",tc4="",tc5="";

public static NewJFrame fr=new NewJFrame();
public static User fr1=new User();
public static POkerForm mainfr=new POkerForm();
public static Rough fr2=new Rough();

int tc_nos[]=new int[5];int tc_suits[]=new int[5];
int p1_nos[]=new int[2];int p1_suits[]=new int[2],p1_rank,p1_rankval;
int p2_nos[]=new int[2];int p2_suits[]=new int[2],p2_rank,p2_rankval;
int p1_finalnos[]=new int[7];int p1_finalsuits[]=new int[7];
int p2_finalnos[]=new int[7];int p2_finalsuits[]=new int[7]; 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TC3 = new javax.swing.JLabel();
        TC2 = new javax.swing.JLabel();
        TC1 = new javax.swing.JLabel();
        TC4 = new javax.swing.JLabel();
        TC5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        P2C2 = new javax.swing.JLabel();
        P2C1 = new javax.swing.JLabel();
        P2show = new javax.swing.JButton();
        P2hand = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        P1C2 = new javax.swing.JLabel();
        P1C1 = new javax.swing.JLabel();
        P1show = new javax.swing.JButton();
        P1hand = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        nextcard = new javax.swing.JButton();
        start = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        P2BET = new javax.swing.JTextField();
        P2M = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        P1BET = new javax.swing.JTextField();
        P1M = new javax.swing.JLabel();
        P1FOLD = new javax.swing.JButton();
        P2FOLD = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        POTM = new javax.swing.JLabel();
        MINBET = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        POK2 = new javax.swing.JLabel();
        POK1 = new javax.swing.JLabel();
        Rlabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POKER :)\n");
        setBackground(new Color(1211737));
        setIconImage(new ImageIcon("E:\\RealPOker\\src\\pc_pics\\icon2.jpg").getImage());
        setResizable(false);
        
        TC3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));

        TC2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));

        TC1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));

        TC4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));

        TC5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(TC1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TC2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TC3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TC4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TC5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TC3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TC2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TC4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TC5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        P2C2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder()));
        P2C2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        P2C1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));

        P2show.setText("Show");
        P2show.setEnabled(false);P2show.setText("           ");
        P2show.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        P2show.setOpaque(true);
        P2show.setVisible(true);
        P2show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2showActionPerformed(evt);
            }
        });

        P2hand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(P2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P2hand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2show))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(P2hand, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P2show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(196, 213));

        P1C2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));

        P1C1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));

        P1show.setText("Show");
        P1show.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        P1show.setEnabled(false);P1show.setText("           ");
        P1show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1showActionPerformed(evt);
            }
        });

        P1hand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(P1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P1hand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(P1show))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(P1hand, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P1show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        nextcard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextcard.setEnabled(false);
        nextcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextcardActionPerformed(evt);
            }
        });

        start.setText("START");
        start.setFocusable(true);
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nextcard, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(nextcard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setText("XX's money:");

        jLabel4.setText("XX bets:");

        P2BET.setEnabled(false);
        P2BET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2BETActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P2BET, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(P2M, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P2M, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(P2BET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel7.setText("XX's money:");

        jLabel3.setText("XX bets:");

        P1BET.setEnabled(false);
        P1BET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1BETActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P1BET, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(P1M, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P1M, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(P1BET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        P1FOLD.setText("          ");
        P1FOLD.setEnabled(false);
        P1FOLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1FOLDActionPerformed(evt);
            }
        });

        P2FOLD.setText("          ");
        P2FOLD.setEnabled(false);
        P2FOLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2FOLDActionPerformed(evt);
            }
        });

        jLabel5.setText("POT:    ");

        MINBET.setText(String.valueOf(minbet));
        MINBET.setEnabled(false);
        MINBET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINBETActionPerformed(evt);
            }
        });

        jLabel11.setText("Minimum Bet");

        POK2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc_pics/pok1.jpg"))); // NOI18N

        POK1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc_pics/pok1.jpg"))); // NOI18N

        Rlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DEVELOPER'S  SIGNATURE");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc_pics/d_sign.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(POK1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(MINBET, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(Rlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(POTM, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(POK2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(126, 126, 126))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(P1FOLD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                                .addComponent(P2FOLD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(POK2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(POK1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(POTM, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(MINBET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P2FOLD)
                            .addComponent(P1FOLD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>                        

    private void startActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if(flag==0)
        {
            flag=1;time=System.currentTimeMillis();
            jLabel1.setText(p1_name);
            jLabel2.setText(p2_name);
            jLabel3.setText(p1_name+" bets:");
            jLabel4.setText(p2_name+" bets:");
            jLabel7.setText(p1_name+"'s money:");
            jLabel6.setText(p2_name+"'s money:");
        } 
        if(gamestage!=10){
        jLabel1.setText(p1_name);
        jLabel2.setText(p2_name);
        P1FOLD.setEnabled(true);P2FOLD.setEnabled(true);
        P1hand.setText("");P2hand.setText("");P2FOLD.setText("FOLD");P1FOLD.setText("FOLD");
        gamestage=0;
        MINBET.setText(String.valueOf(minbet));
        P1FOLD.setEnabled(true);
        P2FOLD.setEnabled(true);
        pot=0;
        nextcard.setEnabled(true);
        tc1="";tc2="";tc3="";tc4="";tc5="";
        Icon ic= new ImageIcon("");
        ETCHED();
        TC1.setIcon(ic);TC2.setIcon(ic);TC3.setIcon(ic);TC4.setIcon(ic);TC5.setIcon(ic);
        P1show.setEnabled(true);        P2show.setEnabled(true);
        P1show.setText("Show");         P2show.setText("Show");
        Rlabel.setText("");  
        NEWDECK();
        GENPC();GENTC();P2STRENGTH_HAND();P1STRENGTH_HAND();RES=0;COMPAREHANDS();
        nextcard.setText("Stage1");
        P1BET.setEnabled(true);P2BET.setEnabled(true);
        P1BET.setText("");P2BET.setText("");
        start.setEnabled(false);       
        if(p1_money<=minbet||p2_money<=minbet)
        {
            if(p1_money<=minbet && p2_money>minbet)
                {
                    p1_bet=p1_money;
                    p2_bet=p1_bet;
                }
            else if(p1_money>minbet && p2_money<=minbet)
                {
                    p2_bet=p2_money;
                    p2_bet=p2_bet;
                }
            else if(p1_money<=minbet&&p2_money<=minbet)
               {
                    p1_bet=p1_money;
                    p2_bet=p2_money;
                }
            pot=p1_bet+p2_bet;
            p1_money-=p1_bet;
            p2_money-=p2_bet;
            p2_bet=p1_bet=0;
            ATONCE();
        }
        else
        {
            
        P1BET.setText(String.valueOf(""));  
        P2BET.setText(String.valueOf(""));
        P1M.setText(String.valueOf(p1_money));  
        P2M.setText(String.valueOf(p2_money));
        POTM.setText(String.valueOf(pot));
        }}
    }                                     

    private void P1showActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(P1show.getText()=="Show")
        {
            SHOWP1CARDS();
            P1show.setText("Hide");
        }
        else if(P1show.getText()=="Hide")
        {
            HIDEP1CARDS();
            P1show.setText("Show");
        }
    }                                      

    private void P2showActionPerformed(java.awt.event.ActionEvent evt) {                                       
         if(P2show.getText()=="Show")
        {
            SHOWP2CARDS();
            P2show.setText("Hide");
        }
        else if(P2show.getText()=="Hide")
        {
            HIDEP2CARDS();
            P2show.setText("Show");
        }
    }                                      

    private void nextcardActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int k=POTC();
        if(gamestage==0)
        {
            if(k!=-1)
            {
                if(k==2)
                 POTIT(k);
             else
             {POTIT(k);
                ImageIcon icon=new ImageIcon(getClass().getResource(tc1));
            TC1.setIcon(icon);
            icon=new ImageIcon(getClass().getResource(tc2));
            TC2.setIcon(icon);
            icon=new ImageIcon(getClass().getResource(tc3));
            TC3.setIcon(icon);
            NULLB(TC1);NULLB(TC2);NULLB(TC3);
            nextcard.setVisible(true);
            gamestage=1;
            nextcard.setText("Stage 2");}}
            
        }
        else if(gamestage==1)
        {
            if(k!=-1)
            {
           if(k==2)
                 POTIT(k);
             else
             {POTIT(k);
            Icon icon=new ImageIcon(getClass().getResource(tc4));
            TC4.setIcon(icon);NULLB(TC4);
            gamestage=2;
            nextcard.setText("Stage 3");}}
            
        }
        else if(gamestage==2)
        {
            if(k!=-1)
            {
            if(k==2)
                 POTIT(k);
             else
             {POTIT(k);
            Icon icon;
            icon = new ImageIcon(getClass().getResource(tc5));
            TC5.setIcon(icon);NULLB(TC5);
            nextcard.setText("RESULT");
            gamestage=3;}}
        }
        else if(gamestage==3)
        {
            if(k!=-1)
            {
             if(k==2)
                 POTIT(k);
             else
             {POTIT(k);
            P1hand.setText(p1_hand);        
            P2hand.setText(p2_hand);
            SHOWP1CARDS();SHOWP2CARDS();
            DECLARERES();
            game=0;
            gamestage=-1;
            ADJUSTMONEY();
            P1show.setEnabled(false); P1show.setText("           ");
            P2show.setEnabled(false); P2show.setText("           ");
            P1FOLD.setEnabled(false);P2FOLD.setEnabled(false);
            nextcard.setText("");
            nextcard.setEnabled(false);
            start.setEnabled(true);   
            P1BET.setText("");P2BET.setText("");
            P1BET.setEnabled(false);P2BET.setEnabled(false);
            P1FOLD.setText("         ");P2FOLD.setText("         ");
            P1FOLD.setEnabled(false);P2FOLD.setEnabled(false);
            start.setEnabled(true);
            CHECK();
            TIME();
            }}
        }
        
             
    }                                        

    private void P1FOLDActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String str=P1BET.getText();
        int foldbm=Integer.parseInt(str);
        str=POTM.getText();
        int foldpm=Integer.parseInt(str);
        if(gamestage==0)
        {
            if(foldbm>=minbet)
            {p1_money-=foldbm;p2_money+=foldbm;start.setEnabled(true);p1_bet=p2_bet=0;start.doClick();}
            
        }
        else if(gamestage>0)
        {
            if(p1_bet==0 || p1_bet>=minbet)
            {p1_money-=foldbm;p2_money+=foldbm+foldpm;start.setEnabled(true);p1_bet=p2_bet=0;start.doClick();}
        }
    }                                      

    private void P2FOLDActionPerformed(java.awt.event.ActionEvent evt) {                                       
       String str=P2BET.getText();
        int foldbm=Integer.parseInt(str);
        str=POTM.getText();
        int foldpm=Integer.parseInt(str);
        if(gamestage==0)
        {
            if(foldbm>=minbet)
            {p2_money-=foldbm;p1_money+=foldbm;start.setEnabled(true);p1_bet=p2_bet=0;start.doClick();}
            
        }
        else
        {
            if(p2_bet==0 || p2_bet>=minbet)
            {p2_money-=foldbm;p1_money+=foldbm+foldpm;start.setEnabled(true);p1_bet=p2_bet=0;start.doClick();}
        }
    }                                      

    private void P1BETActionPerformed(java.awt.event.ActionEvent evt) {                                      
       try{String str=P1BET.getText();
       int b=Integer.parseInt(str);
       str=P2BET.getText();
       int c=Integer.parseInt(str);
       if(b>=0 &&c>=0)
       nextcard.doClick();
       else
       {JOptionPane.showMessageDialog(null,"Please, Do not make mad bets!!");}}
       catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"Please, Do not make mad bets!!");}
    }                                     

    private void P2BETActionPerformed(java.awt.event.ActionEvent evt) {                                      
       try{String str=P1BET.getText();
       int b=Integer.parseInt(str);
       str=P2BET.getText();
       int c=Integer.parseInt(str);
       if(b>=0 &&c>=0)
       nextcard.doClick();
       else
       {JOptionPane.showMessageDialog(null,"Please, Do not make mad bets!!");}}
       catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"Please, Do not make mad bets!!");}
    }                                     

    private void MINBETActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    public void POTIT(int k)
    {
        if(k==2)
        {if(p1_bet>=p2_money)
            {p1_bet=p2_bet=p2_money;}
        else if(p2_bet>=p1_money)
        {p1_bet=p2_bet=p1_money;}
        }   
         p1_money-=p1_bet;
         p2_money-=p2_bet;
         pot+=p2_bet+p1_bet;
         if(k==2)
        {
            ATONCE();
        }else
         {POTM.setText(String.valueOf(pot));
         P1M.setText(String.valueOf(p1_money));  
         P2M.setText(String.valueOf(p2_money));
         P1BET.setText("0");P2BET.setText("0");
         p1_bet=p2_bet=0;}
               
              
    }
    public int POTC()
    {
        try{
        String str=P1BET.getText();
        p1_bet=Integer.parseInt(str);
        str=P2BET.getText();
        p2_bet=Integer.parseInt(str);
        if(p1_bet%10!=0||p2_bet%10!=0)
        {JOptionPane.showMessageDialog(null,"Bet has to be a multiple of 10");return -1;}
        else if(p1_bet>p1_money||p2_bet>p2_money)
        {JOptionPane.showMessageDialog(null,"Bet limit exceeded!!");return -1;}
        else if(p1_bet<0||p2_bet<0)
        {JOptionPane.showMessageDialog(null,"Stay Calm and bet properly!!");return -1;}
        else if(p1_bet!=p2_bet || ((p1_bet==p1_money)||(p2_bet==p2_money)))
        {
          if((p1_bet>=p2_money&&p2_bet==p2_money)||(p2_bet>=p1_money&&p1_bet==p1_money))
              return 2;
          else
        {JOptionPane.showMessageDialog(null,"Please make equal bets or go ALL IN!!");return -1;}}
        else if((p1_bet<minbet||p2_bet<minbet)&&gamestage==0)
        {JOptionPane.showMessageDialog(null,"Make a minimum bet of  "+ minbet);return -1;}
        else if((p1_bet<minbet &&p1_bet!=0)||(p2_bet<minbet &&p2_bet!=0))
        {JOptionPane.showMessageDialog(null,"Atleast make a bet of" + minbet);return -1;}
        return 1;}catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"Please, Do not make mad bets");}
        return -1;
    }
    public void ATONCE()
    {
       SHOWALL();
        gamestage=-1;if(RES==1) p1_money+=pot;else if(RES==2) p2_money+=pot;
        else if(RES==0) {p1_money+=pot/2;p2_money+=pot/2;}
        pot=0;
        P1M.setText(String.valueOf(p1_money));  
        P2M.setText(String.valueOf(p2_money));
        P1BET.setText("");P2BET.setText("");POTM.setText("0");
        P1BET.setEnabled(false);P2BET.setEnabled(false);
         nextcard.setText("");
         P1FOLD.setText("         ");P2FOLD.setText("         ");
         P1FOLD.setEnabled(false);P2FOLD.setEnabled(false);
         TIME();
        CHECK();
    }
   public void ADJUSTMONEY()
   {
       
       if(gamestage==-1)
       {
           String str=POTM.getText();
           pot=Integer.parseInt(str);
           if(RES==1)
           {p1_money+=pot;P1M.setText(String.valueOf(p1_money));}
           else if(RES==2)
           {p2_money+=pot;P2M.setText(String.valueOf(p2_money));}
           else if(RES==0)
           {p1_money+=pot/2;p2_money+=pot/2;P2M.setText(String.valueOf(p2_money));P1M.setText(String.valueOf(p1_money));}
           }
          POTM.setText("0");
   }
   public void SHOWALL()
    {     
         Icon icon;
        icon=new ImageIcon(getClass().getResource(tc1));
        TC1.setIcon(icon);NULLB(TC1);
        icon=new ImageIcon(getClass().getResource(tc2));
        TC2.setIcon(icon);NULLB(TC2);
        icon=new ImageIcon(getClass().getResource(tc3));
        TC3.setIcon(icon);NULLB(TC3);
        icon=new ImageIcon(getClass().getResource(tc4));
        TC4.setIcon(icon);NULLB(TC4);
        icon=new ImageIcon(getClass().getResource(tc5));
        TC5.setIcon(icon);NULLB(TC5);
        P1hand.setText(p1_hand);
        P2hand.setText(p2_hand);
        DECLARERES();
        nextcard.setEnabled(false);
        nextcard.setText(null);
        start.setEnabled(true);
        SHOWP1CARDS();SHOWP2CARDS();P1show.setEnabled(false); P1show.setText("           ");
            P2show.setEnabled(false); P2show.setText("           ");
    }
     public void DECLARERES()
    {
      if(RES==1)
            Rlabel.setText(p1_name+" wins");
        else if(RES==2)
            Rlabel.setText(p2_name+" wins");
        else
            Rlabel.setText("DRAW");  
    }
     public void CHECK()
     {
         if(gamestage==-1)
         {if(p1_money==0)
         {JOptionPane.showMessageDialog(null,p2_name+" WON");SETNULL();fr2.setVisible(true);}
         else if(p2_money==0)
         {JOptionPane.showMessageDialog(null,p1_name+" WON");SETNULL();fr2.setVisible(true);}
         }
     }
     public void SETNULL()
     {
         jLabel6.setText("XX's money:");
         jLabel7.setText("XX's money:");
         jLabel3.setText("XX bets:");
         jLabel4.setText("XX bets:");
         P1M.setText(null);
         P2M.setText(null);
         Rlabel.setText(null);
         jLabel1.setText(null);
         jLabel2.setText(null);
         P1BET.setText(null);
         P2BET.setText(null);
         MINBET.setText(null);
         POTM.setText(null);
         gamestage=10;
         P1hand.setText(null);P2hand.setText(null);
         TC1.setIcon(null);TC2.setIcon(null);TC3.setIcon(null);TC4.setIcon(null);TC5.setIcon(null);
         P1C1.setIcon(null);P1C2.setIcon(null);P2C1.setIcon(null);P2C2.setIcon(null);
         ETCHED();
         P1C1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));
         P1C2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));
         P2C1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));
         P2C2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));
         
     }
    public void GENTC()
    {
        for(int i=1;i<=5;++i)
        {
            while(true)
            {
                int x=(int)(Math.random()*53);
                if(arr[x]==0)
                {
                    arr[x]=1;SETTC(x,i);
                    break;
                }
            }
        }
       
    }
    public void SETTC(int card,int pos)
    {
        String card_n="",card_s="";
        int cardn=card%13;
        int cards=card/13;
        if(cardn==0)
        {
            cardn=13;
            cards=(card/13)-1;
        }  
        card_n=String.valueOf(cardn);
        if(cards==0)
            card_s="C";
        else if(cards==1)
            card_s="D";
        else if(cards==2)
            card_s="H";
        else if(cards==3)
            card_s="S";
        if(pos==1)
        {tc1=path+card_s+card_n+".jpg";}
        else if(pos==2)
        {tc2=path+card_s+card_n+".jpg";}
        else if(pos==3)
        {tc3=path+card_s+card_n+".jpg";}
        else if(pos==4)
        {tc4=path+card_s+card_n+".jpg";}
        else if(pos==5)
        {tc5=path+card_s+card_n+".jpg";}
        tc_nos[pos-1]=cardn;
        tc_suits[pos-1]=cards;
        
    }
    public void GENPC()
    {
        int i,x;
        for(i=1;i<=2;++i)
        {
            while(true)
            {
                x=(int)(Math.random()*53);
                if(arr[x]==0)
                {
                    SETP2C(x,i);arr[x]=1;break;
                }
            }
        }   
       
        for(i=1;i<=2;++i)
        {
            while(true)
            {
                x=(int)(Math.random()*53);
                if(arr[x]==0)
                {
                    SETP1C(x,i);arr[x]=1;break;
                }
            }
        }
        
    }    
    public void SETP1C(int card,int pos)
    {
        String card_n="",card_s="";
        int cardn=card%13;
        int cards=card/13;
        if(cardn==0)
        {
            cardn=13;
            cards=(card/13)-1;
        }         
        card_n=String.valueOf(cardn);
        if(cards==0)
            card_s="C";
        else if(cards==1)
            card_s="D";
        else if(cards==2)
            card_s="H";
        else if(cards==3)
            card_s="S";
        if(pos==1)
        {p1c1=path+card_s+card_n+".jpg";P1C1.setIcon(new ImageIcon(getClass().getResource(path+"back.jpg")));NULLB(P1C1);}
        else if(pos==2)
        {p1c2=path+card_s+card_n+".jpg";P1C2.setIcon(new ImageIcon(getClass().getResource(path+"back.jpg")));NULLB(P1C2);}
        p1_nos[pos-1]=cardn;
        p1_suits[pos-1]=cards;
    }
    public void SETP2C(int card,int pos)
    {
      String card_n="",card_s="";
        int cardn=card%13;
        int cards=card/13;
        if(cardn==0)
        {
            cardn=13;
            cards=(card/13)-1;
        }  
        card_n=String.valueOf(cardn);
        if(cards==0)
            card_s="C";
        else if(cards==1)
            card_s="D";
        else if(cards==2)
            card_s="H";
        else if(cards==3)
            card_s="S";
        if(pos==1)
        {p2c1=path+card_s+card_n+".jpg";P2C1.setIcon(new ImageIcon(getClass().getResource(path+"back.jpg")));NULLB(P2C1);}
        else if(pos==2)
        {p2c2=path+card_s+card_n+".jpg";P2C2.setIcon(new ImageIcon(getClass().getResource(path+"back.jpg")));NULLB(P2C2);}  
        p2_nos[pos-1]=cardn;
        p2_suits[pos-1]=cards;
    }
    public void NEWDECK()
    {
        for(int i=1;i<53;++i)
            arr[i]=0;
        arr[0]=1;
    }
    public void SHOWP1CARDS()
    {
       P1C1.setIcon(new ImageIcon(getClass().getResource(p1c1)));
       P1C2.setIcon(new ImageIcon(getClass().getResource(p1c2))); 
    }
    public void SHOWP2CARDS()
    {
      P2C1.setIcon(new ImageIcon(getClass().getResource(p2c1)));
      P2C2.setIcon(new ImageIcon(getClass().getResource(p2c2)));  
    }
    public void HIDEP1CARDS()
    {
        ImageIcon ic=new ImageIcon(getClass().getResource(path+"back.jpg"));
        P1C1.setIcon(ic);
        P1C2.setIcon(ic);
    }
    public void HIDEP2CARDS()
    {
        ImageIcon ic=new ImageIcon(getClass().getResource(path+"back.jpg"));
        P2C1.setIcon(ic);
        P2C2.setIcon(ic);
    }
    public void ETCHED()
    {
        TC1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));
        TC2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));
        TC3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));
        TC4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));
        TC5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), null));
    }
    public void NULLB(JLabel j)
    {
        j.setBorder(null);
    }
    public void P1STRENGTH_HAND()
    {
        int i;
        for(i=0;i<5;++i)
        {
            p1_finalnos[i]=tc_nos[i];p1_finalsuits[i]=tc_suits[i];
        }
        for(i=0;i<2;++i)
        {
            p1_finalnos[i+5]=p1_nos[i];p1_finalsuits[i+5]=p1_suits[i];
        }
        SORT(p1_finalnos,p1_finalsuits);
        STRENGTH(p1_finalnos,p1_finalsuits,1);
    }
    public void P2STRENGTH_HAND()
    {
        int i;
        for(i=0;i<5;++i)
        {
            p2_finalnos[i]=tc_nos[i];p2_finalsuits[i]=tc_suits[i];
        }
        for(i=0;i<2;++i)
        {
            p2_finalnos[i+5]=p2_nos[i];p2_finalsuits[i+5]=p2_suits[i];
        }
        SORT(p2_finalnos,p2_finalsuits);      
        STRENGTH(p2_finalnos,p2_finalsuits,2);
    }
    public void STRENGTH(int nos[],int suits[],int player)
    {
        int k=FLUSH(nos,suits),rank,val=0,k1;String str="";
           if(k==2)
           {rank=10;str="ROYAL FLUSH";}
           else if(k>0)
           {rank=9;str="STRAIGHT FLUSH";}
           else
           {
               k1=FOUR(nos,suits);
               if(k1!=-1)
               {rank=8;val=k1;str="FOUR OF A KIND";}
               else
               {
                   k1=FULL(nos,suits);
                   if(k1!=-1)
                   {rank=7;val=k1;str="FULL HOUSE";}
                   else
                   {
                       k1=k;
                       if(k1<0)
                       {rank=6;val=-1*k1;str="FLUSH";}
                       else
                       {
                           k1=STRAIGHT(nos,suits);
                           if(k1!=-1)
                           {rank=5;val=k1;str="STRAIGHT";}
                           else
                           {
                               k1=THREE(nos,suits);
                               if(k1!=-1)
                               {rank=4;val=k1;str="THREE OF A KIND";}
                               else
                               {
                                   k1=TWOPAIR(nos, suits);
                                   if(k1!=-1)
                                   {rank=3;val=k1;str="TWO PAIR";}
                                   else
                                   {
                                       k1=PAIR(nos, suits);
                                       if(k1!=-1)
                                       {rank=2;val=k1;str="PAIR";}
                                       else
                                       {k1=HIGH(nos,suits);
                                        rank=1;val=k1;str="HIGH CARD";
                                       }
                                   }
                               }
                           }
                       }
                   }
               }
           }
           if(player==1)
           {p1_rank=rank;p1_rankval=val;p1_hand=str;}
           else if(player==2)
           {p2_rank=rank;p2_rankval=val;p2_hand=str;}
    }
    public void COMPAREHANDS()
    {
        if(p1_rank>p2_rank)
            RES=1;
        else if(p1_rank<p2_rank)
            RES=2;
        else if(p1_rank==p2_rank)
        {
            if(p1_rankval>p2_rankval)
                RES=1;
            else if(p1_rankval<p2_rankval)
                RES=2;
            else
            {
             BREAKTIE(p1_rank);   
            }
        }
    }
    public void BREAKTIE(int rank)
    {
        int h=0,i,j;
      if(rank==1) //HIGH CARD
      {
        if(p1_finalnos[0]==1&&p2_finalnos[0]!=1)
            RES=1;
        else if(p2_finalnos[0]==1&&p1_finalnos[0]!=1)
            RES=2;
        else
        {
            if(p1_finalnos[0]==1&&p1_finalnos[0]==1)
                h=3;
            else 
                h=2;
            for(i=6;i>=h;--i)
            {
                if(p1_finalnos[i]>p2_finalnos[i])
                {RES=1;break;}
                else if(p1_finalnos[i]<p2_finalnos[i])
                {RES=2;break;}
            }
        }
      }
      else if(rank==2)//PAIR
      {
        int suit1[]=new int[14];
        int suit2[]=new int[14];
        for(i=0;i<7;++i)
        {
            suit1[p1_finalnos[i]]++;
            suit2[p2_finalnos[i]]++;
            if(suit1[p1_finalnos[i]]==2)
                suit1[p1_finalnos[i]]=0;
            if(suit2[p2_finalnos[i]]==2)
                suit2[p2_finalnos[i]]=0;
        }
        if(suit1[1]==1&&suit2[1]!=1)
        {RES=1;return;}
        else if(suit1[1]==0&&suit2[1]==1)
        {RES=2;return;}
        else if(suit1[1]==suit2[1]&&suit1[1]==1)
        h=1;
        else if(suit1[1]==suit2[1]&&suit1[1]==0)
        h=0;
        for(i=13;i>=1&&h!=3;--i)
        {
            if(suit1[i]!=0&&suit2[i]==0)
            {RES=1;break;}
            else if(suit1[i]==0&&suit2[i]!=0)
            {RES=2;break;}
            else if(suit1[i]!=0&&suit2[i]!=0)
                h++;
        }
        
      }
      else if(rank==3)//TWO PAIR
      {
         int suit1[]=new int[14];
         int suit2[]=new int[14];
         for(i=0;i<7;++i)
             suit1[p1_finalnos[i]]++;
         for(i=0;i<7;++i)
             suit2[p2_finalnos[i]]++;
         int m1=0,m2=0;
         for(i=13;i>=2;--i)
         {
             if(suit1[i]==2 && p1_rankval!=i)
             {
                 m1=i;
             }
         }
         for(i=13;i>=2;--i)
         {
             if(suit2[i]==2 && p1_rankval!=i)
             {
                 m2=i;
             }
         }
         if(m1>m2)
             RES=1;
         else if(m1<m2)
             RES=2;
         else if(m1==m2)
         {
             suit1[m1]=suit2[m2]=0;
             if(p1_rankval==14)
                 suit1[1]=suit2[1]=0;
             else if(p1_rankval!=14)
                 suit1[p1_rankval]=suit2[p2_rankval]=0;
             if(suit1[1]!=0&&suit2[1]==0)
                 RES=1;
             else if(suit1[1]==0&&suit2[1]!=0)
                 RES=2;
             else if(suit1[1]==1&&suit2[1]==1&&suit2[1]!=0)
                 RES=0;
             else
             {
                 for(i=13;i>=2;--i)
                 {
                     if(suit1[i]!=0&&suit2[i]==0)
                     {RES=1;break;}
                     else if(suit1[i]==0&&suit2[i]!=0)
                     {RES=2;break;}
                     else if(suit1[i]!=0&&suit2[1]!=0)
                     {RES=0;break;}  
                 }
             }
         }
      }
      else if(rank==4)//THREE OF A KIND
      {
        int suit1[]=new int[14];
        int suit2[]=new int[14];
        for(i=0;i<7;++i)
        {
            suit1[p1_finalnos[i]]++;
            suit2[p2_finalnos[i]]++;
            if(suit1[p1_finalnos[i]]==3)
                suit1[p1_finalnos[i]]=0;
            if(suit2[p2_finalnos[i]]==3)
                suit2[p2_finalnos[i]]=0;
        }
        if(suit1[1]==1&&suit2[1]!=1)
        {RES=1;return;}
        else if(suit1[1]==0&&suit2[1]==1)
        {RES=2;return;}
        else if(suit1[1]==suit2[1]&&suit1[1]==1)
        h=1;
        else if(suit1[1]==suit2[1]&&suit1[1]==0)
        h=0;
        for(i=13;i>=1&&h!=2;--i)
        {
            if(suit1[i]!=0&&suit2[i]==0)
            {RES=1;break;}
            else if(suit1[i]==0&&suit2[i]!=0)
            {RES=2;break;}
            else if(suit1[i]!=0&&suit2[i]!=0)
                h++;
        } 
      }
      else if(rank==6)//FLUSH
      {
         int suits1[]=new int[4];
         int max1=0;
         for(i=0;i<7;++i)
             suits1[p1_finalsuits[i]]++;
         h=0;
         for(i=0;i<4;++i)
             if(suits1[i]>h)
                 max1=i;
        int suit1[]=new int[14];
        int suit2[]=new int[14];
        for(i=0;i<7;++i)
            if(p1_finalsuits[1]==max1)
            {
                suit1[p1_finalnos[i]]++;
                suit2[p2_finalnos[i]]++;
            }
        if(suit1[1]==1&&suit2[1]!=1)
        {RES=1;return;}
        else if(suit2[1]==1&&suit1[1]!=1)
        {RES=2;return;}
        else if(suit1[1]==1&&suit2[1]==1)
            h=1;
        else if(suit1[1]==0&&suit2[1]==0)
            h=0;
        i=13;
        while(h<5)
        {
            if(suit1[i]==1&&suit2[i]!=1)
            {RES=1;break;}
            else if(suit1[i]!=1&&suit2[i]==1)
            {RES=2;break;}
            i--;
        }            
      }
      else if(rank==7)//FULL HOUSE
      {
        int suit1[]=new int[14];
        int suit2[]=new int[14];
        for(i=0;i<7;++i)
        {
            suit1[p1_finalnos[i]]++;
            suit2[p2_finalnos[i]]++;
            if(suit1[p1_finalnos[i]]==3)
                suit1[p1_finalnos[i]]=0;
            if(suit2[p2_finalnos[i]]==3)
                suit2[p2_finalnos[i]]=0;
        }
        if(suit1[1]==2&&suit2[1]!=2)
        {RES=1;return;}
        else if(suit2[1]==2&&suit1[1]!=2)
        {RES=2;return;}
        else if(suit1[1]!=2&&suit2[1]!=2)
        {
            for(i=13;i>=2;--i)
            {
                if(suit1[i]==2&&suit2[i]!=2)
                {RES=1;break;}
                if(suit2[i]==2&&suit1[i]!=2)
                {RES=2;break;}
                else if(suit1[i]==2&&suit2[i]==2)
                    return;
            }
        }
      }
      else if(rank==8)//FOUR OF A KIND
      {
        int suit1[]=new int[14];
        int suit2[]=new int[14];
        for(i=0;i<7;++i)
        {
            suit1[p1_finalnos[i]]++;
            suit2[p2_finalnos[i]]++;
            if(suit1[p1_finalnos[i]]==4)
                suit1[p1_finalnos[i]]=0;
            if(suit2[p2_finalnos[i]]==4)
                suit2[p2_finalnos[i]]=0;
        } 
        if(suit1[1]>=1&&suit2[1]==0)
        {RES=1;return;}
        else if(suit2[1]>=1&&suit1[1]==0)
        {RES=2;return;}
        else if(suit1[1]==0&&suit2[1]==0)
        {
            for(i=13;i>=2;--i)
            {
                if(suit1[i]>=1&&suit2[i]==0)
                {RES=1;break;}
                if(suit2[i]>=1&&suit1[i]==0)
                {RES=2;break;}
                else if(suit1[i]>=1&&suit2[i]>=1)
                    return;
            }
        }
      }
    }
    public int TIME()
    {
        x=System.currentTimeMillis();
        if(x-time>=t)
        {minbet*=2;time=x;MINBET.setText(String.valueOf(minbet));if(minbet>startm) minbet=startm;}
         return 0;
    }
    public int FLUSH(int final_nos[],int final_suits[]) 
    {    
    int i,j,max=0,maxsuit=-1,t,v=0;
    int suits[]=new int[4];
    for(i=0;i<7;++i)
       suits[final_suits[i]]++;
    for(i=0;i<4;++i)
         if(suits[i]>max)
             {max=suits[i];maxsuit=i;}
    if(max>=5)
        {
            int stfl[]=new int[max];
            j=0;
            for(i=0;i<7;++i)
            {
                if(final_suits[i]==maxsuit)
                    {stfl[j]=final_nos[i];j++;}
            }
            int sf=STRAIGHTFLUSH(stfl,max);
            if(sf==-1)
            {
               if(stfl[0]==1)
                   return -14;
               return (-1*stfl[max-1]);
            }
            else if(sf==14)
                return 2;
            else
                return sf;
        }
     return 0;
    }    
    int FOUR(int f_nos[],int f_suits[])
    {
    int i,v,count[]=new int[14];
    for(i=0;i<7;++i)
        count[f_nos[i]]++;
    for(i=1;i<=13;++i)
            if(count[i]==4)
               {if(i==1)
               v=14;
               else
                v=i;
               return v;}
    return -1;
    }
    int FULL(int f_nos[],int f_suits[])
    {
     int i,k=0,v=0,count[]=new int[14];
    for(i=0;i<7;++i)
        count[f_nos[i]]++;
    for(i=13;i>=1;--i)
          if(count[i]==3)
          {
              k=i;
              for(v=13;v>=1;--v)
              {
                  if(count[v]>=2&&v!=k)
                  {
                      if(k==1)
                          return 14;
                      return k;
                  }
                      
              }
          }
    return -1;
    }
    public int STRAIGHT(int f_nos[],int f_suits[])
    {
    int i,j,count[]=new int[14];
    for(i=0;i<7;++i)
    {
        count[f_nos[i]]++;
    }
    if(count[1]>=1&&count[10]>=1&&count[11]>=1&&count[12]>=1&&count[13]>=1)
        return 60;
    for(i=6;i>=4;--i)
    {
        if(count[f_nos[i]]>=1&&count[f_nos[i]-1]>=1&&count[f_nos[i]-2]>=1&&count[f_nos[i]-3]>=1&&count[f_nos[i]-4]>=1)
        {
            
               int v=5*(f_nos[i]-2);
            
            return v;
        }
    }
    return -1;
    }
    public int THREE(int f_nos[],int f_suits[])
    {
    int i,count[]=new int[14],k=0,v;
    for(i=0;i<7;++i)
        count[f_nos[i]]++;
    for(i=13;i>=1;--i)
        if(count[i]==3)
         {if(i==1) v=14;else v=i;return v;}
    return -1;
    }
    public int TWOPAIR(int f_nos[],int f_suits[])
    {
    int i,count[]=new int[14],k=0,v=0,v1=0;
    for(i=0;i<7;++i)
        count[f_nos[i]]++;
    for(i=13;i>=1;--i)
    {
        if(count[i]==2)
        {v=i;k=1;count[i]=0;break;}
    }
    for(i=13;i>=1;--i)
    {
        if(count[i]==2)
        {k++;v1=i;break;}
    }
    if(k>=2)
    {
        if(v1==1||v==1)
            return 14;
        else if(v1>v)
            v=v1;
        return v;
    }
    return -1;
    }
    public int PAIR(int f_nos[],int f_suits[])
    {
    int i,count[]=new int[14],k=0,v;
    for(i=0;i<7;++i)
        count[f_nos[i]]++;
    for(i=13;i>=1;--i)
    {
        if(count[i]==2)
            {if(i==1)v=14;else v=i;return v;}
    }
    return -1;
    }
    public int HIGH(int final_nos[],int final_suits[])
    {
      if(final_nos[0]==1)
        return 14;
    else 
        return final_nos[6];
    }
    public int STRAIGHTFLUSH(int stfl[],int max)
    {
    int i,j,t,m;
    int count[]=new int[14];
        for(i=0;i<max;++i)
            count[stfl[i]]++;

    if(count[13]>=1&&count[12]>=1&&count[11]>=1&&count[10]>=1&&count[1]>=1)
        return 14;
    else
    {
        for(i=max-1;i>=4;--i)
        {
            t=stfl[i];
            if(count[t]>=1&&count[t-1]>=1&&count[t-2]>=1&&count[t-3]>=1&&count[t-4]>=1)
                return(5*t-10);
        }
        return -1;
    }
    }
    public void SORT(int a[],int b[])
    {
        int i,t,j;
        for(i=0;i<7;++i)
            for(j=i+1;j<7;++j)
            {
                if(a[j]<a[i])
                {
                    t=a[i]; a[i]=a[j];a[j]=t;
                    t=b[i];b[i]=b[j];b[j]=t;
                }
            }
    }
    static public int MIN(int a,int b)
    {
        if(a<b)
            return a;
        return b;
    }
    public static void main(String args[]) {
        fr.setVisible(true);
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JTextField MINBET;
    private javax.swing.JTextField P1BET;
    private javax.swing.JLabel P1C1;
    private javax.swing.JLabel P1C2;
    private javax.swing.JButton P1FOLD;
    private javax.swing.JLabel P1M;
    private javax.swing.JLabel P1hand;
    private javax.swing.JButton P1show;
    private javax.swing.JTextField P2BET;
    private javax.swing.JLabel P2C1;
    private javax.swing.JLabel P2C2;
    private javax.swing.JButton P2FOLD;
    private javax.swing.JLabel P2M;
    private javax.swing.JLabel P2hand;
    private javax.swing.JButton P2show;
    private javax.swing.JLabel POK1;
    private javax.swing.JLabel POK2;
    private javax.swing.JLabel POTM;
    private javax.swing.JLabel Rlabel;
    private javax.swing.JLabel TC1;
    private javax.swing.JLabel TC2;
    private javax.swing.JLabel TC3;
    private javax.swing.JLabel TC4;
    private javax.swing.JLabel TC5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton nextcard;
    private javax.swing.JButton start;
    // End of variables declaration                   
};

class NewJFrame extends javax.swing.JFrame {    
    public NewJFrame() {
        initComponents();
    }     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        PLAY = new javax.swing.JButton();
        TITLE = new javax.swing.JLabel();
        PASS = new javax.swing.JLabel();
        PASSF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);setTitle("Password Please :)");
        setIconImage(new ImageIcon("E:\\RealPOker\\src\\pc_pics\\icon2.jpg").getImage());
        setBackground(Color.pink);
    
        PLAY.setText("PLAY NOW");
        PLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYActionPerformed(evt);
            }
        });

        TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE.setText("WELCOME TO THE ENTRACE DOOR OF THE WORLD OF POKER!!!");

        PASS.setText("PASSWORD:");

        PASSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TITLE, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PASS, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PASSF, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(PLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PASSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PASS))
                .addGap(40, 40, 40)
                .addComponent(PLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                                          
    public void PLAYActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if(PASSF.getText().equals("poker"))
        {
            POkerForm.fr.setVisible(false); 
            POkerForm.fr.PASSF.setText(null);
            POkerForm.fr1.setVisible(true);          
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Try Again With Correct Password -_-");
        }
    }                                    
    private void PASSFActionPerformed(java.awt.event.ActionEvent evt) {   
        PLAY.doClick();
    }  
    private javax.swing.JLabel PASS;
    private javax.swing.JPasswordField PASSF;
    private javax.swing.JButton PLAY;
    private javax.swing.JLabel TITLE;
                      
};

 class User extends javax.swing.JFrame {

    public User() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabelP1 = new javax.swing.JLabel();
        jLabelP1N = new javax.swing.JLabel();
        jLabelP1A = new javax.swing.JLabel();
        jLabelP2 = new javax.swing.JLabel();
        jLabelP2N = new javax.swing.JLabel();
        jLabelP2A = new javax.swing.JLabel();
        P1N = new javax.swing.JTextField();
        P1A = new javax.swing.JTextField();
        P2N = new javax.swing.JTextField();
        P2A = new javax.swing.JTextField();
        jLabelMIB = new javax.swing.JLabel();
        MIB = new javax.swing.JTextField();
        GO = new javax.swing.JButton();
        NOTE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALMOST THERE!!");
        setResizable(false);
        setIconImage(new ImageIcon("E:\\RealPOker\\src\\pc_pics\\icon2.jpg").getImage());

        jLabelP1.setText("PLAYER 1");

        jLabelP1N.setText("Name   :");

        jLabelP1A.setText("Amount:");

        jLabelP2.setText("PLAYER 2");

        jLabelP2N.setText("Name   :");

        jLabelP2A.setText("Amount:");

        P1N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1NActionPerformed(evt);
            }
        });

        P1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1AActionPerformed(evt);
            }
        });

        P2N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2NActionPerformed(evt);
            }
        });
        
        P2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2AActionPerformed(evt);
            }
        });
        
        MIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIBActionPerformed(evt);
            }
        });

        jLabelMIB.setText("MINIMUM BET :");

        GO.setText("GO!!!");
        GO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOActionPerformed(evt);
            }
        });

        NOTE.setText("NOTE: Minimum bet gets doubled after every two minutes. Play wisely!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(NOTE)
                .addGap(0, 56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelP2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelMIB)
                                    .addComponent(jLabelP1N)
                                    .addComponent(jLabelP1A)
                                    .addComponent(jLabelP2N)
                                    .addComponent(jLabelP2A))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P1N, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MIB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P1A, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P2N, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P2A, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelP1))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(GO)
                        .addGap(192, 192, 192))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMIB)
                    .addComponent(MIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1N, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelP1N, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelP1A))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelP2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P2N, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelP2N))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P2A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelP2A))
                .addGap(34, 34, 34)
                .addComponent(GO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NOTE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void P1NActionPerformed(java.awt.event.ActionEvent evt) {                                    
      GO.doClick();
    }                                   

    private void P1AActionPerformed(java.awt.event.ActionEvent evt) {                                    
      GO.doClick();
    }                                   

    private void GOActionPerformed(java.awt.event.ActionEvent evt) {                                   
        try{
      String str=MIB.getText();
      POkerForm.minbet=Integer.parseInt(str);
      str=P1A.getText();
      POkerForm.p1_money=Integer.parseInt(str);
      str=P2A.getText();
      POkerForm.p2_money=Integer.parseInt(str);
      POkerForm.p1_name=P1N.getText();
      POkerForm.p2_name=P2N.getText();
      int min=POkerForm.MIN(POkerForm.p1_money,POkerForm.p2_money);
       if(min<20*(POkerForm.minbet))
           {JOptionPane.showMessageDialog(null,"Initial amount of each player should be at least 20 times that of minimum bet!!");}
       else if(POkerForm.minbet%10!=0||POkerForm.p1_money%10!=0||POkerForm.p2_money%10!=0)
           {JOptionPane.showMessageDialog(null,"Initial amount and minimum bet are to be multiple of 10");}
       else if(POkerForm.minbet<0 ||POkerForm.p1_money<0 ||POkerForm.p1_money<0)
           {JOptionPane.showMessageDialog(null,"Stay Calm and bet properly!!");}
        else
       {
           POkerForm.fr1.setVisible(false);
           POkerForm.mainfr.flag=0;
           POkerForm.mainfr.gamestage=-1;
           POkerForm.mainfr.setVisible(true);
       }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"What the heck!!");}
    }                                  

    private void P2NActionPerformed(java.awt.event.ActionEvent evt) {                                    
        GO.doClick();
    }      
    private void P2AActionPerformed(java.awt.event.ActionEvent evt){
        GO.doClick();
    }    
     private void MIBActionPerformed(java.awt.event.ActionEvent evt){
        GO.doClick();
    }
                    
    private javax.swing.JButton GO;
    private javax.swing.JTextField MIB;
    private javax.swing.JLabel NOTE;
    private javax.swing.JTextField P1A;
    private javax.swing.JTextField P1N;
    private javax.swing.JTextField P2A;
    private javax.swing.JTextField P2N;
    private javax.swing.JLabel jLabelMIB;
    private javax.swing.JLabel jLabelP1;
    private javax.swing.JLabel jLabelP1A;
    private javax.swing.JLabel jLabelP1N;
    private javax.swing.JLabel jLabelP2;
    private javax.swing.JLabel jLabelP2A;
    private javax.swing.JLabel jLabelP2N;                   
}

class Rough extends javax.swing.JFrame {
    public Rough() {
        initComponents();
    }
    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(223, 80, 80));
        setForeground(java.awt.Color.orange);
        setIconImage(new ImageIcon("E:\\RealPOker\\src\\pc_pics\\icon2.jpg").getImage());
        setResizable(false);
        setTitle(":/");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLAY AGAIN?");

        jButton1.setText("YES :)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("NO :(");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Final.home.setVisible(true);
        POkerForm.mainfr.setVisible(false);
        POkerForm.fr2.setVisible(false);
    }                                        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        POkerForm.mainfr.setVisible(false);
        POkerForm.fr2.setVisible(false);
        POkerForm.fr1.setVisible(true);
    }                                        
    
                    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;                  
}


//BRICK BREAKER


class Brick extends JPanel implements KeyListener,
ActionListener, Runnable {
	
	/*
	 * left and right are movement keys for the bar.
	 * Initially the bar is stationary, so they are initialized as false.
	 */
	static boolean right = false;
	static boolean left = false;
	
	/*
	 * barx and bary are initial coordinates of the bar
	 */
	int barx = 360;
	int bary = 565;
	
	/*
	 * ballx and bally are initial coordinates of the ball
	 */
	int ballx = 360;
	int bally = 565;
	
	/*
	 * brickx and bricky are coordinates of the first brick of first layer of the brick. 
	 */
	int brickx = 200;
	int bricky = 70;
	
	/*
	 * Declaring bar and ball at their respective coordinates of appropriate sizes.
	 */
	Rectangle Bar = new Rectangle(barx, bary, 100, 15);
	Rectangle Ball = new Rectangle(ballx, bally, 15, 15);

	/*
	 * Declaring array of bricks.
	 */
	Rectangle[] Brick = new Rectangle[44];

	/*
	 * Stating initial conditions:
	 * The ball is moving from the bar to upward directions
	 * GaveOver conditions, ie, ballFallDown and bricksOver are set false.
	 * Count of broken bricks is set to zero. 
	 */
	int movex = -1;
	int movey = -1;
	boolean ballFallDown = false;
	boolean bricksOver = false;
	int count = 0;
	String status;
	public static JFrame frame = new JFrame();
        public static Brick game = new Brick();
	
	Brick() {
	}
	
	public void main(String[] args) {
		JButton button = new JButton("restart");
		frame.setSize(750, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(game);
		frame.add(button, BorderLayout.SOUTH);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		button.addActionListener(game);
		game.addKeyListener(game);
		game.setFocusable(true);
		Thread t = new Thread(game);
		t.start();
                restart();
	}


	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 750, 650);
		g.setColor(Color.YELLOW);
		g.fillOval(Ball.x, Ball.y, Ball.width, Ball.height);
		g.setColor(Color.BLUE);
		g.fill3DRect(Bar.x, Bar.y, Bar.width, Bar.height, true);
		g.setColor(Color.red);
		g.fillRect(0,580,750,20);
		g.drawRect(0, 0, 743, 580);
		for (int i = 0; i < Brick.length; i++) {
			if (Brick[i] != null) {
				g.fill3DRect(Brick[i].x, Brick[i].y, Brick[i].width,
						Brick[i].height, true);
			}
		}		
		if (ballFallDown == true || bricksOver == true) {
			Font f = new Font("Arial", Font.BOLD, 40);
			g.setFont(f);
			g.drawString(status, 230, 320);
			ballFallDown = false;
			bricksOver = false;
		}
	}

	
	public void run() {
		/*
		 * Bricks are created.
		 */
		for (int i = 0; i < Brick.length; i++) {
			Brick[i] = new Rectangle(brickx, bricky, 40, 20);
			if (i == 7) {
				brickx = 200;
				bricky = 92;
			}
			if (i == 13) {
				brickx = 242;
				bricky = 114;
			}
			if(i == 17){
				brickx = 284;
				bricky = 136;
			}
			if(i == 19){
				brickx=20;
				bricky=130;
			}
			if(i == 21){
				brickx=20;
				bricky=152;
			}
			if(i == 23){
				brickx=550;
				bricky=130;
			}
			if(i == 25){
				brickx=550;
				bricky=152;
			}
			if(i==27){
				brickx=0;
				bricky=230;
			}
			brickx += 42;
		}
		
		/*
		 * Environment has been set up.
		 * Ball, Bar and Bricks are ready to use.
		 */
		
		while (true) {
			/*
			 * Intersection of ball and bricks is checked
			 * We make the brick=null to remove it once it has been hit by the ball.
			 * The ball changes direction(x) due to collision.
			 * We could change y-direction x-direction or both
			 * Then we keep count of the bricks that have been broken
			 */
			for (int i = 0; i < Brick.length; i++) {
				if (Brick[i] != null) {
					if (Brick[i].intersects(Ball)) {
						Brick[i] = null;
						movex = -movex;
						count++;
					}
				}
			}
			
			/*
			 * Checking if all the bricks have been hit
			 */
                        
			if (count == Brick.length) {
				bricksOver = true;
				status = "YOU WIN!";
				repaint();
                                for(int j=0;j<5;++j)
                                    for( int i=0;i<1000000000;++i)
                                    {}
                                Final.home.setVisible(true);
                                restart();
                                frame.setVisible(false);                                
			}
			
			repaint();
			Ball.x += movex;
			Ball.y += movey;

			/*
			 * Movement of bar when left and right keys are pressed
			 */
			if (left == true) {
				Bar.x -= 3;
				right = false;
			}
			if (right == true) {	
				Bar.x += 3;
				left = false;
			}
			
			/*
			 * To refrain the bar from going out of the screen
			 * For right side, we also take into account the bat size.
			 */
			if (Bar.x <= 4) {
				Bar.x = 4;
			} 
			else if (Bar.x >= 641) {
				Bar.x = 641;
			}
			
			/*
			 * Ball goes back up when it strikes the bar
			 */
			if (Ball.intersects(Bar)) {
				movey = -movey;
			}
			
			/*
			 * Ball reverses direction when it strikes the horizontal and vertical borders
			 */
			if (Ball.x <= 0 || Ball.x + Ball.height >= 743) {
				movex = -movex;
			}
			if (Ball.y <= 0) {
				movey = -movey;
			}
			
			/*
			 * if the bar can't save the ball
			 */
			if (Ball.y >= 650) {
				ballFallDown = true;
				status = "GAME OVER!";
                                
				repaint();
                                for(int j=0;j<5;++j)
                                    for( int i=0;i<1000000000;++i)
                                    {}
                                Final.home.setVisible(true);
                                restart();
                                frame.setVisible(false);
                                
			}
			try {
				Thread.sleep(7);
			} catch (Exception ex) {
			}// try catch ends here

		}// while loop ends here

	}//run function loop ends here

	/*
	 * HANDLING KEY EVENTS
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_LEFT) {
			left = true;
		}

		if (keyCode == KeyEvent.VK_RIGHT) {
			right = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_LEFT) {
			left = false;
		}

		if (keyCode == KeyEvent.VK_RIGHT) {
			right = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.equals("restart")) {
			this.restart();

		}
	}

	public void restart() {
                System.out.println("Called");
		requestFocus(true);
		/*
		 * barx and bary are initial coordinates of the bar
		 */
		barx = 360;
		bary = 565;
		/*
		 * ballx and bally are initial coordinates of the ball
		 */
		ballx = 360;
		bally = 565;
		/*
		 * brickx and bricky are initial coordinates of the first layer of the brick. 
		 */
		brickx = 200;
		bricky = 70;
		/*
		 * Creating and declaring bar and ball at their respective coordinates of appropriate sizes.
		 */
		Bar = new Rectangle(barx, bary, 100, 15);
		Ball = new Rectangle(ballx, bally, 15, 15);
		/*
		 * Declaring array of bricks.
		 */
		Brick = new Rectangle[44];
		
		/*
		 * stating initial conditions again
		 */
		movex = -1;
		movey = -1;
		ballFallDown = false;
		bricksOver = false;
		count = 0;
		status = null;

		/*
		 * Creating bricks again because this for loop is out of while loop in run method
		 */
		for (int i = 0; i < Brick.length; i++) {
			Brick[i] = new Rectangle(brickx, bricky, 40, 20);
			if (i == 7) {
				brickx = 200;
				bricky = 92;
			}
			if (i == 13) {
				brickx = 242;
				bricky = 114;
			}
			if(i == 17){
				brickx = 284;
				bricky = 136;
			}
			if(i == 19){
				brickx=20;
				bricky=130;
			}
			if(i == 21){
				brickx=20;
				bricky=152;
			}
			if(i == 23){
				brickx=550;
				bricky=130;
			}
			if(i == 25){
				brickx=550;
				bricky=152;
			}
			if(i==27){
				brickx=0;
				bricky=230;
			}
			brickx += 42;
		}
		repaint();
                
	}
}





// PICTURE PUZZLE





class PictureButton extends JButton {
	/**
	 * Modified Button For Puzzle Pieces
	 */
	private static final long serialVersionUID = 1L;
	private boolean mover;
	public PictureButton() {
		super();
		init();
	}
	public PictureButton(ImageIcon icon){
		super(icon);
		init();
	}
	void init(){
		mover = false;
		BorderFactory.createLineBorder(Color.GRAY);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setBorder(BorderFactory.createLineBorder(Color.YELLOW));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				setBorder(BorderFactory.createLineBorder(Color.GRAY));
			}
		});	
	}
	
	public void setMover(){
		mover = true;
	}
	
	public boolean getMover(){
		return mover;	
	}
}

class PuzzleGame extends JFrame implements ActionListener{
	
	private JPanel panel;
	private ImagePanel imagepanel;
	private BufferedImage source;
	private BufferedImage resize;
	private ArrayList<PictureButton> buttons;
	private ArrayList<Point> solution = new ArrayList<Point>();
	private ArrayList<Point> current = new ArrayList<Point>();
	private ArrayList<Point> by = new ArrayList<Point>();
	private Image image;
	private PictureButton moverbutton;
	private int width,height;
	private JSplitPane jsp;
	private JMenuBar mb;
	private JMenu file,help;
	private JMenuItem fnew,fopen,fclose,fsave,habout,hrule;
	private final int REQUIRED_WIDTH = 500;

	
	public PuzzleGame() {
		
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			}catch(Exception e){}
		
		solution.add(new Point(0, 0));
        solution.add(new Point(0, 1));
        solution.add(new Point(0, 2));
        solution.add(new Point(1, 0));
        solution.add(new Point(1, 1));
        solution.add(new Point(1, 2));
        solution.add(new Point(2, 0));
        solution.add(new Point(2, 1));
        solution.add(new Point(2, 2));
        solution.add(new Point(3, 0));
        solution.add(new Point(3, 1));
        solution.add(new Point(3, 2));
        
        initializemenu();
        
        buttons = new ArrayList<PictureButton>();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        panel.setLayout(new GridLayout(4, 3, 0, 0));
        try {
			source = ImageIO.read(new File("E:/q007.jpg"));
			
			int h = getNewHeight(source.getWidth(), source.getHeight());
			resize = resizeImage(source, REQUIRED_WIDTH, h, BufferedImage.TYPE_INT_ARGB);
		} catch (IOException e) {}
        
        imagepanel = new ImagePanel(resize);
        imagepanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        imagepanel.setLayout(new FlowLayout());
        
        width = resize.getWidth();
        height = resize.getHeight();
        jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panel,imagepanel);
        add(jsp, BorderLayout.CENTER);
        
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {

                image = createImage(new FilteredImageSource(resize.getSource(),
                        new CropImageFilter(j * width / 3, i * height / 4,
                                (width / 3), height / 4)));
                PictureButton button = new PictureButton(new ImageIcon(image));
                button.putClientProperty("position", new Point(i, j));

                if (i == 3 && j == 2) {
                    moverbutton = new PictureButton();
                    moverbutton.setBorderPainted(false);
                    moverbutton.setContentAreaFilled(false);
                    moverbutton.setMover();
                    moverbutton.putClientProperty("position", new Point(i, j));
                } else {
                    buttons.add(button);
                }
            }
        }

        Collections.shuffle(buttons);
        buttons.add(moverbutton);
        for (int i = 0; i < 12; i++) {

            PictureButton btn = buttons.get(i);
            panel.add(btn);
            btn.setBorder(BorderFactory.createLineBorder(Color.gray));
            btn.addActionListener(new ClickAction());
        }
        
        current.clear();
        for (JComponent btn : buttons) {
            current.add((Point) btn.getClientProperty("position"));
        }
        
        setSize(2*REQUIRED_WIDTH,height);
        setTitle("Puzzle");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

	}
	
	 private void initializemenu(){
		 Container c = getContentPane();
		 c.setLayout(new BorderLayout());
		 mb = new JMenuBar();
		 c.add("North",mb);
		 file = new JMenu("File");
		 help = new JMenu("Help");
		 mb.add(file);
		 mb.add(help);
		 
		 fnew = new JMenuItem("New Game");
		 fopen = new JMenuItem("Open");
		 fsave = new JMenuItem("Save");
		 fclose = new JMenuItem("Close");
		 habout = new JMenuItem("About");
		 hrule = new JMenuItem("Instructions");
		 
		 file.add(fnew);
		 file.add(fopen);
		 file.add(fsave);
		 file.add(fclose);
		 help.add(habout);
		 help.add(hrule);
		 
		 fnew.addActionListener(this);
		 fopen.addActionListener(this);
		 fsave.addActionListener(this);
		 fclose.addActionListener(this);
		 habout.addActionListener(this);
		 hrule.addActionListener(this);
		 
	 }
	
	  private int getNewHeight(int w, int h) {

	        double ratio = REQUIRED_WIDTH / (double) w;
	        int newHeight = (int) (h * ratio);
	        return newHeight;
	    }
	  
	  private BufferedImage resizeImage(BufferedImage originalImage, int width,
	            int height, int type) throws IOException {

	        BufferedImage resizedImage = new BufferedImage(width, height, type);
	        Graphics2D g = resizedImage.createGraphics();
	        g.drawImage(originalImage, 0, 0, width, height, null);
	        g.dispose();

	        return resizedImage;
	    }
	  private class ClickAction extends AbstractAction {

	        @Override
	        public void actionPerformed(ActionEvent e) {

	            checkButton(e);
	            checkSolution();
	        }

	        private void checkButton(ActionEvent e) {

	            int lidx = 0;
	            for (PictureButton button : buttons) {
	                if (button.getMover()) {
	                    lidx = buttons.indexOf(button);
	                }
	            }

	            JButton button = (JButton) e.getSource();
	            int bidx = buttons.indexOf(button);

	            if ((bidx - 1 == lidx) || (bidx + 1 == lidx)
	                    || (bidx - 3 == lidx) || (bidx + 3 == lidx)) {
	                Collections.swap(buttons, bidx, lidx);
	                updateButtons();
	            }
	        }

	        private void updateButtons() {
	            panel.removeAll();
	            for (JComponent btn : buttons) {
	                panel.add(btn);
	            }
	            panel.validate();
	        }
	    }
	  
	  private void checkSolution() {

	        current.clear();

	        for (JComponent btn : buttons) {
	            current.add((Point) btn.getClientProperty("position"));
	        }
	        if (compareList(solution, current)) {
	            JOptionPane.showMessageDialog(panel, "Finished",
	                    "Congratulation", JOptionPane.INFORMATION_MESSAGE);
	        }
	    }
	  
	  public static boolean compareList(List ls1, List ls2) {
	        return ls1.toString().contentEquals(ls2.toString());
	    }


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				PuzzleGame game = new PuzzleGame();
				game.setVisible(true);
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (fopen.isArmed())
			this.openfile();
		else if (fsave.isArmed()){
			this.savegame();
		}else if (fclose.isArmed())
                {this.dispose();
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					PuzzleGame game = new PuzzleGame();
                                        Final.puzzle =game;
					
				}
			});Final.home.setVisible(true);}
		else if(habout.isArmed()){
			String str = "Netaji Subhas Institute of Technology"+"\n"
							+ "Puzzle Game By :-"+"\n"
							+ "Sagar Aggarwal"+"\n"+"COE 2014-2018"+"\n"
							+ "Developer,UI Designer And Tester";
		    JOptionPane.showMessageDialog(this, str);
		}else if(hrule.isArmed()){
			String str = "The goal is to re-assemble the picture."
					+ "User needs to reconstruct the image in the left hand side by following the "+
					"\n" +"original image shown in the right side."+"At the starting of each game a blank space "+
					"\n"+ 	"is left at the bottom right part.Picture pieces can be easily swapped "+
					"\n"+  "with it by clicking on any of the adjacent pieces.";
    JOptionPane.showMessageDialog(this, str);
		}else if(fnew.isArmed()){
			this.dispose();
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					PuzzleGame game = new PuzzleGame();
					game.setVisible(true);
				}
			});
		}
			
	}
	
	public void openfile(){
		JFileChooser fc = new JFileChooser();
		int i = fc.showOpenDialog(this);
		if(i == JFileChooser.APPROVE_OPTION){
			File f = fc.getSelectedFile();
			try {
				BufferedReader in = new BufferedReader(new FileReader(f));
				char sol[] = in.readLine().toCharArray();
				by.clear();
				for(i=0;i<sol.length;i=i+2)
					by.add(new Point(sol[i]-48,sol[i+1]-48));
				buttons.clear();
				panel.removeAll();
				for(Point p:by){
					image = createImage(new FilteredImageSource(resize.getSource(),
	                        new CropImageFilter((int)p.getY() * width / 3, (int)p.getX() * height / 4,
	                                (width / 3), height / 4)));
	                PictureButton button = new PictureButton(new ImageIcon(image));
	                button.putClientProperty("position", new Point((int)p.getX(), (int)p.getY()));

	                if ((int)p.getX() == 3 && (int)p.getY() == 2) {
	                    moverbutton = new PictureButton();
	                    moverbutton.setBorderPainted(false);
	                    moverbutton.setContentAreaFilled(false);
	                    moverbutton.setMover();
	                    moverbutton.putClientProperty("position", new Point(3 , 2));
	                    buttons.add(moverbutton);   
	                } else {
	                    buttons.add(button);
	                }
				}
		        for (int i1 = 0; i1 < 12; i1++) {

		            PictureButton btn = buttons.get(i1);
		            panel.add(btn);
		            btn.setBorder(BorderFactory.createLineBorder(Color.gray));
		            btn.addActionListener(new ClickAction());
		        }
				panel.revalidate();
				current.clear();
				current = by;
				
			} catch (Exception e) {}
		}
	}
	
	public void savegame(){
		JFileChooser saveFile = new JFileChooser();
        int i = saveFile.showSaveDialog(null);
        if(i == JFileChooser.APPROVE_OPTION){
			File f = saveFile.getSelectedFile();
			try {
				BufferedWriter out = new BufferedWriter(new FileWriter(f));
				String store = "";
				for(Point p :current){
					store = store + (int)p.getX() + (int)p.getY();
				}
	            out.write(store);
	            out.close();
			} catch (Exception e) {}
		}
	}
}
