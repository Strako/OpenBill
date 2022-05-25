package proyecto_final;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class VentanaPrivacidad extends javax.swing.JFrame {
    
    /**
     * Se crea una forma VentanaPrivacidad
     */
    public VentanaPrivacidad() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);    
    }
    //metodo para inicializar componentes
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        CAceptar = new javax.swing.JCheckBox();
        BSalir = new javax.swing.JButton();
        BSiguiente = new javax.swing.JButton();
        SPrivacidad = new javax.swing.JScrollPane();
        TAPrivacidad = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        CAceptar.setText("Aceptar acuerdo de privacidad");
        CAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAceptarActionPerformed(evt);
            }
        });

        BSalir.setText("Salir");
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });

        BSiguiente.setText("Siguiente");
        BSiguiente.setEnabled(false);
        BSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSiguienteActionPerformed(evt);
            }
        });

        SPrivacidad.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        TAPrivacidad.setEditable(false);
        TAPrivacidad.setColumns(20);
        TAPrivacidad.setLineWrap(true);
        TAPrivacidad.setRows(5);
        TAPrivacidad.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean turpis mauris, feugiat id rhoncus sit amet, feugiat vel orci. Aliquam sed elementum nibh. Morbi ipsum risus, placerat eu enim id, eleifend interdum libero. Sed lectus mauris, maximus at augue a, fringilla pretium tortor. Aenean molestie, lacus a convallis suscipit, eros arcu finibus enim, id mattis urna sapien a tellus. Donec sed diam laoreet felis posuere tincidunt. Aenean sed felis ac odio varius ullamcorper a non elit.\n\nIn eleifend neque eget leo pretium maximus. Curabitur in ante ut tortor posuere mattis. Nullam eu suscipit velit. Morbi auctor massa imperdiet pellentesque vestibulum. Donec tellus lacus, aliquet non nunc non, accumsan blandit odio. Curabitur eget pretium diam. Praesent tincidunt nibh nec tellus lacinia pulvinar. Nunc facilisis, leo at placerat fringilla, mauris neque suscipit augue, non semper nibh risus nec tellus. Aliquam non rutrum tellus. Proin id ipsum eu nulla finibus luctus in eget elit. Maecenas dui dolor, finibus sit amet fermentum vestibulum, consectetur non ex. Nunc congue metus quis massa scelerisque, eu rhoncus mauris malesuada. Nulla at tellus vitae purus pharetra facilisis at in risus. Etiam dictum orci lectus.\n\nProin tellus justo, rutrum vitae nunc mattis, molestie cursus ex. Fusce accumsan magna sed nisl eleifend faucibus. In feugiat ante mauris, quis pulvinar arcu convallis ut. Proin feugiat nibh et sollicitudin accumsan. Pellentesque consequat semper nisi at eleifend. Nam suscipit, quam semper hendrerit ultricies, felis purus consequat odio, imperdiet rhoncus dui magna et erat. Vivamus blandit condimentum mi, ac aliquet erat. Fusce vel faucibus est.\n\nVivamus lacinia quis ex in blandit. Sed sed sollicitudin metus. Maecenas aliquet tempor ligula, in ultrices nunc convallis non. Sed ut ultrices dolor, at semper erat. Suspendisse vitae felis lacus. Ut hendrerit enim nec tortor ultricies ullamcorper. Etiam non arcu lectus. Nullam et felis condimentum, facilisis sapien eget, mollis ex. Vestibulum odio augue, venenatis at ullamcorper vitae, posuere porta orci.\n\nNulla bibendum felis a blandit eleifend. Nulla at lacus arcu. Cras quam lorem, sagittis eu est eu, viverra tincidunt nulla. Duis nec accumsan felis. Nulla aliquam sapien sit amet tincidunt varius. Sed sit amet aliquam eros. Donec non felis eu lorem ornare bibendum a in odio. Sed imperdiet interdum lorem vitae pellentesque. Phasellus viverra lacinia faucibus. Nunc a neque vestibulum sem dapibus aliquet. Sed congue cursus laoreet. Suspendisse vestibulum sem sed lectus finibus lacinia. Curabitur eget fringilla justo.");
        TAPrivacidad.setWrapStyleWord(true);
        TAPrivacidad.setCaretPosition(0);
        TAPrivacidad.setOpaque(false);
        SPrivacidad.setViewportView(TAPrivacidad);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(CAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BSalir)
                .addGap(18, 18, 18)
                .addComponent(BSiguiente)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(SPrivacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(SPrivacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CAceptar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BSalir)
                        .addComponent(BSiguiente)))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    private void CAceptarActionPerformed(java.awt.event.ActionEvent evt) {
        verifica();
    }

    private void BSiguienteActionPerformed(java.awt.event.ActionEvent evt) {
         try{
        proyecto_final.Ventana nueva = new proyecto_final.Ventana();
        this.dispose();
        }catch(Exception e){
            
        }
    }

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
     this.dispose();
     System.exit(WIDTH);
    }

    
    public void verifica(){
        try{
            if(SPrivacidad.getVerticalScrollBar().getValue()> 200){
           if(CAceptar.isSelected()==false){
                BSiguiente.setEnabled(false);
           }if(CAceptar.isSelected()==true){
                BSiguiente.setEnabled(true);
           }
            }else{
                JOptionPane.showMessageDialog(null, "Nesecitas leer nuestro aviso de privaciad", "Error", JOptionPane.WARNING_MESSAGE);
                CAceptar.setSelected(false);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    // Declaracion de variables
    private javax.swing.JButton BSalir;
    private javax.swing.JButton BSiguiente;
    private javax.swing.JCheckBox CAceptar;
    private javax.swing.JScrollPane SPrivacidad;
    private javax.swing.JTextArea TAPrivacidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    
}
