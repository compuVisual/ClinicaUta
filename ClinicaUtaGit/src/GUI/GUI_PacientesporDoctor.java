
package GUI;

import Clinica.Doctores;
import static Clinica.Contenedor_Doctores.*;
import javax.swing.table.DefaultTableModel;
import static Clinica.Contenedor_Examenes.*;
import Clinica.Examenes;

public class GUI_PacientesporDoctor extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    int con = 0;

    public GUI_PacientesporDoctor() {
        initComponents();
        
        item_nombre.addItem("Seleccione...");
        
        item_tipo.addItem("Seleccione...");
        item_tipo.addItem("Medico General");
        item_tipo.addItem("Especialista");
       
        String data[][] = {};
        String col[] = {"CEDULA","NOMBRE"};
        model = new DefaultTableModel(data,col);
        datos.setModel(model);
        
        //MOSTRAR LOS NOMBRES DE LOS DOCTORES EN EL ITEM DOCTORES
        Doctores d;
        for(int i=0; i<ld.size(); i++)
            {
            d = (Doctores)ld.get(i);
            item_nombre.addItem(d.getNombre());            
            }               
    }        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        item_nombre = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        btn_nombre = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        item_tipo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        btn_tipo = new javax.swing.JButton();
        lbl_cedula = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_ci = new javax.swing.JButton();
        item_CI = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pacientes Por Doctor");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Por Nombre:");

        item_nombre.setToolTipText("Seleccione Doctor");

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        datos.setToolTipText("Tabla Con Nombre De Pacientes");
        jScrollPane1.setViewportView(datos);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 204, 51));
        jTextField2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("LISTA DE PACIENTES POR DOCTOR ");
        jTextField2.setToolTipText("Lista De Pacientes Por Doctor");
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_nombre.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_nombre.setText("VER");
        btn_nombre.setToolTipText("Ver Pacientes");
        btn_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nombreActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 255, 0));
        jTextField1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("VER PACIENTES POR:");

        item_tipo.setToolTipText("Seleccione Doctor");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Por Tipo de Examen:");

        btn_tipo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_tipo.setText("VER");
        btn_tipo.setToolTipText("Ver Pacientes");
        btn_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tipoActionPerformed(evt);
            }
        });

        lbl_cedula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_cedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("C.I");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Por C.I");

        btn_ci.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_ci.setText("VER");
        btn_ci.setToolTipText("Ver Pacientes");
        btn_ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ciActionPerformed(evt);
            }
        });

        item_CI.setToolTipText("Seleccione Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(item_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                        .addComponent(lbl_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(item_CI, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_ci)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(item_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_nombre)
                                .addGap(125, 125, 125))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_tipo)
                                .addGap(123, 123, 123)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(item_CI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(btn_ci)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(item_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(btn_nombre)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addComponent(btn_tipo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(850, 483));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nombreActionPerformed
        // TODO add your handling code here:       
        String nom = item_nombre.getSelectedItem().toString();
        model.setNumRows(con);
        Examenes e;
        for(int i=0; i<ces.size(); i++)
            {
            e = (Examenes)ces.get(i);
            if(nom == e.getNomDoc() )
                {
                lbl_cedula.setText(""+e.getCedDoc());
                model.insertRow(con,new Object[]{});
                model.setValueAt(e.getCedPac(), con, 0);  // ACTUALIZA LA CELDA CON EL VALOR DE CAMPO OBTENIDO
                model.setValueAt(e.getNomPac(), con, 1);             
                //con++; 
                }         
            }  
        
    }//GEN-LAST:event_btn_nombreActionPerformed

    private void btn_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tipoActionPerformed
        // TODO add your handling code here:
        int tipo = item_tipo.getSelectedIndex();   //M.G. ESP.                        
        model.setNumRows(con);
        String mg = "";
        Examenes e;
        if(tipo == 1)
            {
            mg = "Medico General";
            }
        else if( tipo == 2 )
            {
            mg = "Especialista";
            }
        
        for (int i=0; i<ces.size(); i++)
            {
                e = (Examenes)ces.get(i);                                
                    if( e.getTipo().equals(mg) )
                        {
                        model.insertRow(con, new Object[]{});
                        model.setValueAt(e.getCedPac(), con, 0);
                        model.setValueAt(e.getNomPac(), con, 1);
                        }                                                                                                                    
            } 
    }//GEN-LAST:event_btn_tipoActionPerformed

    private void btn_ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ciActionPerformed
        // TODO add your handling code here:
        String nom = item_CI.getSelectedItem().toString();
        model.setNumRows(con);
        Examenes e;
        for(int i=0; i<ces.size(); i++)
            {
            e = (Examenes)ces.get(i);
            if(nom == e.getNomDoc() )
                {
                model.insertRow(con,new Object[]{});
                model.setValueAt(e.getCedPac(), con, 0);  // ACTUALIZA LA CELDA CON EL VALOR DE CAMPO OBTENIDO
                model.setValueAt(e.getNomPac(), con, 1);             
                //con++; 
                }         
            }  
    }//GEN-LAST:event_btn_ciActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_PacientesporDoctor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ci;
    private javax.swing.JButton btn_nombre;
    private javax.swing.JButton btn_tipo;
    private javax.swing.JTable datos;
    private javax.swing.JComboBox item_CI;
    private javax.swing.JComboBox item_nombre;
    private javax.swing.JComboBox item_tipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl_cedula;
    // End of variables declaration//GEN-END:variables
}
