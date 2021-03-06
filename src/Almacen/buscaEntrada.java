/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * acceso.java
 *
 * Created on 19/01/2012, 02:01:25 PM
 */
package Almacen;

import Integral.FormatoTabla;
import Integral.Herramientas;
import Integral.DefaultTableHeaderCellRenderer;
import Hibernate.Util.HibernateUtil;
import Hibernate.entidades.Almacen;
import Hibernate.entidades.Movimiento;
import Hibernate.entidades.Pedido;
import Hibernate.entidades.Usuario;
import java.util.Vector;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author ISC_SALVADOR
 */
public class buscaEntrada extends javax.swing.JDialog {

    public static final Almacen RET_CANCEL =null;
    InputMap map = new InputMap();
    DefaultTableModel model;
    Usuario usr;
    String sessionPrograma="";
    Herramientas h;
    String[] columnas = new String [] {"Pedido", "Usuario", "Fecha", "Tipo", "Existencia"};
    FormatoTabla formato;
    private Movimiento actor;
    
    /** Creates new form acceso */
    public buscaEntrada(java.awt.Frame parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        initComponents();
        getRootPane().setDefaultButton(jButton6);
        usr=usuario;
        t_datos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        titulos();
        buscaDato();
    }    
   DefaultTableModel ModeloTablaReporte(int renglones, String columnas[])
        {
            model = new DefaultTableModel(new Object [renglones][10], columnas)
            {
                Class[] types = new Class [] {
                    java.lang.Integer.class, 
                    java.lang.String.class, 
                    java.lang.String.class, 
                    java.lang.String.class,
                    java.lang.Double.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false
                };

                public void setValueAt(Object value, int row, int col)
                 {
                        Vector vector = (Vector)this.dataVector.elementAt(row);
                        Object celda = ((Vector)this.dataVector.elementAt(row)).elementAt(col);
                        switch(col)
                        {
                            default:
                                    vector.setElementAt(value, col);
                                    this.dataVector.setElementAt(vector, row);
                                    fireTableCellUpdated(row, col);
                                    break;
                        }
                    }
                
                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            };
            return model;
        }

    
    private void doClose(Almacen o) {
        returnStatus = o;
        setVisible(false);
        dispose();
    }
    
    public Almacen getReturnStatus() {
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
        jPanel2 = new javax.swing.JPanel();
        t_busca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        c_filtro = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminación de entradas en Almacén");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 2, 11))); // NOI18N

        t_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_buscaActionPerformed(evt);
            }
        });
        t_busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_buscaKeyReleased(evt);
            }
        });

        jLabel1.setText("Contiene:");

        c_filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un filtro", "Pedido" }));
        c_filtro.setNextFocusableComponent(t_busca);
        c_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_filtroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(c_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_busca)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(c_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Usuario", "Fecha", "Orden", "Tipo", "Entradas", "Salidas", "Existencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        t_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_datosMouseClicked(evt);
            }
        });
        t_datos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_datosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(t_datos);

        jButton6.setBackground(new java.awt.Color(2, 135, 242));
        jButton6.setForeground(new java.awt.Color(254, 254, 254));
        jButton6.setIcon(new ImageIcon("imagenes/seleccionar.png"));
        jButton6.setMnemonic('s');
        jButton6.setText("Eliminar");
        jButton6.setToolTipText("Cargar registro seleccionado");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void t_buscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_buscaKeyReleased
        // TODO add your handling code here:
        this.buscaDato();
    }//GEN-LAST:event_t_buscaKeyReleased

    private void c_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_filtroActionPerformed
        // TODO add your handling code here:
       this.buscaDato();
    }//GEN-LAST:event_c_filtroActionPerformed

    private void t_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_buscaActionPerformed
        // TODO add your handling code here:
        t_datos.requestFocus();
        t_datos.getSelectionModel().setSelectionInterval(0,0);
    }//GEN-LAST:event_t_buscaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            int a = t_datos.getSelectedRow();
            if((double)t_datos.getValueAt(t_datos.getSelectedRow(),4)==0.00)
            {
                int opt=JOptionPane.showConfirmDialog(this, "¡Los datos capturados se eliminarán!");
                if (JOptionPane.YES_OPTION == opt)
                {
                    session.beginTransaction().begin();
                    int valor =(int)t_datos.getValueAt(t_datos.getSelectedRow(), 0);
                    Pedido ped= (Pedido) session.get(Pedido.class, valor);
                    Almacen[] almacen= (Almacen[])ped.getAlmacens().toArray(new Almacen[0]);
                    for(int alm=0; alm<ped.getAlmacens().size(); alm++)
                    {
                        session.delete(almacen[alm]);
                    }
                    session.getTransaction().commit();              
                    JOptionPane.showMessageDialog(null, "¡Registro eliminado!");
                    model.setValueAt(0.0d, t_datos.getSelectedRow(), 5);
                    model.setValueAt(0.0d, t_datos.getSelectedRow(), 6);
                    model.setValueAt(0.0d, t_datos.getSelectedRow(), 7);
                }
            }
            else
                JOptionPane.showMessageDialog(null, "¡No es posible eliminar los movimientos, ya que contiene existencias!");
            }catch(Exception e)
            {
                session.getTransaction().rollback();
            }
        if(session!=null)
            if(session.isOpen())
                session.close();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void t_datosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_datosKeyPressed
        // TODO add your handling code here:
        int code = evt.getKeyCode(); 
        if(code == KeyEvent.VK_ENTER)
        {
            t_datos.getInputMap(t_datos.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0,false), "selectColumnCell");
            this.jButton6.requestFocus();
        }
    }//GEN-LAST:event_t_datosKeyPressed

    private void t_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_datosMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            try
            {
                int a = t_datos.getSelectedRow();
                if((double)t_datos.getValueAt(t_datos.getSelectedRow(),4)==0.00)
                {
                    int opt=JOptionPane.showConfirmDialog(this, "¡Los datos capturados se eliminarán!");
                    if (JOptionPane.YES_OPTION == opt)
                    {
                        session.beginTransaction().begin();
                        int valor =(int)t_datos.getValueAt(t_datos.getSelectedRow(), 0);
                        Pedido ped= (Pedido) session.get(Pedido.class, valor);
                        Almacen[] almacen= (Almacen[])ped.getAlmacens().toArray(new Almacen[0]);
                        for(int alm=0; alm<ped.getAlmacens().size(); alm++)
                        {
                            session.delete(almacen[alm]);
                        }
                        session.getTransaction().commit();              
                        JOptionPane.showMessageDialog(null, "¡Registro eliminado!");
                        model.setValueAt(0.0d, t_datos.getSelectedRow(), 5);
                        model.setValueAt(0.0d, t_datos.getSelectedRow(), 6);
                        model.setValueAt(0.0d, t_datos.getSelectedRow(), 7);
                    }
                }
                else
                    JOptionPane.showMessageDialog(null, "¡No es posible eliminar los movimientos, ya que contiene existencias!");
                }catch(Exception e)
                {
                    session.getTransaction().rollback();
                }
            if(session!=null)
                if(session.isOpen())
                    session.close();
        }
    }//GEN-LAST:event_t_datosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c_filtro;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField t_busca;
    private javax.swing.JTable t_datos;
    // End of variables declaration//GEN-END:variables

    
    private void buscaDato()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();  
        try
        {
            session.beginTransaction().begin();
            String consulta="select id_pedido as id, empleado.nombre, fecha_pedido, tipo_pedido, \n" +
"if(tipo_pedido=\"Interno\",\n" +
"(select if( sum(movimiento.cantidad) is null, 0, sum(movimiento.cantidad)) as can from partida inner join movimiento on partida.id_partida=movimiento.id_partida inner join almacen on movimiento.id_almacen=almacen.id_almacen where partida.id_pedido=id and almacen.tipo_movimiento=1 and almacen.operacion=1)\n" +
"-(select if( sum(movimiento.cantidad) is null, 0, sum(movimiento.cantidad)) as can from partida inner join movimiento on partida.id_partida=movimiento.id_partida inner join almacen on movimiento.id_almacen=almacen.id_almacen where partida.id_pedido=id and almacen.tipo_movimiento=2 and almacen.operacion=1), \n" +
"\n" +
" (select if( sum(movimiento.cantidad) is null, 0, sum(movimiento.cantidad)) as can from partida_externa inner join movimiento on partida_externa.id_partida_externa=movimiento.id_externos inner join almacen on movimiento.id_almacen=almacen.id_almacen where partida_externa.id_pedido=id and almacen.tipo_movimiento=1 and almacen.operacion in (2, 3))\n" +
"-(select if( sum(movimiento.cantidad) is null, 0, sum(movimiento.cantidad)) as can from partida_externa inner join movimiento on partida_externa.id_partida_externa=movimiento.id_externos inner join almacen on movimiento.id_almacen=almacen.id_almacen where partida_externa.id_pedido=id and almacen.tipo_movimiento=2 and almacen.operacion in (2, 3)) ) as almacen2  \n" +
"from pedido inner join empleado on pedido.comprador=empleado.id_empleado";
            
            if(c_filtro.getSelectedItem().toString().compareTo("Pedido")==0)
                consulta+=" where pedido.id_pedido like '%"+t_busca.getText()+"%'";
            Query query = session.createSQLQuery(consulta);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            ArrayList pedidos=(ArrayList)query.list();
            //Query query = session.createQuery("FROM Pedido");
            //List pedidos = query.list();
            t_datos.setModel(ModeloTablaReporte(pedidos.size(), columnas));
            t_datos.setModel(model);

            for(int a=0; a<pedidos.size(); a++)
            {
                java.util.HashMap map=(java.util.HashMap)pedidos.get(a);
                model.setValueAt(map.get("id"), a, 0);
                model.setValueAt(map.get("nombre"), a, 1);
                model.setValueAt(map.get("fecha_pedido"), a, 2);
                model.setValueAt(map.get("tipo_pedido"), a, 3);
                model.setValueAt(map.get("almacen2"), a, 4);
            }
            titulos();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        if(session!=null)
            if(session.isOpen())
                session.close();
    }
    
    private Almacen returnStatus = RET_CANCEL;
    
public void tabla_tamaños()
    {
        TableColumnModel col_model = t_datos.getColumnModel();
        for (int i=0; i<t_datos.getColumnCount(); i++)
        {
            TableColumn column = col_model.getColumn(i);
            switch(i)
            {
                case 0:
                    column.setPreferredWidth(20);
                    break;
                case 1:
                    column.setPreferredWidth(200);
                    break;
                case 2:
                    column.setPreferredWidth(110);
                    break;      
                case 3:
                    column.setPreferredWidth(40);
                    break; 
                case 4:
                    column.setPreferredWidth(100);
                    break; 
                case 5:
                    column.setPreferredWidth(40);
                    break; 
                case 6:
                    column.setPreferredWidth(40);
                case 7:
                    column.setPreferredWidth(40);
                    break; 
            }
        }
    }
    
    public void titulos()
    {
        TableCellRenderer textNormal = new DefaultTableHeaderCellRenderer();        
        for (int c=0; c<t_datos.getColumnCount(); c++)
        {
            t_datos.getColumnModel().getColumn(c).setHeaderRenderer(textNormal);
        }
        JTableHeader header = t_datos.getTableHeader();
        header.setBackground(new java.awt.Color(2, 135, 242));//102,102,102
        header.setForeground(Color.white);
        t_datos.setShowVerticalLines(true);
        t_datos.setShowHorizontalLines(true);
        
        t_datos.setDefaultRenderer(Double.class, formato); 
        t_datos.setDefaultRenderer(Integer.class, formato);
        t_datos.setDefaultRenderer(String.class, formato);
        t_datos.setDefaultRenderer(Boolean.class, formato);
        this.tabla_tamaños();
    }
}
