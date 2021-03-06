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
import Hibernate.entidades.Usuario;
import java.util.List;
import java.util.Vector;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author ISC_SALVADOR
 */
public class buscaAlmacen extends javax.swing.JDialog {

    public static final Almacen RET_CANCEL =null;
    InputMap map = new InputMap();
    DefaultTableModel model;
    Usuario usr;
    String sessionPrograma="";
    Herramientas h;
    String[] columnas = new String [] {"N° Entrada", "Usuario", "Fecha", "Pedido", "Notas", "Tipo", "Operación"};
    FormatoTabla formato;
    
    /** Creates new form acceso */
    public buscaAlmacen(java.awt.Frame parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        initComponents();
        getRootPane().setDefaultButton(jButton5);
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
                    java.lang.Integer.class, 
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
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
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Búsqueda movimientos en Almacen");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Filtrar por:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 2, 11))); // NOI18N

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

        c_filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un filtro", "N° Entrada", "Pedido", "O. Taller", "No Proveedor (pedido)", "Nombre de Proveedor (pedido)", "Entrego/recibió", "No Proveedor (s. compañía)", "Nombre de Proveedor (s. compañía)" }));
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

        jButton5.setBackground(new java.awt.Color(2, 135, 242));
        jButton5.setForeground(new java.awt.Color(254, 254, 254));
        jButton5.setIcon(new ImageIcon("imagenes/seleccionar.png"));
        jButton5.setMnemonic('s');
        jButton5.setText("Seleccionar");
        jButton5.setToolTipText("Cargar registro seleccionado");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Movimiento", "Usuario", "Fecha", "Pedido", "Notas", "Tipo", "Operación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        t_busca.requestFocus();
//        h=new Herramientas(usr, 0);
//        h.session(sessionPrograma);
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            usr = (Usuario)session.get(Usuario.class, usr.getIdUsuario());
            if(usr.getConsultaMovimientoAlmacen()==true)
            {
                if(t_datos.getSelectedRow()>=0)
                {
                    Almacen cli = new Almacen();
                    cli.setIdAlmacen(Integer.parseInt(t_datos.getValueAt(t_datos.getSelectedRow(), 0).toString()));
                    doClose(cli);
                }
                else
                    JOptionPane.showMessageDialog(null, "¡No hay un movimiento seleccionado!");
            }
            else
                JOptionPane.showMessageDialog(null, "¡Acceso denegado!");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        if(session!=null)
            if(session.isOpen())
                session.close();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void t_datosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_datosKeyPressed
        // TODO add your handling code here:
        int code = evt.getKeyCode(); 
        if(code == KeyEvent.VK_ENTER)
        {
            t_datos.getInputMap(t_datos.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0,false), "selectColumnCell");
            this.jButton5.requestFocus();
        }
    }//GEN-LAST:event_t_datosKeyPressed

    private void t_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_datosMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            t_busca.requestFocus();
//        h=new Herramientas(usr, 0);
//        h.session(sessionPrograma);
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            usr = (Usuario)session.get(Usuario.class, usr.getIdUsuario());
            if(usr.getConsultaMovimientoAlmacen()==true)
            {
                if(t_datos.getSelectedRow()>=0)
                {
                    Almacen cli = new Almacen();
                    cli.setIdAlmacen(Integer.parseInt(t_datos.getValueAt(t_datos.getSelectedRow(), 0).toString()));
                    doClose(cli);
                }
                else
                    JOptionPane.showMessageDialog(null, "¡No hay un movimiento seleccionado!");
            }
            else
                JOptionPane.showMessageDialog(null, "¡Acceso denegado!");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        if(session!=null)
            if(session.isOpen())
                session.close();
        }
    }//GEN-LAST:event_t_datosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c_filtro;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField t_busca;
    private javax.swing.JTable t_datos;
    // End of variables declaration//GEN-END:variables

    private void buscaDato()
    {
        String consulta="SELECT DISTINCT obj from Almacen obj ";
        String aux="";
        if(c_filtro.getSelectedItem().toString().compareTo("N° Entrada")==0)
            if(t_busca.getText().compareTo("")!=0)
                consulta+=" where obj.idAlmacen =" + t_busca.getText();

        if(c_filtro.getSelectedItem().toString().compareTo("Pedido")==0)
        {
            if(t_busca.getText().compareTo("")!=0)
            consulta+="LEFT JOIN obj.pedido ped "
                + "where ped.idPedido like'%"+t_busca.getText()+"%'";
        }

        if(c_filtro.getSelectedItem().toString().compareTo("O. Taller")==0)
        {
            if(t_busca.getText().compareTo("")!=0)
            {
                aux="SELECT DISTINCT obj from Almacen obj "
                  + "WHERE obj.pedido.partida.ordenByIdOrden.idOrden like '%"+t_busca.getText()+"%'";
                consulta+="LEFT JOIN FETCH obj.movimientos objM "
                    + "LEFT JOIN objM.partida part "
                    + "LEFT JOIN part.ordenByIdOrden ord "
                    + "where ord.idOrden like'%"+t_busca.getText()+"%' OR obj.orden.idOrden like'%"+t_busca.getText()+"%'";
            }
        }

        if(c_filtro.getSelectedItem().toString().compareTo("No Proveedor (pedido)")==0)
            if(t_busca.getText().compareTo("")!=0)
                consulta+="LEFT JOIN obj.pedido ped "
                + "LEFT JOIN ped.proveedorByIdProveedor prov "
                + "where prov.idProveedor like'%"+t_busca.getText()+"%'";

        if(c_filtro.getSelectedItem().toString().compareTo("Nombre de Proveedor (pedido)")==0)
            consulta+="LEFT JOIN obj.pedido ped "
                + "LEFT JOIN ped.proveedorByIdProveedor prov "
                + "where prov.nombre like'%"+t_busca.getText()+"%'";

        if(c_filtro.getSelectedItem().toString().compareTo("Entrego/recibió")==0)
            consulta+="LEFT JOIN obj.pedido ped "
                + "where obj.entrego like'%"+t_busca.getText()+"%'";

        if(c_filtro.getSelectedItem().toString().compareTo("No Proveedor (s. compañía)")==0)
        {
            if(t_busca.getText().compareTo("")!=0)
            consulta+="LEFT JOIN FETCH obj.movimientos objM "
                + "LEFT JOIN objM.partida part "
                + "LEFT JOIN part.proveedor prov "
                + "where prov.idProveedor like'%"+t_busca.getText()+"%'";
        }
        if(c_filtro.getSelectedItem().toString().compareTo("Nombre de Proveedor (s. compañía)")==0)
        {
            if(t_busca.getText().compareTo("")!=0)
            consulta+="LEFT JOIN FETCH obj.movimientos objM "
                + "LEFT JOIN objM.partida part "
                + "LEFT JOIN part.proveedor prov "
                + "where prov.nombre like'%"+t_busca.getText()+"%'";
        }


        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            session.beginTransaction();
            Query q = session.createQuery(consulta);
            List resultList = q.list();

            if(aux.compareTo("")!=0)
            {
                Query q1 = session.createQuery(aux);
                resultList.addAll(q1.list());
            }

            if(resultList.size()>0)
            {
                t_datos.setModel(ModeloTablaReporte(resultList.size(), columnas));
                int i=0;
                for (Object o : resultList) 
                {
                    Almacen actor = (Almacen) o;
                    model.setValueAt(actor.getIdAlmacen(), i, 0);
                    model.setValueAt(actor.getUsuario().getEmpleado().getNombre(), i, 1);
                    model.setValueAt(actor.getFecha(), i, 2);
                    if(actor.getPedido()!=null)
                        model.setValueAt(actor.getPedido().getIdPedido(), i, 3);
                    else
                        model.setValueAt("", i, 3);
                    model.setValueAt(actor.getNotas(), i, 4);
                    if(actor.getTipoMovimiento()==1)
                    {
                        if(actor.getOperacion()==1)
                        {
                            model.setValueAt("Entrada", i, 5);
                            model.setValueAt("P. Valuacion", i, 6);
                        }
                        if(actor.getOperacion()==2)
                        {
                            model.setValueAt("Entrada", i, 5);
                            model.setValueAt("P. Externo", i, 6);
                        }
                        if(actor.getOperacion()==3)
                        {
                            model.setValueAt("Entrada", i, 5);
                            model.setValueAt("P. Directo", i, 6);
                        }
                        if(actor.getOperacion()==4)
                        {
                            model.setValueAt("Entregada", i, 5);
                            model.setValueAt("Compañía", i, 6);
                        }

                        if(actor.getOperacion()==5)
                        {
                            model.setValueAt("Devolución", i, 5);
                            model.setValueAt("Operarios", i, 6);
                        }
                        if(actor.getOperacion()==6)
                        {
                            model.setValueAt("Devolución", i, 5);
                            model.setValueAt("Venta", i, 6);
                        }
                        if(actor.getOperacion()==7)
                        {
                            model.setValueAt("Entrada", i, 5);
                            model.setValueAt("P.Consumibles", i, 6);
                        }
                        if(actor.getOperacion()==8)
                        {
                            model.setValueAt("Devolucion", i, 5);
                            model.setValueAt("Consumibles", i, 6);
                        }
                        if(actor.getOperacion()==9)
                        {
                            model.setValueAt("Entrada", i, 5);
                            model.setValueAt("Ajuste", i, 6);
                        }
                    }
                    else
                    {

                        if(actor.getOperacion()==1)
                        {
                            model.setValueAt("Devolución", i, 5);
                            model.setValueAt("P. Valuacion", i, 6);
                        }
                        if(actor.getOperacion()==2)
                        {
                            model.setValueAt("Devolución", i, 5);
                            model.setValueAt("P. Externo", i, 6);
                        }
                        if(actor.getOperacion()==3)
                        {
                            model.setValueAt("Devolución", i, 5);
                            model.setValueAt("P. Directo", i, 6);
                        }
                        if(actor.getOperacion()==4)
                        {
                            model.setValueAt("Devolución", i, 5);
                            model.setValueAt("Compañía", i, 6);
                        }
                        if(actor.getOperacion()==5)
                        {
                            model.setValueAt("Salida", i, 5);
                            model.setValueAt("Operarios", i, 6);
                        }
                        if(actor.getOperacion()==6)
                        {
                            model.setValueAt("Salida", i, 5);
                            model.setValueAt("Venta", i, 6);
                        }
                        if(actor.getOperacion()==7)
                        {
                            model.setValueAt("Devolución", i, 5);
                            model.setValueAt("P.Consumibles", i, 6);
                        }
                        if(actor.getOperacion()==8)
                        {
                            model.setValueAt("Salida", i, 5);
                            model.setValueAt("Consumibles", i, 6);
                        }
                        if(actor.getOperacion()==9)
                        {
                            model.setValueAt("Salida", i, 5);
                            model.setValueAt("Ajuste", i, 6);
                        }
                    }
                    i++;
                }
            }
            else
                t_datos.setModel(ModeloTablaReporte(0, columnas));
            t_busca.requestFocus();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        if(session!=null)
            if(session.isOpen())
                session.close();
        titulos();
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
                    column.setPreferredWidth(70);
                    break;      
                case 3:
                    column.setPreferredWidth(20);
                    break; 
                case 4:
                    column.setPreferredWidth(200);
                    break; 
                case 5:
                    column.setPreferredWidth(40);
                    break; 
                case 6:
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
