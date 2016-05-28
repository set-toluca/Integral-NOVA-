/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compras;

import Hibernate.Util.HibernateUtil;
import Hibernate.entidades.Orden;
import Hibernate.entidades.Partida;
import Hibernate.entidades.Usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import Integral.FormatoTabla;
import Integral.Herramientas;
import Integral.HorizontalBarUI;
import Integral.Render1;
import Integral.VerticalBarUI;

/**
 *
 * @author ESPECIALIZADO TOLUCA
 */
public class buscaPartida extends javax.swing.JDialog {
    
    private Usuario user;
    private String orden="";
    //private Session session;
    public static final Partida[] RET_CANCEL =null;
    InputMap map = new InputMap();
    DefaultTableModel model;
    String[] columnas = new String [] {"N°","#","Grupo","Descripción","Folio","Código"};
    Orden ord;
    String sessionPrograma="";
    Herramientas h;
    int x=0, entro=0;
    FormatoTabla formato;
    int tipo=1;
     /**
     * Creates new form buscaPartida
     */    
    public buscaPartida(String ord, java.awt.Frame parent, boolean modal, int tipo, int seleccion) {
        super(parent, modal);
        orden=ord;
        this.tipo=tipo;
        initComponents();
        scroll.getVerticalScrollBar().setUI(new VerticalBarUI());
        scroll.getHorizontalScrollBar().setUI(new HorizontalBarUI());
        getRootPane().setDefaultButton(jButton5);
        t_datos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        formato = new FormatoTabla();
        formatoTabla();
        buscaDato();
        t_datos.setSelectionMode(seleccion);
    }
    
    DefaultTableModel ModeloTablaReporte(int renglones, String columnas[])
    {
        model = new DefaultTableModel(new Object [renglones][6], columnas)
        {
            Class[] types = new Class [] {
                java.lang.Integer.class,
                java.lang.String.class, 
                java.lang.String.class, 
                java.lang.String.class, 
                java.lang.String.class,
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };
            public void setValueAt(Object value, int row, int col)
            {
                Vector vector = (Vector)this.dataVector.elementAt(row);
                Object celda = ((Vector)this.dataVector.elementAt(row)).elementAt(col);
                switch(col)
                {
                    case 0:
                        vector.setElementAt(value, col);
                        this.dataVector.setElementAt(vector, row);
                        fireTableCellUpdated(row, col);
                        break;
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
    private void doClose(Partida[] o) {
        returnStatus = o;
        setVisible(false);
        dispose();
    }
    
    public Partida[] getReturnStatus() {
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
        jLabel1 = new javax.swing.JLabel();
        t_busca = new javax.swing.JTextField();
        b_busca = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("busqueda de partidas");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Descripción:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Contiene:");

        t_busca.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        t_busca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        t_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_buscaActionPerformed(evt);
            }
        });
        t_busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_buscaKeyTyped(evt);
            }
        });

        b_busca.setBackground(new java.awt.Color(2, 135, 242));
        b_busca.setIcon(new ImageIcon("imagenes/buscar.png"));
        b_busca.setToolTipText("Busca una partida");
        b_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(t_busca)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Resultados", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 11))); // NOI18N

        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "#", "Grupo", "Descripción", "Folio", "Código"
            }
        ));
        t_datos.getTableHeader().setReorderingAllowed(false);
        t_datos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_datosKeyPressed(evt);
            }
        });
        scroll.setViewportView(t_datos);
        t_datos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        t_busca.requestFocus();
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(t_datos.getSelectedRows().length>=0)
        {
            int [] renglones = t_datos.getSelectedRows();
            Partida[] datos = new Partida[renglones.length];
            for(int x=0; x<renglones.length; x++)
            {
                Partida par = new Partida();
                Partida resp=(Partida) session.createCriteria(Partida.class).add(Restrictions.eq("ordenByIdOrden.idOrden", Integer.parseInt(orden))).add(Restrictions.eq("idEvaluacion", Integer.parseInt(t_datos.getValueAt(renglones[x], 0).toString()))).add(Restrictions.eq("subPartida", Integer.parseInt(t_datos.getValueAt(renglones[x], 1).toString()))).addOrder(Order.desc("idEvaluacion")).setMaxResults(1).uniqueResult();
                datos[x]=resp;
            }
            doClose(datos);
        }
        else
            JOptionPane.showMessageDialog(null, "¡No hay una partida seleccionada!");
        if(session!=null)
            if(session.isOpen())
                session.close();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void t_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_buscaActionPerformed
        // TODO add your handling code here:
        if(this.t_busca.getText().compareToIgnoreCase("")!=0)
        {
            if(x>=t_datos.getRowCount())
            x=0;
            for(; x<t_datos.getRowCount(); x++)
            {
                if(t_datos.getValueAt(x, 3).toString().indexOf(t_busca.getText()) != -1)
                {
                    t_datos.setRowSelectionInterval(x, x);
                    t_datos.setColumnSelectionInterval(3, 3);
                    break;
                }
            }
            x++;
        }
    }//GEN-LAST:event_t_buscaActionPerformed

    private void t_buscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_buscaKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }//GEN-LAST:event_t_buscaKeyTyped

    private void b_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscaActionPerformed
        // TODO add your handling code here:
        if(this.t_busca.getText().compareToIgnoreCase("")!=0)
        {
            if(x>=t_datos.getRowCount())
                x=0;
            for(; x<t_datos.getRowCount(); x++)
            {
                if(t_datos.getValueAt(x, 3).toString().indexOf(t_busca.getText()) != -1)
                {
                    t_datos.setRowSelectionInterval(x, x);
                    t_datos.setColumnSelectionInterval(3, 3);
                    break;
                }
            }
            x++;
        }
    }//GEN-LAST:event_b_buscaActionPerformed

    private void t_datosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_datosKeyPressed
        // TODO add your handling code here:
        int code = evt.getKeyCode(); 
        if(code == KeyEvent.VK_ENTER)
        {
            t_datos.getInputMap(t_datos.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0,false), "selectColumnCell");
            this.jButton5.requestFocus();
        }
    }//GEN-LAST:event_t_datosKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_busca;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane scroll;
    public javax.swing.JTextField t_busca;
    private javax.swing.JTable t_datos;
    // End of variables declaration//GEN-END:variables

  
    private void buscaDato()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Partida[] par;
        ord = (Orden)session.get(Orden.class, Integer.parseInt(orden));
        System.out.println(ord.getIdOrden());
        if(tipo==1)
            par = (Partida[])session.createCriteria(Partida.class).add(Restrictions.eq("ordenByIdOrden.idOrden", ord.getIdOrden())).add(Restrictions.eq("refComp", true)).add(Restrictions.eq("autorizadoValuacion", true)).add(Restrictions.eq("autorizado", true)).add(Restrictions.isNull("pedido")).list().toArray(new Partida[0]);
        else
            par = (Partida[])session.createCriteria(Partida.class).add(Restrictions.eq("ordenByIdOrden.idOrden", ord.getIdOrden())).add(Restrictions.eq("refComp", true)).add(Restrictions.eq("autorizadoValuacion", true)).add(Restrictions.eq("autorizado", true)).list().toArray(new Partida[0]);
        if(par.length>0)
        {
            t_datos.setModel(this.ModeloTablaReporte(par.length, columnas));
            for(int i=0; i<par.length; i++)
            {
                model.setValueAt(""+par[i].getIdEvaluacion(), i, 0);//n°
                model.setValueAt(par[i].getSubPartida(), i, 1);//#
                model.setValueAt(par[i].getCatalogo().getEspecialidad().getDescripcion(), i, 2);//grupo
                model.setValueAt(par[i].getCatalogo().getNombre(), i, 3);//descrip
                model.setValueAt(par[i].getCatalogo().getIdCatalogo(), i, 4);//fol
                if(par[i].getEjemplar()!=null)
                    model.setValueAt(par[i].getEjemplar().getIdParte(), i, 5);//código
                else
                    model.setValueAt("", i, 5);
            }
        }
        else
            t_datos.setModel(ModeloTablaReporte(0, columnas));
        formatoTabla();
        if(session.isOpen())
            session.close();
    }
    private Partida[] returnStatus = RET_CANCEL;
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
                    column.setPreferredWidth(20);
                    break;
                case 2:
                    column.setPreferredWidth(100);
                    break;
                case 3:
                    column.setPreferredWidth(200);
                    break;
                case 4:
                    column.setPreferredWidth(20);
                    break;
                case 5:
                    column.setPreferredWidth(20);
                    break;
                default:
                    column.setPreferredWidth(40);
                    break;
            }
        }
    }
    
    public void formatoTabla()
    {
        Color c1 = new java.awt.Color(2, 135, 242);   
        for(int x=0; x<t_datos.getColumnModel().getColumnCount(); x++)
        {
            t_datos.getColumnModel().getColumn(x).setHeaderRenderer(new Render1(c1));
        }
        tabla_tamaños();
        t_datos.setShowVerticalLines(true);
        t_datos.setShowHorizontalLines(true);
        
        t_datos.setDefaultRenderer(Double.class, formato); 
        t_datos.setDefaultRenderer(Integer.class, formato);
        t_datos.setDefaultRenderer(String.class, formato);
        t_datos.setDefaultRenderer(Boolean.class, formato);
    }
}