/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipo;

import Integral.Herramientas;
import Integral.Render1;
import Hibernate.Util.HibernateUtil;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import Hibernate.entidades.Usuario;
import Hibernate.entidades.Tipo;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author ESPECIALIZADO TOLUCA
 */
public class buscaTipo extends javax.swing.JDialog {

    public static final String RET_CANCEL =null;
    //private Session session;
    InputMap map = new InputMap();
    DefaultTableModel model;
    String[] columnas = new String [] {"Tipo","Equipo Pesado"};
    String sessionPrograma="";
    Herramientas h;
    Usuario usr;  
    
    /** Creates new form acceso */
    public buscaTipo(javax.swing.JFrame parent, boolean modal, String ses, Usuario usuario) {
        super(parent, modal);
        sessionPrograma=ses;
        usr=usuario;
        initComponents();
        getRootPane().setDefaultButton(jButton1);
        t_datos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        buscaDato();
    }
    
    DefaultTableModel ModeloTablaReporte(int renglones, String columnas[])
    {
            model = new DefaultTableModel(new Object [renglones][2], columnas)
            {
                Class[] types = new Class [] {
                    java.lang.String.class, 
                    java.lang.Boolean.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false
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

    
    private void doClose(String o) {
        returnStatus = o;
        setVisible(false);
        dispose();
    }
    
    public String getReturnStatus() {
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda de tipos de unidad");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Contiene:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 11))); // NOI18N

        t_busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_buscaActionPerformed(evt);
            }
        });
        t_busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_buscaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_buscaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_busca)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(t_busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Resultados", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 11))); // NOI18N

        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Equipo Pesado"
            }
        ));
        t_datos.getTableHeader().setReorderingAllowed(false);
        t_datos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_datosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(t_datos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(2, 135, 242));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setIcon(new ImageIcon("imagenes/seleccionar.png"));
        jButton1.setText("Seleccionar");
        jButton1.setToolTipText("Cargar registro seleccionado");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_buscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_buscaKeyReleased
        // TODO add your handling code here:
        buscaDato();
    }//GEN-LAST:event_t_buscaKeyReleased

    private void t_buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_buscaActionPerformed
        t_datos.requestFocus();
        t_datos.getSelectionModel().setSelectionInterval(0,0);
    }//GEN-LAST:event_t_buscaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        h=new Herramientas(usr, 0);
        h.session(sessionPrograma);
        Session session = HibernateUtil.getSessionFactory().openSession();
        usr = (Usuario)session.get(Usuario.class, usr.getIdUsuario());
        if(usr.getEditaTipo()==true)
        {
            if(t_datos.getRowCount()>0)
            {
                if(t_datos.getSelectedRow()>=0)            
                {
                    if(session!=null)
                        if(session.isOpen())
                            session.close();
                    doClose(t_datos.getValueAt(t_datos.getSelectedRow(), 0).toString());
                }
                else
                    JOptionPane.showMessageDialog(null, "¡No hay una tipo seleccionado!");    
            }
        }
        else
            JOptionPane.showMessageDialog(null, "¡Acceso denegado!");
        if(session!=null)
            if(session.isOpen())
                session.close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t_datosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_datosKeyPressed
        // TODO add your handling code here:
        int code = evt.getKeyCode();
        if(code == KeyEvent.VK_ENTER)
        {
            t_datos.getInputMap(t_datos.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0,false), "selectColumnCell");
            this.jButton1.requestFocus();
        }
    }//GEN-LAST:event_t_datosKeyPressed

    private void t_buscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_buscaKeyPressed
        // TODO add your handling code here:
        /*int code = evt.getKeyCode();
        
        if (evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER)
        {
           evt.setKeyCode(java.awt.event.KeyEvent.VK_TAB);
        }
        /*if(code == KeyEvent.VK_ENTER)
        {
            t_datos.getSelectionModel().setSelectionInterval(0,0);
            
            
        }*/
    }//GEN-LAST:event_t_buscaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField t_busca;
    private javax.swing.JTable t_datos;
    // End of variables declaration//GEN-END:variables

    private List<Object[]> executeHQLQuery(String hql) {
        try 
        {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            session.getTransaction().commit();
            session.disconnect();
            return resultList;
        } catch (HibernateException he) {
            he.printStackTrace();
            List lista= null;//new List(5);
            return lista;
        }
    }
    
private void buscaDato()
{
    String consulta="from Tipo obj where obj.tipoNombre like '%" + t_busca.getText() +"%'";
    List <Object[]> resultList=executeHQLQuery(consulta);
    if(resultList.size()>0)
    {
        t_datos.setModel(ModeloTablaReporte(resultList.size(), columnas));
        int i=0;
        for (Object o : resultList) 
        {
            Tipo actor = (Tipo) o;
            model.setValueAt(actor.getTipoNombre(), i, 0);
            if(actor.getEPesado()==0)
                model.setValueAt(false, i, 1);
            else
                model.setValueAt(true, i, 1);
            i++;
        }
    }
    else
        t_datos.setModel(ModeloTablaReporte(0, columnas));
    formatoTabla();
}
    private String returnStatus = RET_CANCEL;
    
    public void tabla_tamaños()
    {
        TableColumnModel col_model = t_datos.getColumnModel();
        for (int i=0; i<t_datos.getColumnCount(); i++)
        {
  	      TableColumn column = col_model.getColumn(i);
              switch(i)
              {
                  case 0:
                      column.setPreferredWidth(150);
                      break;
                  case 1:
                      column.setPreferredWidth(10);
                      break;                 
                  default:
                      column.setPreferredWidth(40);
                      break;                     
              }
        }
        JTableHeader header = t_datos.getTableHeader();
        header.setForeground(Color.white);
    }

    public void formatoTabla()
    {
        Color c1 = new java.awt.Color(2, 135, 242);
        for(int x=0; x<t_datos.getColumnModel().getColumnCount(); x++)
            t_datos.getColumnModel().getColumn(x).setHeaderRenderer(new Render1(c1));
        tabla_tamaños();
        t_datos.setShowVerticalLines(true);
        t_datos.setShowHorizontalLines(true);
    }
}
