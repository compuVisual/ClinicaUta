package GUI;

import static Clinica.Contenedor_Tipos_Examenes.*;
import Clinica.Tipos_Examenes;
import javax.swing.JOptionPane;
import static Clinica.Contenedor_Examenes.*;
import static Clinica.Contenedor_Doctores.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static Clinica.Contenedor_Pacientes.*;
import Clinica.Doctores;
import Clinica.GenerarExcel;
import Clinica.Pacientes;
import com.mysql.jdbc.Connection;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;

public class Bienvenido extends javax.swing.JFrame {

    public static String DcmtoExcel;

    public Bienvenido() {
        initComponents();

        FondoBienvenido2 F = new FondoBienvenido2();
        this.add(F, BorderLayout.CENTER);
        this.pack();
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_doctor = new javax.swing.JLabel();
        btn_paciente = new javax.swing.JLabel();
        btn_Examen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_PacientesporDoctor = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_Tipos_Examenes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_facturar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_PacFecha = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Menu_NuevoDoctor = new javax.swing.JMenuItem();
        Menu_NuevoPac = new javax.swing.JMenuItem();
        Menu_Examenes = new javax.swing.JMenuItem();
        Menu_Facturar = new javax.swing.JMenuItem();
        Menu_Tipos_Examenes = new javax.swing.JMenuItem();
        Menu_Tipos_Examenes1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuExcelDoc = new javax.swing.JMenuItem();
        MenuExcelPac = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clinica Uta");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel1.setText("REGISTRAR DOCTORES");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel2.setText("REGISTRAR PACIENTES");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel3.setText("EXAMENES");

        btn_doctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/DoctorInicio.png"))); // NOI18N
        btn_doctor.setToolTipText("Registrar Doctores");
        btn_doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_doctorMouseClicked(evt);
            }
        });

        btn_paciente.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        btn_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/PacienteInici.png"))); // NOI18N
        btn_paciente.setToolTipText("Registrar Pacientes");
        btn_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pacienteMouseClicked(evt);
            }
        });

        btn_Examen.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        btn_Examen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CitaInicio.png"))); // NOI18N
        btn_Examen.setToolTipText("Asignar Cita");
        btn_Examen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ExamenMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel4.setText("PACIENTES POR DOCTOR");

        btn_PacientesporDoctor.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        btn_PacientesporDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/PacDocInicio.png"))); // NOI18N
        btn_PacientesporDoctor.setToolTipText("Lista De Pacientes Por Doctor Determinado");
        btn_PacientesporDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PacientesporDoctorMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel5.setText("TIPOS DE EXAMENES");

        btn_Tipos_Examenes.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        btn_Tipos_Examenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/AreaInicio.png"))); // NOI18N
        btn_Tipos_Examenes.setToolTipText("Registrar Areas De Doctores");
        btn_Tipos_Examenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Tipos_ExamenesMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel6.setText("FACTURAR");

        btn_facturar.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        btn_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/FacturarInicio.png"))); // NOI18N
        btn_facturar.setToolTipText("Facturar Cita");
        btn_facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_facturarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Clinica UTA");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel8.setText("PACIENTES POR FECHA");

        btn_PacFecha.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        btn_PacFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Calendar.png"))); // NOI18N
        btn_PacFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PacFechaMouseClicked(evt);
            }
        });

        jMenu1.setText("Archivo");

        Menu_NuevoDoctor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        Menu_NuevoDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuNuevoDoc.png"))); // NOI18N
        Menu_NuevoDoctor.setText("Nuevo doctor");
        Menu_NuevoDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_NuevoDoctorActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_NuevoDoctor);

        Menu_NuevoPac.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Menu_NuevoPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuUser.png"))); // NOI18N
        Menu_NuevoPac.setText("Nuevo paciente");
        Menu_NuevoPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_NuevoPacActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_NuevoPac);

        Menu_Examenes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Examenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuCita.png"))); // NOI18N
        Menu_Examenes.setText("Examenes");
        Menu_Examenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ExamenesActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Examenes);

        Menu_Facturar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuFacturar.png"))); // NOI18N
        Menu_Facturar.setText("Facturar Examen");
        Menu_Facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_FacturarActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Facturar);

        Menu_Tipos_Examenes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Tipos_Examenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuArea.png"))); // NOI18N
        Menu_Tipos_Examenes.setText("Tipos de Examenes");
        Menu_Tipos_Examenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Tipos_ExamenesActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Tipos_Examenes);

        Menu_Tipos_Examenes1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Tipos_Examenes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuSalir.png"))); // NOI18N
        Menu_Tipos_Examenes1.setText("Salir");
        Menu_Tipos_Examenes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Tipos_Examenes1ActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Tipos_Examenes1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ver");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuLista.png"))); // NOI18N
        jMenuItem7.setText("Lista de doctores");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuListaPac.png"))); // NOI18N
        jMenuItem8.setText("Lista de pacientes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuPacDoc.png"))); // NOI18N
        jMenuItem9.setText("Pacientes por doctor");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Editar");

        MenuExcelDoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        MenuExcelDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/exceldoctor.png"))); // NOI18N
        MenuExcelDoc.setText("Generar Excel de doctores");
        MenuExcelDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExcelDocActionPerformed(evt);
            }
        });
        jMenu3.add(MenuExcelDoc);

        MenuExcelPac.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MenuExcelPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/excelPac.png"))); // NOI18N
        MenuExcelPac.setText("Generar Excel de pacientes");
        MenuExcelPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExcelPacActionPerformed(evt);
            }
        });
        jMenu3.add(MenuExcelPac);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btn_PacFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_PacientesporDoctor)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btn_doctor)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(btn_paciente)
                                        .addGap(71, 71, 71))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addGap(57, 57, 57)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(btn_Examen))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(24, 24, 24)))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 85, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_Tipos_Examenes)
                                    .addComponent(jLabel5))))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btn_facturar)
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btn_Tipos_Examenes))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Examen)
                                    .addComponent(btn_paciente)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_doctor)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_PacFecha)
                            .addComponent(btn_PacientesporDoctor))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btn_facturar)
                        .addGap(36, 36, 36))))
        );

        setSize(new java.awt.Dimension(938, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_NuevoDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_NuevoDoctorActionPerformed
        // TODO add your handling code here:
        if (cte.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Primero Debes Registrar Un Area");
        } else {
            GUI_Doctores d = new GUI_Doctores();
            d.setVisible(true);
        }
    }//GEN-LAST:event_Menu_NuevoDoctorActionPerformed

    private void Menu_NuevoPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_NuevoPacActionPerformed
        // TODO add your handling code here:
        if (ld.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Primero Debes Registrar Doctores");
        } else {
            GUI_Pacientes rp = new GUI_Pacientes();
            rp.setVisible(true);
        }
    }//GEN-LAST:event_Menu_NuevoPacActionPerformed

    private void Menu_ExamenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ExamenesActionPerformed
        // TODO add your handling code here:
        if (cp.isEmpty() && ld.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes Registrar Pacientes Para Asignarles Citas");
        } else {
            GUI_Examen ac = new GUI_Examen();
            ac.setVisible(true);
        }
    }//GEN-LAST:event_Menu_ExamenesActionPerformed

    private void Menu_FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_FacturarActionPerformed
        // TODO add your handling code here:
//        if (cc.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "No Hay Citas Registradas Para Facturar, Asigne Una Primero");
//        } else {
//            GUI_Facturacion fac = new GUI_Facturacion();
//            fac.setVisible(true);
//        }
    }//GEN-LAST:event_Menu_FacturarActionPerformed

    private void Menu_Tipos_ExamenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Tipos_ExamenesActionPerformed
        // TODO add your handling code here:
        GUI_Tipos_Examenes a = new GUI_Tipos_Examenes();
        a.setVisible(true);
    }//GEN-LAST:event_Menu_Tipos_ExamenesActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        if (ces.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Hay Citas Asignadas Por Doctores");
        } else {
            GUI_PacientesporDoctor pd = new GUI_PacientesporDoctor();
            pd.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        if (ld.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Hay Doctores Registrados Para Mostrar");
        } else {
            Tabla_Doctores td = new Tabla_Doctores();
            td.setVisible(true);
            Doctores p;
            td.Cargar();
            for (int i = 0; i < ld.size(); i++) {
                p = (Doctores) ld.get(i);
                td.Mostrar(p);
            }
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        if (cp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Hay Pacientes Registrados Para Mostrar");
        } else {
            Tabla_Pacientes ListaPacientes = new Tabla_Pacientes();
            ListaPacientes.setVisible(true);
            ListaPacientes.CargarInterfaz();
            Pacientes p;
            for (int i = 0; i < cp.size(); i++) {
                p = (Pacientes) cp.get(i);
                ListaPacientes.MostrarDatos(p);
            }
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void Menu_Tipos_Examenes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Tipos_Examenes1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Menu_Tipos_Examenes1ActionPerformed

    private void MenuExcelDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExcelDocActionPerformed
        // TODO add your handling code here:
        String xls = "";
        String txt = "";
        xls += "CEDULA \t NOMBRE \t TELEFONO \t TIPO \t AREA \n ";
        txt += "CEDULA \t NOMBRE \t TELEFONO \t TIPO \t AREA \n ";

        Doctores d;
        for (int i = 0; i < ld.size(); i++) {
            d = (Doctores) ld.get(i);
            xls += d.getCedula() + "\t" + d.getNombre() + "\t" + d.getTelefono() + "\t" + d.getTipo() + "\t" + d.getNombreExamen() + "\n";
            txt += d.getCedula() + "\t" + d.getNombre() + "\t" + d.getTelefono() + "\t" + d.getTipo() + "\t" + d.getNombreExamen() + "\n";
            GenerarExcel.Grabar(txt, "Doctores.txt");
            GenerarExcel.Grabar(xls, "Doctores.xls");
        }
        JOptionPane.showMessageDialog(null, "Generados Correctamente");
    }//GEN-LAST:event_MenuExcelDocActionPerformed

    private void MenuExcelPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExcelPacActionPerformed
        // TODO add your handling code here:
        Pacientes p;
        DcmtoExcel += "CEDULA \t NOMBRE \t EDAD \t TELEFONO \t  FECHA DE ENTRADA \t HORA\n";
        for (int i = 0; i < cp.size(); i++) {
            p = (Pacientes) cp.get(i);
            DcmtoExcel += p.getCedula() + "\t" + p.getNombre() + "\t" + p.getEdad() + "\t" + p.getTelefono() + "\t" + p.getFecha() + "\t" + p.getHora() + "\n";
            GenerarExcel.Grabar(DcmtoExcel, "Registro Pacientes.xls");
        }

    }//GEN-LAST:event_MenuExcelPacActionPerformed

    private void btn_doctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_doctorMouseClicked
        // TODO add your handling code here:
        if (cte.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Primero Debes Ingresar los Doctores para los tipos de examenes", "Los Doctores para los tipos de examenes Esta Vacio", JOptionPane.PLAIN_MESSAGE);
        } else {
            GUI_Doctores rd = new GUI_Doctores();
            rd.setVisible(true);
        }

    }//GEN-LAST:event_btn_doctorMouseClicked

    private void btn_pacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pacienteMouseClicked
        // TODO add your handling code here:
        GUI_Pacientes rp = new GUI_Pacientes();
        rp.setVisible(true);
    }//GEN-LAST:event_btn_pacienteMouseClicked

    private void btn_ExamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExamenMouseClicked
        // TODO add your handling code here:
        if (cp.isEmpty() && ld.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes Registrar Pacientes Para Asignarles los examenes");
        } else {
            GUI_Examen ac = new GUI_Examen();
            ac.setVisible(true);
        }
    }//GEN-LAST:event_btn_ExamenMouseClicked

    private void btn_PacientesporDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PacientesporDoctorMouseClicked
        // TODO add your handling code here:
        if (ces.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Hay examens Registrados\nAsigne Un examen para Algun Doctor");
        } else {
            GUI_PacientesporDoctor pd = new GUI_PacientesporDoctor();
            pd.setVisible(true);
        }
    }//GEN-LAST:event_btn_PacientesporDoctorMouseClicked

    private void btn_Tipos_ExamenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Tipos_ExamenesMouseClicked
        // TODO add your handling code here:
        GUI_Tipos_Examenes a = new GUI_Tipos_Examenes();
        a.setVisible(true);
    }//GEN-LAST:event_btn_Tipos_ExamenesMouseClicked

    private void btn_facturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturarMouseClicked
        // TODO add your handling code here:
//        if (cc.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "No Hay Citas Registradas Para Facturar, Asigne Una Primero");
//        } else {
//            GUI_Facturacion fac = new GUI_Facturacion();
//            fac.setVisible(true);
//        }
    }//GEN-LAST:event_btn_facturarMouseClicked

    private void btn_PacFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PacFechaMouseClicked
        // TODO add your handling code here:
         if (ces.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Hay examenes Del Paciente Asignadas, Asigne Un examen Primero");
        } else {
            ListaDePacientesPorFecha lpf = new ListaDePacientesPorFecha();
            lpf.setVisible(true);
        }
    }//GEN-LAST:event_btn_PacFechaMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenido().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuExcelDoc;
    private javax.swing.JMenuItem MenuExcelPac;
    private javax.swing.JMenuItem Menu_Examenes;
    private javax.swing.JMenuItem Menu_Facturar;
    private javax.swing.JMenuItem Menu_NuevoDoctor;
    private javax.swing.JMenuItem Menu_NuevoPac;
    private javax.swing.JMenuItem Menu_Tipos_Examenes;
    private javax.swing.JMenuItem Menu_Tipos_Examenes1;
    private javax.swing.JLabel btn_Examen;
    private javax.swing.JLabel btn_PacFecha;
    private javax.swing.JLabel btn_PacientesporDoctor;
    private javax.swing.JLabel btn_Tipos_Examenes;
    private javax.swing.JLabel btn_doctor;
    private javax.swing.JLabel btn_facturar;
    private javax.swing.JLabel btn_paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
