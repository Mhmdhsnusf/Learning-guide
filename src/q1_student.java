/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import jaco.mp3.player.MP3Player;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ziad
 */
public class q1_student extends javax.swing.JFrame {

    /**
     * Creates new form q1
     */
    public q1_student() {
        initComponents();
    }
public static final String song ="F:\\Faculty of Engineering\\java course\\Login\\Pou_fail_sound_(getmp3.pro).mp3";
MP3Player mp3player =new MP3Player (new File(song));
public static final String song1 ="F:\\Faculty of Engineering\\java course\\Login\\Congratulations_Roblox_sound_effect_(getmp3.pro).mp3";
MP3Player mp3player1 =new MP3Player (new File(song1));

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1_q1z4 = new javax.swing.JRadioButton();
        buttonGroup1_q1 = new javax.swing.ButtonGroup();
        buttonGroup1_ans_q1 = new javax.swing.ButtonGroup();
        buttonGroup1_q2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1_q1z = new javax.swing.JTextField();
        b1z = new javax.swing.JRadioButton();
        b2z = new javax.swing.JRadioButton();
        b9z = new javax.swing.JRadioButton();
        b13z = new javax.swing.JRadioButton();
        b5z = new javax.swing.JRadioButton();
        b17z = new javax.swing.JRadioButton();
        b6z = new javax.swing.JRadioButton();
        b14z = new javax.swing.JRadioButton();
        b18z = new javax.swing.JRadioButton();
        b10z = new javax.swing.JRadioButton();
        jTextField1_q1z1 = new javax.swing.JTextField();
        jTextField1_q1z2 = new javax.swing.JTextField();
        jTextField1_q1z3 = new javax.swing.JTextField();
        jTextField1_q1z4 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jRadioButton1_q1z4.setBackground(new java.awt.Color(36, 47, 65));
        jRadioButton1_q1z4.setText("a");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1_q1z.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1_q1z.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z.setText("q2");
        jTextField1_q1z.setBorder(null);
        jTextField1_q1z.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1zActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 520, -1));

        b1z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1.add(b1z);
        b1z.setForeground(new java.awt.Color(255, 255, 255));
        b1z.setText("a ");
        jPanel1.add(b1z, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 40, -1));

        b2z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1.add(b2z);
        b2z.setForeground(new java.awt.Color(255, 255, 255));
        b2z.setText("b");
        jPanel1.add(b2z, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 40, -1));

        b9z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1_q2.add(b9z);
        b9z.setForeground(new java.awt.Color(255, 255, 255));
        b9z.setText("a");
        jPanel1.add(b9z, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 40, -1));

        b13z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup2.add(b13z);
        b13z.setForeground(new java.awt.Color(255, 255, 255));
        b13z.setText("a");
        jPanel1.add(b13z, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 40, 20));

        b5z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1_ans_q1.add(b5z);
        b5z.setForeground(new java.awt.Color(255, 255, 255));
        b5z.setText("a");
        jPanel1.add(b5z, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 40, -1));

        b17z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup5.add(b17z);
        b17z.setForeground(new java.awt.Color(255, 255, 255));
        b17z.setText("a");
        jPanel1.add(b17z, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 40, -1));

        b6z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1_ans_q1.add(b6z);
        b6z.setForeground(new java.awt.Color(255, 255, 255));
        b6z.setText("b");
        b6z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6zActionPerformed(evt);
            }
        });
        jPanel1.add(b6z, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 40, -1));

        b14z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup2.add(b14z);
        b14z.setForeground(new java.awt.Color(255, 255, 255));
        b14z.setText("b");
        jPanel1.add(b14z, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 40, -1));

        b18z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup5.add(b18z);
        b18z.setForeground(new java.awt.Color(255, 255, 255));
        b18z.setText("b");
        jPanel1.add(b18z, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 40, -1));

        b10z.setBackground(new java.awt.Color(0, 0, 51));
        buttonGroup1_q2.add(b10z);
        b10z.setForeground(new java.awt.Color(255, 255, 255));
        b10z.setText("b");
        jPanel1.add(b10z, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 40, -1));

        jTextField1_q1z1.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1_q1z1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z1.setText("q1 ");
        jTextField1_q1z1.setBorder(null);
        jTextField1_q1z1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 520, -1));

        jTextField1_q1z2.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1_q1z2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z2.setText("q4");
        jTextField1_q1z2.setBorder(null);
        jTextField1_q1z2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 540, -1));

        jTextField1_q1z3.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1_q1z3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z3.setText("q5");
        jTextField1_q1z3.setBorder(null);
        jTextField1_q1z3.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 550, -1));

        jTextField1_q1z4.setBackground(new java.awt.Color(0, 0, 51));
        jTextField1_q1z4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1_q1z4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1_q1z4.setText("q3");
        jTextField1_q1z4.setBorder(null);
        jTextField1_q1z4.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1_q1z4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_q1z4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_q1z4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 530, -1));

        jTextField4.setBackground(new java.awt.Color(0, 0, 51));
        jTextField4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText(" write choices");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 160, -1));

        jTextField6.setBackground(new java.awt.Color(0, 0, 51));
        jTextField6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText(" write choices");
        jTextField6.setBorder(null);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 150, -1));

        jTextField8.setBackground(new java.awt.Color(0, 0, 51));
        jTextField8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setText(" write choices");
        jTextField8.setBorder(null);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 160, -1));

        jTextField10.setBackground(new java.awt.Color(0, 0, 51));
        jTextField10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setText(" write choices");
        jTextField10.setBorder(null);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 160, -1));

        jTextField11.setBackground(new java.awt.Color(0, 0, 51));
        jTextField11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setText(" write choices");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, 20));

        jTextField12.setBackground(new java.awt.Color(0, 0, 51));
        jTextField12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setText(" write choices");
        jTextField12.setBorder(null);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 140, 20));

        jTextField14.setBackground(new java.awt.Color(0, 0, 51));
        jTextField14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setText(" write choices");
        jTextField14.setBorder(null);
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 140, -1));

        jTextField16.setBackground(new java.awt.Color(0, 0, 51));
        jTextField16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.setText(" write choices");
        jTextField16.setBorder(null);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 140, -1));

        jTextField18.setBackground(new java.awt.Color(0, 0, 51));
        jTextField18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(255, 255, 255));
        jTextField18.setText(" write choices");
        jTextField18.setBorder(null);
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 140, -1));

        jTextField20.setBackground(new java.awt.Color(0, 0, 51));
        jTextField20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(255, 255, 255));
        jTextField20.setText(" write choices");
        jTextField20.setBorder(null);
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 140, -1));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("submit quiz");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, 250, 50));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("upload quiz");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 680, 150, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quiz");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-home-40.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_q1zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1zActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1zActionPerformed

    private void b6zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6zActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b6zActionPerformed

    private void jTextField1_q1z1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z1ActionPerformed

    private void jTextField1_q1z2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z2ActionPerformed

    private void jTextField1_q1z3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z3ActionPerformed

    private void jTextField1_q1z4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_q1z4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_q1z4ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 
        int mark=0;
        if ( b1z.isSelected() && (c1.equals("a")))
        {  mark++;}

        if ( b2z.isSelected() && c1.equals("b"))
        {
            mark++;}
        if ( b5z.isSelected() && c2.equals("a"))
        mark++;
        if ( b6z.isSelected() && c2.equals("b"))
        mark++;
        if ( b9z.isSelected() && c3.equals("a"))
        mark++;
        if ( b10z.isSelected() && c3.equals("b"))
        mark++;
        if ( b13z.isSelected() && c4.equals("a"))
        mark++;
        if ( b14z.isSelected() && c4.equals("b"))
        mark++;

        if ( b17z.isSelected() && c5.equals("a"))
        mark++;
        if ( b18z.isSelected() && c5.equals("b"))
        mark++;
        if (mark==5){
             mp3player1.play();
            JOptionPane.showMessageDialog(this, mark+"/"+5+"FULL MARK CONGRATULATIONS");
        }
        else if (mark>=2)
        JOptionPane.showMessageDialog(this, mark+"/"+5);
        
        else {
            mp3player.play();
        JOptionPane.showMessageDialog(this, mark+"/"+5+" "+"TRY AGAIN");
        }
    }//GEN-LAST:event_jButton5ActionPerformed
 static String c1;
 static String c2;
 static String c3;
 static String c4;
 static String c5;
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            Scanner ss = new Scanner (new File("q1file.txt"));
            jTextField1_q1z1.setText(ss.nextLine());
            jTextField11.setText(ss.nextLine());
            jTextField12.setText(ss.nextLine());
             c1=ss.nextLine();

            jTextField1_q1z.setText(ss.nextLine());
            jTextField4.setText(ss.nextLine());
            jTextField14.setText(ss.nextLine());
             c2=ss.nextLine();

            jTextField1_q1z4.setText(ss.nextLine());
            jTextField6.setText(ss.nextLine());
            jTextField16.setText(ss.nextLine());
             c3=ss.nextLine();

            jTextField1_q1z2.setText(ss.nextLine());
            jTextField8.setText(ss.nextLine());
            jTextField18.setText(ss.nextLine());
            c4=ss.nextLine();

            jTextField1_q1z3.setText(ss.nextLine());
            jTextField10.setText(ss.nextLine());
            jTextField20.setText(ss.nextLine());
             c5=ss.nextLine();
            ss.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        
        jTextField1_q1z1.setEditable(false);
        jTextField1_q1z.setEditable(false);
        jTextField1_q1z2.setEditable(false);
        jTextField1_q1z3.setEditable(false);
        jTextField1_q1z4.setEditable(false);
        jTextField11.setEditable(false);
        jTextField12.setEditable(false);
        jTextField4.setEditable(false);
        jTextField14.setEditable(false);
        jTextField6.setEditable(false);
        jTextField16.setEditable(false);
        jTextField8.setEditable(false);
        jTextField18.setEditable(false);
        jTextField10.setEditable(false);
        jTextField20.setEditable(false);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SignInl s1=new SignInl();
                    s1.show();
                    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

       
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(q1_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(q1_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(q1_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(q1_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new q1_student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b10z;
    private javax.swing.JRadioButton b13z;
    private javax.swing.JRadioButton b14z;
    private javax.swing.JRadioButton b17z;
    private javax.swing.JRadioButton b18z;
    private javax.swing.JRadioButton b1z;
    private javax.swing.JRadioButton b2z;
    private javax.swing.JRadioButton b5z;
    private javax.swing.JRadioButton b6z;
    private javax.swing.JRadioButton b9z;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup1_ans_q1;
    private javax.swing.ButtonGroup buttonGroup1_q1;
    private javax.swing.ButtonGroup buttonGroup1_q2;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1_q1z4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField1_q1z;
    public javax.swing.JTextField jTextField1_q1z1;
    private javax.swing.JTextField jTextField1_q1z2;
    private javax.swing.JTextField jTextField1_q1z3;
    private javax.swing.JTextField jTextField1_q1z4;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
