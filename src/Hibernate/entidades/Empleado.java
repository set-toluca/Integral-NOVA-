package Hibernate.entidades;
// Generated 21/08/2015 05:39:10 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Integer idEmpleado;
     private Puestos puestos;
     private String nombre;
     private String direccion;
     private String telefono;
     private String email;
     private int fomaPago;
     private Double importe;
     private String password;
     private String smtp;
     private boolean tls;
     private Integer puerto;
     private Boolean autentificacion;
     private Set ordensForRSuspension = new HashSet(0);
     private Set ordensForRElectrico = new HashSet(0);
     private Set ordensForRRefacciones = new HashSet(0);
     private Set ordensForRExpediente = new HashSet(0);
     private Set ordensForRLevantamiento = new HashSet(0);
     private Set ordensForRMecanica = new HashSet(0);
     private Set ordensForRHojalateria = new HashSet(0);
     private Set ordensForRValuacion = new HashSet(0);
     private Set ordensForRPintura = new HashSet(0);
     private Set pedidos = new HashSet(0);
     private Set ordensForRCotiza = new HashSet(0);
     private Set usuarios = new HashSet(0);
     private Set responsivas = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(Puestos puestos, String nombre, String direccion, int fomaPago, Double importe, boolean tls) {
        this.puestos = puestos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fomaPago = fomaPago;
        this.importe = importe;
        this.tls = tls;
    }
    public Empleado(Puestos puestos, String nombre, String direccion, String telefono, String email, int fomaPago, Double importe, String password, String smtp, boolean tls, Integer puerto, Boolean autentificacion, Set ordensForRSuspension, Set ordensForRElectrico, Set ordensForRRefacciones, Set ordensForRExpediente, Set ordensForRLevantamiento, Set ordensForRMecanica, Set ordensForRHojalateria, Set ordensForRValuacion, Set pedidos, Set ordensForRCotiza, Set usuarios, Set ordensForRPintura, Set responsivas) {
       this.puestos = puestos;
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
       this.fomaPago = fomaPago;
       this.importe = importe;
       this.password = password;
       this.smtp = smtp;
       this.tls = tls;
       this.puerto = puerto;
       this.autentificacion = autentificacion;
       this.ordensForRSuspension = ordensForRSuspension;
       this.ordensForRElectrico = ordensForRElectrico;
       this.ordensForRRefacciones = ordensForRRefacciones;
       this.ordensForRExpediente = ordensForRExpediente;
       this.ordensForRLevantamiento = ordensForRLevantamiento;
       this.ordensForRMecanica = ordensForRMecanica;
       this.ordensForRHojalateria = ordensForRHojalateria;
       this.ordensForRValuacion = ordensForRValuacion;
       this.pedidos = pedidos;
       this.ordensForRCotiza = ordensForRCotiza;
       this.usuarios = usuarios;
       this.ordensForRPintura = ordensForRPintura;
       this.responsivas =  responsivas;
    }
   
    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public Puestos getPuestos() {
        return this.puestos;
    }
    
    public void setPuestos(Puestos puestos) {
        this.puestos = puestos;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public int getFomaPago() {
        return this.fomaPago;
    }
    
    public void setFomaPago(int fomaPago) {
        this.fomaPago = fomaPago;
    }
    public Double getImporte() {
        return this.importe;
    }
    
    public void setImporte(Double importe) {
        this.importe = importe;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSmtp() {
        return this.smtp;
    }
    
    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }
    public boolean isTls() {
        return this.tls;
    }
    
    public void setTls(boolean tls) {
        this.tls = tls;
    }
    public Integer getPuerto() {
        return this.puerto;
    }
    
    public void setPuerto(Integer puerto) {
        this.puerto = puerto;
    }
    public Boolean getAutentificacion() {
        return this.autentificacion;
    }
    
    public void setAutentificacion(Boolean autentificacion) {
        this.autentificacion = autentificacion;
    }
    public Set getOrdensForRSuspension() {
        return this.ordensForRSuspension;
    }
    
    public void setOrdensForRSuspension(Set ordensForRSuspension) {
        this.ordensForRSuspension = ordensForRSuspension;
    }
    public Set getOrdensForRElectrico() {
        return this.ordensForRElectrico;
    }
    
    public void setOrdensForRElectrico(Set ordensForRElectrico) {
        this.ordensForRElectrico = ordensForRElectrico;
    }
    public Set getOrdensForRRefacciones() {
        return this.ordensForRRefacciones;
    }
    
    public void setOrdensForRRefacciones(Set ordensForRRefacciones) {
        this.ordensForRRefacciones = ordensForRRefacciones;
    }
    public Set getOrdensForRExpediente() {
        return this.ordensForRExpediente;
    }
    
    public void setOrdensForRExpediente(Set ordensForRExpediente) {
        this.ordensForRExpediente = ordensForRExpediente;
    }
    public Set getOrdensForRLevantamiento() {
        return this.ordensForRLevantamiento;
    }
    
    public void setOrdensForRLevantamiento(Set ordensForRLevantamiento) {
        this.ordensForRLevantamiento = ordensForRLevantamiento;
    }
    public Set getOrdensForRMecanica() {
        return this.ordensForRMecanica;
    }
    
    public void setOrdensForRMecanica(Set ordensForRMecanica) {
        this.ordensForRMecanica = ordensForRMecanica;
    }
    public Set getOrdensForRHojalateria() {
        return this.ordensForRHojalateria;
    }
    
    public void setOrdensForRHojalateria(Set ordensForRHojalateria) {
        this.ordensForRHojalateria = ordensForRHojalateria;
    }
    public Set getOrdensForRValuacion() {
        return this.ordensForRValuacion;
    }
    
    public void setOrdensForRValuacion(Set ordensForRValuacion) {
        this.ordensForRValuacion = ordensForRValuacion;
    }
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }
    public Set getOrdensForRCotiza() {
        return this.ordensForRCotiza;
    }
    
    public void setOrdensForRCotiza(Set ordensForRCotiza) {
        this.ordensForRCotiza = ordensForRCotiza;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }

    public Set getResponsivas() {
        return this.responsivas;
    }
    
    public void setResponsivas(Set responsivas) {
        this.responsivas = responsivas;
    }
    public Set getOrdensForRPintura() {
        return this.ordensForRPintura;
    }
    
    public void setOrdensForRPintura(Set ordensForRPintura) {
        this.ordensForRPintura = ordensForRPintura;
    }



}


