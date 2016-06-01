/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * acceso.java
 *
 * Created on 19/01/2012, 02:01:25 PM
 */
package Compras;

import Integral.Render1;
import Hibernate.Util.HibernateUtil;
import java.util.List;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import Hibernate.entidades.Pedido;
import Integral.HorizontalBarUI;
import Integral.VerticalBarUI;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ISC_SALVADOR
 */
public class buscaPedido extends javax.swing.JDialog {

    public static final Pedido RET_CANCEL =null;
    InputMap map = new InputMap();
    DefaultTableModel model;
    int tipoVentana=0;
    String tipoPedido="";
    
    /** Creates new form acceso */
    public buscaPedido(java.awt.Frame parent, boolean modal, int tipo, String tipoPedido) {
        super(parent, modal);
        initComponents();
        scroll.getVerticalScrollBar().setUI(new VerticalBarUI());
        scroll.getHorizontalScrollBar().setUI(new HorizontalBarUI());
        getRootPane().setDefaultButton(jButton5);
        tipoVentana=tipo;
        this.tipoPedido=tipoPedido;
        model=(DefaultTableModel)t_datos.getModel();
        titulos();
        buscaDato();
    }
    
    private void doClose(Pedido o) {
        returnStatus = o;
        setVisible(false);
        dispose();
    }
    
    public Pedido getReturnStatus() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        t_busca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        c_filtro = new javax.swing.JComboBox();
        cb_todos = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda de Pedidos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 11))); // NOI18N

        t_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_buscaActionPerformed(evt);
            }
        });
        t_busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_buscaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_buscaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Contiene:");

        c_filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pedido", "O. Taller", "Nombre de Proveedor" }));
        c_filtro.setNextFocusableComponent(t_busca);
        c_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_filtroActionPerformed(evt);
            }
        });

        cb_todos.setText("Todos");

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
                .addComponent(t_busca, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_todos)
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(c_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_todos))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jButton5.setBackground(new java.awt.Color(2, 135, 242));
        jButton5.setForeground(new java.awt.Color(254, 254, 254));
        jButton5.setIcon(new ImageIcon("imagenes/seleccionar.png"));
        jButton5.setText("Seleccionar");
        jButton5.setToolTipText("Cargar registro seleccionado");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        t_datos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Fecha", "O. Taller", "Usuario", "Nombre de Proveedor", "Autorizo 1"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_datos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        t_datos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t_datos.getTableHeader().setReorderingAllowed(false);
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
        scroll.setViewportView(t_datos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.buscaDato();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            if(t_datos.getRowCount()>0)
            {
                if(t_datos.getSelectedRow()>=0)
                {
                    Pedido cli = new Pedido();
                    cli.setIdPedido(Integer.parseInt(t_datos.getValueAt(t_datos.getSelectedRow(), 0).toString()));
                    doClose(cli);
                }
                else
                JOptionPane.showMessageDialog(null, "¡No hay un pedido seleccionado!");
            }
        }
    }//GEN-LAST:event_t_datosMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        t_busca.requestFocus();
        if(t_datos.getRowCount()>0)
        {
            if(t_datos.getSelectedRow()>=0)
            {
                Pedido cli = new Pedido();
                cli.setIdPedido(Integer.parseInt(t_datos.getValueAt(t_datos.getSelectedRow(), 0).toString()));
                doClose(cli);
            }
            else
            JOptionPane.showMessageDialog(null, "¡No hay un pedido seleccionado!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void c_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_filtroActionPerformed

    private void t_buscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_buscaKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(c_filtro.getSelectedItem().toString().compareTo("Pedido")==0 || c_filtro.getSelectedItem().toString().compareTo("O. Taller")==0 || c_filtro.getSelectedItem().toString().compareTo("No Proveedor")==0)
        {
            if((car<'0' || car>'9'))
            evt.consume();
        }
    }//GEN-LAST:event_t_buscaKeyTyped

    private void t_buscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_buscaKeyReleased
        // TODO add your handling code here:
        this.buscaDato();
    }//GEN-LAST:event_t_buscaKeyReleased

    private void t_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_buscaActionPerformed
        // TODO add your handling code here:
        this.buscaDato();
        t_datos.requestFocus();
        t_datos.getSelectionModel().setSelectionInterval(0,0);
    }//GEN-LAST:event_t_buscaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c_filtro;
    private javax.swing.JCheckBox cb_todos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scroll;
    public javax.swing.JTextField t_busca;
    private javax.swing.JTable t_datos;
    // End of variables declaration//GEN-END:variables

    private void buscaDato()
    {
        
        String consulta="select distinct id_pedido as id, fecha_pedido, id_usuario, T2.nombre, if(autorizo is null, '', autorizo) as a1, tipo_pedido, if(tipo_pedido='Interno', (select id_orden from partida where id_pedido=id limit 1),if(tipo_pedido='Adicional',id_orden,'')) as ord " +
                        "from pedido as T1 left join proveedor as T2 on T1.id_proveedor=T2.id_proveedor ";
        if(t_busca.getText().compareToIgnoreCase("")!=0)
        {
            switch(c_filtro.getSelectedItem().toString())
            {
                case "Pedido":
                    consulta+=" where T1.id_pedido =" + t_busca.getText();
                    if(tipoVentana==1)
                        consulta+=" and autorizo is not null";
                    
                    if(tipoPedido.compareToIgnoreCase("")!=0)
                        consulta+=" and tipo_pedido='"+tipoPedido+"'";
                    consulta+=" order by T1.id_pedido desc";
                    break;
                    
                case "O. Taller":
                    consulta+=" where id_orden like'"+t_busca.getText()+"%'";
                    if(tipoVentana==1)
                        consulta+=" and autorizo is not null";
                    if(t_busca.getText().compareToIgnoreCase("")==0)
                        consulta+=" where autorizo is not null";
                    
                    if(tipoPedido.compareToIgnoreCase("")!=0)
                        consulta+=" and tipo_pedido='"+tipoPedido+"'";
                    consulta+=" order by T1.id_pedido desc";
                    break;
                    
                case "Nombre de Proveedor":
                    consulta+="where T2.nombre like '%" + t_busca.getText() +"%'";
                    if(tipoVentana==1)
                        consulta+=" and autorizo is not null";
                    if(t_busca.getText().compareTo("")==0)
                        consulta+=" where autorizo is not null";
                    
                    if(tipoPedido.compareTo("")!=0)
                        consulta+=" and tipo_pedido='"+tipoPedido+"'";
                    consulta+=" order by T1.id_pedido desc";
                    break;
            }
        }
        else
        {
            if(tipoPedido.compareTo("")!=0)
            {
                if(tipoVentana==1)
                    consulta+=" where autorizo is not null and tipo_pedido='"+tipoPedido+"' order by T1.id_pedido desc";
                else
                    consulta+=" where tipo_pedido='"+tipoPedido+"' order by T1.id_pedido desc";
            }
            else
                consulta+=" where autorizo is not null order by T1.id_pedido desc";
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            if(cb_todos.isSelected()==false)
                consulta+=" limit 70";
            Query q = session.createSQLQuery(consulta);
            q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List resultList = q.list();
            model.setRowCount(0);
            for (Object o : resultList) 
            {
                java.util.HashMap pedido=(java.util.HashMap)o;
                Object[] renglon=new Object[]{pedido.get("id"),pedido.get("fecha_pedido"),pedido.get("ord"),pedido.get("id_usuario"),pedido.get("nombre"),pedido.get("a1")};
                model.addRow(renglon);
            }
            t_busca.requestFocus();
        }catch(Exception e){e.printStackTrace();}
        finally
        {
            if(session!=null)
                if(session.isOpen())
                {
                    session.close();
                }
        }
    }
  
    private Pedido returnStatus = RET_CANCEL;
    
public void tabla_tamaños()
    {
        TableColumnModel col_model = t_datos.getColumnModel();
        for (int i=0; i<t_datos.getColumnCount(); i++)
        {
            TableColumn column = col_model.getColumn(i);
            switch(i)
            {
                case 0:
                    column.setPreferredWidth(60);
                    break;
                case 1:
                    column.setPreferredWidth(150);
                    break;
                case 2:
                    column.setPreferredWidth(60);
                    break;      
                case 3:
                    column.setPreferredWidth(80);
                    break; 
                case 4:
                    column.setPreferredWidth(400);
                    break; 
                case 5:
                    column.setPreferredWidth(100);
                    break; 
                default:
                    column.setPreferredWidth(90);
                    break; 
            }
        }
    }
    
    public void titulos()
    {
        Color c1 = new java.awt.Color(2, 135, 242);
        int col=t_datos.getColumnCount();
        for (int c=0; c<col; c++)
            t_datos.getColumnModel().getColumn(c).setHeaderRenderer(new Render1(c1));        
        JTableHeader header = t_datos.getTableHeader();
        header.setForeground(Color.white);
        this.tabla_tamaños();
    }
}
