/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controlador.ContactoDAO;
import java.util.*;
import javax.swing.*;
import model.pojos.Contacto;

/**
 *
 * @author Daniela
 */
public class Directorio extends JFrame {
    
    private List<Contacto> contactos;
    private DefaultListModel model;
    
    /** Creates new form Directorio */
    
    public Directorio() {
        initComponents();
        
        cargarContactos(null);
        
        setVisible(true);
        pBarraBuscar.setVisible(true);
        pConsultarContacto.setVisible(false);
        pNuevoContacto.setVisible(false);
        pNoSeleccion.setVisible(true);
        pListaContactos.setVisible(true);
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBarraBuscar = new javax.swing.JPanel();
        lBuscar = new javax.swing.JLabel();
        tfBuscar = new javax.swing.JTextField();
        pNuevoContacto = new javax.swing.JPanel();
        lNuevoContactoNC = new javax.swing.JLabel();
        tfNombreNC = new javax.swing.JTextField();
        lTelefonoNC = new javax.swing.JLabel();
        tfTelefonoNC = new javax.swing.JTextField();
        lCorreoNC = new javax.swing.JLabel();
        tfCorreoNC = new javax.swing.JTextField();
        lFechaNC = new javax.swing.JLabel();
        lDireccionNC = new javax.swing.JLabel();
        tfDireccionNC = new javax.swing.JTextField();
        lNombreNC = new javax.swing.JLabel();
        lCancelarNC = new javax.swing.JLabel();
        lGuardarNC = new javax.swing.JLabel();
        lGuardarIconNC = new javax.swing.JLabel();
        dcFechaNC = new com.toedter.calendar.JDateChooser();
        lCancelarIconNC1 = new javax.swing.JLabel();
        pConsultarContacto = new javax.swing.JPanel();
        lNombreContactoCC = new javax.swing.JLabel();
        tfNombreCC = new javax.swing.JTextField();
        lTelefonoCC = new javax.swing.JLabel();
        tfTelefonoCC = new javax.swing.JTextField();
        lCorreoCC = new javax.swing.JLabel();
        tfCorreoCC = new javax.swing.JTextField();
        lFechaCC = new javax.swing.JLabel();
        lDireccionCC = new javax.swing.JLabel();
        tfDireccionCC = new javax.swing.JTextField();
        lEliminarCC = new javax.swing.JLabel();
        lCancelarCC = new javax.swing.JLabel();
        lModificarCC = new javax.swing.JLabel();
        lModificarIconCC = new javax.swing.JLabel();
        lNombreCC = new javax.swing.JLabel();
        lDiasCumpleaños = new javax.swing.JLabel();
        lDiasFaltantesCC = new javax.swing.JLabel();
        dcFechaCC = new com.toedter.calendar.JDateChooser();
        lCancelarIconCC1 = new javax.swing.JLabel();
        pNoSeleccion = new javax.swing.JPanel();
        pListaContactos = new javax.swing.JPanel();
        lNuevoContactoicon = new javax.swing.JLabel();
        lNuevoContacto = new javax.swing.JLabel();
        spContactos = new javax.swing.JScrollPane();
        listContactos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 590));
        setMinimumSize(new java.awt.Dimension(850, 590));
        setPreferredSize(new java.awt.Dimension(850, 590));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pBarraBuscar.setBackground(new java.awt.Color(211, 1, 0));
        pBarraBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Button Search.png"))); // NOI18N
        lBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lBuscarMouseClicked(evt);
            }
        });
        pBarraBuscar.add(lBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 9, 40, 40));

        tfBuscar.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        tfBuscar.setText("  Buscar");
        tfBuscar.setBorder(null);
        tfBuscar.setSelectionColor(new java.awt.Color(255, 255, 255));
        pBarraBuscar.add(tfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 40));

        getContentPane().add(pBarraBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 60));

        pNuevoContacto.setBackground(new java.awt.Color(243, 243, 243));
        pNuevoContacto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lNuevoContactoNC.setFont(new java.awt.Font("Futura", 1, 30)); // NOI18N
        lNuevoContactoNC.setText("Nuevo contacto");
        pNuevoContacto.add(lNuevoContactoNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        tfNombreNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        tfNombreNC.setBorder(null);
        tfNombreNC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreNCKeyTyped(evt);
            }
        });
        pNuevoContacto.add(tfNombreNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 510, -1));

        lTelefonoNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lTelefonoNC.setText("Telefono");
        pNuevoContacto.add(lTelefonoNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        tfTelefonoNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        tfTelefonoNC.setBorder(null);
        tfTelefonoNC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefonoNCKeyTyped(evt);
            }
        });
        pNuevoContacto.add(tfTelefonoNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 510, -1));

        lCorreoNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lCorreoNC.setText("Correo electronico");
        pNuevoContacto.add(lCorreoNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        tfCorreoNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        tfCorreoNC.setBorder(null);
        pNuevoContacto.add(tfCorreoNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 510, -1));

        lFechaNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lFechaNC.setText("Fecha de nacimiento");
        pNuevoContacto.add(lFechaNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lDireccionNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lDireccionNC.setText("Direccion");
        pNuevoContacto.add(lDireccionNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        tfDireccionNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        tfDireccionNC.setBorder(null);
        pNuevoContacto.add(tfDireccionNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 510, 70));

        lNombreNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lNombreNC.setText("Nombre");
        pNuevoContacto.add(lNombreNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lCancelarNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lCancelarNC.setForeground(new java.awt.Color(255, 255, 255));
        lCancelarNC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCancelarNC.setText("Cancelar");
        lCancelarNC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCancelarNCMouseClicked(evt);
            }
        });
        pNuevoContacto.add(lCancelarNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 90, 30));

        lGuardarNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lGuardarNC.setForeground(new java.awt.Color(255, 255, 255));
        lGuardarNC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lGuardarNC.setText("Guardar");
        lGuardarNC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lGuardarNCMouseClicked(evt);
            }
        });
        pNuevoContacto.add(lGuardarNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 90, 30));

        lGuardarIconNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lGuardarIconNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Button OK.png"))); // NOI18N
        pNuevoContacto.add(lGuardarIconNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        dcFechaNC.setBackground(new java.awt.Color(243, 243, 243));
        dcFechaNC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        pNuevoContacto.add(dcFechaNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 500, -1));

        lCancelarIconNC1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lCancelarIconNC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Button Cancel.png"))); // NOI18N
        pNuevoContacto.add(lCancelarIconNC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        getContentPane().add(pNuevoContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 620, 630));

        pConsultarContacto.setBackground(new java.awt.Color(243, 243, 243));
        pConsultarContacto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lNombreContactoCC.setFont(new java.awt.Font("Futura", 1, 30)); // NOI18N
        lNombreContactoCC.setText("Nombre contacto");
        pConsultarContacto.add(lNombreContactoCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        tfNombreCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        tfNombreCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreCCKeyTyped(evt);
            }
        });
        pConsultarContacto.add(tfNombreCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 510, -1));

        lTelefonoCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lTelefonoCC.setText("Telefono");
        pConsultarContacto.add(lTelefonoCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        tfTelefonoCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        tfTelefonoCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefonoCCKeyTyped(evt);
            }
        });
        pConsultarContacto.add(tfTelefonoCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 510, -1));

        lCorreoCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lCorreoCC.setText("Correo electronico");
        pConsultarContacto.add(lCorreoCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        tfCorreoCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        pConsultarContacto.add(tfCorreoCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 510, -1));

        lFechaCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lFechaCC.setText("Fecha de nacimiento");
        pConsultarContacto.add(lFechaCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        lDireccionCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lDireccionCC.setText("Direccion");
        pConsultarContacto.add(lDireccionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        tfDireccionCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        pConsultarContacto.add(tfDireccionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 510, 70));

        lEliminarCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lEliminarCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Button Trash.png"))); // NOI18N
        lEliminarCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lEliminarCCMouseClicked(evt);
            }
        });
        pConsultarContacto.add(lEliminarCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 30, 50));

        lCancelarCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lCancelarCC.setForeground(new java.awt.Color(255, 255, 255));
        lCancelarCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCancelarCC.setText("Cancelar");
        lCancelarCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCancelarCCMouseClicked(evt);
            }
        });
        pConsultarContacto.add(lCancelarCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 465, 100, 40));

        lModificarCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lModificarCC.setForeground(new java.awt.Color(255, 255, 255));
        lModificarCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lModificarCC.setText("Modificar");
        lModificarCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lModificarCCMousePressed(evt);
            }
        });
        pConsultarContacto.add(lModificarCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 90, 30));

        lModificarIconCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lModificarIconCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Button OK.png"))); // NOI18N
        pConsultarContacto.add(lModificarIconCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        lNombreCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lNombreCC.setText("Nombre");
        pConsultarContacto.add(lNombreCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lDiasCumpleaños.setBackground(new java.awt.Color(255, 255, 255));
        lDiasCumpleaños.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        lDiasCumpleaños.setForeground(new java.awt.Color(204, 0, 51));
        lDiasCumpleaños.setText("Dias para su cumpleaños:");
        pConsultarContacto.add(lDiasCumpleaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lDiasFaltantesCC.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        lDiasFaltantesCC.setForeground(new java.awt.Color(204, 0, 51));
        lDiasFaltantesCC.setText("18");
        pConsultarContacto.add(lDiasFaltantesCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        dcFechaCC.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        pConsultarContacto.add(dcFechaCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 500, -1));

        lCancelarIconCC1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lCancelarIconCC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Button Cancel.png"))); // NOI18N
        pConsultarContacto.add(lCancelarIconCC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        getContentPane().add(pConsultarContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 620, 630));

        pNoSeleccion.setBackground(new java.awt.Color(243, 243, 243));

        javax.swing.GroupLayout pNoSeleccionLayout = new javax.swing.GroupLayout(pNoSeleccion);
        pNoSeleccion.setLayout(pNoSeleccionLayout);
        pNoSeleccionLayout.setHorizontalGroup(
            pNoSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        pNoSeleccionLayout.setVerticalGroup(
            pNoSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(pNoSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 560, 630));

        pListaContactos.setBackground(new java.awt.Color(255, 255, 255));
        pListaContactos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lNuevoContactoicon.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lNuevoContactoicon.setIcon(new javax.swing.ImageIcon("/Users/dany/Downloads/Icons phonebook/fab.png")); // NOI18N
        pListaContactos.add(lNuevoContactoicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lNuevoContacto.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lNuevoContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNuevoContacto.setText("Nuevo contacto");
        lNuevoContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lNuevoContactoMousePressed(evt);
            }
        });
        pListaContactos.add(lNuevoContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 220, 40));

        spContactos.setBorder(null);
        spContactos.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N

        listContactos.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        listContactos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listContactos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listContactos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        listContactos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        listContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listContactosMouseClicked(evt);
            }
        });
        spContactos.setViewportView(listContactos);

        pListaContactos.add(spContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 420));

        getContentPane().add(pListaContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 310, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lCancelarCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCancelarCCMouseClicked
        pNoSeleccion.setVisible(true);
        pConsultarContacto.setVisible(false);
        pNuevoContacto.setVisible(false);
    }//GEN-LAST:event_lCancelarCCMouseClicked

    private void lGuardarNCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lGuardarNCMouseClicked
        if(!camposIncompletosNC()){
            Contacto nc = new Contacto(tfNombreNC.getText(), tfTelefonoNC.getText(), tfCorreoNC.getText(), 
                tfDireccionNC.getText(), dcFechaNC.getDate());
            if (ContactoDAO.registrar(nc)) {
                JOptionPane.showMessageDialog(this, "Contacto guardado correctamente");
                this.cargarContactos(null);
            } else {
                JOptionPane.showMessageDialog(this, "No se puedo guardar el contacto");
            }
        }
    }//GEN-LAST:event_lGuardarNCMouseClicked
        
    private void tfTelefonoNCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoNCKeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfTelefonoNCKeyTyped

    private void tfTelefonoCCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoCCKeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfTelefonoCCKeyTyped

    private void tfNombreCCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreCCKeyTyped
        char cha = evt.getKeyChar();
        if(Character.isDigit(cha)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfNombreCCKeyTyped

    private void tfNombreNCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreNCKeyTyped
        char cha = evt.getKeyChar();
        if(Character.isDigit(cha)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tfNombreNCKeyTyped

    private void listContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listContactosMouseClicked
        try {
            Contacto c = contactos.get(listContactos.getSelectedIndex());
            
            tfNombreCC.setText(c.getNombre());
            //txt_Apodo.setText(c.getApodo());
            tfTelefonoCC.setText(c.getTelefono());
            tfDireccionCC.setText(c.getDireccion());
            tfCorreoCC.setText(c.getEmail());
            dcFechaCC.setDate(c.getFechaNacimiento());
            lNombreContactoCC.setText(c.getNombre());
            
            pConsultarContacto.setVisible(true);
            pNoSeleccion.setVisible(false);
            pNuevoContacto.setVisible(false);
            
            Date current = new Date();
            // int dias=(int) ((c.getFechaNacimiento().getTime()-current.getTime())/86400000);
        } catch (Exception ev) {
            System.out.println("Fijar mouse antes de hacer click derecho");
        }
    }//GEN-LAST:event_listContactosMouseClicked

    private void lEliminarCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lEliminarCCMouseClicked
        int resultado = JOptionPane.showConfirmDialog(this,
                "¿Desea eliminar el contacto seleccionado?", "Eliminar Contacto",
                JOptionPane.YES_NO_OPTION);
        Contacto c = contactos.get(listContactos.getSelectedIndex());
        if (resultado == 0) {
            int id = (contactos.get(listContactos.getSelectedIndex()).getIdContacto());
            if (ContactoDAO.eliminar(id)) {
                //JOptionPane.showMessageDialog(this, "Contacto eliminado");
                this.cargarContactos(null);
            } else {
                JOptionPane.showMessageDialog(this, "No se puedo eliminar el contacto");
            }
        }
    }//GEN-LAST:event_lEliminarCCMouseClicked

    private void lBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lBuscarMouseClicked
        if (this.lBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Búsqueda Vacía");
            return;
        }
        String nombre = this.lBuscar.getText();
        this.cargarContactos(nombre);
    }//GEN-LAST:event_lBuscarMouseClicked

    private void lCancelarNCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCancelarNCMouseClicked
        pNoSeleccion.setVisible(true);
        pConsultarContacto.setVisible(false);
        pNuevoContacto.setVisible(false);
    }//GEN-LAST:event_lCancelarNCMouseClicked

    private void lModificarCCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lModificarCCMousePressed
        if(!camposIncompletosCC()){
            int resultado = JOptionPane.showConfirmDialog(this, "¿Desea modificar los datos del contacto?",
                        "Modificar Contacto", JOptionPane.YES_NO_OPTION);
            Contacto c = contactos.get(listContactos.getSelectedIndex());
            if(resultado == 0){
                int id = contactos.get(listContactos.getSelectedIndex()).getIdContacto();
                Contacto nc = new Contacto(c.getIdContacto(), lNombreCC.getText(), lTelefonoCC.getText(),
                    lCorreoCC.getText(), lDireccionCC.getText(), dcFechaCC.getDate());
                if(ContactoDAO.actualizar(nc)){
                    JOptionPane.showMessageDialog(this, "Contacto modificado correctamente");
                    this.cargarContactos(null);
                }else{
                    JOptionPane.showMessageDialog(this, "No se puedo modificar el contacto");
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Campos Incompletos");
        }
    }//GEN-LAST:event_lModificarCCMousePressed

    private void lNuevoContactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lNuevoContactoMousePressed
        pNoSeleccion.setVisible(false);
        pConsultarContacto.setVisible(false);
        pNuevoContacto.setVisible(true);
        
        tfNombreNC.setText("");
        tfTelefonoNC.setText("");
        tfCorreoNC.setText("");
        dcFechaNC.setDate(new Date());
        tfDireccionNC.setText("");
    }//GEN-LAST:event_lNuevoContactoMousePressed
    
    private boolean camposIncompletosNC(){
        boolean camposVacios = false;
        if(tfNombreNC.getText().isEmpty() || tfTelefonoNC.getText().isEmpty() ||
            tfCorreoNC.getText().isEmpty() || tfDireccionNC.getText().isEmpty()){
            camposVacios = true;
        }
        return camposVacios;
    } 
    
    private boolean camposIncompletosCC(){
        boolean camposVacios = false;
        if(tfNombreCC.getText().isEmpty() || tfTelefonoCC.getText().isEmpty() ||
            tfCorreoCC.getText().isEmpty() || tfDireccionCC.getText().isEmpty()){
            camposVacios = true;
        }
        return camposVacios;
    }
    
    private void cargarContactos(String nombre){
        if (nombre == null) {
            contactos = ContactoDAO.getAllContactos();
        } else {
            contactos = ContactoDAO.buscarContacto(nombre);
        }
        model = new DefaultListModel();
        if (contactos != null) {
            for (Contacto c : contactos) {
                model.addElement(c.getNombre());
            }
            listContactos.setModel(model);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Directorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dcFechaCC;
    private com.toedter.calendar.JDateChooser dcFechaNC;
    private javax.swing.JLabel lBuscar;
    private javax.swing.JLabel lCancelarCC;
    private javax.swing.JLabel lCancelarIconCC1;
    private javax.swing.JLabel lCancelarIconNC1;
    private javax.swing.JLabel lCancelarNC;
    private javax.swing.JLabel lCorreoCC;
    private javax.swing.JLabel lCorreoNC;
    private javax.swing.JLabel lDiasCumpleaños;
    private javax.swing.JLabel lDiasFaltantesCC;
    private javax.swing.JLabel lDireccionCC;
    private javax.swing.JLabel lDireccionNC;
    private javax.swing.JLabel lEliminarCC;
    private javax.swing.JLabel lFechaCC;
    private javax.swing.JLabel lFechaNC;
    private javax.swing.JLabel lGuardarIconNC;
    private javax.swing.JLabel lGuardarNC;
    private javax.swing.JLabel lModificarCC;
    private javax.swing.JLabel lModificarIconCC;
    private javax.swing.JLabel lNombreCC;
    private javax.swing.JLabel lNombreContactoCC;
    private javax.swing.JLabel lNombreNC;
    private javax.swing.JLabel lNuevoContacto;
    private javax.swing.JLabel lNuevoContactoNC;
    private javax.swing.JLabel lNuevoContactoicon;
    private javax.swing.JLabel lTelefonoCC;
    private javax.swing.JLabel lTelefonoNC;
    private javax.swing.JList<String> listContactos;
    private javax.swing.JPanel pBarraBuscar;
    private javax.swing.JPanel pConsultarContacto;
    private javax.swing.JPanel pListaContactos;
    private javax.swing.JPanel pNoSeleccion;
    private javax.swing.JPanel pNuevoContacto;
    private javax.swing.JScrollPane spContactos;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfCorreoCC;
    private javax.swing.JTextField tfCorreoNC;
    private javax.swing.JTextField tfDireccionCC;
    private javax.swing.JTextField tfDireccionNC;
    private javax.swing.JTextField tfNombreCC;
    private javax.swing.JTextField tfNombreNC;
    private javax.swing.JTextField tfTelefonoCC;
    private javax.swing.JTextField tfTelefonoNC;
    // End of variables declaration//GEN-END:variables

}
