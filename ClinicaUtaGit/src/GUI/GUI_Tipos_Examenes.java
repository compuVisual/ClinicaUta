
package GUI;
import static Clinica.Contenedor_Tipos_Examenes.*;
import Clinica.Tipos_Examenes;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class GUI_Tipos_Examenes extends javax.swing.JFrame {
    
    public static int j;

    public GUI_Tipos_Examenes() {
        initComponents();                    
    }
    
    void limpiar()
        {
        cj_id.setText("");
        cj_nombre.setText("");
        cj_DESCR.setText("");
        }
    
    public Tipos_Examenes Buscar()
        {
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese ID DeL Tipo_Examen"));
        Tipos_Examenes a = null;
        for(int i=0; i<cte.size(); i++)
            {
            a = (Tipos_Examenes)cte.get(i);
            if(id == a.getIdTipoExamen())
                {
                cj_id.setText(""+id);
                cj_nombre.setText(a.getNombreExamen());
                cj_DESCR.setText(a.getDescripcionExamen());
                j = i;
                break;
                }
            else
                {
                a = null;
                }
            }
        return a;
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cj_id = new javax.swing.JTextField();
        cj_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_modificar1 = new javax.swing.JButton();
        btn_modificar2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cj_DESCR = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignar Tipos De Examenes");
        setResizable(false);

        jLabel1.setText("Id. Del Tipo de Examen:");

        cj_id.setToolTipText("Digite Id. Area");
        cj_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cj_idActionPerformed(evt);
            }
        });
        cj_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_idKeyTyped(evt);
            }
        });

        cj_nombre.setToolTipText("Escriba El Nombre De Area");
        cj_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cj_nombreActionPerformed(evt);
            }
        });
        cj_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_nombreKeyTyped(evt);
            }
        });

        jLabel2.setText("NOMBRE DEL TIPO DE EXAMEN:");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(153, 153, 0));
        jTextField3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Tipos de Examenes");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/GuardarTodo.png"))); // NOI18N
        btn_guardar.setToolTipText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mantenimiento.png"))); // NOI18N
        btn_modificar.setToolTipText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa.png"))); // NOI18N
        btn_buscar.setToolTipText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_modificar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar.png"))); // NOI18N
        btn_modificar1.setToolTipText("Cancelar");
        btn_modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar1ActionPerformed(evt);
            }
        });

        btn_modificar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir.png"))); // NOI18N
        btn_modificar2.setToolTipText("Salir");
        btn_modificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar2ActionPerformed(evt);
            }
        });

        jLabel3.setText("DESCRIPCION:");

        cj_DESCR.setToolTipText("Escriba El Nombre De Area");
        cj_DESCR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_DESCRKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(btn_modificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btn_modificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cj_DESCR, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(cj_id, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cj_nombre))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cj_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cj_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cj_DESCR, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_modificar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_modificar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(569, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        
        int id = Integer.parseInt(this.cj_id.getText().trim());
        String nombre = cj_nombre.getText().trim();
        String descripcion = cj_DESCR.getText().trim();
        Tipos_Examenes a = new Tipos_Examenes(id, nombre, descripcion);
        cte.add(a);
        JOptionPane.showMessageDialog(null, "Examen Guardado");
        limpiar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        if(Buscar() == null)
            {
            JOptionPane.showMessageDialog(null, "Examen NO EXISTENTE");
            }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(cj_id.getText().trim());
        String nombre = cj_nombre.getText().trim();
        String descripcion = cj_DESCR.getText().trim();
        Tipos_Examenes a = new Tipos_Examenes(id, nombre, descripcion);
        cte.add(a);
        cte.set(j, a);
        JOptionPane.showMessageDialog(null, "Examen Modificado");
        limpiar();
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar1ActionPerformed
        // TODO add your handling code here:
        limpiar();
        btn_guardar.transferFocus();
    }//GEN-LAST:event_btn_modificar1ActionPerformed

    private void cj_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_nombreKeyTyped
        // TODO add your handling code here:
        String tipos_examenes = cj_nombre.getText();
        tipos_examenes = tipos_examenes.toUpperCase();
        cj_nombre.setText(tipos_examenes);
        int c = evt.getKeyChar();
        if( c == 10 )
            {
            btn_guardar.requestFocus();
            }
    }//GEN-LAST:event_cj_nombreKeyTyped

    private void cj_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_idKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if (  c == 10 )
            {
            cj_nombre.requestFocus();
            }
    }//GEN-LAST:event_cj_idKeyTyped

    private void btn_modificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_modificar2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void cj_DESCRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_DESCRKeyTyped
        // TODO add your handling code here:
        String tipos_examenes = cj_DESCR.getText();
        tipos_examenes = tipos_examenes.toUpperCase();
        cj_DESCR.setText(tipos_examenes);
        int c = evt.getKeyChar();
        if( c == 10 )
            {
            btn_guardar.requestFocus();
            }
    }//GEN-LAST:event_cj_DESCRKeyTyped

    private void cj_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cj_idActionPerformed

    private void cj_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cj_nombreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Tipos_Examenes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_modificar1;
    private javax.swing.JButton btn_modificar2;
    private javax.swing.JTextField cj_DESCR;
    private javax.swing.JTextField cj_id;
    private javax.swing.JTextField cj_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
