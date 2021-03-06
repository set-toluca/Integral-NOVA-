/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipo;

import Hibernate.Util.HibernateUtil;
import Hibernate.entidades.Tipo;
import Hibernate.entidades.Usuario;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import Integral.Herramientas;
/**
 *
 * @author ESPECIALIZADO TOLUCA
 */
public class altaTipo extends javax.swing.JDialog {
    
    public static final Tipo RET_CANCEL =null;
    InputMap map = new InputMap();
    DefaultTableModel model;
    Usuario user;
    String sessionPrograma;
    Herramientas h;
    private Tipo returnStatus;
    
    /** Creates new form acceso */
    public altaTipo(java.awt.Frame parent, boolean modal, Usuario u, String ses) {
        super(parent, modal);
        user=u;
        sessionPrograma=ses;
        initComponents();
        Nombre.requestFocus();
    }
    
    private void doClose(Tipo o) {
        returnStatus = o;
        setVisible(false);
        dispose();
    }
    
    public Tipo getReturnStatus() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_guardar = new javax.swing.JButton();
        cb_ep = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de tipo de unidad");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 255));
        jLabel8.setText("Tipo");

        Nombre.setNextFocusableComponent(cb_ep);
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        b_cancelar.setBackground(new java.awt.Color(2, 135, 242));
        b_cancelar.setForeground(new java.awt.Color(254, 254, 254));
        b_cancelar.setIcon(new ImageIcon("imagenes/cancelar.png"));
        b_cancelar.setText("Cancelar");
        b_cancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_cancelar.setNextFocusableComponent(Nombre);
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_guardar.setBackground(new java.awt.Color(2, 135, 242));
        b_guardar.setForeground(new java.awt.Color(254, 254, 254));
        b_guardar.setIcon(new ImageIcon("imagenes/guardar.png"));
        b_guardar.setText("Guardar");
        b_guardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_guardar.setNextFocusableComponent(b_cancelar);
        b_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guardarActionPerformed(evt);
            }
        });

        cb_ep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_ep.setText("Equipo Pesado");
        cb_ep.setNextFocusableComponent(b_guardar);
        cb_ep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_epActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cb_ep)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_ep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
        cb_ep.requestFocus();
    }//GEN-LAST:event_NombreActionPerformed

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        if(Nombre.getText().length()>=20)
            evt.consume();
    }//GEN-LAST:event_NombreKeyTyped

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        Nombre.requestFocus();
        int opt=JOptionPane.showConfirmDialog(this, "¡Los datos capturados se eliminarán!");
        if(opt==0)
            borra_cajas();
        Nombre.requestFocus();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guardarActionPerformed
        h=new Herramientas(user, 0);
        h.session(sessionPrograma);   
        if(Nombre.getText().compareTo("")!=0)
        {
            if(consultaTipo(Nombre.getText())==false)
            {
                Tipo nuevoTipo = new Tipo();
                nuevoTipo.setTipoNombre(Nombre.getText());                
                if(cb_ep.isSelected())             
                    nuevoTipo.setEPesado(Integer.parseInt("1"));
                else
                    nuevoTipo.setEPesado(Integer.parseInt("0"));
                String respuesta=guardarTipo(nuevoTipo);  
                if(respuesta==null)
                    JOptionPane.showMessageDialog(null, "Error al guardar los datos");
                else
                {
                    JOptionPane.showMessageDialog(null, "Registro almacenado");
                    this.borra_cajas();
                    Nombre.requestFocus();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "¡El nombre del tipo ya existe!");
                this.borra_cajas();
                Nombre.requestFocus();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "¡Debe introducir el nombre del tipo!");
            Nombre.requestFocus();
        }
    }//GEN-LAST:event_b_guardarActionPerformed

    private void cb_epActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_epActionPerformed
        b_guardar.requestFocus();
    }//GEN-LAST:event_cb_epActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_guardar;
    public javax.swing.JCheckBox cb_ep;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

        private List<Object[]> executeHQLQuery(String hql) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            session.getTransaction().commit();
            session.disconnect();
            return resultList;
        }catch (HibernateException he) {
            he.printStackTrace();
            List lista= null;
            return lista;
        }
    }
    
    private String guardarTipo(Tipo obj)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String tipoNombre = null;
        try 
        {
            session.beginTransaction();
            tipoNombre=(String) session.save(obj);
            session.save(obj);
            session.getTransaction().commit();
        } 
        catch (HibernateException he) 
        {
            he.printStackTrace();
            session.getTransaction().rollback();
            tipoNombre = null;
        }   
        finally
        {
            session.close();
            return tipoNombre;
        }
    }
    
    public boolean consultaTipo(String nombre)
    {
        List <Object[]> resultList=executeHQLQuery("from Tipo obj where obj.tipoNombre='"+nombre+"'");
        if(resultList.size()>0)
            return true;
        else
            return false;
    }
    
    private void cajas( boolean nombre)
    {
        this.Nombre.setEnabled(nombre);        
    }
    
    private void borra_cajas()
    {
        this.Nombre.setText("");  
        this.cb_ep.setSelected(false);
    }
}
