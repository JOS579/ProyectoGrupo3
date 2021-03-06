package InterfazG3;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import HotelG3.UsuarioG3;

public class LoginG3 extends JFrame{

	 public LoginG3() {
	        initComponents();
	        this.setLocationRelativeTo(this);
	        this.setVisible(true);
	        this.setResizable(false);
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    private void initComponents() {

	        UsuarioText = new javax.swing.JTextField();
	        PasswordText = new javax.swing.JTextField();
	        UsuarioLabel = new javax.swing.JLabel();
	        UsuarioLabel1 = new javax.swing.JLabel();
	        EntrarButton = new javax.swing.JButton();
	        CrearButton = new javax.swing.JButton();
	        UserIcon = new javax.swing.JLabel();
	        TituloLabel = new javax.swing.JLabel();
	        LogoIcon = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Login");

	        UsuarioLabel.setText("Usuario:");

	        UsuarioLabel1.setText("Contraseņa:");

	        EntrarButton.setText("Entrar");
	        EntrarButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                EntrarButtonActionPerformed(evt);
	            }
	        });

	        CrearButton.setText("Crear");
	        CrearButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                CrearButtonActionPerformed(evt);
	            }
	        });

	        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usuario-60.png"))); // NOI18N

	        TituloLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
	        TituloLabel.setText("HOTELERIA GRUPO 3");
	        TituloLabel.setBackground(new java.awt.Color(10, 3, 208));
	        TituloLabel.setForeground(new java.awt.Color(10, 3, 208));

	        LogoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-información-del-hotel-48.png"))); // NOI18N

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(22, 22, 22)
	                        .addComponent(CrearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(UsuarioLabel1)
	                            .addComponent(UsuarioLabel)
	                            .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(UsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(69, 69, 69)
	                                .addComponent(EntrarButton))))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(71, 71, 71)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addComponent(UserIcon)
	                            .addComponent(TituloLabel))
	                        .addGap(26, 26, 26)
	                        .addComponent(LogoIcon)))
	                .addContainerGap(99, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(21, 21, 21)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(14, 14, 14)
	                        .addComponent(TituloLabel))
	                    .addComponent(LogoIcon))
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(CrearButton)
	                        .addGap(11, 11, 11))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(21, 21, 21)
	                        .addComponent(UserIcon)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(UsuarioLabel)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(UsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(UsuarioLabel1)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                        .addComponent(EntrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addContainerGap(28, Short.MAX_VALUE))))
	        );

	        pack();
	    }// </editor-fold>//GEN-END:initComponents

	    private void EntrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarButtonActionPerformed
	        // TODO add your handling code here:
	        String usuario = UsuarioText.getText();
	        String contraseņa = PasswordText.getText();
	        boolean sesion = UsuarioG3.verificarUsuario(usuario, contraseņa);
	        int pos = UsuarioG3.obtenerPOS(usuario, contraseņa);
	        if (sesion) {
	            this.dispose();
	            AdministraG3 ventana = new AdministraG3(pos);
	        } else {
	            JOptionPane.showMessageDialog(this, "Usuario o Contraseņa Incorrecta");
	        }
	    }//GEN-LAST:event_EntrarButtonActionPerformed

	    private void CrearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearButtonActionPerformed
	        // TODO add your handling code here:
	        RegistroG3 abrir = new RegistroG3();
	        abrir.setVisible(true);
	        this.dispose();
	        
	    }//GEN-LAST:event_CrearButtonActionPerformed

	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JButton CrearButton;
	    private javax.swing.JButton EntrarButton;
	    private javax.swing.JLabel LogoIcon;
	    private javax.swing.JTextField PasswordText;
	    private javax.swing.JLabel TituloLabel;
	    private javax.swing.JLabel UserIcon;
	    private javax.swing.JLabel UsuarioLabel;
	    private javax.swing.JLabel UsuarioLabel1;
	    private javax.swing.JTextField UsuarioText;
	    // End of variables declaration//GEN-END:variables
	}
