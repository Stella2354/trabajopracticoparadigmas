/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicocollectionsjava;
import java.util.*;
/**
 *
 * @Stella Usuario
 */
public class PracticoCollectionsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ArrayList<Profesores> TipoProfesores = new ArrayList<>();
        //Set <Profesores> TipoProfesores=new HashSet<clientes>();
        //LinkedList<Profesores> TipoProfesores = new LinkedList<>();
        
        
//        Profesores PR1= new Profesores ("graciela ", 454666333, "paradigmas");
//        Profesores PR2= new Profesores ("pablo", 453632322, "logica");
//        
//        
//        
//        TipoProfesores.add(PR1);
//        TipoProfesores.add(PR2);
        
        
//        for (Profesores obj : TipoProfesoress)
//        System.out.println(obj.getNombre());
        
        
//        for ( Profesores : TipoProfesores) {
//
//            System.out.println(Profesores.getNombre()+ " " + Profesores.getDNI() + " "
//            + Profesores.getmateria());
//            
//        }
        
//        System.out.println(TipoProfesores);
//        
//        ListIterator<Profesores> ite = TipoProfesores.listIterator(); 
//        
//        ite.next();
//        ite.add(PR2);
//        TipoProfesores.forEach(obj -> System.out.println(obj));
        
        
        Set<Profesores> players = new TreeSet<>(Comparator.reverseOrder());
        
        Profesores PR1= new Profesores ("Graciela", 14664355, "Paradigmas");
        Profesores PR2= new Profesores ("chanampe Hugo", 30444555, "logica");
        
        players.add(PR1);
        players.add(PR2);
        
        players.forEach(obj -> System.out.print(obj));
        
    }
    
    }
    

