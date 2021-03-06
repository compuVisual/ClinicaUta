
package GUI;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class Ingresar extends javax.swing.JFrame {
    
    public static String user = "uta";
    public static String pass = "0000";

    public Ingresar() {
        initComponents();
        
        FondoLogin F = new FondoLogin();  
        
        this.jPanel1.add(F,BorderLayout.CENTER);
        this.pack();   
    }        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cj_usuario = new javax.swing.JTextField();
        cj_pass = new javax.swing.JPasswordField();
        btn_entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESAR");

        cj_usuario.setBackground(new java.awt.Color(204, 255, 255));
        cj_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_usuarioKeyTyped(evt);
            }
        });

        cj_pass.setBackground(new java.awt.Color(204, 255, 255));
        cj_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_passKeyTyped(evt);
            }
        });

        btn_entrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_entrar.setText("Entrar");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_entrar)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(41, 41, 41)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cj_pass)
                                        .addComponent(cj_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cj_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cj_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_entrar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-371)/2, (screenSize.height-251)/2, 371, 251);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        // TODO add your handling code here:        
        String usuario = cj_usuario.getText().trim();        
        String contraseña = new String(cj_pass.getPassword());
        
        if( usuario.equalsIgnoreCase(user) && contraseña.equalsIgnoreCase(pass) )
            {
            Bienvenido b = new Bienvenido();
            b.setVisible(true);
            dispose();
            }
        else if( usuario.isEmpty() && contraseña.isEmpty() )
            {
            JOptionPane.showMessageDialog(null, "Ingrese Usuario y Contraseña");
            }
        else if( usuario != user && contraseña != pass )
            {
            JOptionPane.showMessageDialog(null, "Usuario y Contraseña Incorrectos", "Error Al Ingresar", JOptionPane.ERROR_MESSAGE);
            }
        else if( usuario != user )
            {
            JOptionPane.showMessageDialog(null, "Usuario Incorrecto", "Usuario No Existe", JOptionPane.ERROR_MESSAGE);
            }
        else if( contraseña != pass )
            {
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Contraseña Mal Escrita", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btn_entrarActionPerformed

    private void cj_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_usuarioKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if ( c == 10 )
            {
            cj_pass.requestFocus();
            }
    }//GEN-LAST:event_cj_usuarioKeyTyped

    private void cj_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_passKeyTyped
        // TODO add your handling code here:
        
        int c = evt.getKeyChar();
        if( c==10 )
        {
        String usuario = cj_usuario.getText().trim();        
        String contraseña = new String(cj_pass.getPassword());
        
        if( usuario.equalsIgnoreCase(user) && contraseña.equalsIgnoreCase(pass) )
            {
            Bienvenido b = new Bienvenido();
            b.setVisible(true);
            dispose();
            }
        else if( usuario.isEmpty() && contraseña.isEmpty() )
            {
            JOptionPane.showMessageDialog(null, "Ingrese Usuario y Contraseña");
            }
        else if( usuario != user && contraseña != pass )
            {
            JOptionPane.showMessageDialog(null, "Usuario y Contraseña Incorrectos", "Error Al Ingresar", JOptionPane.ERROR_MESSAGE);
            }
        else if( usuario != user )
            {
            JOptionPane.showMessageDialog(null, "Usuario Incorrecto", "Usuario No Existe", JOptionPane.ERROR_MESSAGE);
            }
        else if( contraseña != pass )
            {
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Contraseña Mal Escrita", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cj_passKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JPasswordField cj_pass;
    private javax.swing.JTextField cj_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
