package pe.edu.upeu.poo.arrayx;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
  
    static List<Persona> personas=new ArrayList<>();
    //Puntos: Marcado Huaracha, Aguilar Mamani, Alanguia Japura. 1 punto
    public static void main(String[] args) {
        //Crear
        Persona p=new Persona();
        p.setDni("43631917");
        p.setNombre("David");
        p.setEdad(36);
        personas.add(p);
        p=new Persona();
        p.setDni("45528512");
        p.setNombre("Raul");
        p.setEdad(40);
        personas.add(p);
        //Reportar
        System.out.println("DNI\t\tNombres\t\tEdad");
        for (Persona px : personas) {
            System.out.println(px.getDni()+"\t"+px.getNombre()+"\t\t"+px.getEdad());
        }
        //Actualizar
        personas.get(0).setNombre("David Mamani");
        System.out.println("DNI\t\tNombres\t\tEdad");
        for (Persona px : personas) {
            System.out.println(px.getDni()+"\t"+px.getNombre()+"\t\t"+px.getEdad());
        }
        //Eliminar
        personas.remove(1);
        System.out.println("DNI\t\tNombres\t\tEdad");
        for (Persona px : personas) {
            System.out.println(px.getDni()+"\t"+px.getNombre()+"\t\t"+px.getEdad());
        }  
    }
}
