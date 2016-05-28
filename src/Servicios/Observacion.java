/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;

import Hibernate.Util.HibernateUtil;
import Hibernate.entidades.Mensaje;
import Hibernate.entidades.Orden;
import Hibernate.entidades.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.ImageIcon;
import org.hibernate.Session;
import Integral.Herramientas;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;

/**
 *
 * @author I.S.C Salvador
 */
public class Observacion extends javax.swing.JPanel implements ActionListener{

    /**
     * Creates new form Observacion
     */
    String orden;
    Usuario user;
    Orden ord;
    private int index = 1;
    private Map nota = new HashMap();
    int i=0;
    String estado="";
    String sessionPrograma="";
    Herramientas h;
    
    public Observacion(String ord, Usuario os, String edo, String ses) {
        sessionPrograma=ses;
        estado=edo;
        orden=ord;
        user=os;
        initComponents();
        if(user.getEditaObservaciones()==false)
        {
            estado="sin permiso";
	}
        cargaMensajes();
        caracteres.setText("Caracteres: 500");
        if(estado.compareTo("")==0)
            visualiza(true);
        else
            visualiza(false);
        
        h=new Herramientas(user, 0);
        if(h.isCerrada(orden)==true)
            visualiza(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        caracteres = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        texto.setBackground(new java.awt.Color(204, 255, 255));
        texto.setColumns(20);
        texto.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        texto.setRows(3);
        texto.setToolTipText("Escribir comentario");
        texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(texto);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jButton1.setBackground(new java.awt.Color(90, 66, 126));
        jButton1.setIcon(new ImageIcon("imagenes/post.png"));
        jButton1.setToolTipText("Agregar comentario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, java.awt.BorderLayout.LINE_END);

        caracteres.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        caracteres.setText("Caracteres:");
        jPanel1.add(caracteres, java.awt.BorderLayout.PAGE_START);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setViewportView(panel);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        h=new Herramientas(user, 0);
        h.session(sessionPrograma);
        
        if(texto.getText().compareTo("")!=0)
        {
            Session session = HibernateUtil.getSessionFactory().openSession();
            try
            {
                session.beginTransaction().begin();
                ord = (Orden)session.get(Orden.class, Integer.parseInt(orden));

                Date fecha_orden = new Date();
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//YYYY-MM-DD HH:MM:SS
                String valor=dateFormat.format(fecha_orden);
                String [] fecha = valor.split("-");
                String [] hora=fecha[2].split(":");
                String [] aux=hora[0].split(" ");
                fecha[2]=aux[0];
                hora[0]=aux[1];
                Calendar calendario = Calendar.getInstance();
                calendario.set(

                        Integer.parseInt(fecha[2]), 
                        Integer.parseInt(fecha[1])-1, 
                        Integer.parseInt(fecha[0]), 
                        Integer.parseInt(hora[0]), 
                        Integer.parseInt(hora[1]), 
                        Integer.parseInt(hora[2]));

                Mensaje msg=new Mensaje(ord, user, texto.getText(), calendario.getTime());
                session.saveOrUpdate(msg);
                session.getTransaction().commit();
                Comentario m=new Comentario(orden, user, msg, i, estado, this.sessionPrograma);
                this.nota.put("elimina_" + i, m );
                this.nota.put("actualiza_" + i, m );
                this.nota.put("correo_" + i, m );
                i++;
                m.setSize(panel.getWidth(), m.getHeight());
                panel.add(m);
                m.btn1.addActionListener(this);
                m.btn2.addActionListener(this);
                m.btn3.addActionListener(this);
                m.setVisible(true);
                panel.setAutoscrolls(true);
                panel.repaint();
                panel.updateUI();
                texto.setText("");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                session.getTransaction().rollback();
                javax.swing.JOptionPane.showMessageDialog(null, "no se pudo almacenar el mensaje");
            }
            if(session!=null)
                if(session.isOpen())
                    session.close();
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Debes introducir un mensaje");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKeyTyped
        // TODO add your handling code here:
        if(texto.getText().length()>=500) 
            evt.consume();
    }//GEN-LAST:event_textoKeyTyped

    private void textoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKeyReleased
        // TODO add your handling code here:
        int cantidad=500-texto.getText().length();
        caracteres.setText("Caracteres: "+cantidad);
    }//GEN-LAST:event_textoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caracteres;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables

public void cargaMensajes()
{
    Session session = HibernateUtil.getSessionFactory().openSession();
    try
    {
        ord=(Orden)session.get(Orden.class, Integer.parseInt(orden));
        panel.removeAll();
        Dimension medida=new Dimension();
        medida.width=this.getSize().width;
        medida.height=panel.getHeight();
        panel.setSize(medida);
        panel.setMaximumSize(medida);
        panel.setPreferredSize(medida);
        panel.setAutoscrolls(true);
        panel.repaint();
        panel.updateUI();
        index = 1;
        nota = new HashMap();

        Mensaje[] mensajes = (Mensaje[]) ord.getMensajes().toArray(new Mensaje[0]);
        for(int k=0;k<mensajes.length-1;k++) 
        {
            for(int f=0;f<(mensajes.length-1)-k;f++) 
            {
                if (mensajes[f].getFecha().after(mensajes[f+1].getFecha())==true) 
                {
                    Mensaje aux;
                    aux=mensajes[f];
                    mensajes[f]=mensajes[f+1];
                    mensajes[f+1]=aux;
                }
            }
        }

        if(mensajes.length>0)
        {
//            GroupLayout jPanel2Layout = new GroupLayout(panel);
//            ParallelGroup parallelGroupA= jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING); 
//
//            ParallelGroup parallelGroupAuxiliar= jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING); /* cada componente en parallelGroupAuxiliar es una fila */ 
//
//            ParallelGroup parallelGroupB= jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING); 
//
//            SequentialGroup sequentialGroupVertical= jPanel2Layout.createSequentialGroup(); /* todos los componentes en sequentialGroupVertical estan en una misma columna */ 
//            sequentialGroupVertical.addContainerGap(); /* dejamos un espacio arriba */ 
            
            for(i=0; i<mensajes.length; i++)
            {
                Comentario m=new Comentario(orden, user, mensajes[i], i, estado, this.sessionPrograma);
                m.setSize(panel.getWidth(), m.getHeight());
                m.setVisible(true);
                panel.add(m);
                //parallelGroupAuxiliar.addComponent(m, 0,this.getSize().width,this.getSize().width);  
                //sequentialGroupVertical.addComponent(m,m.getSize().height,m.getSize().height,m.getSize().height); 
                m.updateUI();
                m.btn1.addActionListener(this);
                m.btn2.addActionListener(this);
                m.btn3.addActionListener(this);
                m.setVisible(true);
                this.nota.put("elimina_" + i, m );
                this.nota.put("actualiza_" + i, m );
                this.nota.put("correo_" + i, m );
            }
            
//            sequentialGroupVertical.addContainerGap(); /* dejamos un espacio abajo */ 
//            
//            SequentialGroup sequentialGroupHorizontal= jPanel2Layout.createSequentialGroup(); 
//            sequentialGroupHorizontal.addContainerGap(); /* dejamos un espacio a la izquierda */ 
//            sequentialGroupHorizontal.addGroup(parallelGroupAuxiliar); 
//            sequentialGroupHorizontal.addContainerGap(); /* dejamos un espacio a la derecha */ 
//            parallelGroupA.addGroup(sequentialGroupHorizontal); 
//            jPanel2Layout.setHorizontalGroup(parallelGroupA);
//            
//            parallelGroupB.addGroup(sequentialGroupVertical); 
//            jPanel2Layout.setVerticalGroup(parallelGroupB); 
//            panel.setLayout(jPanel2Layout);
            panel.repaint();
            panel.updateUI();
        }
        else
        {
            panel.setAutoscrolls(true);
            panel.repaint();
            panel.updateUI();
        }
    }catch(Exception e)
    {
        System.out.println(e);
    }
    if(session!=null)
        if(session.isOpen())
            session.close();
}

public void actionPerformed(ActionEvent e) {
        //se obtiene el comando ejecutado
    h=new Herramientas(user, 0);
    h.session(sessionPrograma);
    
        String comando = e.getActionCommand();
        //se recorre el MAP
        Iterator it = nota.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            //se obtiene el KEY -> identificador unico
            String itm = entry.getKey().toString();
            //si comando de componente es igual a comando pulsado
            if( itm.equals(comando))
            {
                if (comando.indexOf ("correo_") != -1) 
                {
                    //se recupera el contenido del JTextfield
                    Session session = HibernateUtil.getSessionFactory().openSession();
                    try
                    {
                        //session.beginTransaction().begin();
                        ord = (Orden)session.get(Orden.class, Integer.parseInt(orden));
                        Mensaje ms1 = (Mensaje)session.get(Mensaje.class, ((Comentario) entry.getValue()).ms.getIdMensaje());
                        EnviarCorreo en;
                        en= new EnviarCorreo(
                            new javax.swing.JFrame(), 
                            true, 
                            "", 
                            "", 
                            ms1.getMensaje(), 
                            null, 
                            this.user, 
                            this.sessionPrograma);
                        if(session!=null)
                        if(session.isOpen())
                            session.close();
                        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                        en.setLocation((d.width/2)-(en.getWidth()/2), (d.height/2)-(en.getHeight()/2));
                        en.setVisible(true);
                        //session.getTransaction().commit();
                    }catch (Exception ioe)
                    {
                        //session.getTransaction().rollback();
                        ioe.printStackTrace();
                        javax.swing.JOptionPane.showMessageDialog(null, "Error no se pudo obtener el mensaje");
                    } 
                }
                if (comando.indexOf ("elimina_") != -1) 
                {
                    //se recupera el contenido del JTextfield
                    int op=javax.swing.JOptionPane.showConfirmDialog(null, "Confirma que quieres eliminar el mensaje");
                    if(op==0)
                    {
                        Session session = HibernateUtil.getSessionFactory().openSession();
                        try
                        {
                            session.beginTransaction().begin();
                            ord = (Orden)session.get(Orden.class, Integer.parseInt(orden));
                            Mensaje ms1 = (Mensaje)session.get(Mensaje.class, ((Comentario) entry.getValue()).ms.getIdMensaje());
                            ord.eliminaMensaje(ms1);
                            session.update(ord);
                            session.delete(ms1);
                            session.getTransaction().commit();
                            ((Comentario) entry.getValue()).setVisible(false);
                        }catch (Exception ioe)
                        {
                            session.getTransaction().rollback();
                            ioe.printStackTrace();
                            javax.swing.JOptionPane.showMessageDialog(null, "Error no se pudo borrar el mensaje");
                        }
                        if(session!=null)
                            if(session.isOpen())
                                session.close(); 
                    }
                }
                if (comando.indexOf ("actualiza_") != -1) 
                {
                    //se recupera el contenido del JTextfield
                    String name = ((Comentario) entry.getValue()).mensaje.getText();                   
                    if(name.compareTo("")!=0)
                    {
                        Session session = HibernateUtil.getSessionFactory().openSession();
                        try
                        {
                            session.beginTransaction().begin();
                            Mensaje ms1 = (Mensaje)session.get(Mensaje.class, ((Comentario) entry.getValue()).ms.getIdMensaje());
                            Date fecha_orden = new Date();
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//YYYY-MM-DD HH:MM:SS
                            String valor=dateFormat.format(fecha_orden);
                            String [] fecha = valor.split("-");
                            String [] hora=fecha[2].split(":");
                            String [] aux=hora[0].split(" ");
                            fecha[2]=aux[0];
                            hora[0]=aux[1];
                            Calendar calendario = Calendar.getInstance();
                            calendario.set(
                                    Integer.parseInt(fecha[2]), 
                                    Integer.parseInt(fecha[1])-1, 
                                    Integer.parseInt(fecha[0]), 
                                    Integer.parseInt(hora[0]), 
                                    Integer.parseInt(hora[1]), 
                                    Integer.parseInt(hora[2]));
                            ms1.setFecha(calendario.getTime());
                            ms1.setMensaje(name);
                            session.update(ms1);
                            session.getTransaction().commit();
                            String titulo=ms1.getUsuario().getEmpleado().getNombre()+"   ("+valor+")";
                            ((Comentario) entry.getValue()).p_general.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), titulo));
                            ((Comentario) entry.getValue()).p_general.repaint();
                            ((Comentario) entry.getValue()).p_general.updateUI();
                        }catch (Exception ioe)
                        {
                            session.getTransaction().rollback();
                            ioe.printStackTrace();
                            javax.swing.JOptionPane.showMessageDialog(null, "Error no se pudo actualizar el mensaje");
                        }
                        if(session!=null)
                            if(session.isOpen())
                                session.close(); 
                        cargaMensajes();
                    }
                    else
                    {
                        javax.swing.JOptionPane.showMessageDialog(null, "Debes introducir un mensaje");
                    }
                }
            }
        }
    }

    public void visualiza(Boolean valor)
    {
        this.jButton1.setEnabled(valor);
        this.texto.setEnabled(valor);
    }
}
