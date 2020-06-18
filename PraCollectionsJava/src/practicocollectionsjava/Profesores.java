/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicocollectionsjava;

import java.util.Objects;

/**
 *
 * @Stella Usuario
 */
public class Profesores implements Comparable<Profesores>{

    public Profesores(String nombre, Integer DNI, String materia) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.materia = materia;
    }
    
    
    private String nombre;
    
    private Integer DNI;
    
    private String materia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getmateria() {
        return materia;
    }

    public void setmateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesores{" + "nombre=" + nombre + ", DNI=" + DNI + ", materia=" + materia + '}';
    }

    @Override
    public int compareTo(Profesores o) {
        
        if (this.getDNI() <o.getDNI())
            
            return -1;
        
        else if (this.getDNI() >o.getDNI() )
            
            return 1;
        
        else 
            
            return 0;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.materia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesores other = (Profesores) obj;
        if (!Objects.equals(this.materia, other.materia)) {
            return false;
        }
        return true;
    }

     
    

   
    
    
}
