
package GUI;
import Clinica.Doctores;
import static Clinica.Contenedor_Doctores.*;
import javax.swing.JOptionPane;
import Clinica.Tipos_Examenes;
import static Clinica.Contenedor_Tipos_Examenes.*;
import Clinica.GenerarExcel;
import java.sql.Connection;

public class GUI_Doctores extends javax.swing.JFrame {        
    Conectar con;
    public static int Encontrado;

    public GUI_Doctores() {
        initComponents();                               
        
        this.item_tipo.addItem("Seleccione...");
        this.item_tipo.addItem("Medico General");
        this.item_tipo.addItem("Especialista");
        CargarInicio();
        
       item_tiposE.addItem("Seleccione..."); 
       Tipos_Examenes a;
       for(int i=0; i<cte.size(); i++)
        {
        a = (Tipos_Examenes)cte.get(i);
        item_tiposE.addItem(a.getNombreExamen());        
        }
    }    
    
    public Doctores Buscar()
        {
        Doctores p = null;
        long ced = Long.parseLong(JOptionPane.showInputDialog(cj_cedula.getText().trim()));
        {
            for (int i = 0; i<ld.size(); i++)
                {
                p = (Doctores)ld.get(i);
                if(ced == p.getCedula() )
                    {
                    cj_cedula.setText(String.valueOf(ced));
                    cj_nombre.setText(p.getNombre());
                    cj_telefono.setText(p.getTelefono());
                    item_tipo.setSelectedItem(p.getTipo());
                    item_tiposE.setSelectedItem(p.getExamenes());
                    Encontrado = i;
                    cj_cedula.setEnabled(true);
                    cj_nombre.setEnabled(true);
                    cj_telefono.setEnabled(true);
                    item_tipo.setEnabled(true);
                    btn_eliminar.setEnabled(true);
                    btn_modificar.setEnabled(true);
                    btn_cancelar.setEnabled(true);
                    btn_ListaDoctores.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Busqueda Finalizada");
                    break;
                    }
                else
                    {
                    p = null;
                    }
                }
            return p;
        }      
}
    
    void Guardado()
        {      
        cj_cedula.setEnabled(false);
        cj_nombre.setEnabled(false);
        cj_telefono.setEnabled(false);
        item_tipo.setEnabled(false);  
        item_tiposE.setEnabled(false);  
        btn_buscar.setEnabled(true);
        btn_cancelar.setEnabled(false);
        btn_nuevo.setEnabled(true);
        btn_guardar.setEnabled(false);
        btn_ListaDoctores.setEnabled(true);
        }
    
    void limpiar()
        {
        cj_cedula.setText("");
        cj_nombre.setText("");
        cj_telefono.setText("");
        item_tipo.setSelectedIndex(0);
        }  
    
    void CargarInicio()
        {
        if(ld.isEmpty())
            {
            cj_cedula.setEnabled(false);
            cj_nombre.setEnabled(false);
            cj_telefono.setEnabled(false);
            item_tipo.setEnabled(false);
            item_tiposE.setEnabled(false);
            btn_cancelar.setEnabled(false);
            btn_guardar.setEnabled(false);
            btn_buscar.setEnabled(false);
            btn_modificar.setEnabled(false);
            btn_eliminar.setEnabled(false);
            btn_ListaDoctores.setEnabled(false);
            btn_archivos.setEnabled(false);
            }
        else if (!ld.isEmpty())
            {
            cj_cedula.setEnabled(true);
            btn_nuevo.setEnabled(true);
            btn_buscarPrimero.setEnabled(true);
            btn_buscar.setEnabled(true);
            btn_salir.setEnabled(true);
            btn_ListaDoctores.setEnabled(true);
            btn_archivos.setEnabled(true);
            }
        
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cj_telefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        item_tipo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cj_nombre = new javax.swing.JTextField();
        cj_cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_buscarPrimero = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        item_tiposE = new javax.swing.JComboBox();
        btn_nuevo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_ListaDoctores = new javax.swing.JButton();
        btn_archivos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro De Doctores");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 0));
        jTextField1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("REGISTRAR DOCTORES");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("NOMBRE:");

        cj_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_telefonoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("TIPO:");

        item_tipo.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        item_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_tipoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("TELEFONO");

        cj_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_nombreKeyTyped(evt);
            }
        });

        cj_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_cedulaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("N° CEDULA:");

        btn_buscarPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        btn_buscarPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarPrimeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cj_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cj_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscarPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(cj_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscarPrimero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cj_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cj_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cj_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(item_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("TIPOS EXAMENES:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(item_tiposE, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item_tiposE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nuevo.png"))); // NOI18N
        btn_nuevo.setToolTipText("Crear Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar.png"))); // NOI18N
        btn_cancelar.setToolTipText("Cancelar Registro");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/GuardarTodo.png"))); // NOI18N
        btn_guardar.setToolTipText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa.png"))); // NOI18N
        btn_buscar.setToolTipText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mantenimiento.png"))); // NOI18N
        btn_modificar.setToolTipText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/borrar.png"))); // NOI18N
        btn_eliminar.setToolTipText("Borrar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir.png"))); // NOI18N
        btn_salir.setToolTipText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_ListaDoctores.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_ListaDoctores.setText("MOSTRAR LISTA DE DOCTORES");
        btn_ListaDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaDoctoresActionPerformed(evt);
            }
        });

        btn_archivos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_archivos.setText("GENERAR ARCHIVOS CON EXTENSION .XLS .TXT");
        btn_archivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_archivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_ListaDoctores)
                                .addGap(59, 59, 59)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_archivos)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ListaDoctores)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_archivos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(452, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:  
            long ced = Long.parseLong(cj_cedula.getText().trim());
            String nom = cj_nombre.getText().trim();
            String tel = cj_telefono.getText().trim();
            String tipo = item_tipo.getSelectedItem().toString();            
            String tiposE = item_tiposE.getSelectedItem().toString();
        Doctores p = new Doctores(ced, nom, tel, tipo, tiposE);
        ld.add(p);
        JOptionPane.showMessageDialog(null, "Registro Guardado Con Exito");
        limpiar();
        Guardado();                                   
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
        
        limpiar();
        if(ld.isEmpty())
        {
            cj_cedula.requestFocus();
            cj_cedula.setEnabled(true);
            cj_nombre.setEnabled(true);                        
            cj_telefono.setEnabled(true);
            item_tipo.setEnabled(true);  
            item_tiposE.setEnabled(true);
            btn_guardar.setEnabled(true);
            btn_cancelar.setEnabled(true);
            btn_salir.setEnabled(true);
            btn_nuevo.setEnabled(false);           
        }
        else
        {
            cj_cedula.setEnabled(true);
            cj_nombre.setEnabled(true);                        
            cj_telefono.setEnabled(true);
            item_tipo.setEnabled(true);
            item_tiposE.setEnabled(true);
            btn_guardar.setEnabled(true);
            btn_cancelar.setEnabled(true);
            btn_salir.setEnabled(true);
            btn_nuevo.setEnabled(false);
            btn_buscar.setEnabled(true);
            btn_modificar.setEnabled(false);
            btn_eliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        limpiar();        
        if(ld.isEmpty())
            {
            btn_nuevo.setEnabled(true);
            btn_salir.setEnabled(true);
            cj_cedula.setEnabled(false);
            cj_nombre.setEnabled(false);
            cj_telefono.setEnabled(false);
            item_tipo.setEnabled(false);
            item_tiposE.setEnabled(false);
            btn_guardar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            btn_modificar.setEnabled(false);
            btn_buscar.setEnabled(false);
            btn_eliminar.setEnabled(false);
            }
        else
            {
            btn_nuevo.setEnabled(true);
            btn_salir.setEnabled(true);
            btn_buscarPrimero.setEnabled(true);
            btn_buscar.setEnabled(true);
            cj_cedula.setEnabled(true);
            cj_nombre.setEnabled(false);
            cj_telefono.setEnabled(false);
            item_tipo.setEnabled(false);
            item_tiposE.setEnabled(true);
            btn_guardar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            btn_modificar.setEnabled(false);          
            btn_eliminar.setEnabled(false);
            }
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        if(Buscar() == null)
            {
            JOptionPane.showMessageDialog(null, "Usuario No Existe");
            }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        long confirmar = JOptionPane.showConfirmDialog(this,"Seguro Que Desea Modificar El Registro","",JOptionPane.YES_NO_OPTION );
        
        if(confirmar == JOptionPane.YES_OPTION)
        {
        long ced = Long.parseLong(cj_cedula.getText().trim());
        String nom = cj_nombre.getText().trim();
        String tel = cj_telefono.getText().trim();
        String tipo = item_tipo.getSelectedItem().toString();
        
        Doctores p = new Doctores(ced, nom, tel, tipo);
        ld.set(Encontrado, p);
        limpiar();
        Guardado();
        JOptionPane.showMessageDialog(null, "Registro Modificado Con Exito");
        }
        else
            {
            JOptionPane.showMessageDialog(null, "Modificacion Cancelada");
            }
        
        
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        long confirmar = JOptionPane.showConfirmDialog(this,"Seguro Que Desea Borrar El Registro","",JOptionPane.YES_NO_OPTION );
        if(confirmar == JOptionPane.YES_OPTION)
            {
            ld.remove(Encontrado);
            limpiar();
            Guardado();
            JOptionPane.showMessageDialog(null, "Registro Eliminado Con Exito");
            }
        else
            {
            JOptionPane.showMessageDialog(null, "Eliminacion Cancelada");
            }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ListaDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListaDoctoresActionPerformed
        // TODO add your handling code here:
        Tabla_Doctores td = new Tabla_Doctores();
        td.setVisible(true);
        Doctores p;
        td.Cargar();
        for (int i=0; i<ld.size(); i++)
            {
            p = (Doctores)ld.get(i);
            td.Mostrar(p);
            }
        
    }//GEN-LAST:event_btn_ListaDoctoresActionPerformed

    private void cj_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_cedulaKeyTyped
        // TODO add your handling code here:        
        int c = evt.getKeyChar();
        if( c == 10 )
            {
                
             if(ld.isEmpty())
                {
                JOptionPane.showMessageDialog(null, "No Hay Registro De Doctores");
                cj_nombre.requestFocus();
                }
             if(cj_cedula.getText().isEmpty())
                {
                JOptionPane.showMessageDialog(null, "El Campo De Cedula Esta Vacio");
                }
            long CedDoc = Long.parseLong(cj_cedula.getText().trim());    
            Doctores d = new Doctores(CedDoc);
            for( int i=0; i<ld.size(); i++ )
                {
                    d = (Doctores)ld.get(i);
                    if( CedDoc == d.getCedula() )
                        {
                        long resp = JOptionPane.showConfirmDialog(this,"Doctor Encontrado \n Desea Agregar Un Nuevo Registro?","Doctor Encontrado",JOptionPane.YES_NO_OPTION );
                        if( resp == JOptionPane.YES_OPTION)
                            {
                            cj_nombre.transferFocus();
                            }
                        else
                            {
                            JOptionPane.showMessageDialog(null, "Registro Cancelado");
                            }
                        break;
                        }
                    else
                        {
                         JOptionPane.showMessageDialog(null, "Doctor No Encontrado"); 
                         break;
                        }  
                }
            }
    }//GEN-LAST:event_cj_cedulaKeyTyped

    private void btn_buscarPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarPrimeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarPrimeroActionPerformed

    private void btn_archivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_archivosActionPerformed
        // TODO add your handling code here:
        String xls="";
        String txt="";
        xls+="CEDULA \t NOMBRE \t TELEFONO \t TIPO \t TIPOS EXAMEN \n ";
        txt+="CEDULA \t NOMBRE \t TELEFONO \t TIPO \t TIPOS EXAMEN \n ";
        
        Doctores d;
        for(int i=0; i<ld.size(); i++)
            {
            d = (Doctores)ld.get(i);
            xls+= d.getCedula()+"\t"+d.getNombre()+"\t"+d.getTelefono()+"\t"+d.getTipo()+"\t"+d.getNombreExamen()+"\n";
            txt+= d.getCedula()+"\t"+d.getNombre()+"\t"+d.getTelefono()+"\t"+d.getTipo()+"\t"+d.getNombreExamen()+"\n";                                 
            GenerarExcel.Grabar(txt, "Doctores.txt");
            GenerarExcel.Grabar(xls, "Doctores.xls");
            }
        
    }//GEN-LAST:event_btn_archivosActionPerformed

    private void cj_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_nombreKeyTyped
        // TODO add your handling code here:
        String nombre = cj_nombre.getText();
        nombre = nombre.toUpperCase();
        cj_nombre.setText(nombre);
        int c = evt.getKeyChar();
        if( c == 10)
            {
            cj_telefono.requestFocus();
            }
    }//GEN-LAST:event_cj_nombreKeyTyped

    private void cj_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_telefonoKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if( c == 10 )
            {
            item_tipo.requestFocus();
            }
    }//GEN-LAST:event_cj_telefonoKeyTyped

    private void item_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_tipoActionPerformed
        // TODO add your handling code here:
        if( item_tipo.getSelectedIndex() == 1 )
            {
            item_tiposE.setEnabled(false);
            }
        else
            {
            item_tiposE.setEnabled(true);    
            item_tiposE.requestFocus();            
            }
    }//GEN-LAST:event_item_tipoActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Doctores().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ListaDoctores;
    private javax.swing.JButton btn_archivos;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscarPrimero;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField cj_cedula;
    private javax.swing.JTextField cj_nombre;
    private javax.swing.JTextField cj_telefono;
    private javax.swing.JComboBox item_tipo;
    private javax.swing.JComboBox item_tiposE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
