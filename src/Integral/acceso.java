/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * acceso.java
 *
 * Created on 19/01/2012, 02:01:25 PM
 */
package Integral;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import Hibernate.entidades.Usuario;
import Hibernate.Util.HibernateUtil;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author ISC_SALVADOR
 */
public class acceso extends javax.swing.JDialog {

    public static final List RET_CANCEL =null;
    Hilo miHilo;
    InputMap map = new InputMap();
    private List returnStatus = RET_CANCEL;
    public String ruta="";
    
    /** Creates new form acceso */
    public acceso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");   
        initComponents();
        this.t_usuario.setEnabled(false);
        this.t_clave.setEnabled(false);
        this.bentrar.setEnabled(false);
        b_conexion.setVisible(false);
        progreso.setIndeterminate(true);
        progreso.setString("INICIANDO SERVICIO");
        bentrar.setInputMap(0, map);
        t_usuario.requestFocus();
        miHilo = new Hilo();
    }

    
    private void doClose(Usuario actor) {
        returnStatus=new ArrayList();
        returnStatus.add(actor);
        returnStatus.add("16");
        dispose();
    }
    
    public List getReturnStatus() {
        return returnStatus;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bentrar = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();
        t_clave = new javax.swing.JPasswordField();
        t_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        progreso = new javax.swing.JProgressBar();
        b_conexion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acceso");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true), "Ingrese sus Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(204, 204, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 204, 0));
        jPanel1.setOpaque(false);

        bentrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bentrar.setForeground(new java.awt.Color(0, 51, 153));
        bentrar.setIcon(new ImageIcon("imagenes/luck.png"));
        bentrar.setText("Entrar");
        bentrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bentrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        bentrar.setRolloverIcon(new ImageIcon("imagenes/unluk.png"));
        bentrar.setSelectedIcon(new ImageIcon("imagenes/unluk.png"));
        bentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bentrarActionPerformed(evt);
            }
        });

        bsalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bsalir.setForeground(new java.awt.Color(0, 51, 153));
        bsalir.setIcon(new ImageIcon("imagenes/close.png"));
        bsalir.setText("Salir");
        bsalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bsalir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        bsalir.setRolloverIcon(new ImageIcon("imagenes/open.png"));
        bsalir.setSelectedIcon(new ImageIcon("imagenes/open.png"));
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        t_clave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_claveFocusGained(evt);
            }
        });
        t_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_claveActionPerformed(evt);
            }
        });
        t_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_claveKeyTyped(evt);
            }
        });

        t_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usuarioFocusGained(evt);
            }
        });
        t_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_usuarioActionPerformed(evt);
            }
        });
        t_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_usuarioKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("USUARIO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("CONTRASEÑA:");

        jLabel5.setIcon(new ImageIcon("imagenes/procesos.png"));

        progreso.setString("");
        progreso.setStringPainted(true);

        b_conexion.setText("Reintentar");
        b_conexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_conexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(t_clave)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(b_conexion))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bentrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bsalir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bentrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_conexion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 250));

        jLabel3.setIcon(new ImageIcon("imagenes/VOLVOf.jpg"));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_usuarioActionPerformed
        t_clave.requestFocus();
}//GEN-LAST:event_t_usuarioActionPerformed

    private void t_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_claveActionPerformed
        bentrar.requestFocus();
}//GEN-LAST:event_t_claveActionPerformed

    private void bentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bentrarActionPerformed
        if(t_usuario.getText().compareTo("")!=0)
        {
            if(t_clave.getText().compareTo("")!=0)
            {
                Session session = HibernateUtil.getSessionFactory().openSession();
                try
                {
                    Query q = session.createQuery("from Usuario usr "+ "where usr.idUsuario='" + t_usuario.getText() + "' and usr.clave='" + t_clave.getText() + "'");
                    Usuario objeto = (Usuario)q.uniqueResult();
                    if(objeto!=null)
                    {
                        if(session.isOpen())
                            session.close();
                        doClose(objeto);
                    }
                    else
                    {
                        if(session.isOpen())
                            session.close();
                        JOptionPane.showMessageDialog(null, "Datos incorrectos");
                        t_usuario.requestFocus();
                    }
                }catch(Exception e)
                {
                    System.out.println(e);
                }
                finally
                {
                    if(session!=null)
                        if(session.isOpen())
                            session.close();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Falta la clave");
                t_clave.requestFocus();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Falta el usuario");
            t_usuario.requestFocus();
        }
    }//GEN-LAST:event_bentrarActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bsalirActionPerformed

    private void t_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_usuarioKeyTyped
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        if(t_usuario.getText().length()>=10)
            evt.consume();
    }//GEN-LAST:event_t_usuarioKeyTyped

    private void t_claveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_claveKeyTyped
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        if(t_clave.getText().length()>=10)
            evt.consume();
    }//GEN-LAST:event_t_claveKeyTyped

    private void b_conexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_conexionActionPerformed
        this.t_usuario.setEnabled(false);
        this.t_clave.setEnabled(false);
        this.bentrar.setEnabled(false);
        b_conexion.setVisible(false);
        progreso.setIndeterminate(true);
        progreso.setString("INICIANDO SERVICIO");
        t_usuario.requestFocus();
        miHilo = new Hilo();
    }//GEN-LAST:event_b_conexionActionPerformed

    private void t_usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usuarioFocusGained
        t_usuario.setSelectionStart(0); 
        t_usuario.setSelectionEnd(t_usuario.getText().length()); 
    }//GEN-LAST:event_t_usuarioFocusGained

    private void t_claveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_claveFocusGained
        t_clave.setSelectionStart(0); 
        t_clave.setSelectionEnd(t_clave.getText().length()); 
    }//GEN-LAST:event_t_claveFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                acceso dialog = new acceso(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_conexion;
    private javax.swing.JButton bentrar;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JProgressBar progreso;
    private javax.swing.JPasswordField t_clave;
    private javax.swing.JTextField t_usuario;
    // End of variables declaration//GEN-END:variables

    public void cargaPeriodo()
    {
        try
        {
            progreso.setString("CARCANDO ARCHIVOS");
            FileReader fil = new FileReader("config.txt");
            BufferedReader b = new BufferedReader(fil);
            if((ruta = b.readLine())==null)
                ruta="";
            b.close();
            progreso.setString("CONECTANDO");
            Session session = HibernateUtil.getSessionFactory().openSession();
            try
            {
                this.t_usuario.setEnabled(true);
                this.t_clave.setEnabled(true);
                this.bentrar.setEnabled(true);
                b_conexion.setVisible(false);
                progreso.setIndeterminate(false);
                progreso.setString("LISTO");
                this.t_usuario.requestFocus();
                this.setVisible(true);
            }catch(HibernateException | HeadlessException | NumberFormatException e)
            {
                System.out.println("error "+e);
            }
            if(session.isOpen())
               session.close();
            session=null;
        }catch(Exception e)
        {
            this.t_usuario.setEnabled(false);
            this.t_clave.setEnabled(false);
            this.bentrar.setEnabled(false);
            b_conexion.setVisible(true);
            progreso.setIndeterminate(false);
            progreso.setString("ERROR DE CONEXION");
        }
    }
    
    public class Hilo implements Runnable
    {
        Thread t;
        public Hilo() 
        {
            t=new Thread(this,"Conexion");
            t.start();
        }
        @Override
        public void run() {
            cargaPeriodo();
        }
    }
}
