/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Almacen;

import Empleados.buscaEmpleado;
import Hibernate.Util.HibernateUtil;
import Hibernate.entidades.Empleado;
import Hibernate.entidades.Herramienta;
import Hibernate.entidades.Usuario;
import Integral.Herramientas;
import Integral.Render1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Sistemas
 */
public class Responsiva extends javax.swing.JPanel {

    Herramientas h;
    Usuario usr;
    String sessionPrograma="";
    /**
     * Creates new form Responsiva
     */
    public Responsiva(Usuario usuario, String ses) {
        initComponents();
        formatoTabla();
        usr=usuario;
        sessionPrograma=ses;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        v_nuevo = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        t_ubicacion = new javax.swing.JTextField();
        t_nombre_herramienta = new javax.swing.JTextField();
        t_id_herramienta = new javax.swing.JTextField();
        b_herramienta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        b_agregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t_cantidad = new javax.swing.JTextField();
        b_empleado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        t_nombre_empleado = new javax.swing.JTextField();
        t_id_empleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        b_menos = new javax.swing.JButton();
        b_mas = new javax.swing.JButton();
        b_imprimir = new javax.swing.JButton();

        v_nuevo.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        t_nombre_herramienta.setEditable(false);
        t_nombre_herramienta.setBackground(new java.awt.Color(255, 255, 255));
        t_nombre_herramienta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        t_id_herramienta.setEditable(false);
        t_id_herramienta.setBackground(new java.awt.Color(255, 255, 255));
        t_id_herramienta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        b_herramienta.setBackground(new java.awt.Color(51, 51, 255));
        b_herramienta.setForeground(new java.awt.Color(255, 255, 255));
        b_herramienta.setText("Herramienta:");
        b_herramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_herramientaActionPerformed(evt);
            }
        });

        jLabel2.setText("Notas:");

        b_agregar.setBackground(new java.awt.Color(51, 51, 255));
        b_agregar.setForeground(new java.awt.Color(255, 255, 255));
        b_agregar.setText("Agregar");
        b_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_agregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad:");

        t_cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_cantidadFocusLost(evt);
            }
        });
        t_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b_herramienta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_id_herramienta, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_nombre_herramienta, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_ubicacion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_agregar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_herramienta)
                    .addComponent(t_id_herramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_nombre_herramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_agregar)
                    .addComponent(jLabel3)
                    .addComponent(t_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout v_nuevoLayout = new javax.swing.GroupLayout(v_nuevo.getContentPane());
        v_nuevo.getContentPane().setLayout(v_nuevoLayout);
        v_nuevoLayout.setHorizontalGroup(
            v_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        v_nuevoLayout.setVerticalGroup(
            v_nuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Responsiva de Herramienta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        b_empleado.setText("Empleado:");
        b_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_empleadoActionPerformed(evt);
            }
        });

        jLabel1.setText("N° Empleado:");

        t_nombre_empleado.setEditable(false);
        t_nombre_empleado.setBackground(new java.awt.Color(255, 255, 255));
        t_nombre_empleado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        t_id_empleado.setEditable(false);
        t_id_empleado.setBackground(new java.awt.Color(255, 255, 255));
        t_id_empleado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Herramienta", "Cantidad", "Notas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_datos.setFillsViewportHeight(true);
        t_datos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_datos);

        b_menos.setIcon(new ImageIcon("imagenes/boton_menos.png"));
        b_menos.setMnemonic('x');
        b_menos.setToolTipText("Elimina la partida seleccionada");
        b_menos.setEnabled(false);
        b_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_menosActionPerformed(evt);
            }
        });

        b_mas.setIcon(new ImageIcon("imagenes/boton_mas.png"));
        b_mas.setToolTipText("Agrega una partida");
        b_mas.setEnabled(false);
        b_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_masActionPerformed(evt);
            }
        });

        b_imprimir.setText("Imprimir");
        b_imprimir.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_empleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_nombre_empleado)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(b_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_imprimir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b_empleado)
                        .addComponent(jLabel1))
                    .addComponent(t_nombre_empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_id_empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_imprimir))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_menosActionPerformed
        /*h=new Herramientas(usr, menu);
        h.session(sessionPrograma);
        if(t_datos.getSelectedRow()>=0)
        {
            DefaultTableModel model = (DefaultTableModel) t_datos.getModel();
            int [] renglones = t_datos.getSelectedRows();
            int opt=JOptionPane.showConfirmDialog(this, "¡Las partidas se eliminará!");
            if (JOptionPane.YES_OPTION == opt)
            {
                for(int x=0; x<renglones.length; x++)
                model.removeRow(t_datos.getSelectedRow());
                sumaTotales();
                JOptionPane.showMessageDialog(null, "¡Partida eliminada!");
            }
        }
        else
        JOptionPane.showMessageDialog(null, "¡Selecciona la partida que desees eliminar!");*/
    }//GEN-LAST:event_b_menosActionPerformed

    private void b_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_masActionPerformed
        h=new Herramientas(usr, 1);
        h.session(sessionPrograma);
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        t_id_herramienta.setText("");
        t_nombre_herramienta.setText("");
        t_ubicacion.setText("");
        t_cantidad.setText("1");
        try
        {
            session.beginTransaction().begin();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            v_nuevo.setSize(565, 160);
            v_nuevo.setLocation((d.width/2)-(v_nuevo.getWidth()/2), (d.height/2)-(v_nuevo.getHeight()/2));
            v_nuevo.setVisible(true);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        if(session!=null)
        if(session.isOpen())
        session.close();
    }//GEN-LAST:event_b_masActionPerformed

    private void b_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_empleadoActionPerformed
        // TODO add your handling code here:
        buscaEmpleado obj = new buscaEmpleado(new javax.swing.JFrame(), true, usr, this.sessionPrograma);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        obj.setLocation((d.width/2)-(obj.getWidth()/2), (d.height/2)-(obj.getHeight()/2));
        obj.setVisible(true);
        Empleado emp=obj.getReturnStatus();
        if(emp!=null)
        {
            this.t_nombre_empleado.setText(emp.getNombre());
            this.t_id_empleado.setText(""+emp.getIdEmpleado());
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction().begin();
            try
            {
                Query q = session.createSQLQuery("select responsiva.id_responsiva, herramienta.nombre, responsiva.cantidad, responsiva.ubicacion from responsiva \n" +
                                                "left join herramienta on responsiva.id_herramienta=herramienta.id_herramienta where id_empleado="+t_id_empleado.getText());
                q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                List lista = q.list();
                DefaultTableModel model = (DefaultTableModel) t_datos.getModel();
                model.setNumRows(0);
                for(int x=0; x<lista.size(); x++)
                {
                    java.util.HashMap map=(java.util.HashMap)lista.get(x);
                    model.addRow(new Object[]{map.get("id_responsiva"),map.get("nombre"),map.get("cantidad"),map.get("")});
                }
                b_mas.setEnabled(true);
                b_menos.setEnabled(true);
                b_imprimir.setEnabled(true);
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                if(session.isOpen())
                    session.close();
            }
        }
        else
        {
            this.t_nombre_empleado.setText("");
            this.t_id_empleado.setText("");
            DefaultTableModel model = (DefaultTableModel) t_datos.getModel();
            model.setNumRows(0);
            b_mas.setEnabled(false);
            b_menos.setEnabled(false);
            b_imprimir.setEnabled(false);
        }
    }//GEN-LAST:event_b_empleadoActionPerformed

    private void b_herramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_herramientaActionPerformed
        // TODO add your handling code here:
        t_id_herramienta.setText("15");
        t_nombre_herramienta.setText("desarmador");
        t_ubicacion.setText("caja de herramientas");
        /*buscaHerramienta obj = new buscaHerramienta(new javax.swing.JFrame(), true, usr, this.sessionPrograma);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        obj.setLocation((d.width/2)-(obj.getWidth()/2), (d.height/2)-(obj.getHeight()/2));
        obj.setVisible(true);
        Herramienta dato=obj.getReturnStatus();
        if(dato!=null)
        {
            t_id_herramienta.setText(dato.getIdHerramienta());
            t_nombre_herramienta.setText(dato.getNombre());
            t_ubicacion.setText(dato.getUbicacion());
        }
        else
        {
            t_id_herramienta.setText("");
            t_nombre_herramienta.setText(");
            t_ubicacion.setText("");
        }*/
    }//GEN-LAST:event_b_herramientaActionPerformed

    private void b_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_agregarActionPerformed
        // TODO add your handling code here:
        if(t_id_herramienta.getText().compareTo("")!=0)
        {
            DefaultTableModel model = (DefaultTableModel) t_datos.getModel();
            Session session = HibernateUtil.getSessionFactory().openSession();
            try
            {
                session.beginTransaction().begin();
                Query q = session.createSQLQuery("select if(sum(cantidad) is null, 0, sum(cantidad)) as total, if(existencias is null, 0, existencias) as existencia  from responsiva " +
                                                 "left join herramienta on responsiva.id_herramienta=herramienta.id_herramienta where responsiva.id_herramienta="+t_id_herramienta.getText());
                q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                List lista = q.list();
                if(lista.size()>0)
                {
                    java.util.HashMap map=(java.util.HashMap)lista.get(0);
                    double asignadas=Double.parseDouble(map.get("total").toString());
                    double existencias=Double.parseDouble(map.get("existencia").toString());
                    double nuevas=Double.parseDouble(t_cantidad.getText());
                    if(existencias>=(asignadas+nuevas))
                    {
                        Hibernate.entidades.Responsiva nuevo=new Hibernate.entidades.Responsiva();
                        Empleado emp=(Empleado)session.get(Empleado.class, Integer.parseInt(t_id_empleado.getText()));
                        Herramienta her=(Herramienta)session.get(Herramienta.class, t_id_herramienta.getText());

                        nuevo.setHerramienta(her);
                        nuevo.setCantidad(Double.parseDouble(t_cantidad.getText()));
                        nuevo.setUbicacion(t_ubicacion.getText());
                        nuevo.setEmpleado(emp);
                        int numero=(int)session.save(nuevo);
                        String valor=""+numero;
                        model.addRow(new Object[]{valor, t_nombre_herramienta.getText(), Integer.parseInt(t_cantidad.getText()), t_ubicacion.getText()});
                        session.beginTransaction().commit();
                        this.v_nuevo.dispose();
                    }
                    else
                    {
                        session.beginTransaction().rollback();
                        double numero=existencias-asignadas;
                        JOptionPane.showMessageDialog(this, "La cantidad de Herramientas existentes es de:"+numero);
                    }
                }
            }catch(Exception e)
            {
                session.beginTransaction().rollback();
                e.printStackTrace();
            }finally{
                if(session.isOpen())
                    session.close();
            }
        }
    }//GEN-LAST:event_b_agregarActionPerformed

    private void t_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cantidadKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(t_cantidad.getText().length()>=10)
            evt.consume();
        if((car<'0' || car>'9'))
            evt.consume();
    }//GEN-LAST:event_t_cantidadKeyTyped

    private void t_cantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_cantidadFocusLost
        // TODO add your handling code here:
        if(t_cantidad.getText().compareTo("")==0)
        {
            t_cantidad.setText("0");
        }
    }//GEN-LAST:event_t_cantidadFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_agregar;
    private javax.swing.JButton b_empleado;
    private javax.swing.JButton b_herramienta;
    private javax.swing.JButton b_imprimir;
    private javax.swing.JButton b_mas;
    private javax.swing.JButton b_menos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_cantidad;
    private javax.swing.JTable t_datos;
    private javax.swing.JTextField t_id_empleado;
    private javax.swing.JTextField t_id_herramienta;
    private javax.swing.JTextField t_nombre_empleado;
    private javax.swing.JTextField t_nombre_herramienta;
    private javax.swing.JTextField t_ubicacion;
    private javax.swing.JDialog v_nuevo;
    // End of variables declaration//GEN-END:variables

    public void formatoTabla()
    {
        Color c1 = new java.awt.Color(2, 135, 242);
        for(int x=0; x<t_datos.getColumnModel().getColumnCount(); x++)
            t_datos.getColumnModel().getColumn(x).setHeaderRenderer(new Render1(c1));
        tabla_tamaños();
        t_datos.setShowVerticalLines(true);
        t_datos.setShowHorizontalLines(true);
    }
    
    public void tabla_tamaños()
    {
        TableColumnModel col_model = t_datos.getColumnModel();
        for (int i=0; i<t_datos.getColumnCount(); i++)
        {
            TableColumn column = col_model.getColumn(i);
            switch(i)
            {
                case 0:
                    column.setPreferredWidth(50);
                    break;
                case 1:
                    column.setPreferredWidth(250);
                    break;
                case 2:
                    column.setPreferredWidth(50);
                    break;      
                case 3:
                    column.setPreferredWidth(250);
                    break; 
                default:
                    column.setPreferredWidth(40);
                    break; 
            }
        }
        JTableHeader header = t_datos.getTableHeader();
        header.setForeground(Color.white);
    }
}