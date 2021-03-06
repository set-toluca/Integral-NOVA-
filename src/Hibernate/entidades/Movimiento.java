package Hibernate.entidades;
// Generated 21/08/2015 05:39:10 PM by Hibernate Tools 3.6.0



/**
 * Movimiento generated by hbm2java
 */
public class Movimiento  implements java.io.Serializable {


     private Integer idMovimiento;
     private PartidaExterna partidaExterna;
     private Partida partida;
     private Almacen almacen;
     private Ejemplar ejemplar;
     private Double cantidad;
     private Double valor;
     private boolean chatarra;

    public Movimiento() {
    }

	
    public Movimiento(boolean chatarra) {
        this.chatarra = chatarra;
    }
    public Movimiento(PartidaExterna partidaExterna, Partida partida, Almacen almacen, Double cantidad, boolean chatarr, Double valor, Ejemplar ejemplar) {
       this.partidaExterna = partidaExterna;
       this.partida = partida;
       this.almacen = almacen;
       this.cantidad = cantidad;
       this.chatarra = chatarra;
       this.valor=valor;
       this.ejemplar=ejemplar;
    }
   
    public Integer getIdMovimiento() {
        return this.idMovimiento;
    }
    
    public void setIdMovimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }
    public PartidaExterna getPartidaExterna() {
        return this.partidaExterna;
    }
    
    public void setPartidaExterna(PartidaExterna partidaExterna) {
        this.partidaExterna = partidaExterna;
    }
    public Partida getPartida() {
        return this.partida;
    }
    
    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    public Almacen getAlmacen() {
        return this.almacen;
    }
    
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    
    public Ejemplar getEjemplar() {
        return this.ejemplar;
    }
    
    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }
    
    
    public Double getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
    
    public Double getValor() {
        return this.valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public boolean isChatarra() {
        return this.chatarra;
    }
    
    public void setChatarra(boolean chatarra) {
        this.chatarra = chatarra;
    }




}


