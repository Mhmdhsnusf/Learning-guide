/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed2
 */
public class Studente extends javax.swing.JFrame {

    /**
     * Creates new form Studente
     */
    public Studente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jp1e1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        TE1 = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        b1e = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AE4 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        TE2 = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        TE3 = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        b2e = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jp1e1.setBackground(new java.awt.Color(36, 47, 65));

        jPanel16.setBackground(new java.awt.Color(36, 47, 65));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "If yout want to Enter a new Question", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(97, 212, 195))); // NOI18N

        TE1.setBackground(new java.awt.Color(36, 47, 65));
        TE1.setForeground(new java.awt.Color(97, 212, 195));
        TE1.setBorder(null);
        TE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE1ActionPerformed(evt);
            }
        });

        jSeparator28.setBackground(new java.awt.Color(36, 47, 65));

        jLabel27.setBackground(new java.awt.Color(97, 212, 195));
        jLabel27.setForeground(new java.awt.Color(97, 212, 195));
        jLabel27.setText("Enter your Qestion :");

        b1e.setBackground(new java.awt.Color(36, 47, 65));
        b1e.setForeground(new java.awt.Color(97, 212, 195));
        b1e.setText("Submit");
        b1e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1eActionPerformed(evt);
            }
        });

        AE4.setColumns(20);
        AE4.setRows(5);
        jScrollPane1.setViewportView(AE4);

        jButton1.setBackground(new java.awt.Color(36, 47, 65));
        jButton1.setForeground(new java.awt.Color(97, 212, 195));
        jButton1.setText("show all questions");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(36, 47, 65));
        jButton2.setForeground(new java.awt.Color(97, 212, 195));
        jButton2.setText("show all answers");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(36, 47, 65));
        jButton3.setForeground(new java.awt.Color(97, 212, 195));
        jButton3.setText("show both");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(72, 72, 72))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TE1)
                                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b1e, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TE1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b1e)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(36, 47, 65));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "If yout want to search for an old Question", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(97, 212, 195))); // NOI18N

        TE2.setBackground(new java.awt.Color(36, 47, 65));
        TE2.setForeground(new java.awt.Color(97, 212, 195));
        TE2.setBorder(null);
        TE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE2ActionPerformed(evt);
            }
        });

        jSeparator30.setBackground(new java.awt.Color(36, 47, 65));

        jLabel29.setBackground(new java.awt.Color(97, 212, 195));
        jLabel29.setForeground(new java.awt.Color(97, 212, 195));
        jLabel29.setText("Enter your Qestion :");

        TE3.setBackground(new java.awt.Color(36, 47, 65));
        TE3.setForeground(new java.awt.Color(97, 212, 195));
        TE3.setBorder(null);
        TE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TE3ActionPerformed(evt);
            }
        });

        jSeparator31.setBackground(new java.awt.Color(36, 47, 65));

        jLabel30.setBackground(new java.awt.Color(97, 212, 195));
        jLabel30.setForeground(new java.awt.Color(97, 212, 195));
        jLabel30.setText("the Answer for your Question is :");

        b2e.setBackground(new java.awt.Color(36, 47, 65));
        b2e.setForeground(new java.awt.Color(97, 212, 195));
        b2e.setText("Submit");
        b2e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2eActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TE2)
                                .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(b2e, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TE3)
                            .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TE2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b2e)
                .addGap(43, 43, 43)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TE3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(36, 47, 65));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-home-40.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp1e1Layout = new javax.swing.GroupLayout(jp1e1);
        jp1e1.setLayout(jp1e1Layout);
        jp1e1Layout.setHorizontalGroup(
            jp1e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1e1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jp1e1Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jp1e1Layout.setVerticalGroup(
            jp1e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1e1Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp1e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp1e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jp1e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TE1ActionPerformed

    private void TE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TE2ActionPerformed

    private void TE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TE3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TE3ActionPerformed
    int x=1,y=2,k=1,l=1;
    private void b1eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1eActionPerformed
        try{
                FileWriter fw=new FileWriter("project.txt");
                PrintWriter pw =new PrintWriter(fw);
//                String a=Integer.toString(x);
//                String b=Integer.toString(y);
                pw.println("1"+TE1.getText()+"2");  
                pw.close();
            }catch(Exception e)
            {
                e.getMessage();
            }
        //for next button
        
                try{
                FileWriter fw=new FileWriter("next.txt",true);
                PrintWriter pw =new PrintWriter(fw);
               
//                String a=Integer.toString(x );
//                String b=Integer.toString(y);
                pw.println(TE1.getText());
                    pw.close();

            }catch(Exception e)
            {
                e.getMessage();
            }
        try{
                FileWriter fw=new FileWriter("project1.txt",true);
                PrintWriter pw =new PrintWriter(fw);
                pw.println("Question :"+TE1.getText());  
                pw.close();
            }catch(Exception e)
            {
                e.getMessage();
            }
         
        try{
                FileWriter fw=new FileWriter("question1.txt");
                PrintWriter pw =new PrintWriter(fw);

//                String a=Integer.toString(x);
//                String b=Integer.toString(y);
                pw.println("1"+TE1.getText()+"2"); 
                pw.close();
            }catch(Exception e)
            {
                e.getMessage();
            }
         try{
                FileWriter fw=new FileWriter("Qeustions.txt",true);
                PrintWriter pw =new PrintWriter(fw);

                pw.println("Question :"+TE1.getText());
                
                pw.close();
            }catch(Exception e)
            {
                e.getMessage();
            }
    }//GEN-LAST:event_b1eActionPerformed

    private void b2eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2eActionPerformed
        try{
            FileReader fr=new FileReader("project.txt");
            Scanner in =new Scanner(fr);
            String str ="";
            
            while(in.hasNext())
            {
                str=str.concat(in.nextLine());
                
            }
                String a=Integer.toString(x);
                String b=Integer.toString(y);
               
               String str2=str.substring(str.indexOf("@")+1,str.indexOf("#"));
               while(in.hasNext())
            {
                str=str.concat(in.nextLine());
            }
            String str4=str.substring(str.indexOf(a)+1,str.indexOf(b));
               if(TE2.getText().equals(str4))
               {  
                TE3.setText(str2);
               }else 
               {TE3.setText("no response yet");}
             
               x+=2;
               y+=2;
            in.close();
        }catch(Exception e)
        {
            e.getMessage();
        }
    }//GEN-LAST:event_b2eActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            FileReader fr=new FileReader("Qeustions.txt");
            Scanner in =new Scanner(fr);

                while(in.hasNext())
                  {
                       AE4.append(in.nextLine()+"\n");
                       
                  }
                in.close();
            }catch(Exception e)
            {
                e.getMessage();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
            FileReader fr=new FileReader("Answers.txt");
            Scanner in =new Scanner(fr);

                while(in.hasNext())
                  {
                       AE4.append(in.nextLine()+"\n");
                       
                  }
                in.close();
            }catch(Exception e)
            {
                e.getMessage();
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            FileReader fr=new FileReader("project1.txt");
            Scanner in =new Scanner(fr);

                while(in.hasNext())
                  {
                       AE4.append(in.nextLine()+"\n");
                       
                  }
                in.close();
            }catch(Exception e)
            {
                e.getMessage();
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         SignInl s1=new SignInl();
                    s1.show();
                    dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Studente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AE4;
    private javax.swing.JTextField TE1;
    private javax.swing.JTextField TE2;
    private javax.swing.JTextField TE3;
    private javax.swing.JButton b1e;
    private javax.swing.JButton b2e;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JPanel jp1e1;
    // End of variables declaration//GEN-END:variables
}
