package InterfazG3;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import DatosG3.PersistenciaG3;
import HotelG3.ListaUsuarioG3;
import HotelG3.UsuarioG3;

public class RegistroG3 extends JFrame{

	
	public RegistroG3() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CrearButton = new javax.swing.JButton();
        NombreLabel = new javax.swing.JLabel();
        ApellidoLabel = new javax.swing.JLabel();
        TelefLabel = new javax.swing.JLabel();
        EdadLabel = new javax.swing.JLabel();
        CILabel = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        ApellidoText = new javax.swing.JTextField();
        EdadText = new javax.swing.JTextField();
        CiText = new javax.swing.JTextField();
        TelefText = new javax.swing.JTextField();
        UsuarioText = new javax.swing.JTextField();
        UsuarioLabel = new javax.swing.JLabel();
        Conrase�aText = new javax.swing.JTextField();
        Contrase�aLabel = new javax.swing.JLabel();
        EntrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-a�adir-usuario-masculino-48.png"))); // NOI18N

        CrearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usuario-hombre-verificado-20.png"))); // NOI18N
        CrearButton.setText("Crear Usuario");
        CrearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearButtonActionPerformed(evt);
            }
        });

        NombreLabel.setText("Nombre: ");

        ApellidoLabel.setText("Apellido: ");

        TelefLabel.setText("Tel�fono: ");

        EdadLabel.setText("Edad: ");

        CILabel.setText("C�dula: ");

        ApellidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoTextActionPerformed(evt);
            }
        });

        EdadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadTextActionPerformed(evt);
            }
        });

        CiText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiTextActionPerformed(evt);
            }
        });

        UsuarioLabel.setText("Usuario: ");

        Contrase�aLabel.setText("Contrase�a: ");

        EntrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-entrar-18.png"))); // NOI18N
        EntrarButton.setText("Entrar");
        EntrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EdadLabel)
                                    .addComponent(ApellidoLabel)
                                    .addComponent(NombreLabel))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NombreText, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(EdadText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ApellidoText)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(UsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TelefLabel)
                                                .addComponent(CILabel)
                                                .addComponent(UsuarioLabel))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(CiText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TelefText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Contrase�aLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Conrase�aText, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(CrearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 223, Short.MAX_VALUE)
                .addComponent(EntrarButton)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidoLabel)
                            .addComponent(ApellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EdadLabel)
                        .addComponent(EdadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CILabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Conrase�aText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contrase�aLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CrearButton)
                .addGap(18, 18, 18)
                .addComponent(EntrarButton)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearButtonActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = NombreText.getText();
            String apellido = ApellidoText.getText();
            int edad = Integer.parseInt(EdadText.getText());
            String numeroTelefono = TelefText.getText();
            String Ci = CiText.getText();
            String usuario = UsuarioText.getText();
            String contra = Conrase�aText.getText();
            if (!nombre.isEmpty() && !apellido.isEmpty() && !numeroTelefono.isEmpty()
                    && !Ci.isEmpty() && !usuario.isEmpty() && !contra.isEmpty()) {

                UsuarioG3 nuevo = new UsuarioG3();

                if (!UsuarioG3.verificarNuevoUsuario(usuario)) {
                    nuevo.setNombre(nombre);
                    nuevo.setApellido(apellido);
                    nuevo.setEdad(edad);
                    nuevo.setNumeroTelefono(numeroTelefono);
                    nuevo.setCi(Ci);
                    nuevo.setUsuario(usuario);
                    nuevo.setContra(contra);
                    ListaUsuarioG3.Agregar(nuevo);
                    try {
                        PersistenciaG3.guardarDatos();
					} catch (Exception e) {
						JOptionPane.showMessageDialog(this, "Ocurri� un error al guardar Datos");
					}
                    JOptionPane.showMessageDialog(this, "Usuario creado con Exito.");
                } else {
                    JOptionPane.showMessageDialog(this, "El Nombre de Usuario ya Existe.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por Favor, llenar todos los campos.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e);
        }
    }//GEN-LAST:event_CrearButtonActionPerformed

    private void ApellidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoTextActionPerformed

    private void EdadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadTextActionPerformed

    private void CiTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CiTextActionPerformed

    private void EntrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginG3 abrir = new LoginG3();
        abrir.setVisible(true);
    }//GEN-LAST:event_EntrarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellidoLabel;
    private javax.swing.JTextField ApellidoText;
    private javax.swing.JLabel CILabel;
    private javax.swing.JTextField CiText;
    private javax.swing.JTextField Conrase�aText;
    private javax.swing.JLabel Contrase�aLabel;
    private javax.swing.JButton CrearButton;
    private javax.swing.JLabel EdadLabel;
    private javax.swing.JTextField EdadText;
    private javax.swing.JButton EntrarButton;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreText;
    private javax.swing.JLabel TelefLabel;
    private javax.swing.JTextField TelefText;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JTextField UsuarioText;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
