
package GUI;

import Clinica.Pacientes;
import Clinica.GenerarExcel;
import java.text.DateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import static Clinica.Contenedor_Pacientes.*;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import static Clinica.Contenedor_Examenes.*;


public class GUI_Pacientes extends javax.swing.JFrame {
    
    DateFormat df = DateFormat.getDateInstance();
    public static String DcmtoExcel= "";
    public static int j;
    public static long k;
    public static double Observacion = 50.000;
    public static double Tratamiento = 100.000;
    public static double Cuidados = 200.000;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
    Date dato = new Date(); //fecha actual o 

    public GUI_Pacientes() {
        initComponents();
        BloquearDesbloquear();       
    }
    
    void Guardado()
        {
        btn_nuevo.setEnabled(true);
        btn_salir.setEnabled(true);
        cj_cedula.setEnabled(true);
        btn_BuscarPrimero.setEnabled(true);
        btn_buscar.setEnabled(true);
        btn_TablaPacientes.setEnabled(true);
        cj_nombre.setEnabled(false);
        cj_edad.setEnabled(false);
        cj_tel.setEnabled(false);
        cj_fecha.setEnabled(false);                       
        btn_guardar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_excel.setEnabled(true);
        }
                    
    public Pacientes Busqueda()
        {
            Pacientes z = null;
            long cedula = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese N° De Documento"));
            
            for(int i=0; i<cp.size(); i++)
              {
                z = (Pacientes) cp.get(i);
                if(cedula == z.getCedula())
                {
                    cj_cedula.setText(String.valueOf(cedula));
                    cj_nombre.setText(z.getNombre());
                    cj_edad.setText(String.valueOf(z.getEdad()));
                    cj_tel.setText(z.getTelefono());
                    cj_fecha.setDateFormatString(z.getFecha());
                    Hora.setText("Hora De Registro: "+z.getHora());
                    j = i;
                    btn_modificar.setEnabled(true);
                    cj_cedula.setEnabled(true);
                    cj_nombre.setEnabled(true);
                    cj_edad.setEnabled(true);
                    cj_tel.setEnabled(true);
                    cj_fecha.setEnabled(true);
                    btn_cancelar.setEnabled(true);
                    btn_eliminar.setEnabled(true);
                    break;
                }
                else
                    {
                    z = null;
                    }
              }
            return z;
        }
    

    void limpiar()
        {
        cj_cedula.setText("");
        cj_nombre.setText("");
        cj_edad.setText("");
        cj_tel.setText("");
        Hora.setText("");
        }
    
    void BloquearDesbloquear()
        {
        if(cp.isEmpty())
            {
            cj_cedula.setEnabled(false);
            cj_nombre.setEnabled(false);
            cj_edad.setEnabled(false);
            cj_tel.setEnabled(false);
            cj_fecha.setEnabled(false);          
            btn_buscar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            btn_TablaPacientes.setEnabled(false);
            btn_BuscarPrimero.setEnabled(false);
            btn_guardar.setEnabled(false);
            btn_eliminar.setEnabled(false);
            btn_modificar.setEnabled(false);
            btn_excel.setEnabled(false);
            }
        else if(!cp.isEmpty())
            {
            cj_cedula.setEnabled(true);
            btn_BuscarPrimero.setEnabled(true);
            btn_buscar.setEnabled(true);
            btn_cancelar.setEnabled(true);
            btn_TablaPacientes.setEnabled(true);
            btn_salir.setEnabled(true);
            btn_eliminar.setEnabled(true);
            }
        }
    
    void Desbloquear()
        {
            this.cj_cedula.setEnabled(true);
            this.cj_nombre.setEnabled(true);
            this.cj_edad.setEnabled(true);
            this.cj_tel.setEnabled(true);
            this.cj_fecha.setEnabled(true);
            btn_guardar.setEnabled(true);
            btn_buscar.setEnabled(false);
            btn_cancelar.setEnabled(true);
            btn_TablaPacientes.setEnabled(false);
            btn_BuscarPrimero.setEnabled(false);
        }
    
    void BloqueaCajas()
        {
        cj_nombre.setEnabled(false);
        cj_edad.setEnabled(false);
        cj_tel.setEnabled(false);
        cj_fecha.setEnabled(false);
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cj_cedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cj_nombre = new javax.swing.JTextField();
        cj_edad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cj_tel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_TablaPacientes = new javax.swing.JButton();
        btn_BuscarPrimero = new javax.swing.JButton();
        btn_excel = new javax.swing.JButton();
        Hora = new javax.swing.JLabel();
        cj_fecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_salir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_asignarcita = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro De Pacientes");
        setBackground(new java.awt.Color(204, 0, 0));
        setResizable(false);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 153, 0));
        jTextField1.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("REGISTRAR PACIENTES");
        jTextField1.setToolTipText("Registrar Pacientes A Clinica Vivir");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("N° CEDULA:");

        cj_cedula.setToolTipText("Ingrese Cedula");
        cj_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_cedulaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("NOMBRE:");

        cj_nombre.setToolTipText("Ingrese Nombre");
        cj_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_nombreKeyTyped(evt);
            }
        });

        cj_edad.setToolTipText("Ingrese Edad");
        cj_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_edadKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("EDAD:");

        cj_tel.setToolTipText("Ingrese Telefono");
        cj_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cj_telKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("TELEFONO:");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("FECHA DE REGISTRO:");

        btn_TablaPacientes.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_TablaPacientes.setText("VER LISTA DE PACIENTES");
        btn_TablaPacientes.setToolTipText("Ver Listado De Pacientes");
        btn_TablaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TablaPacientesActionPerformed(evt);
            }
        });

        btn_BuscarPrimero.setBackground(new java.awt.Color(255, 255, 255));
        btn_BuscarPrimero.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_BuscarPrimero.setForeground(new java.awt.Color(0, 255, 0));
        btn_BuscarPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        btn_BuscarPrimero.setToolTipText("Buscar Paciente");
        btn_BuscarPrimero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_BuscarPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarPrimeroActionPerformed(evt);
            }
        });

        btn_excel.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_excel.setText("GENERAR DOCUMENTO .XLS (EXCEL)");
        btn_excel.setToolTipText("Generar Archivo Excel");
        btn_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excelActionPerformed(evt);
            }
        });

        Hora.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cj_fecha.setToolTipText("Ingrese Fecha");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/17-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel9))
                            .addGap(54, 54, 54)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cj_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cj_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                        .addComponent(cj_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cj_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cj_cedula))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_BuscarPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(btn_TablaPacientes)
                            .addGap(18, 18, 18)
                            .addComponent(btn_excel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_BuscarPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cj_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cj_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cj_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cj_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(cj_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_excel)
                    .addComponent(btn_TablaPacientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        btn_salir.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir.png"))); // NOI18N
        btn_salir.setToolTipText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar.png"))); // NOI18N
        btn_cancelar.setToolTipText("Canceñar Registro");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa.png"))); // NOI18N
        btn_buscar.setToolTipText("Buscar Paciente");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_guardar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/GuardarTodo.png"))); // NOI18N
        btn_guardar.setToolTipText("Guardar Registro");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_modificar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mantenimiento.png"))); // NOI18N
        btn_modificar.setToolTipText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_nuevo.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nuevo.png"))); // NOI18N
        btn_nuevo.setToolTipText("Crear Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/borrar.png"))); // NOI18N
        btn_eliminar.setToolTipText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_asignarcita.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        btn_asignarcita.setText("ASIGNAR FECHA");
        btn_asignarcita.setToolTipText("Asignar Cita");
        btn_asignarcita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asignarcitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btn_asignarcita)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_asignarcita)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(516, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpiar();        
        if(cp.isEmpty())
            {
            btn_nuevo.setEnabled(true);
            btn_salir.setEnabled(true);
            cj_cedula.setEnabled(false);
            cj_nombre.setEnabled(false);
            cj_edad.setEnabled(false);
            cj_tel.setEnabled(false);
            cj_fecha.setEnabled(false);
            btn_guardar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            btn_modificar.setEnabled(false);
            btn_buscar.setEnabled(false);
            btn_TablaPacientes.setEnabled(false);
            btn_excel.setEnabled(false);
            }
        else
            {
            btn_nuevo.setEnabled(true);
            btn_salir.setEnabled(true);
            btn_BuscarPrimero.setEnabled(true);
            btn_buscar.setEnabled(true);
            btn_TablaPacientes.setEnabled(true);
            cj_cedula.setEnabled(true);
            cj_nombre.setEnabled(false);
            cj_edad.setEnabled(false);
            cj_tel.setEnabled(false);
            cj_fecha.setEnabled(false);                       
            btn_guardar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            btn_modificar.setEnabled(false);          
            Hora.setText("");
            btn_eliminar.setEnabled(false);
            btn_excel.setEnabled(true);
            }
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void cj_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_cedulaKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if(c == 10)
            {
            cj_nombre.requestFocus();
            if(cp.isEmpty() )
                {
                JOptionPane.showMessageDialog(null, "NO HAY REGISTROS DE USUARIOS GUARDADOS");
                }
            if(cj_cedula.getText().isEmpty())
                {
                JOptionPane.showMessageDialog(rootPane, "Ingrese Numero De Cedula A Buscar ");
                }
        
        long ced = Long.parseLong(cj_cedula.getText().trim());
        Pacientes esta = new Pacientes(ced);
        for(int i=0; i<cp.size(); i++)
            {
             esta = (Pacientes)cp.get(i);
             if ( ced == esta.getCedula())
                {
                    JOptionPane.showMessageDialog(null, "USUARIO YA EXISTE");
                    break;
                }                
             else 
                {
                     long resp = JOptionPane.showConfirmDialog(this,"EL PACIENTE NO SE ENCUENTRA REGISTRADO \n DESEA REGISTRAR UN NUEVO USUARIO?  ","",JOptionPane.YES_NO_OPTION );
                     if( resp == JOptionPane.YES_OPTION )
                    {
                        //limpiar();
                        cj_nombre.requestFocus();
                        cj_nombre.setEnabled(true);
                        cj_edad.setEnabled(true);
                        cj_tel.setEnabled(true);
                        cj_fecha.setEnabled(true);
                        btn_nuevo.setEnabled(false);
                        btn_cancelar.setEnabled(true);
                        btn_guardar.setEnabled(true);
                        btn_modificar.setEnabled(false);
                        btn_buscar.setEnabled(true);
                        btn_TablaPacientes.setEnabled(true);
                        break;
                    }
                }                
            }
            }
    }//GEN-LAST:event_cj_cedulaKeyTyped

    private void cj_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_nombreKeyTyped
        // TODO add your handling code here:            
            String nombre = cj_nombre.getText();
            nombre = nombre.toUpperCase();
            cj_nombre.setText(nombre);
            int c = evt.getKeyChar();
            if( c == 10 )
                {
                cj_edad.requestFocus();
                }
    }//GEN-LAST:event_cj_nombreKeyTyped

    private void cj_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_edadKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if(c == 10)
            {
            cj_tel.requestFocus();
            }
    }//GEN-LAST:event_cj_edadKeyTyped

    private void cj_telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_telKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if(c == 10)
            {
           cj_fecha.requestFocus();
            }
    }//GEN-LAST:event_cj_telKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        long cedula = Long.parseLong(cj_cedula.getText().trim());
        String nombre = cj_nombre.getText().trim();
        int edad = Integer.parseInt(cj_edad.getText().trim());
        String telefono = cj_tel.getText().trim();
        String fecha = df.format(cj_fecha.getDate());
        String hora = formato.format(dato);
        Pacientes p = new Pacientes(cedula, nombre, edad, telefono, fecha, hora);
        cp.add(p);
        
        JOptionPane.showMessageDialog(null, "Paciente Registrado A Las "+hora);
        limpiar();
        Guardado();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here: 
        
        long resp = JOptionPane.showConfirmDialog(this,"Seguro Que Desea Modificar El Registro","Modificar Registro",JOptionPane.YES_NO_OPTION );
        
        if(resp == JOptionPane.YES_OPTION)
        {
        long cedula = Long.parseLong(cj_cedula.getText().trim());
        String nombre = cj_nombre.getText().trim();
        int edad = Integer.parseInt(cj_edad.getText().trim());
        String telefono = cj_tel.getText().trim();
        String fecha = df.format(cj_fecha.getDate());
        
        Pacientes p = new Pacientes(cedula, nombre, edad, telefono, fecha);
        cp.set(j, p);
        JOptionPane.showMessageDialog(null, "REGISTRO MODIFICADO !");
        limpiar();
        //BloquearDesbloquear();
        btn_nuevo.setEnabled(true);
        btn_salir.setEnabled(true);
        btn_TablaPacientes.setEnabled(true);
        btn_buscar.setEnabled(true);
        btn_guardar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_modificar.setEnabled(false);
        cj_nombre.setEnabled(false);
        cj_edad.setEnabled(false);
        cj_tel.setEnabled(false);
        cj_fecha.setEnabled(false);     
        }
        else
            {
            JOptionPane.showMessageDialog(null, "Registro Sin Modificar");
            }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
      if( Busqueda() == null )
        {
        JOptionPane.showMessageDialog(null, "USUARIO NO EXISTE");
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_BuscarPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarPrimeroActionPerformed

        // TODO add your handling code here:
        if(cp.isEmpty())
            {
            JOptionPane.showMessageDialog(null, "NO HAY REGISTROS DE USUARIOS GUARDADOS");
            }
        if(cj_cedula.getText().isEmpty())
                {
                JOptionPane.showMessageDialog(rootPane, "Ingrese Numero De Cedula A Buscar ");
                }
        
        long ced = Long.parseLong(cj_cedula.getText().trim());
        Pacientes esta = new Pacientes(ced);
        for(int i=0; i<cp.size(); i++)
            {
             esta = (Pacientes)cp.get(i);
             if ( ced == esta.getCedula())
                {
                    JOptionPane.showMessageDialog(null, "USUARIO YA EXISTE");
                    break;
                }                
            }
        for(int i=0; i<cp.size(); i++)
        {
            esta = (Pacientes)cp.get(i);
            if(ced != esta.getCedula())
                {
                     long resp = JOptionPane.showConfirmDialog(this,"EL PACIENTE NO SE ENCUENTRA REGISTRADO \n DESEA REGISTRAR UN NUEVO USUARIO?  ","",JOptionPane.YES_NO_OPTION );
                     if( resp == JOptionPane.YES_OPTION )
                        {
                        //limpiar();
                        cj_cedula.requestFocus();
                        cj_nombre.setEnabled(true);
                        cj_edad.setEnabled(true);
                        cj_tel.setEnabled(true);
                        cj_fecha.setEnabled(true);
                        btn_nuevo.setEnabled(false);
                        btn_cancelar.setEnabled(true);
                        btn_guardar.setEnabled(true);
                        btn_modificar.setEnabled(false);
                        btn_buscar.setEnabled(true);
                        btn_TablaPacientes.setEnabled(true);
                        break;
                        }
                     else
                        {
                        JOptionPane.showMessageDialog(rootPane, "Gracias!");
                        }
                }
        }
    }//GEN-LAST:event_btn_BuscarPrimeroActionPerformed

    private void btn_TablaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TablaPacientesActionPerformed
        // TODO add your handling code here:
        Tabla_Pacientes ListaPacientes = new Tabla_Pacientes();
        ListaPacientes.setVisible(true);
        ListaPacientes.CargarInterfaz();        
        Pacientes p;
        for(int i=0; i<cp.size(); i++)
            {
            p = (Pacientes)cp.get(i);
            ListaPacientes.MostrarDatos(p);
            }                            
    }//GEN-LAST:event_btn_TablaPacientesActionPerformed

    private void cj_fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cj_fechaKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if(c == 10)
        {
            this.btn_guardar.requestFocus();
        }
    }//GEN-LAST:event_cj_fechaKeyTyped

    private void btn_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excelActionPerformed
        // TODO add your handling code here:
        Pacientes p;
        DcmtoExcel+= "CEDULA \t NOMBRE \t EDAD \t TELEFONO \t  FECHA DE ENTRADA \t HORA\n";
        for(int i=0; i<cp.size(); i++)
            {
                p = (Pacientes)cp.get(i);
                DcmtoExcel+= p.getCedula()+"\t"+p.getNombre()+"\t"+p.getEdad()+"\t"+p.getTelefono()+"\t"+p.getFecha()+"\t"+p.getHora()+"\n";
                GenerarExcel.Grabar(DcmtoExcel, "Registro Pacientes.xls");
            }
    }//GEN-LAST:event_btn_excelActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        if(cp.isEmpty())
        {
            this.cj_cedula.setEnabled(true);
            this.cj_nombre.setEnabled(true);
            this.cj_edad.setEnabled(true);
            this.cj_tel.setEnabled(true);
            this.cj_fecha.setEnabled(true);
            btn_guardar.setEnabled(true);
            btn_cancelar.setEnabled(true);
            btn_salir.setEnabled(true);
            btn_nuevo.setEnabled(false);
            btn_nuevo.setEnabled(false);
        }
        else
        {
            this.cj_cedula.setEnabled(true);
            this.cj_nombre.setEnabled(true);
            this.cj_edad.setEnabled(true);
            this.cj_tel.setEnabled(true);
            this.cj_fecha.setEnabled(true);
            btn_guardar.setEnabled(true);
            btn_buscar.setEnabled(true);
            btn_cancelar.setEnabled(true);
            btn_TablaPacientes.setEnabled(true);
            btn_salir.setEnabled(true);
            btn_nuevo.setEnabled(true);
        }

        cj_cedula.requestFocus();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        long resp = JOptionPane.showConfirmDialog(this,"Confirmar Eliminacion De Paciente","",JOptionPane.YES_NO_OPTION );
        if( resp == JOptionPane.YES_OPTION)
            {
            cp.remove(j);
            JOptionPane.showMessageDialog(null, "Registo Eliminado!");
            limpiar();
            BloqueaCajas();
            if(cp.isEmpty())
                {
                cj_cedula.setEnabled(false);
                BloqueaCajas();
                BloquearDesbloquear();
                }
            else
                {
                BloquearDesbloquear();
                BloqueaCajas();
                }
            }
        else
            {
            JOptionPane.showMessageDialog(null, "Eliminacion Cancelada");
            }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_asignarcitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asignarcitaActionPerformed
        // TODO add your handling code here:
        if(cp.isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Hay Pacientes Registrados","Registre Pacientes Para Poder Asignar FECHA",JOptionPane.OK_OPTION);
        }
        else
            {
            GUI_Examen ac = new GUI_Examen();
            ac.setVisible(true);
            }        
    }//GEN-LAST:event_btn_asignarcitaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Pacientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hora;
    private javax.swing.JButton btn_BuscarPrimero;
    private javax.swing.JButton btn_TablaPacientes;
    private javax.swing.JButton btn_asignarcita;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_excel;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField cj_cedula;
    private javax.swing.JTextField cj_edad;
    private com.toedter.calendar.JDateChooser cj_fecha;
    private javax.swing.JTextField cj_nombre;
    private javax.swing.JTextField cj_tel;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}