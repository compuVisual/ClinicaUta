
package GUI;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import Clinica.Examenes;
import static Clinica.Contenedor_Examenes.*;
import static Clinica.Contenedor_Doctores.*;
import Clinica.Doctores;
import static Clinica.Contenedor_Pacientes.*;
import Clinica.Pacientes;
import java.util.Calendar;
import java.util.Date;

public class GUI_Examen extends javax.swing.JFrame {
    
     public static int j;
     DateFormat df = DateFormat.getDateInstance();

    public GUI_Examen() {
        initComponents();
                            
        item_NomDoc.addItem("Seleccione...");
                
        Doctores p;
        for (int i=0; i<ld.size(); i++)
            {
            p = (Doctores)ld.get(i);
            item_NomDoc.addItem(p.getNombre());
            }
    }
    
    public Examenes Buscar()
        {
        long bc = Long.parseLong(JOptionPane.showInputDialog(null, "Cedula Del Paciente"));
        Examenes e = null;
        for(int i=0; i<ces.size(); i++)
            {
            e = (Examenes)ces.get(i);
            if( bc == e.getCedPac() )
                {
                cj_CedPac.setText(""+bc);
                cj_NomPac.setText(e.getNomPac());
                item_NomDoc.setSelectedItem(e.getNomDoc());
                cj_CedDoc.setText(""+e.getCedDoc());
                cj_tipo.setText(e.getTipo());
                //cj_fecha.setd(c.getFechaCita());
                j = i;
                break;
                }
            else
                {
                e = null;
                }
            }
        return e;
        }
    
    void limpiar()
        {
        cj_CedPac.setText("");
        cj_NomPac.setText("");
        item_NomDoc.setSelectedIndex(0);
        cj_CedDoc.setText("");
        cj_tipo.setText("");
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cj_CedPac = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        item_NomDoc = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cj_NomPac = new javax.swing.JTextField();
        btn_asignar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cj_CedDoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cj_tipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cj_fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignar Cita");
        setResizable(false);

        cj_CedPac.setToolTipText("Ingrese Cedula Del Paciente");
        cj_CedPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cj_CedPacActionPerformed(evt);
            }
        });
        cj_CedPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_CedPacKeyTyped(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 0));
        jTextField1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Examen");

        item_NomDoc.setToolTipText("Seleccione Nombre De Doctor");
        item_NomDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_NomDocActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("C.I. Paciente:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Nombre Paciente:");

        cj_NomPac.setToolTipText("Nombre Del Paciente");

        btn_asignar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_asignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/GuardarTodo.png"))); // NOI18N
        btn_asignar.setToolTipText("Asignar Cita");
        btn_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignarActionPerformed(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa.png"))); // NOI18N
        btn_buscar.setToolTipText("Buscar Cita");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/borrar.png"))); // NOI18N
        btn_cancelar.setToolTipText("Cancelar Cita");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("C.C Doctor:");

        cj_CedDoc.setToolTipText("Cedula De Doctor");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Nombre Doctor:");

        cj_tipo.setToolTipText("Tipo De Doctor");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Fecha De Examen:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cj_NomPac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(cj_CedPac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(cj_CedDoc, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(item_NomDoc, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cj_tipo, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(cj_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btn_asignar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cj_CedPac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cj_NomPac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_NomDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cj_CedDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cj_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cj_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_asignar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        setSize(new java.awt.Dimension(396, 441));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignarActionPerformed
           // TODO add your handling code here:                                    
        if(cj_CedPac.getText().isEmpty() || cj_NomPac.getText().isEmpty() || item_NomDoc.getSelectedItem().equals("Seleccione...") || cj_CedPac.getText().isEmpty())
            {
            JOptionPane.showMessageDialog(null, "Complete Todos Los Campos");
            }
        else
        {
        long CedPac = Long.parseLong(cj_CedPac.getText().trim());
        String NomPac = cj_NomPac.getText().trim();
        String NomDoc = item_NomDoc.getSelectedItem().toString();
        long CedDoc = Long.parseLong(cj_CedDoc.getText().trim());
        String tipo = cj_tipo.getText().trim();
        Date fecha = cj_fecha.getDate();
        
        Examenes e;
        e = new Examenes(CedPac, NomPac, NomDoc, CedDoc, tipo, fecha);
        ces .add(e);
        JOptionPane.showMessageDialog(null, "Examen Asiganado Para El Dia "+fecha+" Por Favor, No Faltes !:D");
        limpiar();
        cj_CedPac.requestFocus();
        }
    }//GEN-LAST:event_btn_asignarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        if(Buscar()== null)
            {
            JOptionPane.showMessageDialog(null, "Examen No Existe");
            }                   
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        long resp = JOptionPane.showConfirmDialog(this,"Desea Eliminar el examen Asignado?","",JOptionPane.YES_NO_OPTION );
        if( resp == JOptionPane.YES_OPTION)
        {
        ces.remove(j);
        JOptionPane.showMessageDialog(null, "Examen Eliminada");
        limpiar();
        }
        else
            {
            JOptionPane.showMessageDialog(null, "Eliminadion Cancelada");
            }
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void cj_CedPacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_CedPacKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if( c == 10 )
        {            
            if(cp.isEmpty())
                {
                JOptionPane.showMessageDialog(null, "No Hay Ningun Paciente Registrado");
                }
            if(cj_CedPac.getText().isEmpty())
                {
                JOptionPane.showMessageDialog(rootPane, "El Campo De Cedula Esta Vacio");
                } 
            
                long CedPac = Long.parseLong(cj_CedPac.getText().trim());
                Pacientes p = new Pacientes(CedPac);
                for (int i=0; i<cp.size(); i++)
                    {
                        p = (Pacientes)cp.get(i);
                        if( CedPac == p.getCedula() )
                            {
                                cj_NomPac.setText(p.getNombre());                                
                            }
                    }
            }                       
    }//GEN-LAST:event_cj_CedPacKeyTyped

    private void item_NomDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_NomDocActionPerformed
        // TODO add your handling code here:
        String NomDoc = item_NomDoc.getSelectedItem().toString();
        Doctores d;
        for(int i=0; i<ld.size(); i++)
            {
            d = (Doctores)ld.get(i);
            if( NomDoc == d.getNombre() )
                {
                cj_CedDoc.setText(""+d.getCedula());
                cj_tipo.setText(d.getTipo());
                break;
                }
            }
        
    }//GEN-LAST:event_item_NomDocActionPerformed

    private void cj_CedPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj_CedPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cj_CedPacActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Examen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_asignar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JTextField cj_CedDoc;
    private javax.swing.JTextField cj_CedPac;
    private javax.swing.JTextField cj_NomPac;
    private com.toedter.calendar.JDateChooser cj_fecha;
    private javax.swing.JTextField cj_tipo;
    private javax.swing.JComboBox item_NomDoc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
