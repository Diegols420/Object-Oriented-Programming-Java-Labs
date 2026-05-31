package Lab01_GestionEmpleados;

public class FrmArquitecto extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmArquitecto.class.getName());
    
    // ← AGREGA ESTAS DOS LÍNEAS:
    Arquitecto arquitecto;   // objeto global de la clase Arquitecto
    
    public FrmArquitecto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jtxtCodigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jtxtNombres = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jcbxAfiliacion = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jcbxCondicion = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jcbxEspecialidad = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jcbxActividad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaDatos = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jbtnCrear = new javax.swing.JButton();
        jbtnMostrar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 540));
        setPreferredSize(new java.awt.Dimension(600, 540));
        setResizable(false);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jtxtCodigo.addActionListener(this::jtxtCodigoActionPerformed);
        jtxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtCodigo, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(jtxtNombres, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Afiliación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        jcbxAfiliacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcbxAfiliacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE---", "AFP", "SNP" }));
        jcbxAfiliacion.addActionListener(this::jcbxAfiliacionActionPerformed);
        jPanel3.add(jcbxAfiliacion, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 170, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Condición de Contrato ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel4.setLayout(new java.awt.BorderLayout());

        jcbxCondicion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcbxCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE---", "Estable", "Contratado" }));
        jPanel4.add(jcbxCondicion, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel5.setLayout(new java.awt.BorderLayout());

        jcbxEspecialidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcbxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE---", "Estructuras", "Recursos Hídricos" }));
        jPanel5.add(jcbxEspecialidad, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Actividad ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        jcbxActividad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcbxActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONE---", "Supervisión de Obras", "Supervisión de Vías" }));
        jPanel6.add(jcbxActividad, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jtxaDatos.setColumns(20);
        jtxaDatos.setRows(5);
        jScrollPane1.setViewportView(jtxaDatos);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 530, 236));

        jbtnCrear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnCrear.setText("Crear Objeto");
        jbtnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCrear.addActionListener(this::jbtnCrearActionPerformed);

        jbtnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnMostrar.setText("Mostrar infromacion del objeto");
        jbtnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnMostrar.addActionListener(this::jbtnMostrarActionPerformed);

        jbtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.setOpaque(true);
        jbtnLimpiar.addActionListener(this::jbtnLimpiarActionPerformed);

        jbtnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnSalir.setText("Salir");
        jbtnSalir.setOpaque(true);
        jbtnSalir.addActionListener(this::jbtnSalirActionPerformed);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jbtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 550, 60));

        getContentPane().add(jPanel7, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed

    private void jtxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodigoKeyTyped
        // Si el texto ya tiene 8 o más caracteres, ignoramos la nueva tecla
        if (jtxtCodigo.getText().length() >= 8) {
            evt.consume(); // Esto "destruye" el evento de la tecla antes de que se escriba
        }
    }//GEN-LAST:event_jtxtCodigoKeyTyped

    private void jcbxAfiliacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxAfiliacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxAfiliacionActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        jtxtCodigo.setText("");
        jtxtNombres.setText("");
        jcbxCondicion.setSelectedIndex(0);
        jcbxEspecialidad.setSelectedIndex(0);
        jcbxActividad.setSelectedIndex(0);
        jcbxAfiliacion.setSelectedIndex(0);
        jtxaDatos.setText("");
        jtxtCodigo.requestFocus();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarActionPerformed
        // Validar que el objeto fue creado
        if (arquitecto == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Primero debe crear un objeto con 'Crear Objeto'.",
                "Sin datos",
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Mostrando información
        jtxaDatos.append("Objeto Número         : " + Arquitecto.getContador()            + "\n");
        jtxaDatos.append("Codigo                : " + arquitecto.codigo                   + "\n");
        jtxaDatos.append("Nombres               : " + arquitecto.nombres                  + "\n");
        jtxaDatos.append("Condición Contrato    : " + arquitecto.condicionContrato        + "\n");
        jtxaDatos.append("Especialidad          : " + arquitecto.especialidad             + "\n");
        jtxaDatos.append("Tipo de Actividad     : " + arquitecto.tipoActividad            + "\n");
        jtxaDatos.append("Tipo de Afiliación    : " + arquitecto.tipoAfiliacion           + "\n");
        jtxaDatos.append("Sueldo Base           : " + arquitecto.calcularSueldoBase()     + "\n");
        jtxaDatos.append("Bonificación          : " + arquitecto.calcularBonificacion()   + "\n");
        jtxaDatos.append("Descuento             : " + arquitecto.calcularDescuento()      + "\n");
        jtxaDatos.append("Sueldo Bruto          : " + arquitecto.sueldoBruto()            + "\n");
        jtxaDatos.append("Sueldo Neto           : " + arquitecto.sueldoNeto()             + "\n");
        jtxaDatos.append("----------------------------------------\n");
    }//GEN-LAST:event_jbtnMostrarActionPerformed

    private void jbtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCrearActionPerformed
        // Validar campos vacíos
        if (jtxtCodigo.getText().isEmpty() || jtxtNombres.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Por favor, complete todos los campos.",
                "Campos vacíos",
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar ComboBox
        if (jcbxCondicion.getSelectedIndex()   == 0 ||
            jcbxEspecialidad.getSelectedIndex() == 0 ||
            jcbxActividad.getSelectedIndex()    == 0 ||
            jcbxAfiliacion.getSelectedIndex()   == 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Por favor, seleccione todas las opciones.",
                "Selección inválida",
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Capturando datos del formulario
        String cod       = jtxtCodigo.getText();
        String nom       = jtxtNombres.getText();
        String condicion = jcbxCondicion.getSelectedItem().toString();
        String espec     = jcbxEspecialidad.getSelectedItem().toString();
        String activ     = jcbxActividad.getSelectedItem().toString();
        String afil      = jcbxAfiliacion.getSelectedItem().toString();

        // Creando el objeto Arquitecto
        arquitecto = new Arquitecto(cod, nom, condicion, espec, activ, afil);

        // Confirmación
        javax.swing.JOptionPane.showMessageDialog(this,
            "Objeto creado correctamente.\nArquitecto N°: " + Arquitecto.getContador(),
            "Éxito",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbtnCrearActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("Error en Look and Feel: " + ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(() -> new FrmArquitecto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCrear;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnMostrar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<String> jcbxActividad;
    private javax.swing.JComboBox<String> jcbxAfiliacion;
    private javax.swing.JComboBox<String> jcbxCondicion;
    private javax.swing.JComboBox<String> jcbxEspecialidad;
    private javax.swing.JTextArea jtxaDatos;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtNombres;
    // End of variables declaration//GEN-END:variables
}