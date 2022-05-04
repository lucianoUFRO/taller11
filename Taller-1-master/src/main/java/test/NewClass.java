/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author elsap
 */
public class NewClass {
    
}



package modelo;

import java.util.ArrayList;

/**
 *
 * @author lucia
 */
public class Test {
    public static void main(String[] args) {
        //Crear mi objeto
        //Constructor vacio y utilizacion de metodos set
       Estudiante estudiante = new Estudiante();
       estudiante.setNombre("Javier");
       Estudiante estudiante1 = new Estudiante("blAs", "Castel",
        "123456789", "12345678911", "ICII", 29,
        "blas.castel@ufrontera.cl");
       Estudiante estudiante2 = new Estudiante();
       estudiante2.setNombre("Juan");
       Estudiante estudiante3 = new Estudiante();
       estudiante3.setNombre("Maria");
//        String nombre = "Blas";
//        estudiante.setNombre(nombre);
//        estudiante.setApellido("Castel");
//        estudiante.setRut("123456789");
//        estudiante.setMatricula("12345678911");
//        estudiante.setCarrera("ICII");
//        estudiante.setEdad(29);
//        estudiante.setCorreo("blas.castel@ufrontera.cl");
//        System.out.println(estudiante.toString());

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i).toString());
            System.out.println("------------------------------");
        }
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNombre().equalsIgnoreCase("Blas")) {
                estudiantes.remove(i);
            }
        }
        System.out.println("DESPUES DE LA ELIMINACION");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(estudiantes.get(i).toString());
            System.out.println("------------------------------");
        }
    }
}