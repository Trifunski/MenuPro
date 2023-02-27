package menu;

import javax.swing.border.LineBorder;
import java.awt.SystemColor;

/**
 *
 * @author mijai
 */

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Menu");
        this.setIconImage(new javax.swing.ImageIcon("imagenes/icono.png").getImage());
        Formulario.setVisible(false);
        Listado.setVisible(false);
        BuscarPersona.setVisible(false);
        Exportar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
                          
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        TextoMenu = new javax.swing.JLabel();
        BtnAñadirPersona = new javax.swing.JLabel();
        BtnListarPersona = new javax.swing.JLabel();
        BtnBuscarPersona = new javax.swing.JLabel();
        BtnExportar = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        Formulario = new javax.swing.JPanel();
        TextoFormulario = new javax.swing.JLabel();
        LabelID = new javax.swing.JLabel();
        FieldID = new javax.swing.JTextField();
        LabelNombre = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        LabelApellido = new javax.swing.JLabel();
        FieldApellido = new javax.swing.JTextField();
        LabelAñoNacimiento = new javax.swing.JLabel();
        FieldAñoNacimiento = new javax.swing.JTextField();
        LabelCorreo = new javax.swing.JLabel();
        FieldCorreo = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JLabel();
        Listado = new javax.swing.JPanel();
        ScrollPanelListado = new javax.swing.JScrollPane();
        TextAreaListado = new javax.swing.JTextArea();
        TextoListado = new javax.swing.JLabel();
        BtnVolverListado = new javax.swing.JLabel();
        BuscarPersona = new javax.swing.JPanel();
        TextoBuscarPersona = new javax.swing.JLabel();
        BtnVolverBuscar = new javax.swing.JLabel();
        TextoIntroduceID = new javax.swing.JLabel();
        FieldIntroduceID = new javax.swing.JTextField();
        BtnBuscarID = new javax.swing.JLabel();
        FieldMostrarPersona = new javax.swing.JTextField();
        Exportar = new javax.swing.JPanel();
        TextoExportar = new javax.swing.JLabel();
        BtnVolverExportar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setBackground(new java.awt.Color(0, 0, 0));
        Menu.setMinimumSize(new java.awt.Dimension(900, 800));

        TextoMenu.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        TextoMenu.setForeground(new java.awt.Color(255, 255, 255));
        TextoMenu.setText("MENU");

        BtnAñadirPersona.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnAñadirPersona.setForeground(new java.awt.Color(255, 255, 255));
        BtnAñadirPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnAñadirPersona.setText("AÑADIR PERSONA");
        BtnAñadirPersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnAñadirPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAñadirPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAñadirPersonaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAñadirPersonaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAñadirPersonaMouseExited(evt);
            }
        });

        BtnListarPersona.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnListarPersona.setForeground(new java.awt.Color(255, 255, 255));
        BtnListarPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnListarPersona.setText("LISTAR PERSONA");
        BtnListarPersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnListarPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnListarPersona.setPreferredSize(new java.awt.Dimension(125, 40));
        BtnListarPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnListarPersonaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnListarPersonaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnListarPersonaMouseExited(evt);
            }
        });

        BtnBuscarPersona.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnBuscarPersona.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscarPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnBuscarPersona.setText("BUSCAR PERSONA");
        BtnBuscarPersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnBuscarPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscarPersona.setPreferredSize(new java.awt.Dimension(131, 40));
        BtnBuscarPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarPersonaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBuscarPersonaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnBuscarPersonaMouseExited(evt);
            }
        });

        BtnExportar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnExportar.setForeground(new java.awt.Color(255, 255, 255));
        BtnExportar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnExportar.setText("EXPORTAR");
        BtnExportar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnExportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnExportar.setPreferredSize(new java.awt.Dimension(78, 40));
        BtnExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnExportarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnExportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnExportarMouseExited(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnSalir.setText("SALIR");
        BtnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.setPreferredSize(new java.awt.Dimension(53, 40));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoMenu)
                    .addComponent(BtnAñadirPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnListarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(379, Short.MAX_VALUE))
        );

        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(TextoMenu)
                .addGap(50, 50, 50)
                .addComponent(BtnAñadirPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BtnListarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BtnBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BtnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        Formulario.setBackground(new java.awt.Color(0, 0, 0));

        TextoFormulario.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        TextoFormulario.setForeground(new java.awt.Color(255, 255, 255));
        TextoFormulario.setText("FORMULARIO");

        LabelID.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelID.setForeground(new java.awt.Color(255, 255, 255));
        LabelID.setText("Id");

        FieldID.setBackground(new java.awt.Color(0, 0, 0));
        FieldID.setForeground(new java.awt.Color(255, 255, 255));
        FieldID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        FieldID.setMinimumSize(new java.awt.Dimension(64, 40));
        FieldID.setPreferredSize(new java.awt.Dimension(3, 18));
        FieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldIDActionPerformed(evt);
            }
        });

        LabelNombre.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre.setText("Nombre");

        FieldNombre.setBackground(new java.awt.Color(0, 0, 0));
        FieldNombre.setForeground(new java.awt.Color(255, 255, 255));
        FieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        FieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNombreActionPerformed(evt);
            }
        });

        LabelApellido.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelApellido.setForeground(new java.awt.Color(255, 255, 255));
        LabelApellido.setText("Apellidos");

        FieldApellido.setBackground(new java.awt.Color(0, 0, 0));
        FieldApellido.setForeground(new java.awt.Color(255, 255, 255));
        FieldApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        LabelAñoNacimiento.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelAñoNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        LabelAñoNacimiento.setText("Año de Nacimiento");

        FieldAñoNacimiento.setBackground(new java.awt.Color(0, 0, 0));
        FieldAñoNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        FieldAñoNacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        FieldAñoNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldAñoNacimientoActionPerformed(evt);
            }
        });

        LabelCorreo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        LabelCorreo.setText("Correo Electronico");

        FieldCorreo.setBackground(new java.awt.Color(0, 0, 0));
        FieldCorreo.setForeground(new java.awt.Color(255, 255, 255));
        FieldCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        BtnGuardar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnGuardar.setText("Guardar");
        BtnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnVolver.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnVolver.setText("<--");
        BtnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVolverMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FormularioLayout = new javax.swing.GroupLayout(Formulario);
        Formulario.setLayout(FormularioLayout);

        FormularioLayout.setHorizontalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(TextoFormulario))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCorreo)
                            .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FormularioLayout.createSequentialGroup()
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelApellido)
                                    .addComponent(FieldApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(LabelID)
                                    .addComponent(FieldID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelNombre)
                                    .addComponent(LabelAñoNacimiento)
                                    .addComponent(FieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(FieldAñoNacimiento)))))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        FormularioLayout.setVerticalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(TextoFormulario)
                .addGap(78, 78, 78)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelID)
                    .addComponent(LabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelApellido)
                    .addComponent(LabelAñoNacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(LabelCorreo)
                .addGap(18, 18, 18)
                .addComponent(FieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        Listado.setBackground(new java.awt.Color(0, 0, 0));

        TextAreaListado.setBackground(new java.awt.Color(0, 0, 0));
        TextAreaListado.setColumns(20);
        TextAreaListado.setForeground(new java.awt.Color(255, 255, 255));
        TextAreaListado.setRows(5);
        TextAreaListado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextAreaListado.setFocusable(false);
        TextAreaListado.setPreferredSize(new java.awt.Dimension(224, 82));
        ScrollPanelListado.setViewportView(TextAreaListado);

        TextoListado.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        TextoListado.setForeground(new java.awt.Color(255, 255, 255));
        TextoListado.setText("LISTADO DE PERSONAS");

        BtnVolverListado.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        BtnVolverListado.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolverListado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnVolverListado.setText("<--");
        BtnVolverListado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnVolverListado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVolverListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnVolverListadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVolverListadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVolverListadoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ListadoLayout = new javax.swing.GroupLayout(Listado);
        Listado.setLayout(ListadoLayout);

        ListadoLayout.setHorizontalGroup(
            ListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadoLayout.createSequentialGroup()
                .addGroup(ListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListadoLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(TextoListado))
                    .addGroup(ListadoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(ListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnVolverListado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScrollPanelListado, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        ListadoLayout.setVerticalGroup(
            ListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListadoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BtnVolverListado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoListado)
                .addGap(18, 18, 18)
                .addComponent(ScrollPanelListado, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        BuscarPersona.setBackground(new java.awt.Color(0, 0, 0));

        TextoBuscarPersona.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        TextoBuscarPersona.setForeground(new java.awt.Color(255, 255, 255));
        TextoBuscarPersona.setText("BUSCAR PERSONA");

        BtnVolverBuscar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        BtnVolverBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolverBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnVolverBuscar.setText("<--");
        BtnVolverBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnVolverBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVolverBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnVolverBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVolverBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVolverBuscarMouseExited(evt);
            }
        });

        TextoIntroduceID.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        TextoIntroduceID.setForeground(new java.awt.Color(255, 255, 255));
        TextoIntroduceID.setText("Introduce el ID");

        FieldIntroduceID.setBackground(new java.awt.Color(0, 0, 0));
        FieldIntroduceID.setForeground(new java.awt.Color(255, 255, 255));
        FieldIntroduceID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        BtnBuscarID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnBuscarID.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnBuscarID.setText("Buscar");
        BtnBuscarID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        FieldMostrarPersona.setBackground(new java.awt.Color(0, 0, 0));
        FieldMostrarPersona.setForeground(new java.awt.Color(255, 255, 255));
        FieldMostrarPersona.setActionCommand("<Not Set>");
        FieldMostrarPersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        FieldMostrarPersona.setFocusable(false);
        FieldMostrarPersona.setMinimumSize(new java.awt.Dimension(63, 22));

        javax.swing.GroupLayout BuscarPersonaLayout = new javax.swing.GroupLayout(BuscarPersona);
        BuscarPersona.setLayout(BuscarPersonaLayout);

        BuscarPersonaLayout.setHorizontalGroup(
            BuscarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarPersonaLayout.createSequentialGroup()
                .addGroup(BuscarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuscarPersonaLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(TextoBuscarPersona))
                    .addGroup(BuscarPersonaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BtnVolverBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BuscarPersonaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(BuscarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoIntroduceID)
                            .addGroup(BuscarPersonaLayout.createSequentialGroup()
                                .addComponent(FieldIntroduceID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FieldMostrarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        BuscarPersonaLayout.setVerticalGroup(
            BuscarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarPersonaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BtnVolverBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoBuscarPersona)
                .addGap(136, 136, 136)
                .addComponent(TextoIntroduceID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldIntroduceID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(FieldMostrarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        Exportar.setBackground(new java.awt.Color(0, 0, 0));

        TextoExportar.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        TextoExportar.setForeground(new java.awt.Color(255, 255, 255));
        TextoExportar.setText("EXPORTAR");

        BtnVolverExportar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        BtnVolverExportar.setForeground(new java.awt.Color(255, 255, 255));
        BtnVolverExportar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnVolverExportar.setText("<--");
        BtnVolverExportar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BtnVolverExportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVolverExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnVolverExportarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVolverExportarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVolverExportarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExportarLayout = new javax.swing.GroupLayout(Exportar);
        Exportar.setLayout(ExportarLayout);

        ExportarLayout.setHorizontalGroup(
            ExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExportarLayout.createSequentialGroup()
                .addGroup(ExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExportarLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(TextoExportar))
                    .addGroup(ExportarLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BtnVolverExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(352, Short.MAX_VALUE))
        );

        ExportarLayout.setVerticalGroup(
            ExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExportarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BtnVolverExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(TextoExportar)
                .addContainerGap(650, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Listado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Listado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Exportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Menu.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>                        

    private void BtnAñadirPersonaMouseClicked(java.awt.event.MouseEvent evt) {                                              
        Menu.setVisible(false);
        Formulario.setVisible(true);
    }                                             

    private void BtnAñadirPersonaMouseEntered(java.awt.event.MouseEvent evt) {                                              
        BtnAñadirPersona.setBorder(new LineBorder(SystemColor.GRAY));
    }                                             

    private void BtnAñadirPersonaMouseExited(java.awt.event.MouseEvent evt) {                                             
        BtnAñadirPersona.setBorder(new LineBorder(SystemColor.white));
    }                                            

    private void BtnListarPersonaMouseClicked(java.awt.event.MouseEvent evt) {                                              
        Menu.setVisible(false);
        Listado.setVisible(true);
        ScrollPanelListado.setVisible(true);
    }                                             

    private void BtnListarPersonaMouseEntered(java.awt.event.MouseEvent evt) {                                              
        BtnListarPersona.setBorder(new LineBorder(SystemColor.GRAY));
    }                                             

    private void BtnListarPersonaMouseExited(java.awt.event.MouseEvent evt) {                                             
        BtnListarPersona.setBorder(new LineBorder(SystemColor.white));
    }                                            

    private void BtnBuscarPersonaMouseClicked(java.awt.event.MouseEvent evt) {                                              
        Menu.setVisible(false);
        BuscarPersona.setVisible(true);
    }                                             

    private void BtnBuscarPersonaMouseEntered(java.awt.event.MouseEvent evt) {                                              
        BtnBuscarPersona.setBorder(new LineBorder(SystemColor.GRAY));
    }                                             

    private void BtnBuscarPersonaMouseExited(java.awt.event.MouseEvent evt) {                                             
        BtnBuscarPersona.setBorder(new LineBorder(SystemColor.white));
    }                                            

    private void BtnExportarMouseClicked(java.awt.event.MouseEvent evt) {                                         
        Menu.setVisible(false);
        Exportar.setVisible(true);
    }                                        

    private void BtnExportarMouseEntered(java.awt.event.MouseEvent evt) {                                         
        BtnExportar.setBorder(new LineBorder(SystemColor.GRAY));
    }                                        

    private void BtnExportarMouseExited(java.awt.event.MouseEvent evt) {                                        
        BtnExportar.setBorder(new LineBorder(SystemColor.white));
    }                                       

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {                                      
        System.exit(0);
    }                                     

    private void BtnSalirMouseEntered(java.awt.event.MouseEvent evt) {                                      
        BtnSalir.setBorder(new LineBorder(SystemColor.GRAY));
    }                                     

    private void BtnSalirMouseExited(java.awt.event.MouseEvent evt) {                                     
        BtnSalir.setBorder(new LineBorder(SystemColor.white));
    }                                                                                   

    private void BtnVolverMouseClicked(java.awt.event.MouseEvent evt) {                                       
        Menu.setVisible(true);
        Formulario.setVisible(false);
    }                                      

    private void BtnVolverMouseEntered(java.awt.event.MouseEvent evt) {                                       
        BtnVolver.setBorder(new LineBorder(SystemColor.GRAY));
    }                                      

    private void BtnVolverMouseExited(java.awt.event.MouseEvent evt) {                                      
        BtnVolver.setBorder(new LineBorder(SystemColor.white));
    }                                     

    private void BtnVolverListadoMouseClicked(java.awt.event.MouseEvent evt) {                                              
        Menu.setVisible(true);
        Listado.setVisible(false);
    }                                             

    private void BtnVolverListadoMouseEntered(java.awt.event.MouseEvent evt) {                                              
        BtnVolverListado.setBorder(new LineBorder(SystemColor.GRAY));
    }                                             

    private void BtnVolverListadoMouseExited(java.awt.event.MouseEvent evt) {                                             
        BtnVolverListado.setBorder(new LineBorder(SystemColor.white));
    }                                            

    private void BtnVolverBuscarMouseClicked(java.awt.event.MouseEvent evt) {                                             
        Menu.setVisible(true);
        BuscarPersona.setVisible(false);
    }                                            

    private void BtnVolverBuscarMouseEntered(java.awt.event.MouseEvent evt) {                                             
        BtnVolverBuscar.setBorder(new LineBorder(SystemColor.gray));
    }                                            

    private void BtnVolverBuscarMouseExited(java.awt.event.MouseEvent evt) {                                            
        BtnVolverBuscar.setBorder(new LineBorder(SystemColor.white));
    }                                           

    private void BtnVolverExportarMouseClicked(java.awt.event.MouseEvent evt) {                                               
        Menu.setVisible(true);
        Exportar.setVisible(false);
    }                                              

    private void BtnVolverExportarMouseEntered(java.awt.event.MouseEvent evt) {                                               
        BtnVolverExportar.setBorder(new LineBorder(SystemColor.gray));
    }                                              

    private void BtnVolverExportarMouseExited(java.awt.event.MouseEvent evt) {                                              
        BtnVolverExportar.setBorder(new LineBorder(SystemColor.white));
    }                                             
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
                
    private javax.swing.JLabel BtnAñadirPersona;
    private javax.swing.JLabel BtnBuscarID;
    private javax.swing.JLabel BtnBuscarPersona;
    private javax.swing.JLabel BtnExportar;
    private javax.swing.JLabel BtnGuardar;
    private javax.swing.JLabel BtnListarPersona;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JLabel BtnVolver;
    private javax.swing.JLabel BtnVolverBuscar;
    private javax.swing.JLabel BtnVolverExportar;
    private javax.swing.JLabel BtnVolverListado;
    private javax.swing.JPanel BuscarPersona;
    private javax.swing.JPanel Exportar;
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JTextField FieldAñoNacimiento;
    private javax.swing.JTextField FieldCorreo;
    private javax.swing.JTextField FieldID;
    private javax.swing.JTextField FieldIntroduceID;
    private javax.swing.JTextField FieldMostrarPersona;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JPanel Formulario;
    private javax.swing.JLabel LabelApellido;
    private javax.swing.JLabel LabelAñoNacimiento;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JPanel Listado;
    private javax.swing.JPanel Menu;
    private javax.swing.JScrollPane ScrollPanelListado;
    private javax.swing.JTextArea TextAreaListado;
    private javax.swing.JLabel TextoBuscarPersona;
    private javax.swing.JLabel TextoExportar;
    private javax.swing.JLabel TextoFormulario;
    private javax.swing.JLabel TextoIntroduceID;
    private javax.swing.JLabel TextoListado;
    private javax.swing.JLabel TextoMenu;                  
}