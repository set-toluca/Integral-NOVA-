/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import Hibernate.Util.HibernateUtil;
import Hibernate.entidades.Almacen;
import Hibernate.entidades.Movimiento;
import Hibernate.entidades.Orden;
import Hibernate.entidades.Usuario;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.File;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import Integral.Herramientas;
import Integral.PDF;
/**
 *
 * @author salvador
 */
public class formatosOrden {
    Herramientas h;
    String sessionPrograma="";
    Usuario usr;
    Almacen miAlmacen;
    public formatosOrden(Usuario u, String ses, Almacen al)
    {
        sessionPrograma=ses;
        usr=u;
        miAlmacen=al;
    }
    
    void formato()
    {
        h=new Herramientas(usr, 0);
        h.session(sessionPrograma);
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            miAlmacen=(Almacen)session.get(Almacen.class, miAlmacen.getIdAlmacen());
            DecimalFormat formatoPorcentaje = new DecimalFormat("#,##0.00");
            formatoPorcentaje.setMinimumFractionDigits(2);
            
            session.beginTransaction().begin();
            BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
            PDF reporte = new PDF();
            Date fecha = new Date();
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyyHH-mm-ss");//YYYY-MM-DD HH:MM:SS
            String valor=dateFormat.format(fecha);
            Movimiento[] mov=(Movimiento[]) session.createCriteria(Movimiento.class).add(Restrictions.eq("almacen.idAlmacen", miAlmacen.getIdAlmacen())).list().toArray(new Movimiento[0]);
            Orden ord=null;
            if(mov.length>0)
            {
                if(mov[0].getPartida()!=null)
                {
                    ord=mov[0].getPartida().getOrdenByIdOrden();
                }
                else
                {
                    ord=mov[0].getPartidaExterna().getPedido().getOrden();
                    //ord=miAlmacen.getPedido().getPartida().getOrdenByIdOrden();
                    //ord=mov[0].getOrden();
                }
            }
            File folder = new File("reportes/"+ord.getIdOrden());
            folder.mkdirs();
            reporte.Abrir(PageSize.LETTER, "Almacen", "reportes/"+ord.getIdOrden()+"/"+valor+"-"+miAlmacen.getIdAlmacen()+"-almacen.pdf");
            Font font = new Font(Font.FontFamily.HELVETICA, 6, Font.BOLD);
            BaseColor contenido=BaseColor.WHITE;
            int centro=Element.ALIGN_CENTER;
            int izquierda=Element.ALIGN_LEFT;
            int derecha=Element.ALIGN_RIGHT;
            float tam[]=new float[]{20,20,80,190,20,30};
            PdfPTable tabla=reporte.crearTabla(6, tam, 100, Element.ALIGN_LEFT);
            cabeceraCompra(reporte, bf, tabla, miAlmacen, ord);
            int ren=0;
            double total=0d;
            if(mov.length>0)
            {
                int renglon=0;
                for(int i=0; i<mov.length; i++)
                {
                    int r=i+1;
                    renglon ++;
                    if(mov[i].getPartida()!=null)
                    {
                        tabla.addCell(reporte.celda(""+mov[i].getPartida().getIdEvaluacion(), font, contenido, izquierda, 0,1,Rectangle.RECTANGLE));
                        tabla.addCell(reporte.celda(""+mov[i].getPartida().getSubPartida(), font, contenido, derecha, 0,1,Rectangle.RECTANGLE));
                        if(mov[i].getPartida().getEjemplar()!=null)
                            tabla.addCell(reporte.celda(""+mov[i].getPartida().getEjemplar().getIdParte(), font, contenido, derecha, 0,1,Rectangle.RECTANGLE));
                        else
                            tabla.addCell(reporte.celda(" ", font, contenido, derecha, 0,1,Rectangle.RECTANGLE));
                        tabla.addCell(reporte.celda(mov[i].getPartida().getCatalogo().getNombre(), font, contenido, izquierda, 0,1,Rectangle.RECTANGLE));
                        tabla.addCell(reporte.celda(mov[i].getPartida().getMed(), font, contenido, izquierda, 0,1,Rectangle.RECTANGLE));
                        tabla.addCell(reporte.celda(formatoPorcentaje.format(mov[i].getCantidad()), font, contenido, derecha, 0,1,Rectangle.RECTANGLE));
                    }
                    else
                    {
                        tabla.addCell(reporte.celda("-", font, contenido, izquierda, 0,1,Rectangle.RECTANGLE));
                        tabla.addCell(reporte.celda("", font, contenido, derecha, 0,1,Rectangle.RECTANGLE));
                        if(mov[i].getPartidaExterna().getNoParte()!=null)
                            tabla.addCell(reporte.celda(mov[i].getPartidaExterna().getNoParte(), font, contenido, derecha, 0,1,Rectangle.RECTANGLE));
                        else
                            tabla.addCell(reporte.celda(" ", font, contenido, derecha, 0,1,Rectangle.RECTANGLE));
                        tabla.addCell(reporte.celda(mov[i].getPartidaExterna().getDescripcion(), font, contenido, izquierda, 0,1,Rectangle.RECTANGLE));
                        tabla.addCell(reporte.celda(mov[i].getPartidaExterna().getUnidad(), font, contenido, izquierda, 0,1,Rectangle.RECTANGLE));
                        tabla.addCell(reporte.celda(formatoPorcentaje.format(mov[i].getCantidad()), font, contenido, derecha, 0,1,Rectangle.RECTANGLE));
                    }
                    if(ren==20)//20
                    {
                        reporte.writer.newPage();
                        reporte.agregaObjeto(tabla);
                        reporte.agregaObjeto(new Paragraph(" "));
                        reporte.agregaObjeto(new Paragraph(" "));
                        reporte.agregaObjeto(new Paragraph(" "));
                        reporte.agregaObjeto(new Paragraph(" "));
                        reporte.agregaObjeto(new Paragraph(" "));
                        reporte.agregaObjeto(new Paragraph(" "));
                        reporte.agregaObjeto(new Paragraph(" "));
                        reporte.agregaObjeto(new Paragraph(" "));
                        reporte.agregaObjeto(tabla);          
                        reporte.agregaObjeto(new Paragraph(" "));
                        reporte.agregaObjeto(new Paragraph(" "));
                        reporte.agregaObjeto(new Paragraph(" "));
                        reporte.agregaObjeto(new Paragraph(" "));
                        
                        tabla=reporte.crearTabla(6, tam, 100, Element.ALIGN_LEFT);
                        cabeceraCompra(reporte, bf, tabla, miAlmacen, ord);
                        ren=-1;
                        renglon=0;
                    }
                    ren++;
                }
                for(renglon=renglon; renglon<20; renglon++)
                {
                    tabla.addCell(reporte.celda(" ", font, contenido, izquierda, 0,1,Rectangle.RECTANGLE));
                    tabla.addCell(reporte.celda(" ", font, contenido, derecha, 0,1,Rectangle.RECTANGLE));
                    tabla.addCell(reporte.celda(" ", font, contenido, derecha, 0,1,Rectangle.RECTANGLE));
                    tabla.addCell(reporte.celda(" ", font, contenido, izquierda, 0,1,Rectangle.RECTANGLE));
                    tabla.addCell(reporte.celda(" ", font, contenido, izquierda, 0,1,Rectangle.RECTANGLE));
                    tabla.addCell(reporte.celda(" ", font, contenido, derecha, 0,1,Rectangle.RECTANGLE));
                }
            }
            tabla.addCell(reporte.celda("Notas: ", font, contenido, izquierda, 0,1,Rectangle.BOTTOM));
            tabla.addCell(reporte.celda(miAlmacen.getNotas(), font, contenido, izquierda, 7,1,Rectangle.BOTTOM));
            session.beginTransaction().rollback();

            reporte.agregaObjeto(tabla);
            reporte.agregaObjeto(new Paragraph(" "));
            reporte.agregaObjeto(new Paragraph(" "));
            reporte.agregaObjeto(new Paragraph(" "));
            reporte.agregaObjeto(new Paragraph(" "));
            reporte.agregaObjeto(new Paragraph(" "));
            reporte.agregaObjeto(new Paragraph(" "));
            reporte.agregaObjeto(new Paragraph(" "));
            reporte.agregaObjeto(new Paragraph(" "));
            reporte.agregaObjeto(new Paragraph(" "));
            reporte.agregaObjeto(new Paragraph(" "));
            reporte.agregaObjeto(tabla);
            reporte.cerrar();
            reporte.visualizar("reportes/"+ord.getIdOrden()+"/"+valor+"-"+miAlmacen.getIdAlmacen()+"-almacen.pdf");
        }catch(Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo realizar el reporte si el archivo esta abierto");
        }
        if(session!=null)
            if(session.isOpen())
                session.close();
    }
    
    private void cabeceraCompra(PDF reporte, BaseFont bf, PdfPTable tabla, Almacen almacen, Orden ord)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            reporte.contenido.setLineWidth(0.5f);
            reporte.contenido.setColorStroke(new GrayColor(0.2f));
            reporte.contenido.setColorFill(new GrayColor(0.9f));
            reporte.contenido.roundRectangle(35, 755, 280, 10, 0);
            reporte.contenido.roundRectangle(35, 735, 280, 20, 0);
            ////*2
            reporte.contenido.roundRectangle(35, 388, 280, 10, 0);
            reporte.contenido.roundRectangle(35, 368, 280, 20, 0);
            ////         
            reporte.inicioTexto();
            reporte.contenido.setFontAndSize(bf, 13);
            reporte.contenido.setColorFill(BaseColor.BLACK);
            reporte.agregaObjeto(reporte.crearImagen("imagenes/grande300115.jpg", 335, -23, 30));
            /*2*/reporte.agregarImagen(reporte.crearImagen("imagenes/grande300115.jpg", 100, -390, 30));
            reporte.contenido.setFontAndSize(bf, 12);
            reporte.contenido.setColorFill(BaseColor.BLACK);
            if(miAlmacen.getTipoMovimiento()==1)
            {
                if(miAlmacen.getOperacion()==4)
                    reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Movimientos en Almacén (Entrada de Material): "+almacen.getIdAlmacen(), 35, 767, 0);
                if(miAlmacen.getOperacion()==5)
                    reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Movimientos de Almacén (Devolución de material de operarios): "+almacen.getIdAlmacen(), 35, 767, 0);
                //*********2
                if(miAlmacen.getOperacion()==4)
                    reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Movimientos en Almacén (Entrada de Material): "+almacen.getIdAlmacen(), 35, 400, 0);                
                if(miAlmacen.getOperacion()==5)
                    reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Movimientos de Almacén (Devolución de material de operarios): "+almacen.getIdAlmacen(), 35, 400 , 0);            
                ////
            }
            else
            {
                if(miAlmacen.getOperacion()==4)
                    reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Movimiento de Almacén (Devolución de material a proveedor): "+almacen.getIdAlmacen(), 35, 767, 0);
                if(miAlmacen.getOperacion()==5)
                    reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Movimientos de Almacén (Entrega de material a operarios): "+almacen.getIdAlmacen(), 35, 767, 0);
                //*********2
                if(miAlmacen.getOperacion()==4)
                    reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Movimiento de Almacén (Devolución de material a proveedor): "+almacen.getIdAlmacen(), 35, 400, 0);
                if(miAlmacen.getOperacion()==5)
                    reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Movimientos de Almacén (Entrega de material a operarios): "+almacen.getIdAlmacen(), 35, 400, 0);
                ///
            }

            reporte.contenido.setFontAndSize(bf, 7);
            reporte.contenido.showTextAligned(PdfContentByte.ALIGN_RIGHT, "Fecha:"+new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()), 306, 757, 0);
            /*2*/reporte.contenido.showTextAligned(PdfContentByte.ALIGN_RIGHT, "Fecha:"+new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()), 306, 390, 0);

            ord = (Orden)session.get(Orden.class, ord.getIdOrden()); 

            //************************datos de movimiento****************************
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");//YYYY-MM-DD HH:MM:SS
            reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Materiales y Refacciones del Almacén", 40, 757 , 0);
            /*2*/reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Materiales y Refacciones del Almacén", 40, 390 , 0); 
            reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "N°. Movimiento: "+almacen.getIdAlmacen(), 40, 747, 0);
            /*2*/ reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "N°. Movimiento: "+almacen.getIdAlmacen(), 40, 380, 0);
            if(almacen.getTipoMovimiento()==1)
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Tipo de Movimiento : Entrada", 120, 747, 0);
            else
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Tipo de Movimiento : Salida", 120, 747, 0);
            ////**2
            if(almacen.getTipoMovimiento()==1)
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Tipo de Movimiento : Entrada", 120, 380, 0);
            else
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Tipo de Movimiento : Salida", 120, 380, 0);
            ////

            if(almacen.getOperacion()==4)
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Tipo de Operación : Compañía", 220, 747, 0);
            if(almacen.getOperacion()==5)
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Tipo de Operación : Operarios", 220, 747, 0);

            ////**2
            if(almacen.getOperacion()==4)
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Tipo de Operación : Compañía", 220, 380, 0);
            if(almacen.getOperacion()==5)
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "Tipo de Operación : Operarios", 220, 380, 0);
            ////

            reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "N°. Orden: "+ord.getIdOrden(), 40, 737, 0);
            /*2*/ reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "N°. Orden: "+ord.getIdOrden(), 40, 370, 0);

            //Firmas de material 
            if(miAlmacen.getTipoMovimiento()==1)
            {
                reporte.contenido.roundRectangle(45, 450, 130, 1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "ENTREGA: "+almacen.getEntrego(), 45, 440, 0);
                reporte.contenido.roundRectangle(250, 450, 130, 1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "AUTORIZA: ", 250, 440, 0);
                reporte.contenido.roundRectangle(440, 450, 130, 1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "RECIBE: "+almacen.getUsuario().getEmpleado().getNombre(), 440, 440, 0);
            }
            else
            {
                reporte.contenido.roundRectangle(45, 450, 130, 1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "ENTREGA: "+almacen.getUsuario().getEmpleado().getNombre(), 45, 440, 0);
                reporte.contenido.roundRectangle(250, 450, 130, 1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "AUTORIZA: ", 250, 440, 0);
                reporte.contenido.roundRectangle(440, 450, 130, 1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "RECIBE: "+almacen.getEntrego(), 440, 440, 0);
            }

            /*2*/if(miAlmacen.getTipoMovimiento()==1)
            {
                reporte.contenido.roundRectangle(45, 30, 130, 1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "ENTREGA: "+almacen.getEntrego(), 45, 20, 0);
                reporte.contenido.roundRectangle(250, 30, 130,  1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "AUTORIZA: ", 250, 20, 0);
                reporte.contenido.roundRectangle(440, 30, 130, 1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "RECIBE: "+almacen.getUsuario().getEmpleado().getNombre(), 440,  20, 0);
            }
            else
            {
                reporte.contenido.roundRectangle(45, 30, 130, 1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "ENTREGA: "+almacen.getUsuario().getEmpleado().getNombre(), 45, 20, 0);
                reporte.contenido.roundRectangle(250, 30, 130, 1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "AUTORIZA: ", 250, 20, 0);
                reporte.contenido.roundRectangle(440, 30, 130, 1, 0);
                reporte.contenido.showTextAligned(PdfContentByte.ALIGN_LEFT, "RECIBE: "+almacen.getEntrego(), 440, 20, 0);
            }
            ///
            reporte.finTexto();
            reporte.contenido.setFontAndSize(bf, 12);
            //agregamos renglones vacios para dejar un espacio(tabla)
            reporte.agregaObjeto(new Paragraph(" "));
            reporte.agregaObjeto(new Paragraph(" "));

            Font font = new Font(Font.FontFamily.HELVETICA, 6, Font.BOLD);
            BaseColor cabecera=BaseColor.GRAY;
            int centro=Element.ALIGN_CENTER;

            tabla.addCell(reporte.celda("N°", font, cabecera, centro, 0, 1, Rectangle.RECTANGLE));
            tabla.addCell(reporte.celda("#", font, cabecera, centro, 0, 1, Rectangle.RECTANGLE));
            tabla.addCell(reporte.celda("N° Parte", font, cabecera, centro, 0, 1,Rectangle.RECTANGLE));
            tabla.addCell(reporte.celda("Descripción", font, cabecera, centro, 0, 1, Rectangle.RECTANGLE));
            tabla.addCell(reporte.celda("Med", font, cabecera, centro, 0, 1, Rectangle.RECTANGLE));
            tabla.addCell(reporte.celda("Cant", font, cabecera, centro, 0, 1, Rectangle.RECTANGLE));
        }catch(Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo realizar el reporte si el archivo esta abierto");
        }
        if(session!=null)
            if(session.isOpen())
                session.close();
    }
}