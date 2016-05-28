package Hibernate.entidades;
// Generated 21/08/2015 05:39:10 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Ciclo generated by hbm2java
 */
public class Ciclo  implements java.io.Serializable {


     private int idCiclo;
     private String descripcion;
     private Set ordens = new HashSet(0);

    public Ciclo() {
    }

	
    public Ciclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }
    public Ciclo(int idCiclo, String descripcion, Set ordens) {
       this.idCiclo = idCiclo;
       this.descripcion = descripcion;
       this.ordens = ordens;
    }
   
    public int getIdCiclo() {
        return this.idCiclo;
    }
    
    public void setIdCiclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getOrdens() {
        return this.ordens;
    }
    
    public void setOrdens(Set ordens) {
        this.ordens = ordens;
    }




}


