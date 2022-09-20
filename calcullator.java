

package calculator1;

/**
 *
 * @author VIPUN SANJANA
 */
public class calculator1 extends javax.swing.JFrame {

   
    public calculator1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btnequl = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        lblerror = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnplus = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnmul = new javax.swing.JButton();
        btnmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        btn2.setText("2");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });

        btn3.setText("3");
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });

        btn4.setText("4");
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });

        btn5.setText("5");
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });

        btn6.setText("6");
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });

        btn7.setText("7");
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });

        btn8.setText("8");
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });

        btn9.setText("9");
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });

        btndot.setText(".");
        btndot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndotMouseClicked(evt);
            }
        });

        btnequl.setText("=");
        btnequl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnequlMouseClicked(evt);
            }
        });

        btn0.setText("0");
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });

        btnclear.setText("clear");
        btnclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclearMouseClicked(evt);
            }
        });

        btnplus.setText("+");
        btnplus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnplusMouseClicked(evt);
            }
        });

        btnsub.setText("-");
        btnsub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsubMouseClicked(evt);
            }
        });

        btndiv.setText("/");
        btndiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndivMouseClicked(evt);
            }
        });

        btnmul.setText("x");
        btnmul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmulMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnplus, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(btnsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnplus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsub)
                .addGap(18, 18, 18)
                .addComponent(btndiv)
                .addGap(18, 18, 18)
                .addComponent(btnmul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnmin.setText("-");
        btnmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnequl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btndot)
                    .addComponent(btnequl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear)
                    .addComponent(lblerror)
                    .addComponent(btnmin))
                .addContainerGap(55, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("CALCULATOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtText, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtTextActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
    }                                       

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {                                  
        
        String txt=txtText.getText()+"1";
        txtText.setText(txt);
    }                                 

    private void btnclearMouseClicked(java.awt.event.MouseEvent evt) {                                      
        
        txtText.setText("");
    }                                     

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {                                  
        
        String txt=txtText.getText()+"2";
        txtText.setText(txt);
    }                                 

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {                                  
    
        String txt=txtText.getText()+"3";
        txtText.setText(txt);
    }                                 

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {                                  
     
        String txt=txtText.getText()+"4";
        txtText.setText(txt);
    }                                 

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {                                  
      
        String txt=txtText.getText()+"5";
        txtText.setText(txt);
    }                                 

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {                                  
     
        String txt=txtText.getText()+"6";
        txtText.setText(txt);
    }                                 

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {                                  
      
        String txt=txtText.getText()+"7";
        txtText.setText(txt);
    }                                 

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {                                  
       
        String txt=txtText.getText()+"8";
        txtText.setText(txt);
    }                                 

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {                                  
      
        String txt=txtText.getText()+"9";
        txtText.setText(txt);
    }                                 

    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {                                  
       
        String txt=txtText.getText()+"0";
        txtText.setText(txt);
    }                                 

    private void btndotMouseClicked(java.awt.event.MouseEvent evt) {                                    
        
        String txt=txtText.getText()+".";
        txtText.setText(txt);
    }                                   
    private double total=0;
    private char mathoperator;
    
    private void btnplusMouseClicked(java.awt.event.MouseEvent evt) {                                     
       
        mathoperator=btnplus.getText().charAt(0);
        total+=Double.parseDouble(txtText.getText());
        txtText.setText("");
    }                                    

    private void btnequlMouseClicked(java.awt.event.MouseEvent evt) {                                     
        
        switch(mathoperator){
            case '+':
                total+=Double.parseDouble(txtText.getText());
                txtText.setText( Double.toString(total));
                total=0;
                break;
                
            case '-':
                total-=Double.parseDouble(txtText.getText());
                txtText.setText( Double.toString(total));
                total=0;
                break;
                
            case 'x':
                total*=Double.parseDouble(txtText.getText());
                txtText.setText( Double.toString(total));
                total=0;
                break;
                
            case '/':
                total/=Double.parseDouble(txtText.getText());
                txtText.setText( Double.toString(total));
                total=0;
                break;  
        }      
        
    }                                    
    
    private void btnsubMouseClicked(java.awt.event.MouseEvent evt) {                                    
       
        mathoperator=btnsub.getText().charAt(0);
        total+=Double.parseDouble(txtText.getText());
        txtText.setText("");
    }                                   

    private void btnmulMouseClicked(java.awt.event.MouseEvent evt) {                                    
        
        mathoperator=btnmul.getText().charAt(0);
        total+=Double.parseDouble(txtText.getText());
        txtText.setText("");
    }                                   

    private void btndivMouseClicked(java.awt.event.MouseEvent evt) {                                    
        
        mathoperator=btndiv.getText().charAt(0);
        total+=Double.parseDouble(txtText.getText());
        txtText.setText("");
    }                                   

    private void btnminMouseClicked(java.awt.event.MouseEvent evt) {                                    
        
        String txt=txtText.getText()+"-";
        txtText.setText(txt);
    }                                   

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
            java.util.logging.Logger.getLogger(calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btnequl;
    private javax.swing.JButton btnmin;
    private javax.swing.JButton btnmul;
    private javax.swing.JButton btnplus;
    private javax.swing.JButton btnsub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblerror;
    private javax.swing.JTextField txtText;
    // End of variables declaration                   
}
